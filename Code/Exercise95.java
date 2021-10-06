import java.util.ArrayList;
import java.util.List;

public class Exercise95 {

	
	public static List<String> fill(List<String> x, int y)
	{
		for(int i = 0; i < y; i++)
		{
			x.add(String.valueOf(i));
		}
		
		return x;
	}
	public static void main(String[] args) {
		// Write a Java program to create an array (length # 0) of string values. 
		// The elements will contain "0", "1", "2" … through ... n-1
		List<String> x = new ArrayList<>();
		
		List<String> y = fill(x, 10);
		
		String type = "";
		for(int i = 0; i < y.size(); i++)
		{
			type = y.get(i).getClass().getSimpleName();
			System.out.println("element " + x.get(i) + " is of type " + type);
		}
	}

}
