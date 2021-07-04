/*
    Rakesh, K. (2021), CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/
package Module_5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;  
public class KondaStreamsTest   
{  
	public static void main(String[] args)   
	{     
		//constructor of file class having file as argument
		File file = new File("D:\\data.txt"); //initialize File object and passing path as argument  
		boolean result;  // Variable to capture boolean value of file existence. 
		try   
		{  
			Random random = new Random();// Random class object to generate Random values
			result = file.createNewFile();  //creates a new file  
			if(result)      // test if successfully created a new file  
			{  
				System.out.println("file created "+file.getCanonicalPath()); //returns the path string 
				FileOutputStream fos=new FileOutputStream("D:\\data.txt", true);// Object to Store data into file.

				for(int i=0;i<10;i++)
	        	  {
	        		  int x = random.nextInt(10);// generate 10 Random numbers.
	        		  String str=Integer.toString(x);//converting Integer into String 
	        		  str=str+" ";//Adding space at the end of the string
	        		  byte[] b= str.getBytes();//converting string into bytes 
	        		  fos.write(b);  // Writing Data into actual file    
	        		  
	        	  }
      		  fos.close();//Closing file
      		System.out.println("file created!!!....");  
			}  
			else  
			{  
				System.out.println("File already exist at location: "+file.getCanonicalPath());
				FileOutputStream fos=new FileOutputStream("D:\\data.txt", true);

				for(int i=0;i<10;i++)
	        	  {
	        		  int x = random.nextInt(10);// generate 10 Random numbers.
	        		  String str=Integer.toString(x);//converting Integer into String
	        		  str=str+" ";//Adding space at the end of the string
	        		  byte[] b= str.getBytes();//converting string into bytes 
	        		  fos.write(b); // Writing Data into actual file       
	        		  
	        	  }
      		  fos.close();//Closing file
      		System.out.println("file saved yee....");  
			}
			FileInputStream fis=new FileInputStream(file); //opens a connection to file 
			System.out.println("Below is file content: ");  
			int r=0;  
			while((r=fis.read())!=-1)  
			{  
			System.out.print((char)r);      //prints the content of the file  
			}  
		}   
		catch (IOException e)   
		{  
			e.printStackTrace();    //prints exception if any  
		}         
	}  // end main
}// end KondaStreamsTest
