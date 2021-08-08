package GradeBookApp;

import java.awt.List;
import java.nio.charset.StandardCharsets;
import java.io.*;
import java.util.*;  
import GradeBookApp.Student;
import java.nio.file.*;

public class KondsStream  
{  
   public KondsStream(Student student)
   {
		//constructor of file class having file as argument
	   	String fName=student.getfName();
		String lName=student.getlName();
		String course=student.getCourse();
		String grade=student.getGrade();
		File file = new File("D:\\grades.csv"); //initialize File object and passing path as argument  
		boolean result;  // Variable to capture boolean value of file existence. 
		String lineSeparator = System.getProperty("line.separator");	
		try   
		{  

			result = file.createNewFile();  //creates a new file  
			if(result)      // test if successfully created a new file  
			{  
				System.out.println("file created "+file.getCanonicalPath()); //returns the path string 
				FileOutputStream fos=new FileOutputStream("D:\\grades.csv", true);// Object to Store data into file.

      		  String str="FirstName;LastName;Course;Grade;";
      		  byte[] b= str.getBytes();//converting string into bytes 
      		  fos.write(b);  // Writing Data into actual file 
      		  fos.write(lineSeparator.getBytes());
      		  String str2=fName+";"+lName+";"+course+";"+grade;
      		  b= str2.getBytes();//converting string into bytes 
      		  fos.write(b);  // Writing Data into actual file 
      		  fos.write(lineSeparator.getBytes());
      		  fos.close();//Closing file
      		System.out.println("file created!!!....");  
			}  
			else  
			{  
				System.out.println("File already exist at location: "+file.getCanonicalPath());
				FileOutputStream fos=new FileOutputStream("D:\\grades.csv", true);

	      		  String str2=fName+";"+lName+";"+course+";"+grade;
	      		  byte[] b= str2.getBytes();//converting string into bytes 
	      		  fos.write(b);  // Writing Data into actual file 
	      		  fos.write(lineSeparator.getBytes());
	      		  fos.close();//Closing file
	      		  System.out.println("file saved yee....");  
			}
			
			

		}   
		catch (IOException e)   
		{  
			e.printStackTrace();    //prints exception if any  
		}         
   }
   
   public static  Set<Student> viewGrades() throws IOException
   {
	   Set<Student> students=new HashSet<Student>();
			System.out.println("Below is file content: ");  
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\grades.csv"), StandardCharsets.UTF_8));
			String line;
			
			while((line = br.readLine()) != null)  
			{  
				
				System.out.println(line);    //prints the content of the file 
				String[] line2 = line.split(";");
				if (line2[0]!= null)
				{
                students.add(new Student(line2[0], line2[1], line2[2], line2[3]));
				}
			} 
			return students;
			
	 
   }


}