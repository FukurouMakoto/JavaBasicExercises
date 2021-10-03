import java.util.Objects;

public class Exercise73 {

	public static String newString(String x, String y)
	{
		if(y.length() == 0)
		{
			y = "#";
		}
		if(x.length() == 0)
		{
			x = "#";
		}
		
		return String.format("%s%s", x.substring(0, 1), y.substring(y.length() - 1));
	}
	public static boolean TestAsserts(String expectedResponse, String Result)
	{
		return Objects.equals(expectedResponse, Result);
	}
	
	public static void TestEngine(String x, String y, String z)
	{
		String result = newString(x, y);
		System.out.println(TestAsserts(z, result));
	}
	public static void main(String[] args) {
		// Write a Java program to create a new string taking first and last characters from two given strings. 
		// If the length of either string is 0 use "#" for missing character
		TestEngine("Python", "", "P#");
		TestEngine("Java", "Snook", "Jk");
		TestEngine("Snook", "Hook", "Sk");
		TestEngine("Hola", "Fucker", "Hr");
		TestEngine("Smack", "", "S#");
		TestEngine("", "Frank", "#k");
	}

}
