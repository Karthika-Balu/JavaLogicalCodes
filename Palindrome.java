package day18.javaConcepts;

public class Palindrome {

	public static void main(String[] args) {

		/** Check for the palindrome of the given string:
		Input: "malayalam"
		output: Yes, Palindrome
		Input: "testleaf"
		output: No, not a palindrome
		**/
		String str1 = "malayalam";
		String str2 = "testleaf";
		String revStr1 = "";
		String revStr2 = "";
		int length = str1.length();
		
		for (int i = length-1; i >= 0; i--) {
			revStr1 = revStr1+str1.charAt(i);	
		}
		
		for (int i = str2.length()-1; i >= 0; i--) {
			revStr2 = revStr2+str2.charAt(i);
		}
		
		if (str1.equals(revStr1)) {
			System.out.println("The string is palindrome :: "+str1);
		} 
		else {
			System.out.println("The string is not a palindrome :: "+str1);
		}
		
		if(str2.equals(revStr2))  {
			System.out.println("The string is palindrome :: "+str2);
		}
		else {
			System.out.println("The string is not a palindrome :: "+str2);
		}
	}

}
