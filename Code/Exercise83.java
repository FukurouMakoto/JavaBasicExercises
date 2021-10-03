import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise83 {

	
	public static List<Integer> multiplyArrays(List<Integer> x, List<Integer> y)
	{
		List<Integer> z = new ArrayList(Arrays.asList());
		if(x.size() == y.size())
		{
			for(int i = 0; i < x.size(); i++)
			{
				z.add(x.get(i) * y.get(i));
			}
			
			return z;
		}
		else
		{
			return z;
		}
	}
	public static void main(String[] args) {
		// Write a Java program to multiply corresponding elements of two arrays of integers
		List<Integer> Array1 = new ArrayList(Arrays.asList(1, 3, -5, 4));
		List<Integer> Array2 = new ArrayList(Arrays.asList(1, 4, -5, -2));
		System.out.println(multiplyArrays(Array1, Array2));
		
		List<Integer> Array3 = new ArrayList(Arrays.asList(10, 20, 30, 40));
		List<Integer> Array4 = new ArrayList(Arrays.asList(2, 4, 6, 8));
		System.out.println(multiplyArrays(Array3, Array4));
		
		List<Integer> Array5 = new ArrayList(Arrays.asList(100, 200, 300, 400));
		List<Integer> Array6 = new ArrayList(Arrays.asList(1, 3, 5, 7));
		System.out.println(multiplyArrays(Array5, Array6));
		
		List<Integer> Array7 = new ArrayList(Arrays.asList(100, 200, 300, 400));
		List<Integer> Array8 = new ArrayList(Arrays.asList(2, 4));
		System.out.println(multiplyArrays(Array7, Array8));
		
	}

}
