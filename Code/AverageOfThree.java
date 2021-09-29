
public class AverageOfThree 
{

	public static int average(int x, int y, int z)
	{
		int a = x + y + z;
		return a / 3;
	}
	public static void main(String[] args) 
	{
		int x = 25;
		int y = 30;
		int z = 80;
		
		System.out.println(average(x,y,z));
	}

}
