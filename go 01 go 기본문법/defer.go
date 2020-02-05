package main

import "fmt"

func f(){
	for i := 0; i < 5; i++ {
		defer fmt.Printf("%d ",i)
		// 함수 하나에 defer 키워드를 여러 개 사용시 defer로 지정한 각 구문은 스택에 쌓였다가 나중에 쌓인 defer 구문부터 수행됨.
	}
}

// defer 키워드는 함수가 종료되기 전까지 특정 구문의 실행을 지연시키고, 함수가 종료되기 직전에 지연시켜둔 구문을 수행함.
func f1(){
	fmt.Println("f1 start")
	defer f2()
	fmt.Println("f1 end")
}

func f2(){
	fmt.Println("f2 defer")
}

func main(){
	f1()
	f()
}
