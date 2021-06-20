/*
    Rakesh, K. (2021), CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/
package Module_2.EnhancedFanApp;

public class Fan
 {
     /**
    *Java Enums can be thought of as classes which have a fixed set of constants (a variable that does not change).
    *enum Speed used to maintain constants of STOPPED,SLOW,MEDIUM,FAST.
    */
	enum Speed{
		STOPPED(0),
		SLOW(1),
		MEDIUM(2),
		FAST(3);

		private int value;
		private Speed(int value){
		this.value=value;
		}
	}
	
	
	private Speed speed;
	private boolean state;
	private int radius;
	private String color;
	/**
         * Constructor takes no parameters. Sets the default values to the class properties speed,radius,color.
         * @return Sets the parameters to the class properties.
         */
	public Fan()
	{
		Speed s=Speed.STOPPED;
		this.setSpeed(s);
		this.setRadius(6);
		this.setColor("white");
		this.setState(false);
	}
	/**
         * Constructor takes four parameters: speed, on, radius, and color. Sets the parameters to the class properties.
         * @param speed int
         * @param radius int
         * @param color String
         * @return Sets the parameters to the class properties.
         */
	public Fan(int speed,int radius,String color){
		for (Speed s : Speed.values()){
			if (s.value==speed)
			{
				this.setSpeed(s);
				this.setState(true);
			}
		}
		this.setRadius(radius);
		this.setColor(color);
	}


	public Speed getSpeed()//Getter for property value for speed. 
     {
		return speed;
	}

	public void setSpeed(Speed speed2)//setter for property value for speed. 
     {
		this.speed = speed2;
	}

	public boolean getState()//Getter for property value for State. 
     {
		return state;
	}

	public void setState(boolean state)//Setter for property value for State. 
     {
		this.state = state;
	}

	public int getRadius()//Getter for property value for Radius. 
     {
		return radius;
	}

	public void setRadius(int radius)//Setter for property value for Radius. 
     {
		this.radius = radius;
	}

	public String getColor()//Getter for property value for Color. 
     {
		return color;
	}

	public void setColor(String color)//Getter for property value for Color. 
     {
		this.color = color;
	}
	
	
}
