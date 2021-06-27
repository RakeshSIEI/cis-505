/*
    Rakesh, K. (2021), CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/
package Module_3;

public class RakeshInteger {
	
	private static int rakesh;//static and integer variable 
	
	//Below is the constructor with no parameters to set default values when object is created for RakeshInteger class.
	public RakeshInteger()
	{
		RakeshInteger.setRakesh(0);
	}
	
	//Below is the constructor with Parameter.
	public RakeshInteger(int rakesh)
	{
		RakeshInteger.setRakesh(rakesh);
	}

	public static int getRakesh() {
		return rakesh;
	}

	public static void setRakesh(int rakesh) {
		RakeshInteger.rakesh = rakesh;
	}
	
	//Below is isEven() method with no parameters to check given number even or not. 
	public boolean isEven(){
		if (RakeshInteger.getRakesh()%2==0)
		{
			return true;
		}
		return false;
	}
	
	//Below is isOdd() method with no parameters to check given number odd or not. 
	public boolean isOdd(){
		if (RakeshInteger.getRakesh()%2!=0)
		{
			return true;
		}
		return false;
		
	}
	
	//Below is isPrime() method with no parameters to check given number prime or not. 
		public  boolean isPrime() {  
		       if (RakeshInteger.getRakesh() <= 1) {  
		           return false;  
		       }  
		       for (int i = 2; i < Math.sqrt(RakeshInteger.getRakesh()); i++) {  
		           if (RakeshInteger.getRakesh() % i == 0) {  
		               return false;  
		           }  
		       }  
		       return true;  
		   }  
		
		//Below is Static isEven() method with int parameters to check given number even or not. 
		public static boolean isEven(int rakesh){
			RakeshInteger.setRakesh(rakesh);
			if (RakeshInteger.getRakesh()%2==0)
			{
				return true;
			}
			return false;
		}
		
		//Below is Static isOdd() method with int  parameters to check given number odd or not. 
		public static boolean isOdd(int rakesh){
			RakeshInteger.setRakesh(rakesh);
			if (RakeshInteger.getRakesh()%2!=0)
			{
				return true;
			}
			return false;
			
		}
		
		//Below is static isPrime() method with int  parameters to check given number prime or not. 
			public  static boolean isPrime(int rakesh) { 
				RakeshInteger.setRakesh(rakesh);
			       if (RakeshInteger.getRakesh() <= 1) {  
			           return false;  
			       }  
			       for (int i = 2; i < Math.sqrt(RakeshInteger.getRakesh()); i++) {  
			           if (RakeshInteger.getRakesh() % i == 0) {  
			               return false;  
			           }  
			       }  
			       return true;  
			   }  
	
			//Below is static isEven() method with Integer  parameters to check given number even or not. 
			public static boolean isEven(Integer rakesh){
				
				if (rakesh%2==0)
				{
					return true;
				}
				return false;
			}
			
			//Below is static isOdd() method with Integer  parameters to check given number odd or not. 
			public static boolean isOdd(Integer rakesh){
				if (rakesh%2!=0)
				{
					return true;
				}
				return false;
				
			}
			
			//Below is static isPrime() method with Integer  parameters to check given number prime or not. 
				public  static boolean isPrime(Integer rakesh) {  
				       if (rakesh <= 1) {  
				           return false;  
				       }  
				       for (int i = 2; i < Math.sqrt(rakesh); i++) {  
				           if (rakesh % i == 0) {  
				               return false;  
				           }  
				       }  
				       return true;  
				   }  
	
}//end RakeshInteger

