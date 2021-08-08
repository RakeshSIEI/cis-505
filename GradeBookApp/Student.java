package GradeBookApp;

public class Student {

	private String fName;
	private String lName;
	private String course;
	private String grade;
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	public Student()
	{
		this.fName="";
		this.lName="";
		this.course="";
		this.grade="";
	}
	
	public Student(String fName,String lName,String course,String grade){
		this.setfName(fName);
		this.setlName(lName);
		this.setGrade(grade);
		this.setCourse(course);
	}
	
	@Override
	public String toString()
	{
		return "First Name: "+getfName()+"	Last Name: "+getlName()+"	Course: "+getCourse()+"	Grade: "+getGrade();
		
	}
	
}
