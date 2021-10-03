import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise75 {
	
	
	public static boolean isSame(List<Integer> array)
	{
		if(array.size() < 3)
		{
			System.out.println("Array must be greater than 2");
			return false;
		}
		else
		{
			return array.get(0) == array.get(array.size() - 1);
		}
	}
	public static void main(String[] args) {
		// Write a Java program to test if the first and the last element of an 
		// array of integers are same. The length of the array must be greater than or equal to 2
		List<Integer> array = new ArrayList<>(Arrays.asList(50, -20, 0, 30, 40, 60, 10));
		List<Integer> array2 = new ArrayList<>(Arrays.asList(50, -20, 0, 30, 40, 60, 50));
		List<Integer> array3 = new ArrayList<>(Arrays.asList(30, 40, 60, 10));
		List<Integer> array4 = new ArrayList<>(Arrays.asList(30, 40, 60, 10, 50, -20, 0));
		List<Integer> array5 = new ArrayList<>(Arrays.asList(30, 40, 60, 30));
		List<Integer> array6 = new ArrayList<>(Arrays.asList(30, 30));
		System.out.println(isSame(array));
		System.out.println(isSame(array2));
		System.out.println(isSame(array3));
		System.out.println(isSame(array4));
		System.out.println(isSame(array5));
		System.out.println(isSame(array6));
	}

}
