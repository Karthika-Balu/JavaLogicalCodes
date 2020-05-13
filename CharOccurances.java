package day18.javaConcepts;

public class CharOccurances {

	public static void main(String[] args) {
		/**
		1. Write a Java Program to find the occurance of the character 'o' in the following String.
		Input: "You have no choice other than following me!"
		output: Occurance of o is: 6
		**/
		
		String input = "You have no choice other than following me!";
		
		/*// Method 1
		String input = "You have no choice other than following me!";
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			
			char char_o = input.charAt(i);

			if (char_o=='o') {
				count++;
			}
		}
		System.out.println("The number of occurances of o is :: "+count);*/
		
		// Method 2
		int count = 0;
		char[] input_text = input.toCharArray();
		for (int j = 0; j < input_text.length; j++) {
			if (input_text[j] == 'o') {
				count++;
			} 
		}
		System.out.println("The number of occurances of o is :: "+count);
	}

}
