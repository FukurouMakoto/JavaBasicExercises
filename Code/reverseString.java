import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class reverseString 
{
	public static String reverseString(String string)
	{
		List<String> letters = Arrays.asList(string.split(""));
		List<String> letters2 = new ArrayList();
		for(int i = letters.size() - 1; i > -1; i--)
		{
			String a = letters.get(i);
			letters2.add(a);
		}
		String listString = String.join("", letters2);
		return listString;
	}
	public static void main(String[] args) 
	{	
		Scanner x = new Scanner(System.in);
		String smack = x.nextLine();
		System.out.println(reverseString(smack));
		
	}

}
