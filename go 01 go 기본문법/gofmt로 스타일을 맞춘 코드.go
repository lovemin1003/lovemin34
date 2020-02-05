package main

import "fmt"

func main(){
	type Rect struct{
		width int // width
		height int //heigt
	}


	r := Rect{1,2}
	fmt.Println(r.width*3, r.height*5)
}
