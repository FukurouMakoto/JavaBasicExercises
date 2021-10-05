import java.util.ArrayList;
import java.util.List;

public class Exercise90 {
	
	public static String returnInfo(String x)
	{
		return System.getProperty(x);
	}
	
	
	public static void main(String[] args) {
		// Write a Java program to get the value of the environment variable PATH, TEMP, USERNAME
		List<String> info = new ArrayList<String>();
		info.add("java.class.path");
		info.add("java.io.tmpdir");
		info.add("user.name");
		
		for(int i = 0; i < info.size(); i++)
		{
			System.out.println(returnInfo(info.get(i)));
		}
	}

}
