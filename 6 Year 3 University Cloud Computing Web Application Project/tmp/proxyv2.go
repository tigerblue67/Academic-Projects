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
		"/square":   "http://square.40203201.qpc.hal.davecutting.uk",
		"/timesten": "https://us-central1-assess2-cc-x10.cloudfunctions.net/Times",
	}
)

func getURL(r *http.Request) (*url.URL, error) {
	incoming := r.URL.Path
	log.Println("path: " + incoming)
	query := r.URL.RawQuery
	log.Println("Query: " + query)
	outgoing := hostTarget[incoming] + "?" + query
	log.Println("Redirect: " + outgoing)
	origin, err := url.Parse(outgoing)

	return origin, err
}

func handler(w http.ResponseWriter, r *http.Request) {
	origin, _ := getURL(r)
	proxy := httputil.NewSingleHostReverseProxy(origin)
	proxy.ServeHTTP(w, r)
}

func main() {

	http.HandleFunc("/", handler)

	log.Fatal(http.ListenAndServe(":80", nil))
}
