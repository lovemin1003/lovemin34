package main

import (
	"fmt"
)

// 함수 서명을 사용자 정의 타입으로 사용
// 현재 코드 문맥에 맞는 의미를 부여하기 위해 함수 서명을 사용자 정의 타입으로 정의하는 것도 좋음.
type quant int

type costcal func(quant, float64) float64

// 기본 서명인 func(quant, float64) float64를 사용하는 것 보다 costcal 타입을 사용하는 것ㅇ
// 더 가독성이 높고 의미도 분명하게 전달된다.
func describe(q quant, price float64, c costcal) {
	fmt.Printf("quan: %d, price: %0.0f, cost: %0.0f\n", q, price, c(q,price))
}

// 메소드는 값에 의한 호출이 기본 방식이며 메소드 내부에서 리시버 변수값을 변경하려면 리서버 변수의 메모리 주소를 전달해야함.
type quanti int

// 참조에 의한 호출로 리시버 변수의 주소를 전달하려면 리시버 타입에 *를 사용하여 포인터로 지정해야함.
// 리시버를 포인터로 지정하면 메소드 호출시 리시버 변수의 메모리 주소가 전달되므로 메소드 내부에서 리시버 변수의 값을 바꿀 수 있음.
func (q quanti) great(i int) bool {
	return int(q) > i
}

func (q *quanti) inc() {
	*q++
}

func (q *quanti) dec() {
	*q--
}

// 메소드 내부에서 리시버 변수를 사용하지 않는다면 메소드를 정의할 때 리시버 변수를 생략할 수 있음.
type rect struct {
	width float64
	height float64
}

func (rect) new() rect {
	return rect{}
}

func main() {

	// 기본 타입을 사용자 정의 타입으로 사용
	type quan int
	type dozen []quan
	var d dozen

	for i := quan(1); i <= 12; i++ {
		d = append(d, i)
	}
	fmt.Println(d)

	// 사용자 정의 타입과 기본 타입간의 타입 변환
	// 기본 타입을 매개변수로 받는 함수에 사용자 정의 타입을 매개변수로 전달하려면 사용자 정의 타입을 기본 타입으로 바꿔야함.
	// 사용자 정의 타입을 매개변수로 함수에 기본 타입을 매개변수로 전달ㄹ하려면 기본 타입을 사용자 정의 타입으로 바꿔야함.
	// type quan int
	var q quan = 3
	display(int(q))

	var per, won costcal

	per = func(q quant, price float64) float64 {
		return float64(q) * price * 0.9
	}

	won = func(q quant, price float64) float64 {
		return float64(q) * price - 1000
	}

	describe(3, 10000, per)
	describe(3, 10000, won)

	w := quanti(3)
	w.inc()
	fmt.Printf("q(%d)는 %d보다 큰가? %t\n", w, 3, w.great(3))
	w.dec()
	fmt.Printf("q(%d)는 %d보다 큰가? %t\n", w, 3, w.great(3))

	//리시버 변수가  생략된 메소드를 호출할 시 rect.new{}처럼 해당 타입 값을 생성하면서 바로 메소드를 호출하면 된다.
	r := rect{}.new()
	fmt.Println(r)

}

func display(i int) {
	fmt.Print(i) //3
}




