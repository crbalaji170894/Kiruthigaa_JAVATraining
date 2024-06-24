package org.kir;

public class BreakAndContinueTest {

	public void breakKeywordTest() {

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			if (i == 5) {
				break;
			}

		}

	}

	public void continueKeywordTest() {

		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		BreakAndContinueTest object = new BreakAndContinueTest();

		object.breakKeywordTest();

		object.continueKeywordTest();

	}

}
