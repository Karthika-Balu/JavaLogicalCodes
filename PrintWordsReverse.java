package day19.javaConcepts;

public class PrintWordsReverse {
	
	public static void main(String[] args) {
		
		/*** Write a java program to do the following.
		   Input: "When the world realise its own mistake, corona will dissolve automatically"
		   output: "When eht world esilaer its nwo mistake, anoroc will evlossid automatically"
		 **/
		String input = "When the world realise its own mistake, corona will dissolve automatically";
		String inputCommaRemoved = input.replaceAll(",", "");
		String[] split = inputCommaRemoved.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i]+" ");
			if (i%2!=0) {
				StringBuffer buffer = new StringBuffer(split[i]);
				split[i] = buffer.reverse().toString();
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < split.length; i++) 
		{
			System.out.print(split[i]+" ");
		}
		
		
	}

}
