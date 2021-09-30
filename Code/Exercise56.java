
public class Exercise56 {
	
	public static void isDivisible(int x, int y, int p){
		for(int i = x; i < y + 1; i++)
		{
			if(i % p == 0)
			{
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		int x = 5;
		int y = 20;
		int p = 3;
		isDivisible(x,y,p);
	}

}
