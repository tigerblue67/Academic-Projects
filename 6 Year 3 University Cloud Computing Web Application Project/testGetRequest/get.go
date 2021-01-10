package main

import (
	"fmt"
	"io/ioutil"
	"net/http"
	"regexp"
	"strconv"
)

type resp struct {
	ans float64
}

func main() {

	resp, _ := http.Get("http://proxy.40203201.qpc.hal.davecutting.uk/add?x=4&y=2")

	body, _ := ioutil.ReadAll(resp.Body)
	str := string(body)
	fmt.Println(string(body))
	var reg = regexp.MustCompile(`"a": "(\d+)"`)
	match := reg.FindStringSubmatch(str)
	integ, _ := strconv.Atoi(match[1])
	if integ == 8 {
		fmt.Println("true!")
	}
	fmt.Println(match[1])
	// integ, _ := strconv.Atoi(string(body))
	// fmt.Println(integ)
	// fmt.Println(12 / 5)
	// if integ == 16 {
	// 	fmt.Println("true")
	// }

}
