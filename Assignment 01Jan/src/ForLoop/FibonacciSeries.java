package ForLoop;
//Write a program to print Fibonacci series of n terms
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int a=0;
		int b=1;
		int c=a+b;
		System.out.print(a);
		System.out.print(","+b);
		for(int i=1;i<=10;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.print(","+c);
			
		}
		
		
		
	}

}

