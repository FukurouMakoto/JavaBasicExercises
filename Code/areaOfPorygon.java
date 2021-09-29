import java.lang.Math;

public class areaOfPorygon {
	
	public static double areaOfPolygon(int n, int s)
	{
		double x = Math.pow(s, 2);
		double firstHalf = n * x;
		double secondHalf = 4 * Math.tan(Math.PI/n); 
		return firstHalf / secondHalf;
	}
	public static void main(String[] args) 
	{
		int n = 7;
		int s = 6;
		System.out.println(areaOfPolygon(n,s));

	}

}
