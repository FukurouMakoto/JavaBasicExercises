import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise68 {

	public static String newString(String x)
	{
		if(x.length() >= 3)
		{
			List<String> String1 = new ArrayList<String>(Arrays.asList(x.split("")));
			List<String> String2 = new ArrayList<String>();
			for(int i = 3; i > 0; i--)
			{
				String2.add(String1.get(String1.size() - i));
			}
			return String.join("", String2).repeat(4);
		}
		else
		{
			return x;
		}
	}
	public static void main(String[] args) {
		// Write a Java program to create a new string of 4 copies of the last 3 characters of the original string. 
		// The length of the original string must be 3 and above.
		String a = "Kronii";
		System.out.println(newString(a));
		a = "Mumei";
		System.out.println(newString(a));
		a = "Youtube";
		System.out.println(newString(a));
		a = "Smackandfuck";
		System.out.println(newString(a));
		a = "By";
		System.out.println(newString(a));
		a = "A";
		System.out.println(newString(a));
		a ="3.0";
		System.out.println(newString(a));
	}

}
