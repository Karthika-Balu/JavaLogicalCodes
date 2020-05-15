package day20.javaConcepts;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmailCheck {

	public static void main(String[] args) {

	/*   PROGRAM:
		 * Write a Java program to verify whether the given String is valid email address.
		 * 
		 * input : "keerthi.b@testleaf.com"
		 * Output : true
		 * 
		 * input : "subha.k@testleaf.co.us"
		 * Output : true
		 * 
		 * input : "anitha m@testleaf.com"
		 * Output : false
		 * 
		 * Note: Spl characters ._ are only allowed.
	*/
		
		String input1 = "keerthi.b@testleaf.com";
		String input2 = "subha.k@testleaf.co.us";
		String input3 = "anitha m@testleaf.com";
		
		String pattern = "[a-zA-Z0-9._]+@[a-z0-9]+.[a-z.]{2,}";
		Pattern compile = Pattern.compile(pattern);
		Matcher matcher1 = compile.matcher(input1);
		Matcher matcher2 = compile.matcher(input2);
		Matcher matcher3 = compile.matcher(input3);
		
		boolean matches = compile.matches(pattern, input1);
		System.out.println(matcher1.matches());
		System.out.println(matcher2.matches());
		System.out.println(matcher3.matches());
		System.out.println(matches);
		
	}

}
