
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int original_number = 371;
		int number= original_number;
		int sum=0, reminder=0;
		
		while(number>0) {
			
			reminder = number%10;			
			sum = sum+(reminder*reminder*reminder);			
			number = number/10;		
			
		}
	
		if(sum==original_number) {
			
			System.out.println(original_number+ " - is an armstrong number");
		}
		else {
			System.out.println("the number is not an armstrong number");
		}

	}

}
