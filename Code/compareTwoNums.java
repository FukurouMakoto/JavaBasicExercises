
public class compareTwoNums {
	
	public static void compareNums(int x, int y)
	{
		if(x != y)
		{
			System.out.println(x + " != " + y);
		}
		else
		{
			System.out.println(x + " == " + y);
		}
		
		if(x < y)
		{
			System.out.println(x + " < " + y);
		}
		else if(x > y)
		{
			System.out.println(x + " > " + y);
		}
		
		if(x <= y)
		{
			System.out.println(x + " <= " + y);
		}
		else
		{
			System.out.println(x + " >= " + y);
		}
	}
	public static void main(String[] args) {
		int x = 25;
		int y = 39;
		compareNums(x, y);

	}

}
