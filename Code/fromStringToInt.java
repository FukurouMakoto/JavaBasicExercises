import java.util.Scanner;

public class fromStringToInt {
	
	public static int convert(String x)
	{
		return Integer.parseInt(x);
	}
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Input a number: ");
		String y = x.next();
		System.out.println("The integer value is: " + convert(y));

	}

}
