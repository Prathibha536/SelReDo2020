package week1.assignments;

public class Prime {

	public static void main(String[] args){

		int input =13;	
		
		
		boolean flag = false;
		
	   /* if(input==0 && input == 1)
			
		{
			System.out.println("Not Prime number");
		}
	    
	    if(input ==2)
	    {
	    	System.out.println(" 2 Is Prime number");
	    }
		*/
        for (int i =2; i<input; i++)
        	
        {
        	if(input % i == 0) {
        		 flag = true;
        		
        	}
        }
		
        if(flag == true)
        	
        {
        	System.out.println("Not a prime number");
        }
        
        else
        {
        	System.out.println("Is a Prime number");
        }
		
		}
}
