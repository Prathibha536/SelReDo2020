package week1.day2;

public class Calculator {
	
	
	/*public void add(int num1,int num2)
	{	
	
		int sum = num1 +num2;
		System.out.println(sum);
		
	}
	
	public void Mul(double num1, double num2 )
	{
		double mul = num1*num2;
		System.out.println(mul);
	}
	
	public void Sub(int num1, int num2)
	{
		int sub = num1 - num2;
		System.out.println(sub);
				
	}*/

	
	public int add(int i,int j)
	{
		return i+j;
	}
	
	public int sub(int l,int m)
	{
		return l -m;
	}
	
	public double mul(double m,double n)
	{
		return m*n;
	}
	public static void main(String[] args) {
		
          Calculator obj = new Calculator();
          
           /*obj.add(1,2);
           obj.Mul(5, 2);
           obj.Sub(5, 3);*/
          
          int add =obj.add(2, 5);
          System.out.println(add);
           
          
          int sub = obj.sub(10, 5);
          System.out.println(sub);
          
          double mul = obj.mul(10, 11);
          System.out.println(mul);
          
	}

}
