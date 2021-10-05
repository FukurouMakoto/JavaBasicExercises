import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise86 {

	
	public static void fuckNumber(int n)
	{
		List<Integer> snuck = new ArrayList<Integer>();
		while(n != 1)
		{
			if(n % 2 == 0)
			{
				n /= 2;
				snuck.add(n);
			}
			
			else
			{
				n *= 3;
				n += 1;
				snuck.add(n);
			}
		}
		
		System.out.println(snuck);
	}
	public static void main(String[] args) {
		// Write a Java program start with an integer n, 
		// divide n by 2 if n is even or multiply by 3 
		// and add 1 if n is odd, repeat the process until n = 1.
		
		fuckNumber(50);
		fuckNumber(100);
		fuckNumber(5);
		fuckNumber(200);
		fuckNumber(125);

	}

}
