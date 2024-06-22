package org.kir;

public class ForLoopTest {

	public static void main(String[] args) {

		for (int i = 0; i <= 5; i++) {

			System.out.println(i);

		}

	}

}
//-------------------------------------------------------
// Step 1:  i=0  0<=5  (true) <0>Print  i++ =1
// Step 2:  i=1  1<=5  (true) <1>Print  i++=2
// Step 3:  i=2  2<=5  (true) <2>Print  i++=3
// Step 4:  i=3  3<=5  (true) <3>Print  i++=4
// Step 5:  i=4  4<=5  (true) <4>Print  i++=5
// Step 6:  i=5  5<=5  (true) <5>Print  i++=6
// Step 7:  i=6  6<=5  (false)
//it comes out of the loop