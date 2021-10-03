import java.util.Objects;

public class Exercise72 {

	
	public static String newString(String x)
	{
		char filler = '#';
		String y = "";
		for(int i = 0; i < 3; i++)
		{
			if(i > x.length() - 1)
					{
						y = y + filler;
					}
			else
			{
				y = y + x.charAt(i);
			}
		}
		
		return y;
	}
	
	public static boolean TestAsserts(String expectedResponse, String result)
	{
		return Objects.equals(expectedResponse, result);
	}
	
	public static void main(String[] args) {
		// Write a Java program to create a new string taking first three characters from a given string. 
		// If the length of the given string is less than 3 use "#" as substitute characters
		String str1 = "Slack";
		String result = newString(str1);
		String expectedResponse = "Sla";
		System.out.println(TestAsserts(expectedResponse, result));
		
		str1 = "Rack";
		result = newString(str1);
		expectedResponse = "Rac";
		System.out.println(TestAsserts(expectedResponse, result));
		
		str1 = "Crack";
		result = newString(str1);
		expectedResponse = "Cra";
		System.out.println(TestAsserts(expectedResponse, result));
		
		str1 = "";
		result = newString(str1);
		expectedResponse = "###";
		System.out.println(TestAsserts(expectedResponse, result));
		
		str1 = "S";
		result = newString(str1);
		expectedResponse = "S##";
		System.out.println(TestAsserts(expectedResponse, result));
		
		str1 = "St";
		result = newString(str1);
		expectedResponse = "St#";
		System.out.println(TestAsserts(expectedResponse, result));
		
	}

}
