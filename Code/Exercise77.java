import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise77 {

	public static List<Integer> newArray(List<Integer> x, List<Integer> y)
	{
		List<Integer> a = new ArrayList<Integer>();
		a.add(x.get(0));
		a.add(y.get(y.size() - 1));
		return a;
	}
	public static void main(String[] args) {
		/* Write a Java program to create a new array of length 2 from two arrays of integers 
		with three elements and the new array will contain 
		the first and last elements from the two arrays */
		List<Integer> array = new ArrayList<>(Arrays.asList(50, -20, 0));
		List<Integer> array2 = new ArrayList<>(Arrays.asList(5, -50, 10));
		List<Integer> array3 = new ArrayList<>(Arrays.asList(50, 10));
		System.out.println(newArray(array, array2));
		
		List<Integer> array4 = new ArrayList<>(Arrays.asList(-20, 50, 0));
		List<Integer> array5 = new ArrayList<>(Arrays.asList(5, 10, -50));
		List<Integer> array6 = new ArrayList<>(Arrays.asList(-20, -50));
		System.out.println(newArray(array4, array5));
	}

}
