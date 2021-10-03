import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise78 {
	
	public static boolean check(List<Integer> x)
	{
		if(x.contains(4) || x.contains(7))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		// Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7
		List<Integer> array = new ArrayList<>(Arrays.asList(5, 7));
		List<Integer> array2 = new ArrayList<>(Arrays.asList(4, 5, 9));
		List<Integer> array3 = new ArrayList<>(Arrays.asList(5, 6, 9));
		List<Integer> array4 = new ArrayList<>(Arrays.asList(3, 1, 2));
		System.out.println(check(array));
		System.out.println(check(array2));
		System.out.println(check(array3));
		System.out.println(check(array4));
	}

}
