// You can edit this code!
// Click here and start typing.
package main

import "fmt"

func main() {

	//int a = 5;
	a := 5
	b := &a

	fmt.Println(b)

//pass by reference
	test(&a)

	fmt.Println(b)
	fmt.Println(&a)

	fmt.Println(*b)
	fmt.Println(a)
	//-----------

//pass by value
	test2(a)
	fmt.Println(a)
}

func test(d *int) {
	*d = 12
	fmt.Println(d)
}

func test2(d int) {
	d = 15
}
