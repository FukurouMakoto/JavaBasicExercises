import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise76 {

	
	public static boolean testArrays(List<Integer> x, List<Integer> y)
	{
		if(x.size() > 3 && y.size() > 3)
		{
		return x.get(0) == y.get(y.size() - 1);
		}
		else
		{
			System.out.println("Arrays must be greater than 2");
			return false;
		}
	}
	public static void main(String[] args) {
		// Write a Java program to test if the first and the last element of two array 
		// of integers are same. The length of the array must be greater than or equal to 2
		List<Integer> array1 = new ArrayList<>(Arrays.asList(50, -20, 0, 30, 40, 60, 12));
		List<Integer> array2 = new ArrayList<>(Arrays.asList(45, 20, 10, 20, 30, 50, 11));
		List<Integer> array3 = new ArrayList<>(Arrays.asList(50, -20, 0, 30, 40, 60, 12));
		List<Integer> array4 = new ArrayList<>(Arrays.asList(45, 20, 10, 20, 30, 50));
		List<Integer> array5 = new ArrayList<>(Arrays.asList(45, 20, 10, 20, 30, 50));
		List<Integer> array6 = new ArrayList<>(Arrays.asList(45));
		System.out.println(testArrays(array1, array2));
		System.out.println(testArrays(array3, array4));
		System.out.println(testArrays(array5, array6));
	}	

}
