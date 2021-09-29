
public class CircleMath {
	
	public static double area(double radius)
	{
		double pi = 3.14;
		double x = radius * radius;
		return pi * x;
	}
	
	public static double perimeter(double radius)
	{
		double pi = 3.14;
		return 2 * pi * radius;
	}
	public static void main(String[] args) 
	{	
		double radius = 7.5;
		System.out.println("Area is: " + area(radius));
		System.out.println("Perimeter is: " + perimeter(radius));
	}

}
