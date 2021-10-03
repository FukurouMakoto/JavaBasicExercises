import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise74 {

	
	public static boolean isTen(List<Integer> array)
	{
		if(array.size() > 2)
			{
			if(array.get(0) == 10 || array.get(array.size() - 1) == 10)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args) {
		// Write a Java program to test if 10 appears as either the first or last element of an array of integers. 
		// The length of the array must be greater than or equal to 2
		List<Integer> array = new ArrayList<>(Arrays.asList(10, -20, 0, 30, 40, 60, 10));
		List<Integer> array2 = new ArrayList<>(Arrays.asList(9, 5, 4, 8, 2));
		List<Integer> array3 = new ArrayList<>(Arrays.asList(10, 5, 4, 8, 12, 11));
		List<Integer> array4 = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
		List<Integer> array5 = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1));
		List<Integer> array6 = new ArrayList<>(Arrays.asList(1));
		
		System.out.println(isTen(array));
		System.out.println(isTen(array2));
		System.out.println(isTen(array3));
		System.out.println(isTen(array4));
		System.out.println(isTen(array5));
		System.out.println(isTen(array6));
	}

}
