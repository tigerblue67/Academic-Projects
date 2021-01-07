package Assess2x10

import "testing"

func TestTimes(t *testing.T) {
	answer := Maths(1, 3)
	if answer != 1000 {
		t.Errorf("Incorrect Result, Expected Result: %d, Actual Result: %d", 1000, answer)
	}

}
