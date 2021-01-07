package main

import (
	"bytes"
	"fmt"
	"io/ioutil"
	"net/http"
	"os/exec"
	"time"
)

func main() {
	startTime := time.Now()
	limit, _ := time.ParseDuration("30m")
	for {
		elapsed := time.Since(startTime)
		if elapsed > limit {
			startTime = time.Now()
			resp, _ := http.Get("http://monmet.40203201.qpc.hal.davecutting.uk/conn")
			body, _ := ioutil.ReadAll(resp.Body)
			stringres := bytes.NewBuffer(body).String()
			fmt.Println(stringres)
			if stringres != "" {
				arg2 := `"There has been an issue with the following service"`
				arg3 := ` | mail -s "Service down" jcheah02@qub.ac.uk`
				cmd2 := exec.Command("echo", arg2, stringres, arg3)
				err := cmd2.Run()
				fmt.Printf("Command finished with error: %v", err)
			}
			fmt.Println(time.Now())
		}
	}
}
