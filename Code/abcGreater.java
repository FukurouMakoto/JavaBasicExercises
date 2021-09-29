import java.util.Scanner;

public class abcGreater {

	
	public static boolean test(int x, int y, int z)
	{
		if(z > x)
		{
			return true;
		}
		else if(y > z)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = 15;
		System.out.println(test(a,b,c));
		a = 10;
		b = 5;
		c = 15;
		System.out.println(test(a,b,c));
		Scanner x = new Scanner(System.in);
		System.out.println("Input the first number: ");
		a = x.nextInt();
		System.out.println("Input the second number: ");
		b = x.nextInt();
		System.out.println("Input the third number: ");
		c = x.nextInt();
		System.out.println(test(a,b,c));
	}

}
