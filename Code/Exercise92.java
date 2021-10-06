import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercise92 {

	
	public static void oddAndEvens(List<Integer> x)
	{
		int even = 0;
		int odd = 0;
		for(int i = 0; i < x.size(); i++)
		{
			if(x.get(i) % 2 == 0)
			{
				even += 1;
			}
			else
			{
				odd += 1;
			}
		}
		System.out.println("This array has " + even + " even numbers");
		System.out.println("This array has " + odd + " odd numbers");
	}
	public static void main(String[] args) {
		// Write a Java program to count the number of even and odd 
		// elements in a given array of integers.
		long startTime = System.nanoTime();
		List<Integer> x = new ArrayList<>();
		List<Integer> y = new ArrayList<>();
		List<Integer> z = new ArrayList<>();
		Random rd = new Random();
		for(int i = 0; i < 100; i++)
		{
			x.add(rd.nextInt());
			y.add(rd.nextInt());
			z.add(rd.nextInt());
		}
		
		oddAndEvens(x);
		System.out.println("");
		oddAndEvens(y);
		System.out.println("");
		oddAndEvens(z);
		
		long endTime = System.nanoTime();
		long duration = (endTime - startTime) / 1000000;
		System.out.println("");
		System.out.println("Program took " + duration + "ms to complete");
	}

}
