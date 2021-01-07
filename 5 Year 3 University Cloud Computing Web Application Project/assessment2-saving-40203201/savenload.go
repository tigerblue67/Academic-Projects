package main

import (
	"encoding/json"
	"fmt"
	"io/ioutil"
	"log"
	"net/http"
	"os"
	"strconv"
	"strings"
)

var id int

func main() {

	http.HandleFunc("/save", save)
	http.HandleFunc("/load", load)

	fmt.Printf("Starting server at port 80\n")
	if err := http.ListenAndServe("0.0.0.0:80", nil); err != nil {
		log.Fatal(err)
	}

}

func load(w http.ResponseWriter, req *http.Request) {
	argx := req.URL.Query()["x"]
	content, err := ioutil.ReadFile("save.txt")
	if err != nil {
		log.Fatal(err)
	}

	// Convert []byte to string and print to screen
	text := string(content)
	pairs := strings.Split(text, "\n")
	i := 0
	returnVal := "0"
	for i < len(pairs) {
		current := strings.Split(pairs[i], "-")
		if argx[0] == current[0] {
			returnVal = current[1]
		}
		i++
	}
	w.Header().Set("Access-Control-Allow-Origin", "*")
	w.Header().Set("Content-Type", "application/json")
	json.NewEncoder(w).Encode(returnVal)

}

func save(w http.ResponseWriter, req *http.Request) {
	argx := req.URL.Query()["x"]
	getID()

	saveString := strconv.Itoa(id) + "-" + argx[0] + "\n"

	f, err := os.OpenFile("save.txt",
		os.O_APPEND|os.O_CREATE|os.O_WRONLY, 0644)
	if err != nil {
		log.Println(err)
	}
	defer f.Close()
	if _, err := f.WriteString(saveString); err != nil {
		log.Println(err)
	}
	w.Header().Set("Access-Control-Allow-Origin", "*")
	w.Header().Set("Content-Type", "application/json")
	json.NewEncoder(w).Encode(id)

}

func getID() {
	content, err := ioutil.ReadFile("save.txt")
	if err != nil {
		log.Fatal(err)
	}

	// Convert []byte to string and print to screen
	text := string(content)
	pairs := strings.Split(text, "\n")
	id = len(pairs)

}
