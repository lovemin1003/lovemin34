package main

import(
	"fmt"
	"strings"
)

func make(suff string) func(string) string {
	return func(name string) string {
		if !strings.HasSuffix(name, suff) {
			return name + suff
		}
		return name
	}
}

func main(){
	addzip := make(".zip")
	addtgz := make(".tar.gz")
	fmt.Println(addtgz("go1.src"))
	fmt.Println(addzip(("go1.win")))
}
