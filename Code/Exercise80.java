import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise80 {
	
	public static int greatest(List<Integer> x)
	{
		int y = 0;
		
		if(x.get(0) > x.get(x.size() - 1))
		{
			y = x.get(0);
		}
		else if(x.get(x.size() -1 ) > x.get(0))
		{
			y = x.get(x.size() - 1);
		}
		
		return y;
	}
	public static void main(String[] args) {
		// Write a Java program to get the larger value between 
		// first and last element of an array (length 3) of integers
		List<Integer> array = new ArrayList<>(Arrays.asList(20, 30, 40));
		System.out.println("Larger value between first and last element: " + greatest(array));
		List<Integer> array2 = new ArrayList<>(Arrays.asList(20, 30, 40, 50));
		System.out.println("Larger value between first and last element: " + greatest(array2));
		List<Integer> array3 = new ArrayList<>(Arrays.asList(20, 30, 40, 50, 60));
		System.out.println("Larger value between first and last element: " + greatest(array3));
		List<Integer> array4 = new ArrayList<>(Arrays.asList(70, 20, 30, 40, 50, 60));
		System.out.println("Larger value between first and last element: " + greatest(array4));
		List<Integer> array5 = new ArrayList<>(Arrays.asList(80, 20, 30, 40, 50, 60));
		System.out.println("Larger value between first and last element: " + greatest(array5));
		List<Integer> array6 = new ArrayList<>(Arrays.asList(100, 20, 30, 40, 50, 60));
		System.out.println("Larger value between first and last element: " + greatest(array6));
	}

}
