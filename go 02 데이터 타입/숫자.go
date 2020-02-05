package main

import (
	"fmt"
	"math"
)

func main() {

	//8진수, 16진수 사용
	a := 160 //10진수
	b := 0200 //8진수
	c := 0x100 //16진수

	fmt.Println(a, b, c)

	var ch1 byte = 65 // 10진수
	var ch2 byte = 0101 // 8진수
	var ch3 byte = 0x41 // 16진수

	var ch4 rune = 44032 // 10진수
	var ch5 rune = 0126000 // 8진수
	var ch6 rune = 0xAC00 // 16진수

	fmt.Println(ch1, ch2, ch3)

	fmt.Println(ch4, ch5, ch6)

	//complex64: 32비트의 실수부, 허수부
	//complex128 64비트의 실수부, 허수부
	c1 := 1 + 2i //complex128
	c2 := complex64(3 + 4i) //complex64
	c3 := complex(5,6) //complex128

	fmt.Println(c1, real(c1), imag(c1))
	fmt.Println(c2, real(c2), imag(c2))
	fmt.Println(c3, real(c3), imag(c3))

	fmt.Println(intToUnit8(100))
	fmt.Println(intToUnit8(1000))

}

func intToUnit8(i int) (uint8 , error){
	if 0 <= i && i <= math.MaxUint8{
		return uint8(i), nil
	}
	return 0, fmt.Errorf("%d cannot convert to unit8 type", i)
}