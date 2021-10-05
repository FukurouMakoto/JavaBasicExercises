import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Exercise85 {

	
	public static boolean startsWith(String string, String word)
	{
		List<String> x = new ArrayList<String>(Arrays.asList(string.split(" ")));
		if(Objects.equals(x.get(0), word))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		//Write a Java program to check if a string starts with a specified word.
		
		System.out.println(startsWith("Hello how are you?", "Hello"));
		System.out.println(startsWith("Fuck your mother", "Fuck"));
		System.out.println(startsWith("Suck the fuck", "Fuck"));
		System.out.println(startsWith("Fuck your mother", "Fuck"));
		
	}

}
