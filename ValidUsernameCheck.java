package day20.javaConcepts;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernameCheck {

	public static void main(String[] args) {

		/* PROGRAM: 
		 * 
		 * Write a java program to validate the given username is valid or not
		 * Input: "Balaji_1"
		 * output: False
		 * Input: "Testleaf$123"
		 * output: false
		 * Input: "Testleaf-123 "
		 * output: False
		 * 
		 * Note: 
		 * 1. It should contain minimum 8 characters.
		 * 2. It allows alpha numeric characters and spl characters like . _ @ $
		 * 
		 */
		
		String uname1 = "Bala_1";
		String uname2 = "Testleaf$123";
		String uname3 = "Testleaf-123 ";
		
		String pattern = "[a-zA-Z0-9._@$]{8,}";
		Pattern compile = Pattern.compile(pattern);
		Matcher matcher = compile.matcher(uname1);
		System.out.println("username1 is Valid ? - "+matcher.matches());
		System.out.println("username2 is Valid ? - "+compile.matcher(uname2).matches());
		System.out.println("username3 is Valid ? - "+compile.matcher(uname3).matches());
		
	}

}
