
public class sumOfDigits {
	public static int sumOfDigits(int num)
	{
		int x = 0;
		int y;
		while (num > 0)
		{
			y = num % 10;
			x = x + y;
			num = num / 10;
		}
		
		return x;
	}
	public static void main(String[] args) {
		int[] tests = {25, 344, 285, 982, 7745};
		
		for(int i = 0; i < tests.length; i++)
		{
			System.out.println(sumOfDigits(tests[i]));
		}
	}

}
