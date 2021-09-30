import java.util.Scanner;

public class Exercise63 {
	
	
	public static int test(int x, int y)
	{
		if(x == y)
		{
			return 0;
		}
		else if(x % 6 == y % 6)
		{
			if(x > y)
			{
				return y;
			}
			else
			{
				return x;
			}
		}
		else if(x > y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input the first number: ");
		int x = input.nextInt();
		System.out.print("Input the second number: ");
		int y = input.nextInt();

		System.out.println("Result: " + test(x, y));
	}

}
