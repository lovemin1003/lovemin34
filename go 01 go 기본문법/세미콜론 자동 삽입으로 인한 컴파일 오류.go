package main
import "fmt"



func main() {
	sum := 0 //for 문에 초기화 구문, 조건식, 후속 작업 정의
	for i := 0; i < 11; i++ {
		sum += i

	}
	fmt.Println(sum)
	for i := 0; i < 11; i++ //중괄호({})는 반드시 제어문이나 함수가 시작되는 줄의 끝에 있어야 함.
	{
		sum += i

	}
	fmt.Println(sum)
}
