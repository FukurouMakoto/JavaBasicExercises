import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise93 {
	
	
	public static boolean checkArray(List<Integer> x)
	{
		boolean result = false;
		boolean ten = false;
		boolean twenty = false;
		
		for(int i = 0; i < x.size() - 1; i++)
		{
			if(x.get(i) == 10 && x.get(i + 1) == 10) {
				ten = true;
			}
			
			if(x.get(i) == 20 && x.get(i + 1) == 20) {
				twenty = true;
			}
			
		}
		
		if(ten && twenty)
		{
			result = false;
		}
		else if(ten && twenty == false)
		{
			result = true;
		}
		else if(ten == false && twenty)
		{
			result = true;
		}
		
		return result;
	}
	
	
	public static boolean TestAsserts(boolean result, boolean expectedResult)
	{
		return result == expectedResult;
	}
	
	public static void main(String[] args) {
		// Write a Java program to test if an array of integers contains an element 
		// 10 next to 10 or an element 20 next to 20, but not both
		
		List<Integer> v = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 8, 10, 10, 15, 20, 20)); //false
		List<Integer> w = new ArrayList<>(Arrays.asList(5, 5, 10, 10, 20, 20));//false
		List<Integer> x = new ArrayList<>();//false
		List<Integer> y = new ArrayList<>(Arrays.asList(10, 10, 5, 8, 2, 7, 5));//true
		List<Integer> z = new ArrayList<>(Arrays.asList(5, 5, 2, 4, 20, 20, 9));//true
		
		for(int i = 0; i < 20; i++)
		{
			x.add(i);
		}
		

		System.out.println(TestAsserts(checkArray(v), false));
		System.out.println(TestAsserts(checkArray(w), false));
		System.out.println(TestAsserts(checkArray(x), false));
		System.out.println(TestAsserts(checkArray(y), true));
		System.out.println(TestAsserts(checkArray(z), true));
		
	}

}
