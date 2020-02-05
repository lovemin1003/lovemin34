package main

import "fmt"

func main(){
	a := 2

	switch{
	case a <= 1 :
		fmt.Println("1 이하")
		fallthrough
	case a <= 2 :
		fmt.Println("2 이하")
		fallthrough
	case a <= 3 :
		fmt.Println("3 이하")
		// fallthrough
		//# command-line-arguments
		//.\fallthrough 사용한 switch.go:17:3: cannot fallthrough final case in switch
	}
}
