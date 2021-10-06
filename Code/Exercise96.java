import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise96 {

	
	public static boolean checkArray(List<Integer> x)
	{
		if(x.contains(10) && x.contains(20))
		{
			if(x.indexOf(10) < x.indexOf(20))
			{
				return true;
			}
			else
				return false;
		}
		
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		// Write a Java program to check if there is a 10 in a given array of 
		// integers with a 20 somewhere later in the array
		
		List<Integer> w = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 10, 20));
		List<Integer> x = new ArrayList<>(Arrays.asList(5, 8, 7, 10, 20));
		List<Integer> y = new ArrayList<>(Arrays.asList(5, 8, 7, 20, 9, 10));
		List<Integer> z = new ArrayList<>(Arrays.asList(2, 8, 4, 20, 15, 10));
		
		System.out.println(checkArray(w));
		System.out.println(checkArray(x));
		System.out.println(checkArray(y));
		System.out.println(checkArray(z));
	}

}
