
public class VerifyNumberSum {
	
	static int[] arr = {3,4,5,6,7,1,9,2}; 

	public static void main(String[] args) {
		
		
		 add(arr,6);

	}
	
	public static void add(int[] array,int number) {
	
		for (int i = 0; i < arr.length; i++) {
			 
			 for (int j = i; j < arr.length; j++) {
				 
				 if(i+j==number) {
					 
					 System.out.println("sum of "+i+" and "+j+"equals - "+number);
					 
				 }
				 
			}
			
		}
	}

}
