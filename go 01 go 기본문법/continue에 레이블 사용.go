package main

import "fmt"

func main(){
	x := 7
	table := [][]int{{1,5,6},{3,9,12,7},{18,7,4,8}}
	LOOP:
	for row := 0; row < len(table); row++ {
		for col := 0; col < len(table[row]); col++ {
			if table[row][col] ==x {
				fmt.Printf("found %d(row:%d , col:%d)\n", x, row, col)
				continue LOOP // LOOP로 지정된 for 문의 다음 반복문 수행
			}
		}

	}

}
