package day22.javaConcepts;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesInList {

	public static void main(String[] args) {
		/*
		 * How to remove duplicates from a list? 
		 * List = "A,B,C,D,A,D,E,F"
		 * 
		 */
		
		char[] input = {'A','B','C','D','A','D','E','F'};
		List<Character> list = new ArrayList<Character>();
		for (int i = 0; i < input.length; i++) {
		
			list.add(input[i]);
		}
		System.out.println(list);
		Set<Character> set = new LinkedHashSet<>(list);
		System.out.println(set);
		
		/*
		 * Method 2 
		 * 
		 * List<String> str = new ArrayList<String>();
		str.add("A");
		str.add("B");
		str.add("C");
		str.add("D");
		str.add("A");
		str.add("D");
		str.add("E");
		str.add("F");
		List<String> strDup = new ArrayList<String>(str);
		for (int i = 0; i < str.size(); i++) {
			String eachStr = str.get(i);
			int count = 0;
			for(int j = 0; j < strDup.size(); j++) {
				if(strDup.get(j)==eachStr) {
					count++;
				}
			}
			if(count>1) {
				strDup.remove(eachStr);
			}
		}
		System.out.println(strDup);*/
		
		
	}

}
