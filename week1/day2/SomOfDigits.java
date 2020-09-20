package week1.day2;

public class SomOfDigits {

	public static void main(String[] args) {
		
		int input = 5555;
		
		int sum= 0;
		
		while(input>0)
		{
			int Rem = input % 10;
			
			sum = sum +Rem;
			
			input = input / 10;
						
		}
		
		System.out.println(sum);

	}

}
