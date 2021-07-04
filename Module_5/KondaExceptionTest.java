/*
    Rakesh, K. (2021), CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/
package Module_5;

import java.util.ArrayList;
import java.util.Scanner;

public class KondaExceptionTest {
	
	public static void main(String[]args)
	{
		ArrayList<String> arrli
        = new ArrayList<String>();// Array list declaration 
		
		arrli.add("CSS");
		arrli.add("HTML");
		arrli.add("python");
		arrli.add("Java");
		arrli.add("C");
		arrli.add("C++");
		arrli.add("JavaScript");
		arrli.add("Flutter");
		arrli.add("SQL");
		arrli.add("MYSQL");
		
		for (String lis : arrli){
			System.out.println("Collection of array list are:"+lis);
			//String is not a primitive and therefore boxing does not apply.
		}
		
		Scanner sc= new Scanner(System.in);
		String userInput=sc.next();
		
		int index1 = arrli.indexOf(userInput);
		
		try{
			if(index1<0)
			{
				throw new ArrayIndexOutOfBoundsException();	
			}
			else 
			{
				System.out.println(userInput);
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			 
            // Message printed when exception occurs
            System.out.println(
                "Out of Bounds...");
        }
	
	}//end main

}//end KondaExceptionTest