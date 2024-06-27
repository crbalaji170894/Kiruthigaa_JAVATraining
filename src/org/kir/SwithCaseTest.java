package org.kir;

public class SwithCaseTest {

	public static void main(String[] args) {
		
		switch("Test2")

		{
		case "Test": 
			System.out.println("First Case");
			break;
		
		case "Test2": 
		System.out.println("Second Case");
		break;
		
		case "Test3": 
			System.out.println("Third Case");
			break;
		
		case "Test4": 
		System.out.println("Fourth Case");
		
		break;
		
		default:
			System.out.println("This Case is Defualt");
			break;
	}
}

}
