/*
    Rakesh, K. (2021), CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/
package Module_4;

import java.util.ArrayList;

public class KondaArrayListTest
 {
	
	//method to display max number from given ArrayList parameter.
	public static Integer max(ArrayList<Integer> arrli){
		
		Integer tmp=0;
		
		for(Integer lis : arrli) {
			if (tmp<lis){
				tmp=lis;
			}
		      
		    }
		return tmp;
		
	}
	
}//end KondaArrayListTest

