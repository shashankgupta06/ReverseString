import java.util.Scanner;


public class ReverseString {


	
	private static Scanner read;

	public static void main(String[] args) {

		Boolean toggle = true;
		
		while(toggle == true) {
			System.out.println("Enter string you would like to reverse");
			
			read = new Scanner(System.in);
			String word = read.nextLine();
			stringReverse(word);
			
			System.out.println("Continue? y or n");
			word = read.nextLine();
			
			if(word.equals("y")) {
				toggle = true;
			}else if (word.equals("n")) {
				toggle = false;
			}
		}
		
	}
	
	public static void stringReverse(String stringToReverse) {
		
		
		String emptyString = "";
		
		for(int i=stringToReverse.length()-1; i>=0; i--) {
			emptyString = emptyString + stringToReverse.charAt(i);
		}
		System.out.println("Result:");
		System.out.println(emptyString);
		
	}
}
