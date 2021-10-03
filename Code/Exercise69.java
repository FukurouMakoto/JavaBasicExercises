import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise69 {

	
	public static String extract(String x)
	{
		int beginIndex = 0;
		int endIndex = x.length();
		int midpoint = beginIndex + (endIndex - beginIndex) / 2;
		
		List<String> String1 = new ArrayList<String>(Arrays.asList(x.split("")));
		List<String> String2 = new ArrayList<String>();
		
		for(int i = 0; i < midpoint; i++)
		{
			String2.add(String1.get(i));
		}
		
		return String.join("", String2);
	}
	public static void main(String[] args) {
		// Write a Java program to extract the 
		// first half of a string of even length
		
		String testData = "Python";
		
		System.out.println(extract(testData));
		
		testData = "Kronii";
		
		System.out.println(extract(testData));
		
		testData = "Java";
		
		System.out.println(extract(testData));
		
		testData = "Calli";
		
		System.out.println(extract(testData));
	}

}
