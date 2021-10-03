import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise81 {

	public static List<Integer> swap(List<Integer> x)
	{
		int first = x.get(0);
		int last = x.get(x.size() - 1);
		x.set(0, last);
		x.set(x.size() - 1, first);
		return x;
	}
	public static void main(String[] args) {
		// Write a Java program to swap the first and last elements of an array 
		// (length must be at least 1) and create a new array
		
		List<Integer> array = new ArrayList<Integer>(Arrays.asList(20, 30, 40));
		System.out.println(swap(array));
		
		List<Integer> array2 = new ArrayList<Integer>(Arrays.asList(10, 20, 30));
		System.out.println(swap(array2));
		
		List<Integer> array3 = new ArrayList<Integer>(Arrays.asList(50, 60, 70));
		System.out.println(swap(array3));
		
	}

}
