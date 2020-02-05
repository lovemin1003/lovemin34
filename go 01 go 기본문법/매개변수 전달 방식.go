package main

import "fmt"

func inc(i int){ //값에 의한 호출
	i += 1
}

func inc1(q *int){
	*q = *q + 1
}

func main(){
	i := 10
	inc(i)
	fmt.Println(i)

	q := 10
	inc1(&q)
	fmt.Println(q)

}
