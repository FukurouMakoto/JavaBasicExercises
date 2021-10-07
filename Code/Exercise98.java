import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise98 {
	public static boolean twenties(List<Integer> x)
	{
		boolean result = false;
		boolean sequential = true;
		int count = 0;
		
		for(int i = 0; i < x.size() - 1; i++)
		{
			if(x.get(i) == 20)
			{
				count++;
				if(x.get(i + 1) == 20)
				{
					sequential = false;
				}
			}
		}
		
		if(count >= 2 && sequential)
		{
			result = true;
			return result;
		}
		else
		{
			return result;
		}
	}
	
	
	public static void main(String[] args) {
		// Write a Java program to check if the value 20 appears three times
		// and no 20's are next to each other in a given array of integers
		
		
		List<Integer> x = new ArrayList<>(Arrays.asList(10, 20, 20, 20, 25, 30));
		List<Integer> y = new ArrayList<>(Arrays.asList(10, 20, 25, 20, 25, 20));
		System.out.println(twenties(x));
		System.out.println(twenties(y));
	}

}
