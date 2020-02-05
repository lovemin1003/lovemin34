package main

import "fmt"

func area(w,h int) int { // 반환 값이 하나일 경우
	return w * h
}

func multi(w,h int) (int, int) { // 반환 값이 둘일 경우
	return w * 3, h * 5
}

func main(){
	a := area(3,5)
	fmt.Println(a)

	q, w := multi(3,5)
	fmt.Println(q, w)

	// z, x := area(3,5)
	// fmt.Println(z, x)
	//# command-line-arguments
	//.\반환 값.go:20:7: assignment mismatch: 2 variables but area returns 1 values
	// 함수의 결과를 할당할 변수와 반환 값 개수가 다를 경우 컴파일 에러 발생
}
