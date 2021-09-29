import java.util.Scanner;

public class computeValueN {
	public static String newValue(String n)
	{
		String x = n + n;
		String y = n + n + n;
		String message = n + " + " + x + " + " + y;
		return message;
		
	}
	public static void main(String[] args) {
		// Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
		//Input number: 5                                                        
		//5 + 55  + 555
		Scanner x = new Scanner(System.in);
		String input = x.nextLine();
		System.out.println(newValue(input));
	}

}
