import java.util.Scanner;

public class sumGreaterThanThird {
	
	public static boolean test(int x, int y, int z)
	{
		if(x + y == z)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("Input the first number: ");
		int x = a.nextInt();
		System.out.print("Input the second number: ");
		int y = a.nextInt();
		System.out.print("Input the third number: ");
		int z = a.nextInt();
		
		System.out.println(test(x,y,z));
	}

}
