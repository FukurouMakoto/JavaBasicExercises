
public class IsJavaInstalled {
	
	public static void main(String[] args) {
		/*
		 	Java Version: 1.8.0_71                                                            
			Java Runtime Version: 1.8.0_71-b15                                                
			Java Home: /opt/jdk/jdk1.8.0_71/jre                                               
			Java Vendor: Oracle Corporation                                                   
			Java Vendor URL: http://Java.oracle.com/                                          
			Java Class Path: .
		 */
		String JavaVersion = System.getProperty("java.version");
		String JavaRuntimeVersion = System.getProperty("java.runtime.version");
		String JavaHome = System.getProperty("java.home");
		String JavaVendor = System.getProperty("java.vendor");
		String JavaVendorURL = System.getProperty("java.vendor.url");
		String JavaClassPath = System.getProperty("java.class.path");
		System.out.println("Java Version: " + JavaVersion);
		System.out.println("Java Runtime Version: " + JavaRuntimeVersion);
		System.out.println("Java Home: " + JavaHome);
		System.out.println("Java Vendor: " + JavaVendor);
		System.out.println("Java Vendor URL: " + JavaVendorURL);
		System.out.println("Java Class Path: " + JavaClassPath);
	}

}
