import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class penultimateWord {

	
	public static String penUltimate(String x)
	{
		List<String> wordAsList = new ArrayList<String>(Arrays.asList(x.split(" ")));
		if(wordAsList.size() < 2)
		{
			if(wordAsList.size() == 1) 
			{
			return wordAsList.get(wordAsList.size() -1);
			}
			else if(wordAsList.size() == 0)
			{
				return x;
			}
		}
		
		return wordAsList.get(wordAsList.size() - 2);
	}
	
	
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		String input = x.nextLine();
		System.out.println(penUltimate(input));
	}

}
