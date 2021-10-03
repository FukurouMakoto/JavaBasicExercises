import java.util.Objects;

public class Exercise71 {
	
	
	public static String newLine(String x, String y)
	{
		return String.format("%s%s", x.substring(1, x.length()), y.substring(1, y.length()));
	}
	
	public static boolean TestAsserts(String expectedResponse, String result)
	{
		return Objects.equals(expectedResponse, result);
	}
	
	public static void main(String[] args) {
		// Write a Java program to create the concatenation of the two strings except removing the first character 
		// of each string. The length of the strings must be 1 and above
		String Str1 = "Python";
		String Str2 = "Tutorial";
		String expectedResponse = "ythonutorial";
		String result = newLine(Str1, Str2);
		System.out.println(TestAsserts(expectedResponse, result));
		
		Str1 = "Smack";
		Str2 = "Fuck";
		expectedResponse = "mackuck";
		result = newLine(Str1, Str2);
		System.out.println(TestAsserts(expectedResponse, result));
		
		Str1 = "Java";
		Str2 = "Csharp";
		expectedResponse = "avasharp";
		result = newLine(Str1, Str2);
		System.out.println(TestAsserts(expectedResponse, result));
		
		Str1 = "Robin";
		Str2 = "Williams";
		expectedResponse = "obinilliams";
		result = newLine(Str1, Str2);
		System.out.println(TestAsserts(expectedResponse, result));
		
		Str1 = "One";
		Str2 = "Two";
		expectedResponse = "newo";
		result = newLine(Str1, Str2);
		System.out.println(TestAsserts(expectedResponse, result));
		
		Str1 = "Fuck";
		Str2 = "Bitch";
		expectedResponse = "uckitch";
		result = newLine(Str1, Str2);
		System.out.println(TestAsserts(expectedResponse, result));
	}

}
