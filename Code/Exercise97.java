import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise97 {
	
	
	public static boolean sequential(List<Integer> x, int y, int z)
	{
		for(int i = 0; i < x.size(); i++)
		{
			if(x.get(i) == y)
			{
				if(x.get(i + 1) == z || x.get(i + 2) == z)
				{
					return true;
				}
				
				else
				{
					return false;
				}
			}
		}
		
		return false;
	}
	public static void main(String[] args) {
		// Write a Java program to check if an array of integers contains a 
		// specified number next to each other or there are two same 
		// specified numbers separated by one element
		
		List<Integer> x = new ArrayList<>(Arrays.asList(5, 10, 15, 20, 25));
		List<Integer> y = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18));
		
		int itemOne = 10;
		int itemTwo = 15;
		
		int elemOne = 2; 
		int elemTwo = 4;
		
		System.out.println(sequential(x, itemOne, itemTwo));
		System.out.println(sequential(y, elemOne, elemTwo));
	}

}
