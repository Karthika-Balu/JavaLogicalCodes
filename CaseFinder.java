package day19.javaConcepts;

public class CaseFinder {

	public static void main(String[] args) {

		/**
		 Write a java program to find the number of Uppercase, lowercase, numbers and spaces in the following String.
		 Input: "1. It is Work from Home  not Work for Home"
		**/
		String input = "1. It is Work from Home  not Work for Home";
		String upperStr = input.replaceAll("[^A-Z]", "");
		String lowerStr = input.replaceAll("[^a-z]", " ");
		String digitsStr = input.replaceAll("[^0-9]", " ");
		int spaceCount = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch==' ') {
				spaceCount++;
			}
		}
		
		System.out.println("The number of Uppercase in the input String is --> "+upperStr.length());
		System.out.println("The number of LowerCase in the input String is --> "+lowerStr.length());
		System.out.println("The number of Digits in the input String is --> "+digitsStr.length());
		System.out.println("The number of white spaces in the input String is --> "+spaceCount);

		
	}

}
