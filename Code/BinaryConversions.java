
public class BinaryConversions {
	
	public static String sumBinary(String x, String y)
	{	
		return Integer.toBinaryString(Integer.parseInt(x, 2) + Integer.parseInt(y, 2));
	}
	
	public static String subtractBinary(String x, String y)
	{	
		return Integer.toBinaryString(Integer.parseInt(x, 2) - Integer.parseInt(y, 2));
	}
	
	public static String multiplyBinary(String x, String y)
	{	
		return Integer.toBinaryString(Integer.parseInt(x, 2) * Integer.parseInt(y, 2));
	}
	
	public static String divideBinary(String x, String y)
	{	
		return Integer.toBinaryString(Integer.parseInt(x, 2) / Integer.parseInt(y, 2));
	}
	
	public static String decToBinary(int num)
	{
		return Integer.toBinaryString(num);
	}
	
	public static String decToHex(int num)
	{
		return Integer.toHexString(num);
	}
	
	public static String decToOctal(int num)
	{
		return Integer.toOctalString(num);
	}
	
	public static int binToDec(String num)
	{
		return Integer.parseInt(num, 2);
	}
	
	public static String binToHex(String num)
	{
		return decToHex(binToDec(num));
	}
	
	public static String binToOct(String num)
	{
		return decToOctal(binToDec(num));
	}
	
	public static int octalToDec(String num)
	{
		return Integer.parseInt(num,8);
	}
	
	public static String octalToBin(String num)
	{
		return decToBinary(octalToDec(num));
	}
	
	public static String octalToHex(String num)
	{
		return binToHex(octalToBin(num));
	}
	
	public static int hexToDec(String num)
	{
		return Integer.parseInt(num,16);
	}
	
	public static String hexToBin(String num)
	{
		return decToBinary(hexToDec(num));
	}
	
	public static String hexToOctal(String num)
	{
		return decToOctal(hexToDec(num));
	}
	
	public static void main(String[] args) 
	{
		String firstBinaryNum = "10";
		String secondBinaryNum = "11";
		System.out.println(sumBinary(firstBinaryNum, secondBinaryNum));
		System.out.println(subtractBinary(firstBinaryNum, secondBinaryNum));
		System.out.println(multiplyBinary(firstBinaryNum, secondBinaryNum));
		System.out.println(divideBinary(firstBinaryNum, secondBinaryNum));
		int num = 5;
		System.out.println(decToBinary(num));
		num = 15;
		System.out.println(decToHex(num));
		System.out.println(decToOctal(num));
		String newBinaryNum = "100";
		System.out.println(binToDec(newBinaryNum));
		newBinaryNum = "1101";
		System.out.println(binToHex(newBinaryNum));
		newBinaryNum = "111";
		System.out.println(binToOct(newBinaryNum));
		String newOctalNum = "10";
		System.out.println(octalToDec(newOctalNum));
		newOctalNum = "7";
		System.out.println(octalToBin(newOctalNum));
		newOctalNum = "100";
		System.out.println(octalToHex(newOctalNum));
		String newHexNum = "25";
		System.out.println(hexToDec(newHexNum));
		newHexNum = "37";
		System.out.println(hexToBin(newHexNum));
		newHexNum = "40";
		System.out.println(hexToOctal(newHexNum));
	}

}
