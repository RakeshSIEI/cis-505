/*
    Rakesh, K. (2021), CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/
package Module_6;

public class UseDivision 
{
	
	public static void main(String args[])
    {
	      DomesticDivision obj = new DomesticDivision("Services", 111, "Hyderabad");
	      DomesticDivision obj1 = new DomesticDivision("sales", 222, "Texas");
	      InternationalDivision obj2 = new InternationalDivision("Services", 333, "India", "Telugu");
	      InternationalDivision obj3 = new InternationalDivision("sales", 444, "America","English-US");
	      obj.display();
	      obj1.display();
	      obj2.display();
	      obj3.display();
	}// end main

}// end class UseDivision
