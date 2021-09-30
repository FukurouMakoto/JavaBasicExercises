import java.util.ArrayList;
import java.util.Scanner;

public class Exercise57 {
	
	public static int findFactors(int x)
	{
		ArrayList factors = new ArrayList();
		for(int i = 1; i <= x; i++)
		{
			for(int j = 1; j <= x; j++)
			{
				if(i * j == x)
				{
					factors.add(j);
				}
			}
		}
		//System.out.println(factors);
		return factors.size();
	}
	public static void main(String[] args) {
		// Write a Java program to accepts an integer and count the factors of the number.
		Scanner x = new Scanner(System.in);
		System.out.print("Input an integer: ");
		int y = x.nextInt();
		System.out.println(findFactors(y));
	}

}
