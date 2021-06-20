/*
    Rakesh, K. (2021), CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/
package Module_2.EnhancedFanApp;

import java.util.HashSet;
import java.util.Set;

public class Test {
	
	public static void main(String args[])
    {
        //creating Fan obj without parameters.This calls constructor with no parameters.
		Fan obj=new Fan();
        //creating Fan obj2 with parameters.This calls constructor with parameters.
		Fan obj2=new Fan(1,7,"blue");
        //creating Fan obj3 with parameters.This calls constructor with parameters.
		Fan obj3=new Fan(3,8,"yellow");
		
        //Creating the collection of instances.
		Set<Fan> fanC = new HashSet<Fan>();
		fanC.add(obj);//Adding obj to collection of instances fanC.
		fanC.add(obj2);//Adding obj2 to collection of instances fanC.
		fanC.add(obj3);//Adding obj3 to collection of instances fanC.
		
		//creating instance for the class UseFans.
		UseFans uf=new UseFans();
        //For displaying fan status, call the method that takes a collection of fan instances.
		uf.displayFanCollection(fanC);
		
		uf.displayFan(obj2);
		
	}//end main

}//end Test