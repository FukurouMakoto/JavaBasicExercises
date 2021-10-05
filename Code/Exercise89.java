
public class Exercise89 {
	
	
	public static void checkSec()
	{
		if(System.getSecurityManager() == null)
		{
			System.out.println("No Security Manager present!");
		}
		
		else
		{
			System.out.println(System.getSecurityManager());
		}
	}
	public static void main(String[] args) {
		// Write a Java program to check whether a security manager 
		// has already been established for the current application or not.
		
		checkSec();
	}
	
	
}
