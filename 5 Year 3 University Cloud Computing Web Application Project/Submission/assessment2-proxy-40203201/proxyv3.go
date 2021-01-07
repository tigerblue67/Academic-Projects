package main

import (
	"log"
	"net/http"
	"net/http/httputil"
	"net/url"
)

var (
	hostTarget = map[string]string{
		"/add":      "http://add.40203201.qpc.hal.davecutting.uk",
		"/minus":    "http://subtract.40203201.qpc.hal.davecutting.uk",
		"/multiply": "http://multiply.40203201.qpc.hal.davecutting.uk",
		"/divide":   "http://divide.40203201.qpc.hal.davecutting.uk/divide",
		"/square":   "http://square.40203201.qpc.hal.davecutting.uk/square/new",
		"/timesten": "http://us-central1-assess2-cc-x10.cloudfunctions.net/Times",
	}
)

var (
	hostTargetBackup = map[string]string{
		"/add":      "http://add2.40203201.qpc.hal.davecutting.uk",
		"/minus":    "http://subtract2.40203201.qpc.hal.davecutting.uk",
		"/multiply": "http://multiply2.40203201.qpc.hal.davecutting.uk",
		"/divide":   "http://divide2.40203201.qpc.hal.davecutting.uk/divide",
		"/square":   "http://square2.40203201.qpc.hal.davecutting.uk/square/new",
		"/timesten": "http://europe-west2-assess2-cc-x10.cloudfunctions.net/Times-1",
	}
)

func getURL(r *http.Request) (*url.URL, error) {
	incoming := r.URL.Path
	log.Println("path: " + incoming)
	query := r.URL.RawQuery
	log.Println("Query: " + query)
	outgoing := hostTarget[incoming] + "?" + query
	resp, err := http.Get(outgoing)
	log.Println("Response from server: " + resp.Status)
	if resp.StatusCode > 399 && resp.StatusCode < 601 {
		log.Println("Primary Server Unavailable switching to secondary")
		outgoing = hostTargetBackup[incoming] + "?" + query
	}
	log.Println("Redirect: " + outgoing)
	origin, err := url.Parse(outgoing)

	return origin, err
}

func main() {
	director := func(r *http.Request) {
		origin, _ := getURL(r)
		r.URL = origin
		r.Host = r.URL.Host
		log.Println("URL " + r.URL.Host)

	}
	revProxy := &httputil.ReverseProxy{Director: director}
	handler := handler{proxy: revProxy}
	http.Handle("/", handler)

	log.Fatal(http.ListenAndServe(":80", nil))
}

type handler struct {
	proxy *httputil.ReverseProxy
}

func (h handler) ServeHTTP(w http.ResponseWriter, r *http.Request) {
	log.Println("host: " + r.URL.Host)
	w.Header().Set("Access-Control-Allow-Origin", "*")
	h.proxy.ServeHTTP(w, r)
}
