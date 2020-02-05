package main

import "fmt"

func main(){
	c := 'a'
	switch {
	// case에 조건식 사용
	case '0' <= c && c <='9':
		fmt.Printf("%c는 숫자.", c)
	case 'a' <= c && c <= 'z':
		fmt.Printf("%c는 소문자", c)
	case 'A' <= c || c <= 'Z':
		fmt.Printf("%c는 대문자", c)
	}
}
