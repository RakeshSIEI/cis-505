/*
    Rakesh, K. (2021), CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/
package Module_3;

public class TestCode {

	public static void main(String []args)
	{
		
	//Below are the Integer objects. To pass variables to Integer methods.
	Integer obj1 = new Integer(7); 
	Integer obj2 = new Integer(7);
	Integer obj3 = new Integer(6);
	
	//object creation for RakeshInteger class and calling constructor with parameters.
	RakeshInteger obj= new RakeshInteger(6);
	
	//below is the equals() method which returns true when both numbers are equal.
	System.out.print("Integer obj1 and Integer obj2 are equal. True or False? = ");  
    System.out.println(obj1.equals(obj2));           
    
    System.out.print("Integer obj2 and Integer obj3 are equal. True or False? = ");  
    System.out.println(obj2.equals(obj3));           

    System.out.print("Integer obj3 and int are equal. True or False? = ");  
    System.out.println(obj3.equals(obj.getRakesh()));           
	
	// below is the method to find prime number with no parameters, with int Parameters and with Integer Parameters
	System.out.println( "This calls method with no parameters  number is Prime: "+obj.isPrime() +"for "+obj.getRakesh() );
	System.out.println( "This calls method with int Parameters number is Prime: "+obj.isPrime(9)+"For "+obj.getRakesh());
	System.out.println( "This calls method with Integer Parameters "+obj1+ " number is Prime: "+RakeshInteger.isPrime(obj1));
	
	// below is the method to find even number with no parameters, with int Parameters and with Integer Parameters
	System.out.println( "This calls method with no parameters number is Even: "+obj.isEven()+"For "+obj.getRakesh());
	System.out.println( "This calls method with Integer Parameters "+obj1+ " number is EVEN: "+RakeshInteger.isEven(obj1));
	System.out.println( "This calls method with int Parameters number is Even: "+obj.isEven(2)+"for"+obj.getRakesh());
	
	// below is the method to find odd number with no parameters, with int Parameters and with Integer Parameters
	System.out.println( "This calls method with no parameters number is Odd: "+obj.isOdd()+"for "+obj.getRakesh());
	System.out.println( "This calls method with int Parameters number is Odd: "+obj.isOdd(8)+"for "+obj.getRakesh());
	System.out.println( "This calls method with Integer Parameters "+obj3+ " number is Odd: "+RakeshInteger.isOdd(obj3));
	
	
	
	}//end main
}//end TestCode

