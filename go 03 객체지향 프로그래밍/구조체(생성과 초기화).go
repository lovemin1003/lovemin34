package main

import (
	"fmt"
)

type Item struct {
	name string
	level float64
	quan int
}

type rect struct {
	w, h int
}



func main() {
	// 구조체 리터럴로 생성

	음번 := Item{name: "음번", level: 10, quan: 1}
	에이스번 := Item{name: "에이스번", level: 100, quan: 2}
	타노스 := Item{name: "타노스", level: 10000, quan: 10}

	fmt.Println(음번)
	fmt.Println(에이스번)
	fmt.Println(타노스)

	// 구조체 리터럴 앞에 주소 연산자(&)를 붙이면 생성된 구조체의 메모리 주소를 반환한다.
	p := &Item{name: "에이스번", level: 100, quan: 2}
	fmt.Println(p)

	// new() 함수는 제로값으로 초기화된 구조체를 생성한 후 생성된 구조체의 메모리 주소가 담긴 포인터를 반환한다.
	item := new(Item)
	item.name = "인텔리레온"
	item.level = 95
	item.quan = 5

	fmt.Println(item)
	fmt.Println(item.level)

	// 구조체의 포인터를 생성하는 방법은 new(Type), &Type()가 있으며 주어진 타입에 맞는 메모리 공간을 할당해
	// 제로값으로 초기화한 후 새로 만들어진 메모리의 주소를 반환한다.
	// 구조체 포인터를 &Type{}로 생성하면 초기값이 할당된 구조체의 포인터를 생성할 수 있어서 활용도가 높음.
	// 포인터를 초기화할 경우 주소 연산자 (&)를 사용하는 코드와 new 함수를 사용하는 코드를 비교해보자.

	r1 := rect{1,2}
	r2 := new(rect)
	r2.w, r2.h = 10,20
	r3 := &rect{}
	r4 := &rect{5,6}

	// r2,r3,r4 포인터를 보면 두 방법의 결과가 같다는 것을 알 수 있다.
	fmt.Println(r1)
	fmt.Println(r2)
	fmt.Println(r3)
	fmt.Println(r4)

	// 구조체를 타입으로 정의하지 않고 익명으로 쓸 수도 있음.
	rects := []struct {w, h int} {
		{1, 2},
		{3, 4},
		{},
	}

	for _, r := range rects {
		fmt.Printf("%d, %d\n", r.w, r.h)
	}


}
