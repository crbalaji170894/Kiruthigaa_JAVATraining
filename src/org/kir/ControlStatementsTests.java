package org.kir;

public class ControlStatementsTests {

	int eligibleAgeToPoll = 18;

	public void toFindPollEligiblity(int age) {

		if ((age >= eligibleAgeToPoll) && (age <= 100)) {

			System.out.println("The age eligible to poll votes");
		} else {
			System.out.println("The age does not eligble to poll the votes");
		}
	}

	public static void main(String[] args) {

		ControlStatementsTests obj = new ControlStatementsTests();

		obj.toFindPollEligiblity(101);

	}

}
