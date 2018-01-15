package main

import (
	"fmt"
	"html/template"
	"log"
	"net/http"
)



func boot(w http.ResponseWriter, r *http.Request) {
	fmt.Println("method:", r.Method) //get request method
	if r.Method == "GET" {
		if t, err := template.ParseFiles("boot.gtpl"); err != nil {
			panic(err)
		} else {
			t.Execute(w, nil)
		}
		//fmt.Fprintf(w, "login astaxie!") // write data to response
	} else {
		r.ParseForm()
		// logic part of log in
		if len(r.Form["number"][0])==0{
			if t, err := template.ParseFiles("boot.gtpl"); err != nil {
				panic(err)
			} else {
				t.Execute(w, nil)
			}
		}
		fmt.Println("number:", r.Form["number"])
		fmt.Println("date:", r.Form["date"])
		fmt.Println("situation:", r.Form["situation"])
		fmt.Println("form:", r.Form["fromda"]," to: ",r.Form["todate"]," duration: ",r.Form["duration"])
		fmt.Println("mission subject:", r.Form["misssub"])
		fmt.Println("mission purpose:", r.Form["misspurp"])
		fmt.Println("request body:", r.Form["request_body"])


		requesterslice:=[]string{"1","2","3","4","5"}
		for _, v := range requesterslice {
			if v == r.Form.Get("requester") {
				fmt.Println("requester: ",r.Form.Get("requester"))
			}
		}
		missionplaceslice:=[]string{"1","2","3","4","5"}
		for _, v := range missionplaceslice {
			if v == r.Form.Get("mission_type") {
				fmt.Println("mission type: ",r.Form.Get("mission_type"))
			}
		}
		missiontypeslice:=[]string{"1","2","3","4","5"}
		for _, v := range missiontypeslice {
			if v == r.Form.Get("mission_place") {
				fmt.Println("mission place: ",r.Form.Get("mission_place"))
			}
		}
		shipslice:=[]string{"1","2","3","4","5"}
		for _, v := range shipslice {
			if v == r.Form.Get("ship") {
				fmt.Println("ship: ",r.Form.Get("ship"))
			}
		}

		//template.HTMLEscape(w, []byte(r.Form.Get("number"))) // responded to clients

	}
}

func main() {
	http.HandleFunc("/login", boot)
	http.Handle("/", http.FileServer(http.Dir("css/styles.css")))

	err := http.ListenAndServe(":9090", nil) // setting listening port
	if err != nil {
		log.Fatal("ListenAndServe: ", err)
	}
}