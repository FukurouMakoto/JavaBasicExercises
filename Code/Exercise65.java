
public class Exercise65 {
	
	public static int selfModulo(int x, int y)
	{
		int z = x / y;
		return x - z * y;
	}
	public static void main(String[] args) {
		// Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator
		int x = 19;
		int y = 7;
		//result should be 5
		System.out.println(x + " % " + y + " = " + x % y);
		int z = selfModulo(x, y);
		System.out.println(z);
		x = 25;
		y = 5;
		//result should be 0
		System.out.println(x + " % " + y + " = " + x % y);
		z = selfModulo(x, y);
		System.out.println(z);
		x = 22;
		y = 5;
		//result should be 2
		System.out.println(x + " % " + y + " = " + x % y);
		System.out.println(selfModulo(x, y));

	}

}
