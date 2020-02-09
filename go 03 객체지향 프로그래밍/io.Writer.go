package main

import (
	"fmt"
	"io"
	"net/http"
	"os"
	"time"
)

//type Writer interface {
//	Write(p []byte) (n int, err os.Error)
//}
//
//func Fprintln(w io.Writer, a ...interface{}) (n int, err error)
//{
//	return
//}

func handle(w io.Writer, msg string) {
	fmt.Fprintln(w, msg)
}

func main() {
	msg := []string{"expose", "burn", "out","!!!"}

	for _, s := range msg {
		time.Sleep(200 * time.Millisecond)
		handle(os.Stdout,s)
	}

	http.HandleFunc("/",func(w http.ResponseWriter, r *http.Request) { handle(w, r.URL.Path[1:])})

	fmt.Println("chuchu")
	http.ListenAndServe(" cv:츠무츠무", nil)

}