
public class PrintTheFlag {
	
	public static void main(String[] args) {
		String one = "* * * * * * ==================================";
		String two = " * * * * *  ==================================";
		String three = "==============================================";
		for(int i = 0; i < 9; i++)
		{
			if(i % 2 != 0)
			{
				System.out.println(two);
			}
			else if(i % 2 == 0)
			{
				System.out.println(one);
			}
		}
		for(int a = 0; a < 6; a++)
		{
			System.out.println(three);
		}
	}

}
