
public class addTwoBinaryNums {
	
	public static String ToBinary(int a, int b)
	{
		String x = String.valueOf(a);
		String y = String.valueOf(b);
		return x + y;
	}
	public static void main(String[] args) 
	{
		int firstBinaryNum = 10;
		int secondBinaryNum = 11;
		System.out.println(ToBinary(firstBinaryNum, secondBinaryNum));
	}

}
