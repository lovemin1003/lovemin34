package main

import (
	"fmt"
)

// area()메소드를 가진 shape 인터페이스를 정의한다. 그리고 shape 인터페이스를 매개변수로 받아, shape에 있는
// area()메소드의 실행 결과를 출력하는 describe() 함수를 정의한다.
type shape interface {
	area() float64
}

func describe(s shape) {
	fmt.Println(s.area())
}

// rect 구조체와 area()메소드를 정의함. main 함수에서는 rect 타입의 값을 매개변수로 전달하여
// describe() 함수를 실행한다.
type rect struct {
	w, h float64
}

func (r rect) area() float64 {
	return r.w * r.h
}

func main() {
	r := rect{3,5}
	describe(r)
}
