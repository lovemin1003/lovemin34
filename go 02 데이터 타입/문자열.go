package main

import (
	"bytes"
	"fmt"
	"math"
	"strings"
	"unicode"
	"unicode/utf8"
)

func main(){
	// 유니코드의 코드값으로 문자를 표현할 때는 앞에 \u나 \U를 붙인다.
	// 코드 포인트가 4자리인 유니코드 문자는 \u를 붙이며, 코드 포인트가 8자리인 유니코드는 \U를 붙인다.
	var ch int = '\u0041'
	var ch2 int = '\uAC00'
	var ch3 int = '\U00101234'
	fmt.Printf("%8d - %8d, %8d\n", ch, ch2, ch3) // 정수
	fmt.Printf("%8c - %8c, %8c\n", ch, ch2, ch3) // 문자
	fmt.Printf("%8X - %8X, %8X\n", ch, ch2, ch3) // UTF-8 바이트 수
	fmt.Printf("%8U - %8U, %8U\n", ch, ch2, ch3) // UTF-8 코드값

	// 문자열 내부에 바이트 단위로 접근할 때는 인덱스([])를 사용한다.

	s := "aichi"
	fmt.Println(s[0]) // 문자열 s의 첫번째 문자 a의 코드값
	fmt.Println(s[len(s)-1]) // 문자열 s의 마지막 문자 i의 코드값

	// 문자열을 []rune 타입으로 바꾼 뒤 인덱스 사용
	s1 := "area"
	s2 := "드래펄트"
	r1 := []rune(s1)
	r2 := []rune(s2)
	fmt.Printf("s1: %c %c %c %c\n", r1[0], r1[1], r1[2], r1[3])
	fmt.Printf("s1: %c %c %c %c\n", r2[0], r2[1], r2[2], r2[3])

	// 문자열의 내부 문자에 순차적으로 접근
	// s1 := "area"
	// s2 := "드래펄트"
	for i, c := range s1 {
		fmt.Printf("%c(%d) ",c, i )
	}
	fmt.Println()
	for i, c := range s2 {
		fmt.Printf("%c(%d) ",c, i )
	}
	fmt.Println()

	// 문자열의 내부 문자수를 구할 때는 unicode/utf8 패키지의 utf8.RuneCountInString() 함수를 사용하거나
	// 문자열을 []rune 타입으로 변환 후 변환한 값의 길이(len([]rune()))를 구하면 된다.
	// s1 := "area"
	// s2 := "드래펄트"
	fmt.Println(len(s1))
	fmt.Println(len(s2))
	fmt.Println(utf8.RuneCountInString(s2))
	fmt.Println(len([]rune(s2)))

	// + 연산자 사용
	var str string
	for i := 0; i < math.MaxUint8; i++ {
		if s, ok := nextString(i); ok {
			str += s
		}
	}
	fmt.Print(str,"\n")

	// string.Join()함수 사용
	strArr := []string{}
	for i := 0; i <math.MaxUint8; i++ {
		if s, ok := nextString(i); ok {
			strArr = append(strArr, s)
		}
	}
	fmt.Println(strings.Join(strArr, ""))

	var buffer bytes.Buffer
	for i := 0; i <math.MaxUint8; i++ {
		if s, ok := nextString(i); ok {
			buffer.WriteString(s)
		}
	}
	fmt.Print(buffer.String(),"\n")

}
func nextString(i int) (s string, ok bool) {
	if unicode.IsLetter(rune(i)) {
		return string(i), true
	}
	return "",false
}
