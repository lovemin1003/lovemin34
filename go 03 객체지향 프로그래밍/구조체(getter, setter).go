package main

import "fmt"

type Items struct {
	name string
	price float64
	quantity int
}

func NewItem(name string, price float64, quantity int) *Items {
	return &Items{name, price, quantity}
}

func (t *Items) Name() string {
	return t.name
}

func (t*Items) SetName(n string) {
	if len(n) != 0 {
		t.name = n
	}
}

func (t *Items) Price() float64 {
	return t.price
}

func (t *Items) SetPrice(p float64) {
	if p > 0 {
		t.price = p
	}
}

func (t *Items) Quantity() int {
	return t.quantity
}

func (t *Items) SetQuantity(q int) {
	if q > 0 {
		t.quantity = q
	}
}

func main() {

	breads := NewItem("bread", 10, 3)
	fmt.Println(breads)
	breads.SetPrice(100)
	breads.SetQuantity(5)
	fmt.Println(breads.Price())
	fmt.Println(breads.Quantity())
}





