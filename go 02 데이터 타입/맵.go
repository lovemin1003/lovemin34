package main

import (
	"fmt"
)

func main() {

	// 맵 생성 예제 1
	numbermap := map[string]int{}
	numbermap["one"] = 1
	numbermap["two"] = 2
	numbermap["three"] = 3
	fmt.Println(numbermap)

	// 맵 생성 예제 2
	numbermap1 := map[string]int{
		"one": 1,
		"two": 2,
		"three": 3, // 요소를 여러 줄로 표기할 때 요소의 끝에 ,를 붙여야 함.
	}
	fmt.Println(numbermap1)

	// 맵 생성 예제 3
	numbermap2 := make(map[string]int, 3) // 용량 생략 가능
	numbermap2["one"] = 1
	numbermap2["two"] = 2
	numbermap2["three"] = 3
	fmt.Println(numbermap2)

	// 맵 내부 요소에 순차적으로 접근
	numbermap3 := make(map[string]int)
	numbermap3["one"] = 1
	numbermap3["two"] = 2
	numbermap3["three"] = 3

	for k, v := range numbermap3 {
		fmt.Println(k, v)
	}

	// 값 찾기
	//	numbermap := map[string]int{}
	//	numbermap["one"] = 1
	//	numbermap["two"] = 2
	//	numbermap["three"] = 3
	fmt.Println("값 찾기:",numbermap["one"])
	fmt.Println("값 찾기:",numbermap["three"])

	// 요소 제거(시에는 delete() 함수를 쓰면 된다.
	delete(numbermap, "one")
	fmt.Println(numbermap)

	// 슬라이스는 참조 타입이므로 맵의 키로 사용할 수 없지만 []byte 타입과 []int32 타입은 string으로 변환하면 맵의 키로 쓸 수 있음.
	groupMap := make(map[string]string)

	g1 := []int32{1, 2, 3}
	g2 := []int32{4, 5, 6}

	groupMap[string(g1)] = "one"
	groupMap[string(g2)] = "two"

	fmt.Println(groupMap[string(g1)])
	fmt.Println(groupMap[string(g2)])

}
