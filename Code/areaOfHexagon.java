import java.lang.Math;

public class areaOfHexagon 
{
	public static double areaOfHex(int s)
	{
		double x = Math.pow(s, 2);
		double firstHalf = 6 * x;
		double secondHalf = 4 * Math.tan(Math.PI/6); 
		return firstHalf / secondHalf;
	}
	public static void main(String[] args) 
	{
		int s = 6;
		System.out.println(areaOfHex(s));

	}

}
