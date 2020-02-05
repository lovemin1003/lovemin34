package main

import "fmt"

func main(){
	x := 7
	table := [][]int{{1,5,6},{3,9,12},{7,4,8}}
	found := false
	for row := 0; row < len(table); row++ {
		for col := 0; col < len(table[row]); col++ {
			if table[row][col] ==x {
				found = true
				fmt.Printf("found %d(row:%d , col:%d)\n", x, row, col)
				break
			}
		}
		if found {
			break
		}
	}

}

