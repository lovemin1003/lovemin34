package main

import (
	"fmt"
)

// 인터페이스도 타입으로 정의하지 않고 익명으로 사용할 수 있다.
// display() 함수의 매개변수 타입을 interface{show()}로 정의했다.
// display() 함수에는 show() 메소드를 가진 타입을 매개변수로 전달할 수 있다.
func display(s interface {show()}) {
	s.show()
}

type rect struct {
	w, h float64
}

func (r rect) show() {
	fmt.Printf("넓이: %f, 높이: %f\n",r.w, r.h)
}

type circle struct {
	r float64
}

func (c circle) show(){
	fmt.Printf("반지름: %f\n",c.r)
}

// interface{} 타입은 메소드를 정의하지 않은 인터페이스이며 이 인터페이스에는 정의된 메소드가 없어서
// 어떤 값이든 interface{}로 쓸 수 있음.
// 즉, 함수나 메소드의 매개변수를 interface{} 타입으로 정의하면 어떤 값이든 전달받을 수 있다.
func displays(s interface{}) {
	fmt.Println(s)
}

func main() {
	r := rect{3, 4}
	c := circle{3}
	display(r)
	display(c)
	displays(c) // 3(circle{3})
	displays(69)
	displays("노데스웅차")
}