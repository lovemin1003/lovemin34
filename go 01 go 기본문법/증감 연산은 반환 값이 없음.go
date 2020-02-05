package main
import "fmt"



func main() {
	sum := 0
	for i := 0; i < 11; i++ {
		sum += i++ //증감 연산은 반환 값이 없음. 컴파일 오류 발생
	}
	fmt.Println(sum)
}