import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise87 {

	
	public static void readSumDigit(int x)
	{
		int y = 0;
		List<String> snook = new ArrayList<>(Arrays.asList(String.valueOf(x).split("")));
		for(int i = 0; i < snook.size(); i++)
		{
			y += Integer.parseInt(snook.get(i));
		}
		
		List<String> stook = new ArrayList<>(Arrays.asList(String.valueOf(y).split("")));
		for(int i = 0; i < stook.size(); i++)
		{
			System.out.println(convertIntString(Integer.parseInt(stook.get(i))));
		}
	}
	
	public static String convertIntString(int x)
	{
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(0, "Zero");
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");
		map.put(6, "Six");
		map.put(7, "Seven");
		map.put(8, "Eight");
		map.put(9, "Nine");
		
		return map.get(x);
	}
	public static void main(String[] args) {
		// Write a Java program than read an integer and calculate the sum 
		// of its digits and write the number of each digit of the sum in English.

		readSumDigit(50);
		System.out.println("");
		readSumDigit(125);
		System.out.println("");
		readSumDigit(1000);
		System.out.println("");
		readSumDigit(528);
		System.out.println("");
		readSumDigit(58762);
	}

}
