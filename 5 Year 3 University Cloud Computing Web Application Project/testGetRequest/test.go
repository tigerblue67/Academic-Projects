package main

import(
	"exec"
)

func main(){
	arg1:= "very cool"
	cmd1 := exec.Command("echo", arg1)
	_ := cmd1.Run()
	arg2 := '"This is a test email" | mail -s "test subject" jacobcheah@hotmail.co.uk'
	cmd2 := exec.Command("echo", arg2)
}