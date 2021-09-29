import java.util.Scanner;

public class FullMath {
	public static int sum(int x, int y)
	{
		return x + y;
	}
	
	public static int subtract(int x, int y)
	{
		return x - y;
	}
	
	public static int multiply(int x, int y)
	{
		return x * y;
	}
	
	public static int divide(int x, int y)
	{
		return x / y;
	}
	
	public static int remainder(int x, int y)
	{
		return x % y;
	}
	public static void main(String[] args) 
	{
		Scanner a = new Scanner(System.in);
		System.out.print("Please enter your first number: ");
		int x = a.nextInt();
		System.out.print("Please enter your second number: ");
		int y = a.nextInt();
		System.out.println(x + " + " + y + " = " + sum(x,y));
		System.out.println(x + " - " + y + " = " + subtract(x,y));
		System.out.println(x + " * " + y + " = " + multiply(x,y));
		System.out.println(x + " / " + y + " = " + divide(x,y));
		System.out.println(x + " mod " + y + " = " + remainder(x,y));
	}

}
