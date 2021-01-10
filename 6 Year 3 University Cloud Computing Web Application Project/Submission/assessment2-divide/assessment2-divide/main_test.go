package main

import "testing"

func TestDivide(t *testing.T) {
	answer := Div(10, 2)
	if answer != 5 {
		t.Errorf("Incorrect Result, Expected Result: %d, Actual Result: %d", 1000, answer)
	}

}
