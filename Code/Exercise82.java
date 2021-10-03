import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise82 {
	
	public static int largest(List<Integer> x)
	{
		int first = x.get(0);
		int last = x.get(x.size() - 1);
		int middle = x.get(0 + (x.size() - 0) / 2);
		
		if(first > last && first > middle)
		{
			return first;
		}
		else if(last > first && last > middle)
		{
			return last;
		}
		else
		{
			return middle;
		}
	}
	public static void main(String[] args) {
		// Write a Java program to find the largest element between first, last, 
		// and middle values from an array of integers (even length)
		
		List<Integer> array = new ArrayList<Integer>(Arrays.asList(20, 30, 40, 50, 67));
		System.out.println(largest(array));
		
		List<Integer> array2 = new ArrayList<Integer>(Arrays.asList(90, 30, 40, 50, 67));
		System.out.println(largest(array2));
		
		List<Integer> array3 = new ArrayList<Integer>(Arrays.asList(20, 30, 99, 50, 67));
		System.out.println(largest(array3));
	}

}
