package main

import (
	"fmt"
	"sort"
)

func main() {
	var a []int // int 형 슬라이스 선언. 길이, 용량은 0으로 지정됨.
	b := []int{} // int 형 슬라이스 선언. 길이, 용량은 0으로 지정됨.
	c := []int{1, 2, 3} // 슬라이스 선언과 동시에 값을 초기화
                        // 길이와 용량은 요소의 개수로 지정됨
	d := [][]int{ // 다차원 슬라이스 선언
		{1, 2},
		{3, 4, 5},
	}

	e := make([]int, 0) // make 함수로 길이와 용량이 0인 슬라이스 생성
	f := make([]int, 3, 5) // make 함수로 길이가 3이고 용량이 5인 슬라이스 생성

	fmt.Printf("%-10T %d %d %v\n",a, len(a), cap(a), a)
	fmt.Printf("%-10T %d %d %v\n",b, len(b), cap(b), b)
	fmt.Printf("%-10T %d %d %v\n",c, len(c), cap(c), c)
	fmt.Printf("%-10T %d %d %v\n",d, len(d), cap(d), d)
	fmt.Printf("%-10T %d %d %v\n",e, len(e), cap(e), e)
	fmt.Printf("%-10T %d %d %v\n",f, len(f), cap(f), f)

	// 내부 요소에 순차적으로 접근
	num := []int{1,3,5,2,7}
	for index, value := range num {
		fmt.Println(index, value)
	}

	// 인덱스 사용하지 않고 현재 요소의 값만 사용할 때는 인덱스 값을 빈 식별자(_)로 받으면 된다.
	sum := 0
	for _, n := range num {
		sum += n
	}
	fmt.Println("sum:",sum)

	// 슬라이스 추가
	ns1 := []int{1, 2, 3}
	ns2 := []int{6, 7, 8}
	ns3 := []int{8, 9, 10, 11}

	ns1 = append(ns1, 4,5) // [1,2,3,4,5]
	ns1 = append(ns1, ns2...) // [1,2,3,4,5,6,7,8]
	ns1 = append(ns1, ns3[1:3]...) // [1,2,3,4,5,6,7,8,9,10]

	fmt.Println(ns1)

	// 슬라이스의 용량이 새 요소를 추가하기에 부족할 경우 append() 함수는 내부에 용량이 늘어난 새 슬라이스를 만들어 반환한다.
	s := make([]int, 0, 3)
	for i := 0; i < 9; i++ {
		s = append(s, i)
		fmt.Printf("len: %d, cap: %d, %v\n",len(s), cap(s), s)
	}

	// 슬라이스 삽입
	// num := []int{1,3,5,2,7}
	num = insert(num, []int{8, 9}, 0) // [8 9 1 3 5 2 7]
	fmt.Println(num)

	num = insert(num, []int{6}, 2) // [8 9 6 1 3 5 2 7]
	fmt.Println(num)

	num = insert(num, []int{4}, len(num)) // [8 9 6 1 3 5 2 7 4]
	fmt.Println(num)

	// 정렬
	sort.Ints(num)
	fmt.Println(num)
}

func insert(s, new []int, index int) []int {
	return append(s[:index], append(new, s[index:]...)...)
}