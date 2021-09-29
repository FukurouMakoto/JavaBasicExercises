import java.util.Scanner;

public class inputDisplayPswd {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Please enter your password");
		String password = x.next();
		System.out.println("Your password was: " + password);

	}

}
