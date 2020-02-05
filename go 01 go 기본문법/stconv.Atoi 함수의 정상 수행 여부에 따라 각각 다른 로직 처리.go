package main
import(
	"fmt"
	"strconv"
	)

func displayInt(s string){
	if v, err := strconv.Atoi(s); err != nil{
		// if문의 초기화 구문에는 strconv.Atoi(origin)의 결과를 변수 v, err에 받아오는 코드를 작성했으며
		// 조건식으로 err의 유무를 확인함.
		fmt.Printf("%s는 정수가 아닙니다.\n",s)
	} else{
		fmt.Printf("정수 값은 %d입니다.", v)
	}
}

func main(){
	displayInt("one")
	displayInt("1")

}
