/*
    Rakesh, K. (2021), CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/
package Module_6;

abstract class Division{
	String divName=null;
	int accNum=0;
	public Division(String divName,int accNum)
	{
		this.accNum=accNum;
		this.divName=divName;
	}
	 abstract void display();
}

class InternationalDivision extends Division
{


	String country;
    String language;
    public InternationalDivision(String divName, int accNum, String country, String language)
    {
    	super(divName, accNum);
        this.divName=divName;
        this.accNum=accNum;
        this.country=country;
        this.language=language;
        
    }

	@Override
    //displays division_name, account number ,country & language
	void display()
     {
		System.out.println("Results:"+divName+" "+accNum+" "+country+" "+language);
		
	}

	
}

class DomesticDivision extends Division
{

	String state=null;
	
	public  DomesticDivision(String divName, int accNum, String state)
    {
		super(divName, accNum);
        this.accNum=accNum;
        this.state=state;
        this.divName=divName;
    }

	@Override
    //displays division_name, account number & state
	void display()
     {
		System.out.println("Results:"+divName+" "+accNum+" "+state);
	}

}
