package main

import "fmt"

func callback(y int, f func(int, int)){
	f(y,2) //add(1,2)를 호출
}

func add(a, b int) {
	fmt.Printf("%d+%d=%d",a,b,a+b)
}

func main(){
	callback(1,add)
}
