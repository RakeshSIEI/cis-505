/*
    Rakesh, K. (2021), CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/
package Module_2.EnhancedFanApp;

import java.util.Set;

public class UseFans
 {
    /**
     * Method takes one parameter: Collection of Fans. 
     *
     * @param fanC  Set<Fan>
     */
	public void displayFanCollection(Set<Fan> fanC)
    {
		for(Fan i: fanC){ 
			String state2=null;
    		if (i.getState()==true)
    		{
    			state2="ON";
    		}
    		else 
    		{
    			state2="OFF";
    		}
			System.out.println( "Status of Collection FANs is: Color:"+ i.getColor() + "	Radius:" + i.getRadius()+"	State:"+state2+"	Speed:"+i.getSpeed());  
		    }  
		
	}//end displayFanCollection
    
	/**
     * Method takes Single instance as parameter & displays its status 
     *
     * @param fan Fan 
     */
	public void displayFan(Fan fan)
    {
		
			String state2=null;
    		if (fan.getState()==true)
    		{
    			state2="ON";
    		}
    		else 
    		{
    			state2="OFF";
    		}
			System.out.println( "Status of FAN is: Color:"+ fan.getColor() + "	Radius:" + fan.getRadius()+"	State:"+state2+"	Speed:"+fan.getSpeed());  
		
	}//end displayFan
	

}//end UseFan
