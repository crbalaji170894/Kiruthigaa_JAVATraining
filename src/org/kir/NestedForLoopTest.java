package org.kir;

public class NestedForLoopTest {

	public static void main(String[] args) {

		for (int i = 4; i >=1; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print("*");

			}
			System.out.println();
		}

	}

}
//------------------------------------------------
//Step 1: i =1  1<=4 (true)
// 1a. j=1 1<=4 (true) j++=2
// 1a. j=2 2<=4 (true) j++=3
// 1a. j=3 3<=4 (true) j++=4
// 1a. j=4 4<=4 (true) j++=5
// false
//i++ =2
//Step 1: i =2  2<=4 (true)
//2a. j=1 1<=4 (true) j++=2
//2a. j=2 2<=4 (true) j++=3
//2a. j=3 3<=4 (true) j++=4  1<=4 * * * *
//2a. j=4 4<=4 (true) j++=5
//false
