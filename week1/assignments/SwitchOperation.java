package week1.assignments;

public class SwitchOperation {

	public static void main(String[] args) {
		
		int i=3;
		int j= 2;
		
		String input = "Add";
		
		switch(input)
		{
		case "Add": int sum = i + j;
		            System.out.println("sum is:" +sum);
		 break;           
		case "sub": int sub =i-j;
		            System.out.println("Sub is: " +sub);
		 break;          
		case "Mul": int mul= i*j;
		             System.out.println("Product is: " +mul);
		 break;
		case "Div":float div=i/j;
		            System.out.println("Dividion is: " +div);
		  break;          
		default: float def= i%j;
		          System.out.println(def);
		}

	}

}
