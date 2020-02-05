package main
import "fmt"



func main() {
	sum := 0//for 문에 초기화 구문, 조건식, 후속 작업 정의
	for i:=0; i<11; i++{
		sum +=i
	}
	fmt.Println(sum)
	q := 0
	for q < 10{
		sum += q
		q++
	}
	fmt.Println(sum)
	w := 0
	for {

		if w >10{
			break
		}

		sum += w
		w++
	}
	fmt.Println(sum)
}
