import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class convertToLowerCase {
	
	public static String turnLowerCase(String x)
	{
		return x.toLowerCase();
	}
	
	public static String turnUpperCase(String x)
	{
		return x.toUpperCase();
	}
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Input a String: ");
		String input = x.nextLine();
		System.out.println(turnUpperCase(input));
		System.out.println(turnLowerCase(input));
	}

}
