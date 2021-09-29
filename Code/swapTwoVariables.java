
public class swapTwoVariables {

	public static void main(String[] args) 
	{
		int a = 12;
		int b = 25;
		
		System.out.println("a before swap = " + a);
		System.out.println("b before swap = " + b);
		int x = a;
		
		a = b;
		b = x;
		
		System.out.println("a after swap = " + a);
		System.out.println("b after swap = " + b);
		

	}

}
