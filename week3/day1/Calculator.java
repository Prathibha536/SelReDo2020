package week3.day1;

public class Calculator {	
	
	
	//- 2 methods for add, 1 method with 2 int args , 1 method with 3 int args
	public void add(int a, int b) {
		
		int sum = a+b;
		System.out.println("Sum is"+" "+sum);	
		
	}
	
	public void add(int x, int y, int z) {
		
		int sum1 = x+y+z;
		System.out.println("Sum is:" +sum1);

	}
	
	//- 2 methods for multiply, 1 method with 2 int args, 1method with 1 int and 1 double args
	public void multiply(int l, int m) {
		
		int mul = l*m;
		System.out.println("Product is:" +mul);
		
	}
	
	public void multiply(double i, double j)
	
	{
		double mul1 = i*j;
		
		System.out.println("Product is :" +mul1);
	}
	
	//- 2 methods for subtract, 1 method with 2 int args , 1 method with 2 double args
	
	public void sub(int x1,int x2) {
		
		int sub = x1-x2;
		
		System.out.println("Sub is"+sub);
		

	}
    
    public void sub(double y1, double y2) {
		
    	double sub1 = y1-y2;
    	System.out.println("Sub is" +sub1);

	}
    
    //- 2 methods to divide , 1 method with 2 int args, one to divide one double number with one int
    
    public void divide(int a1, int a2) {
		
    	int div = a1/a2;
    	
    	System.out.println("Division is" +div);

	}
    
    public void divide(double b1, int b2) {
    	
    	double div1 = b1/b2;
    	
    	System.out.println("Division is:" +div1);
		

	}
    
	public static void main(String[] args) {
		
		//create object for the Calculator class and execute all the methods*/
		
		Calculator cal = new Calculator();
		
		cal.add(10, 20);
		cal.add(11, 12, 13);
		
		cal.multiply(15, 15);
		cal.multiply(25, 30);
		
		cal.sub(20, 10);
		cal.sub(100, 76);
		
		cal.divide(15, 5);
		cal.divide(1250, 26);
		
			}

}
