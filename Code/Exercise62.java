import java.util.Scanner;

public class Exercise62 {

	
	public static boolean test(int x, int y, int z)
	{
		if(x >= 20 && x <= y - z)
		{
			return true;
		}
		else if(y >= 20 && y <= x - z)
		{
			return true;
		}
		else if(z >= 20 && z <= x - y)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		// Write a Java program that accepts three integer values and return true 
		//if one of them is 20 or more and less than the substractions of others
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
