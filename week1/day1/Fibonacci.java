package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		
		int i =0;
		
		int j =1;	
		
		System.out.println("Fibonacci series is :");
		
		System.out.println(+i);
		
		
		for (int k = 1; k <=10 ; k++) 
		{
			int sum= i+j;
			i=j;
			j=sum;
			System.out.println( +j);
		}
				 

	}

}
