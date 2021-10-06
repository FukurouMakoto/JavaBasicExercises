import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise94 {

	
	public static List<Integer> rearrange(List<Integer> x)
	{
		int index = 0;
		for(int i = 0; i < x.size(); i++)
		{
			if(x.get(i) % 2 != 0)
			{
				index = x.get(i);
				x.remove(x.get(i));
				x.add(0, index);
			}
		}
		
		return x;
	}
	public static void main(String[] args) {
		// Write a Java program to rearrange all the 
		// elements of a given array of integers so that all 
		// the odd numbers come before all the even numbers
		List<Integer> x = new ArrayList<>(Arrays.asList(5, 4, 6, 2, 3, 9, 8, 0, 1));
		List<Integer> y = new ArrayList<>(Arrays.asList(4, 6, 8, 2, 3, 5, 7, 9));
		System.out.println(rearrange(x));
		System.out.println(rearrange(y));
	}

}
