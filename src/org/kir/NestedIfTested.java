package org.kir;

public class NestedIfTested {

	public void toFindTheGradeList(int totalMark) {

		if ((totalMark >= 450) && (totalMark <= 500)) {
			System.out.println("Total mark is " + totalMark + " Grade A+");
		} else if ((totalMark >= 400) && (totalMark < 450)) {
			System.out.println("Total mark is " + totalMark + " Grade A");
		} else if ((totalMark >= 350) && (totalMark < 400)) {
			System.out.println("Total mark is " + totalMark + " Grade B");
		} else if ((totalMark >= 300) && (totalMark < 350)) {
			System.out.println("Total mark is " + totalMark + " Grade C");
		} else {
			System.out.println("Total mark is " + totalMark + " NOT PASS");
		}
	}

	public static void main(String[] args) {

		NestedIfTested obj = new NestedIfTested();

		obj.toFindTheGradeList(299);

	}

}
