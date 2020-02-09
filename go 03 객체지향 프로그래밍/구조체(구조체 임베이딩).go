package main

import (
	"fmt"
)

type option struct {
	name string
	value string
}

type items struct {
	name string
	price float64
	quan int
	option // 임베이드 필드
}

func (t items) cost() float64 {
	return t.price * float64(t.quan)
}

type disitem struct {
	items
	disrate float64
}

// 임베이드 필드에 정의된 메소드를 오버라이딩할 수도 있음.
func (t disitem) discost() float64 {
	return t.price * float64(t.quan)*0.9
}

func main() {
	bread := items{"choco corone", 1200, 3, option{"flavor","cocoa"}}

	fmt.Println(bread)

	//names 필드에 접근
	fmt.Println(bread.name)

	// 임베이드 필드인 option 구조체의 내부  필드인 value에 접근
	fmt.Println(bread.value)

	// 임베이드 필드인 option 구조체의 내부 필드 name에 접근
	// items 구조체에 이름인 같은 필드가 있으므로 option 타입을 명시
	fmt.Println(bread.option.name)

	cookie := items{"makaron", 1400, 5, option{"flavor","apple"}}
	eventcookie := disitem{items{"sabre", 1100, 3, option{"flavor","choco"}},10.00}

	fmt.Println(cookie.cost())
	fmt.Println(eventcookie.cost())
	fmt.Println(eventcookie.discost())

}
