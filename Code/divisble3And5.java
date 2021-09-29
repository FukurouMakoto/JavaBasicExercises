import java.util.ArrayList;
import java.util.List;

public class divisble3And5 {
	public static boolean divisible(int x, int y)
	{
		if(x % y == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		List<Integer> divisibleByThree = new ArrayList();
		List<Integer> divisibleByFive = new ArrayList();
		List<Integer> divisibleByThreeAndFive = new ArrayList();
		
		for(int i = 1; i < 100; i++)
		{
			if(divisible(i, 5) && divisible(i, 3))
			{
				divisibleByThreeAndFive.add(i);
			}
			else if(divisible(i, 5))
			{
				divisibleByFive.add(i);
			}
			else if(divisible(i, 3))
			{
				divisibleByThree.add(i);
			}
		}
		
		System.out.println("Divided by 3:");
		System.out.println(divisibleByThree);
		System.out.println("Divided by 5:");
		System.out.println(divisibleByFive);
		System.out.println("Divided by 3 & 5:");
		System.out.println(divisibleByThreeAndFive);

	}

}
