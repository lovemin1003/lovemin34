package main

import (
	"fmt"
	"reflect"
)


// 다른 구조체를 구조체의 내부 필드로 지정하면 지정한 필드명으로 내부 구조체의 필드에 접근할 수 있다.
type dimen struct {
	w, h, l int
}

type item struct {
	name string
	price int
	quan int
	packdimen dimen
	itemdimen dimen
}

type poke struct {
	name string "포켓몬 이름"
	level int "포켓몬 레벨"
}
func main() {

	shoes := item {
		"nintendo switch", 320000, 2,
		dimen{10,20, 30},
		dimen{100,200,300},
	}

	// 내부 필드인 dimension 구조체의 값 출력
	// 구조체의 값을 출력할 때 필드명과 값을 함께 출력하려면 %#v를 사용하면 됨.
	fmt.Printf("%#v\n", shoes.itemdimen)
	fmt.Printf("%#v\n", shoes.packdimen)

	// dimen 구조체의 내부 필드 값 출력
	fmt.Println(shoes.packdimen.w)
	fmt.Println(shoes.packdimen.h)
	fmt.Println(shoes.packdimen.l)
	fmt.Println(shoes.itemdimen.w)
	fmt.Println(shoes.itemdimen.h)
	fmt.Println(shoes.itemdimen.l)

	//태그는 reflect.TypeOf() 함수로 확인 가능.
	pokemon := reflect.TypeOf(poke{})
	for i := 0; i < pokemon.NumField(); i++ {
		fmt.Println(pokemon.Field(i).Tag)
	}

}
