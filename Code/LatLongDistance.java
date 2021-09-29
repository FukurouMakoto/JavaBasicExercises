import java.lang.Math;

public class LatLongDistance 
{
	public static double distance(double x1, double y1, double x2, double y2)
	{
		double radiusOfEarth = 6371.01;
		return radiusOfEarth * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		
	}
	public static void main(String[] args) 
	{
		// formula: d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
		double x1 = 25;
		double y1 = 35;
		double x2 = 35.5;
		double y2 = 25.5;
		
		//Expected output: 1480.0848451069087 km 
		System.out.println("The distance between those points is: " + distance(x1, y1, x2, y2) + " km.");
	}

}
