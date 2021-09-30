import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class reverseWord {

	
	public static String reverseWord(String word)
	{
		List<String> x = new ArrayList<>(Arrays.asList(word.split("")));
		Collections.reverse(x);
		return String.join("", x);
	}
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Input a word: ");
		String input = x.nextLine();
		System.out.println("Reverse a word: " + reverseWord(input));
	}

}
