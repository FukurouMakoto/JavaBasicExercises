import java.util.List;

public class Exercise88 {
	
	
	public static String returnInfo(String x)
	{
		return System.getProperty(x);
	}
	
	public static void printInfo(String x, String y)
	{
		System.out.println(x + ": " + y);
	}
	
	public static void main(String[] args) {
		// Write a Java program to get the current system environment and system properties
		printInfo("User Directories", returnInfo("user.dir"));
		printInfo("Home", returnInfo("home"));
		printInfo("User name", returnInfo("user.name"));
		printInfo("Name of Operating System", returnInfo("os.name"));
		printInfo("Operating System Version", returnInfo("os.version"));
		printInfo("JAVA Runtime Version", returnInfo("java.runtime.version"));
		printInfo("name", returnInfo("name "));
	}

}
