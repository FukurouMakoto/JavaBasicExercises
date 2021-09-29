import java.util.Scanner;

public class PrintSum {
	public static int sum(int x, int y)
	{
		return x + y;
	}
	public static void main(String[] args) 
	{
		Scanner a = new Scanner(System.in);
		System.out.print("Please enter your first number: ");
		int x = a.nextInt();
		System.out.print("Please enter your second number: ");
		int y = a.nextInt();
		System.out.print(x + " + " + y + " is equal to: " + sum(x,y));
	}

}
