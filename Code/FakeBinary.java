import java.util.ArrayList;
import java.util.Arrays;

public class FakeBinary {
	public static String fakeBin(String numberString) 
	{
        String[] x = numberString.split("");
        if(x[0] == "")
        {
        	return "";
        }
        ArrayList<String> y = new ArrayList<String>(Arrays.asList(x));
        ArrayList<String> z = new ArrayList();
        for(String s : y)
        {
        	int i = Integer.parseInt(s);
        	if(i < 5)
        	{
        		z.add("0");
        	}
        	else
        	{
        		z.add("1");
        	}
        }
        
        return String.join("", z);
	}
	
	public static boolean AssertEquals(String a, String b)
	{
		if(a == b)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args) 
	{
		String x = "45385593107843568";
		String y = "01011110001100111";
		System.out.println(x);
		System.out.println(y);
		x = "";
		System.out.println(fakeBin(x));
	}

}
