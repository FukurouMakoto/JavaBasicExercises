import java.util.Scanner;

public class isNumEven {
	public static boolean isEven(int x)
	{
		if(x % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Input a number: ");
		int y = x.nextInt();
		
		if(isEven(y))
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(0);
		}

	}

}
