import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercises64 {

	
	public static boolean test(int x, int y)
	{
		//Convert integers to strings for easier comparison
		String num1 = String.valueOf(x);
		String num2 = String.valueOf(y);
		//Convert strings to lists for easier comparison
		List<String> list1 = new ArrayList<String>(Arrays.asList(num1.split("")));
		List<String> list2 = new ArrayList<String>(Arrays.asList(num2.split("")));
		//List to hold results of comparison 
		List<String> list3 = new ArrayList<String>();
		//To accomodate numbers of varying sizes
		int biggest;
		//Find which number has the most spaces
		if(list1.size() > list2.size())
		{
			biggest = list1.size();
		}
		else
		{
			biggest = list2.size();
		}
		//Add all common digits to list3
		for(int i = 0; i < biggest; i++)
		{
			if(list2.contains(list1.get(i)))
			{
				list3.add(list1.get(i));
			}
		}
		
		if(list3.size() != 0) //list3 being higher than 0 indicates a common element
		{
			return true;
		}
		else //size of 0 indicates no common elements
		{
			return false;
		}
	}
	
	public static void main(String[] args) {
		int x = 35;
		int y = 45;
		System.out.println(test(x, y));
		
		x = 72;
		y = 73;
		System.out.println(test(x, y));
		
		x = 27;
		y = 34;
		System.out.println(test(x, y));
		
		x = 1094;
		y = 492;
		System.out.println(test(x, y));
		
		x = 10025;
		y = 20;
		System.out.println(test(x, y));
	}

}
