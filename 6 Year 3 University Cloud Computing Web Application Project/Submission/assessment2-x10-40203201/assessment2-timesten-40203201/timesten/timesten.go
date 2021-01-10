package Assess2x10

import (
	"encoding/json"
	"log"
	"net/http"
	"strconv"
)

func Maths(x int, y int) int {
	ans := 0
	if y > 0 {
		ans = x * 10
		for i := 1; i < y; i++ {
			ans = ans * 10

		}
	} else {
		ans = x
	}
	return ans
}

func Times(w http.ResponseWriter, req *http.Request) {
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
	ans := Maths(x, y)
	w.Header().Set("Content-Type", "application/json")
	json.NewEncoder(w).Encode(ans)

}
