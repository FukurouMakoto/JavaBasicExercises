import java.util.Scanner;

public class multiplicationToTen {
	public static int result(int x, int y)
	{
		return x * y;
	}
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a value: ");
		int x = input.nextInt();
		for(int i = 1; i < 11; i++)
		{
			int result = result(x, i);
			System.out.println(x + " x " + i + " = " + result);
		}
	}

}
