import java.util.Scanner;

public class Math {
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
	
	public static void main(String[] args) 
	{
		//Scanner a = new Scanner(System.in);
		System.out.println(-5 + 8 * 6);
		System.out.println((55 + 9) % 9);
		System.out.println(20 + -3 * 5 / 8);
		System.out.println(5 + 15 / 3 * 2 - 8 % 3);
	}

}
