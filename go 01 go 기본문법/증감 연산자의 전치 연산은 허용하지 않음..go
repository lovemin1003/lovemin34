package main
import "fmt"



func main() {
	sum := 0 //for 문에 초기화 구문, 조건식, 후속 작업 정의
	for i := 0; i < 11; i++ {
		sum += i
		++i //증감 연산자의 전치 연산은 허용하지 않음. 컴파일 에러 발생
	}
	fmt.Println(sum)
}
