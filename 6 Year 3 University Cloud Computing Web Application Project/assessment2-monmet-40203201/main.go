package main

import (
	"bytes"
	"fmt"
	"html/template"
	"io/ioutil"
	"log"
	"math/rand"
	"net/http"
	"regexp"
	"strconv"
	"time"
)

type ResultVar struct {
	Result1 string
	Result2 string
	Result3 string
	Result4 string
	Result5 string
	Result6 string
}

func main() {
	http.HandleFunc("/status", root)
	http.HandleFunc("/conn", connTestHandler)

	fmt.Printf("Starting server at port 80\n")
	if err := http.ListenAndServe("0.0.0.0:80", nil); err != nil {
		log.Fatal(err)
	}

}

func httpGetString(strpath string) string {

	resp, _ := http.Get(strpath)
	body, _ := ioutil.ReadAll(resp.Body)
	stringres := bytes.NewBuffer(body).String()
	return stringres
}

func runTest() []string {

	basePath := "http://proxy.40203201.qpc.hal.davecutting.uk/"
	var subpath [6]string
	subpath[0] = "add"
	subpath[1] = "minus"
	subpath[2] = "multiply"
	subpath[3] = "divide"
	subpath[4] = "square"
	subpath[5] = "timesten"
	var output []string
	i := 0
	for i < 6 {
		k := 0
		accuracy := 0
		start := time.Now()
		for k < 10 {
			x := rand.Intn(1000)
			y := rand.Intn(1000)
			stringP := basePath + subpath[i] + "?x=" + strconv.Itoa(x) + "&y=" + strconv.Itoa(y)
			ans := -1
			if i == 10 {
				y = rand.Intn(5)
				stringP = basePath + subpath[i] + "?x=" + strconv.Itoa(x) + "&y=" + strconv.Itoa(y)
				j := 0
				ans = x
				for j < y {
					ans = ans * 10
				}

				stringres := httpGetString(stringP)
				responseAns, _ := strconv.Atoi(stringres)
				if ans == responseAns {
					accuracy++
				} else {
					strans := strconv.Itoa(ans)
					fmt.Println("Incorrect Answer for " + stringP + " Expected answer: " + strans + " Answer: " + stringres)
				}

			} else if i == 4 {
				stringP = basePath + subpath[i] + "?x=" + strconv.Itoa(x)
				stringres := httpGetString(stringP)
				responseAns, _ := strconv.Atoi(stringres)
				ans = x * x
				if ans == responseAns {
					accuracy++
				} else {
					strans := strconv.Itoa(ans)
					fmt.Println("Incorrect Answer for " + stringP + " Expected answer: " + strans + " Answer: " + stringres)
				}
			} else if i == 3 {
				stringres := httpGetString(stringP)
				trim := stringres[0:1]
				responseAns, err := strconv.Atoi(trim)
				if err != nil {
					fmt.Println(err)
				}
				ans = x / y
				if ans == responseAns {
					accuracy++
				} else {
					fmt.Println("Incorrect Answer for "+stringP+" Expected answer: ", ans, " Answer: ", responseAns, " Response was: ", stringres)
				}
			} else if i == 2 {
				stringres := httpGetString(stringP)
				var reg = regexp.MustCompile(`"a": "(\d+)"`)
				match := reg.FindStringSubmatch(stringres)
				responseAns, _ := strconv.Atoi(match[1])
				ans = x * y
				if ans == responseAns {
					accuracy++
				} else {
					strans := strconv.Itoa(ans)
					fmt.Println("Incorrect Answer for " + stringP + " Expected answer: " + strans + " Answer: " + stringres)
				}
			} else if i == 1 {
				stringres := httpGetString(stringP)
				var reg = regexp.MustCompile(`"answer":(\d+)}`)
				match := reg.FindStringSubmatch(stringres)
				responseAns, _ := strconv.Atoi(match[1])
				ans = x - y
				if ans == responseAns || responseAns == 0 {
					accuracy++
				} else {
					strans := strconv.Itoa(ans)
					fmt.Println("Incorrect Answer for " + stringP + " Expected answer: " + strans + " Answer: " + stringres)
				}
			} else if i == 0 {
				stringres := httpGetString(stringP)
				var reg = regexp.MustCompile(`"answer":(\d+)}`)
				match := reg.FindStringSubmatch(stringres)
				responseAns, _ := strconv.Atoi(match[1])
				ans = x + y
				if ans == responseAns {
					accuracy++
				} else {
					strans := strconv.Itoa(ans)
					fmt.Println("Incorrect Answer for " + stringP + " Expected answer: " + strans + " Answer: " + stringres)
				}
			}

			k++
		}
		elapsed := time.Since(start).Seconds()
		thisOutput := "accuracy for " + subpath[i] + " =" + strconv.Itoa(accuracy) + " Time taken for 10 executions of this sum was: " + strconv.FormatFloat(elapsed, 'E', -1, 64) + " Seconds"
		output = append(output, thisOutput)
		fmt.Println("accuracy for "+subpath[i]+" =", accuracy, " Time taken for 10 executions of this sum was: ", elapsed, " Seconds")
		i++
	}
	return output
}
func connTestHandler(w http.ResponseWriter, req *http.Request) {
	failures := checkConn()
	writing := []byte(failures)
	w.Write(writing)
}
func checkConn() string {
	basePath := "http://proxy.40203201.qpc.hal.davecutting.uk/"
	var subpath [6]string
	subpath[0] = "add"
	subpath[1] = "minus"
	subpath[2] = "multiply"
	subpath[3] = "divide"
	subpath[4] = "square"
	subpath[5] = "timesten"
	outputString := ""
	i := 0
	for i < 6 {
		stringP := basePath + subpath[i] + "?x=15&y=3"
		if i == 4 {
			stringP = basePath + subpath[i] + "?x=10"

		}
		resp, err := http.Get(stringP)
		log.Println("Response from server: " + resp.Status)
		if resp.StatusCode > 399 && resp.StatusCode < 601 {
			log.Println("Connection to server unavailable")
			log.Println(err)
			outputString = outputString + "Connection Has failed to: " + stringP + "\n"
		}

		i++
	}
	return outputString

}
func root(w http.ResponseWriter, req *http.Request) {
	Results := runTest()

	webPageVars := ResultVar{
		Result1: Results[0],
		Result2: Results[1],
		Result3: Results[2],
		Result4: Results[3],
		Result5: Results[4],
		Result6: Results[5],
	}

	t, err := template.ParseFiles("src/index.html") //parse the html file homepage.html
	if err != nil {                                 // if there is an error
		log.Print("template parsing error: ", err) // log it
	}
	err = t.Execute(w, webPageVars) //execute the template and pass it the HomePageVars struct to fill in the gaps
	if err != nil {                 // if there is an error
		log.Print("template executing error: ", err) //log it
	}

}
