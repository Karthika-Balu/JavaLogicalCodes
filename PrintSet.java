package day22.javaConcepts;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintSet {

	public static void main(String[] args) {

		/*
		 * How to retrieve a value from a Set?
		 * Set = "1,2,3,4,5,6,7,8,9"
         * retrieve and print only the value - 7
		 */
		
		Set<Integer> set = new LinkedHashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(8);
		set.add(9);
		
		/*
		 * Method 1 to get the particular value from set
		 * 
		 * List<Integer> list = new ArrayList<Integer>(set);
		System.out.println(list.get(6));
		*/
		for (Integer integer : set) {
			if (integer==7) {
				System.out.println(integer);
			}
		}
		
		
	}

}
