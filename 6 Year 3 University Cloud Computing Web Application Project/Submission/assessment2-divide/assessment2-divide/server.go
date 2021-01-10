package main

import (
	"encoding/json"
	"fmt"
	"log"
	"net/http"
	"strconv"
)

func Div(x int, y int) int {
	ans := x / y
	return ans
}

func divide(w http.ResponseWriter, req *http.Request) {
	var argx, argy []string
	w.Header().Set("Access-Control-Allow-Origin", "*")
	w.Header().Set("Access-Control-Allow-Headers", "X-Requested-With")
	argx = req.URL.Query()["x"]
	argy = req.URL.Query()["y"]
	x, err := strconv.Atoi(argx[0])
	if err != nil {
		log.Fatal(err)
	}
	y, err := strconv.Atoi(argy[0])
	if err != nil {
		log.Fatal(err)
	}
	ans := Div(x, y)
	log.Println(ans)
	w.Header().Set("Content-Type", "application/json")
	json.NewEncoder(w).Encode(ans)

}

func main() {

	http.HandleFunc("/divide", divide)

	fmt.Printf("Starting server at port 80\n")
	if err := http.ListenAndServe("0.0.0.0:80", nil); err != nil {
		log.Fatal(err)
	}
}
