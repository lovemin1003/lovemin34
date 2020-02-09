package main

import "fmt"



func checkType(v interface{}) {
	switch v.(type) {
	case bool:
		fmt.Printf("%t is bool\n", v)
	case float64:
		fmt.Printf("%.1f is float64\n", v)
	case string:
		fmt.Printf("%s is string\n", v)
	default:
		fmt.Printf("%v is unknown type\n", v)
	}
}

func main() {
	checkType(true)
	checkType(0.4)
	checkType("포켓몬")
}