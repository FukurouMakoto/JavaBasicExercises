import java.util.Objects;

public class Exercise70 {
	
	
	public static String combineStrings(String x, String y)
	{
		String shortString= "";
		String longString = "";
		
		if(x.length() > y.length())
		{
			longString = x;
			shortString = y;
		}
		else if(y.length() > x.length())
		{
			longString = y;
			shortString = x;
		}
		else
		{
			return "Strings must not be the same length!";
		}
		
		return String.format("%s%s%s", shortString, longString, shortString);
	}
	
	public static boolean TestAsserts(String expectedResponse, String result)
	{
		//System.out.println(expectedResponse);
		//System.out.println(result);
		return Objects.equals(expectedResponse, result);
	}
	public static void main(String[] args) {
		// Write a Java program to create a string in the form short_string + long_string + short_string from two strings. 
		// The strings must not have the same length
		
		String Str1 = "Python";
		String Str2 = "Tutorial";
		String expectedResponse = "PythonTutorialPython";
		String result = combineStrings(Str1, Str2);
		System.out.println(TestAsserts(expectedResponse, result));
		
		
		Str1 = "Fuck";
		Str2 = "Bitch";
		expectedResponse = "FuckBitchFuck";
		result = combineStrings(Str1, Str2);
		System.out.println(TestAsserts(expectedResponse, result));
		
		Str1 = "Shit";
		Str2 = "Snack";
		expectedResponse = "ShitSnackShit";
		result = combineStrings(Str1, Str2);
		System.out.println(TestAsserts(expectedResponse, result));
		
		Str1 = "Fuck";
		Str2 = "Cunt";
		expectedResponse = "Strings must not be the same length!";
		result = combineStrings(Str1, Str2);
		System.out.println(TestAsserts(expectedResponse, result));
		
		Str1 = "ShittyBitch";
		Str2 = "FuckkittyNook";
		expectedResponse = "ShittyBitchFuckkittyNookShittyBitch";
		result = combineStrings(Str1, Str2);
		System.out.println(TestAsserts(expectedResponse, result));
		
		
	}

}
