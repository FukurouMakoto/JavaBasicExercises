import java.util.Scanner;

public class ASCIIValue {
	
	public static int asciiValue(String x)
	{
		return (int) x.charAt(0);
	}
	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		String y = x.next();
		System.out.println("The ASCII value of Z is: " + asciiValue(y));

	}

}
