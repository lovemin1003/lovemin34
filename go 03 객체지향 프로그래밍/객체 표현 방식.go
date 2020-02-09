package main

import (
	"fmt"
)

type Item struct {
	name string
	price float64
	num int
}

func (t Item) cost() float64 {
	return t.price*float64(t.num)
}

func main() {

	shirt := Item{name: "너의 이름은?", price:1000, num: 5}

	fmt.Println(shirt.name,": ",shirt.cost())

}
