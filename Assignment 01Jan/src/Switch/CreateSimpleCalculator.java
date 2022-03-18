package Switch;
	//2.Create simple calculator (switch statement support, addition,multiplication and other operations)  
public abstract class CreateSimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operation(50,12,'*');
		
	}
	
	
		public static void operation(int a,  double b, int c) {
			switch (c) 
			{
			case '+':
				System.out.println("addition "+(a+b));
				break;
			case '-':
				System.out.println("subtraction "+(a-b));
				break;
			case '*':
				System.out.println("multipliction "+(a*b));
				break;
			case '/':
				System.out.println("division "+(a/b));
				break;
						
			
		}
	}

}
