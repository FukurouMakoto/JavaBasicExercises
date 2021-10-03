import java.util.Objects;

public class Exercise84 {

	
	public static String funkyString(String x)
	{
		String y = x.substring(x.length() - 3, x.length());
		return String.format("%s%s%s", y, x, y);
	}
	
	public static boolean TestAssert(String x, String y)
	{
		return Objects.equals(x, y);
	}
	public static void main(String[] args) {
		/* Write a Java program to take the last three characters from a given string and 
		add the three characters at both the front and back of the string. 
		String length must be greater than three and more. */
		
		System.out.println(TestAssert(funkyString("Python"), "honPythonhon"));
		System.out.println(TestAssert(funkyString("FuckyNucky"), "ckyFuckyNuckycky"));
		System.out.println(TestAssert(funkyString("Hololive"), "iveHololiveive"));
		System.out.println(TestAssert(funkyString("PomuOmu"), "OmuPomuOmuOmu"));

	}

}
