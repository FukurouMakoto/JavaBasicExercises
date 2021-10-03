import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise79 {
	public static List<Integer> rotate(List<Integer> x)
	{
		int y = x.get(0);
		x.remove(x.get(0));
		x.add(y);
		return x;
	}
	public static void main(String[] args) {
		// Write a Java program to rotate an array (length 3) of integers in left direction.
		List<Integer> originalArray = new ArrayList<>(Arrays.asList(20, 30, 40));
		List<Integer> rotatedArray = new ArrayList<>(Arrays.asList(30, 40, 20));
		System.out.println(rotate(originalArray));
		System.out.println(rotate(rotatedArray));
	}

}
