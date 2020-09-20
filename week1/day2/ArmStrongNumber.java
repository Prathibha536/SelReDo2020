package week1.day2;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		int input = 123;
		
		int original = input;
		
			
		int sum =0;
		
		while (input > 0)
			
		{
			int rem = input % 10;
			
			int calculated = rem*rem*rem;
			
			sum = sum+calculated;
			
			input = input /10;
			
			
		}
		
		System.out.println(sum);
		
		if( sum == original)
		{
			System.out.println(+original + " The number is an Armstrong number");
		}
		else
		{
			System.out.println( +original + " Number is not an Armstrong number");
		}

	}

}
