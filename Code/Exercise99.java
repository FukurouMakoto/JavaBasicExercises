import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise99 {
	
	
	public static boolean check(List<Integer> x, int y)
	{
		int a;
		int b;
		boolean result = false;
		
		for(int i = 0; i < x.size() - 1; i++)
		{
			a = x.get(i);
			b = x.get(i+1);
			if(a == y || b == y)
			{
				result = true;
			}
			else
			{
				result = false;
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		// Write a Java program to check if a specified number appears
		// in every pair of adjacent element of a given array of integers

		List<Integer> x = new ArrayList<>(Arrays.asList(10, 20, 10, 20, 40, 20, 50));
		List<Integer> y = new ArrayList<>(Arrays.asList(30, 10, 20, 10, 50, 10, 90));
		System.out.println(check(x, 20));
		System.out.println(check(y, 10));
		System.out.println(check(x, 10));
		System.out.println(check(y, 20));
	}

}
