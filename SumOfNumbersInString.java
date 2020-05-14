package day19.javaConcepts;

public class SumOfNumbersInString {

	public static void main(String[] args) {

		/***
		 Write a java code to find the sum of the given numbers
		 Input: "asdf1qwer9as8d7"
		 output: 1+9+8+7 = 25
		***/
		
		String input = "asdf1qwer9as8d7";
		String input_int = input.replaceAll("[^0-9]", "");
		int int_input = Integer.parseInt(input_int);
		System.out.println("The digits in the given String --> "+int_input);
		int solution = 0;
		while (int_input>0) {
			solution = solution+int_input%10;
			int_input = int_input/10;
		}
		System.out.println("The sum of given Digits is :: "+solution);
		
		
	}

}
