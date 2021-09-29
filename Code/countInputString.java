import java.util.Arrays;
import java.util.List;

public class countInputString {
	
	public static boolean matches(String x, String pattern)
	{
		return x.matches(pattern);
	}
	
	
	public static void main(String[] args) {
		String x = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		List<String> characters = Arrays.asList(x.split(""));
		int letters = 0;
		int space = 0;
		int number = 0;
		int other = 0;
		String y;
		String alphaPattern = "^[a-zA-Z]*$";
		String numericPattern = "^[0-9]*$";
		
		for(int i = 0; i < characters.size(); i++)
		{
			y = characters.get(i);
			if(matches(y, alphaPattern))
			{
				letters++;
			}
			else if(matches(y, numericPattern))
			{
				number++;
			}
			else if(y.contains(" "))
			{
				space++;
			}
			else
			{
				other++;
			}
		}
		
		System.out.println("The string is: " + x);
		System.out.println("letter: " + letters);
		System.out.println("space: " + space);
		System.out.println("number: " + number);
		System.out.println("other: " + other);
	}

}
