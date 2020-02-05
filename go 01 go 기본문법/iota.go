package main

import "fmt"

const(
	//iota로 비트 연산의 결과값을 상수로 선언
	run = 1 << iota //1 << 0 == 1
	wait // 1 << 1 == 2
	send // 1 << 2 == 4
)

func main(){
	//or 연산자(|)로 stat 변수 생성
	stat := run|send
	display(stat)
}

func display(stat int){
	//AND 연산자로 stat에 포함된 비트 값의 상태 출력
	if stat&run == run{
		fmt.Println("run")
	}
	if stat&wait == wait{
		fmt.Println("wait")
	}
	if stat&send == send{
		fmt.Println("send")
	}

}


