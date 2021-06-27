/*
    Rakesh, K. (2021), CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/
package Module_4;

import java.util.ArrayList;
import java.util.Scanner;

public class KondaTest {
	
	public static void main(String[]args)
	{
		ArrayList<Integer> arrli        = new ArrayList<Integer>();// Array list declaration
		
		
		//Scanner class to get Array list inputs from Users
		System.out.println("Please enter Array List numbers - 0 to quit:");
		Scanner sc= new Scanner(System.in);
		Integer num=sc.nextInt();
		
		//Adding values in Array List.
		while (num!=0){
			arrli.add(num);
			System.out.println("Please enter Array List numbers - 0 to quit:");
			Scanner sc1= new Scanner(System.in);
			num=sc1.nextInt();
			if(num==0){
				arrli.add(num);
			}
		}
		
		KondaArrayListTest obj=new KondaArrayListTest();//Object creation for KondaArrayListTest class(no parameters)
		
		Integer res=KondaArrayListTest.max(arrli);//Calling max() method from KondaArrayListTest class
		
		System.out.println("Max Integer is:"+res);
		
		

		
	}//end main

}
  
