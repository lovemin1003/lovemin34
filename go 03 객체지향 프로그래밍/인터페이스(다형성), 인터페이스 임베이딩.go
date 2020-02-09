package main

import (
	"fmt"
	"io"
	"os"
	"strings"
)

type Coster interface {
	Cost() float64
}

func displayCost(c Coster) {
	fmt.Println("cost:",c.Cost())
}

// Item 타입과 DisItem 타입을 정의하고 각 타입에 Cost() float64 메소드를 정의한다.

type Itemer struct {
	name string
	price float64
	quantity int
}

func (t Itemer) Cost() float64 {
	return t.price * float64(t.quantity)
}

type DisItem struct {
	Itemer
	disRate float64
}

func (t DisItem) Cost() float64 {
	return t.Itemer.Cost() * (1.0 - t.disRate/100)
}

type Rental struct {
	name string
	feeperday float64
	periodLength int
	RentalPeriod
}

type RentalPeriod int

const (
	Days RentalPeriod = iota
	Weeks
	Months
)

func (p RentalPeriod) Todays() int {
	switch p {
	case Weeks:
		return 7
	case Months:
		return 12
	default:
		return 1
	}
}

func (r Rental) Cost() float64 {
	return r.feeperday * float64(r.Todays() * r.periodLength)
}

type Itemq []Coster

func (ts Itemq) Cost() (c float64) {
	for _, t := range ts {
		c += t.Cost()
	}
	return
}

func Println(a ...interface{}) (n int, err error) {
	return Fprintln(os.Stdout, a...)
}

func Fprintln(w io.Writer, a ...interface{}) (n int, err error) {


	//fmt.Stringer //인터페이스 타입일 경우 String() 메소드의 결과값을 출력

	return

}

type Stringer interface {
	String() string
}

func (t Itemer) String() string {
	return fmt.Sprintf("[%s] %.0f",t.name, t.Cost())
}

func (t DisItem) String() string {
	return fmt.Sprintf("%s -> %.0f(%.0f%s DC)", t.Itemer.String(), t.Cost(), t.disRate, "%")
}

func (t Rental) String() string {
	return fmt.Sprintf("[%s] %.0f",t.name, t.Cost())
}

func (ts Itemq) String() string {
	var s []string
	for _, t := range ts {
		s = append(s, fmt.Sprint(t))
	}
	return fmt.Sprintf("%d items. total: %.0f\n\f- %s",len(ts), ts.Cost(), strings.Join(s, "\n\t-"))
}

// 인터페이스 임베이딩
type Itemking interface {
	Coster
	fmt.Stringer
}

type Order struct {
	Itemking
	taxRate float64
}

func (o Order) Cost() float64 {
	return o.Itemking.Cost() * (1.0 + o.taxRate/100)
}

func (o Order) String() string {
	return fmt.Sprintf("총 비용: %.0f(세율:%.2f)\n\t주문 내역:%s",
		o.Cost(), o.taxRate, o.Itemking.String())
}
func main() {
	bread := Itemer{"sweet", 100, 6}
	eventbread := DisItem{Itemer{"bitter",120, 8},10.00}
	displayCost(bread)
	displayCost(eventbread)

	corone := Itemer{"corone", 100, 6}
	sabre := Rental{"sabre", 100, 6, Days}
	displayCost(corone)
	displayCost(sabre)

	shirt := Itemer{"tshirt", 10000, 2}
	video := Rental{"av", 12000, 4, Days}
	eventmouse := DisItem{Itemer{"mouse",14000, 5},10.0}

	qqq := Itemq{shirt,video, eventmouse}
	displayCost(qqq)

	fmt.Println(shirt)
	fmt.Println(video)
	fmt.Println(eventmouse)
	fmt.Println(qqq)

	//인터페이스 임베이딩
	order1 := Order{Itemq{shirt, eventmouse},10.00}
	order2 := Order{video, 5.00}
	fmt.Println(order1)
	fmt.Println(order2)
}

