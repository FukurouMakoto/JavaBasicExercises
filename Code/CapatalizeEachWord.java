import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CapatalizeEachWord {
	
	public static String turnToList(String x)
	{
		List<String> wordAsList = new ArrayList<String>(Arrays.asList(x.split(" ")));
		List<String> capatalizedWords = new ArrayList<String>();
		
		for(int i = 0; i < wordAsList.size(); i++)
		{
			char capitalizedLetter = Character.toUpperCase(wordAsList.get(i).charAt(0));
			String word = wordAsList.get(i);
			word = word.replace(word.charAt(0), capitalizedLetter);
			capatalizedWords.add(word);
		}
		
		String newSentence = String.join(" ", capatalizedWords);
		return newSentence;
	}
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		String input = x.nextLine();
		System.out.println(turnToList(input));

	}

}
