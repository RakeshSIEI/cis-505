/*
    Rakesh, K. (2021), CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/
package Module_1.HelloWorldApp;
public class RakeshFan {

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
        } // end enum.
        
        
        private Speed speed; 
        private boolean state;
        private int radius;
        private String color;
        
        
        /**
         * Constructor takes no parameters. Sets the default values to the class properties speed,radius,color.
         * @return Sets the parameters to the class properties.
         */
        public RakeshFan()
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
        public RakeshFan(int speed,int radius,String color){
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
    
    
        public Speed getSpeed() //Getter for property value for speed. 
        {
            return speed;
        }//end getSpeed.
    
        public void setSpeed(Speed speed2)//sets property value for speed. 
        {
            this.speed = speed2;
        }//end setSpeed.
    
        public boolean getState() //Getter for property value for state.
        {
            return state;
        }//end getState.
    
        public void setState(boolean state)//sets property value for state.
         {
            this.state = state;
        }//end setState.
    
        public int getRadius() //Getter for property value for Radius.
        {
            return radius;
        }//end getRadius.
    
        public void setRadius(int radius)//sets property value for radius.
         {
            this.radius = radius;
        }//end setRadius.
    
        public String getColor() //Getter for property value for Color.
        {
            return color;
        }//end getColor.
    
        public void setColor(String color) //sets property value for color.
        {
            this.color = color;
        }//end setColor.
        
        //toString() method represents object as a string in a required format. 
        public String toString(){
            String state2=null;
            if (getState()==true)
            {
                state2="ON";
            }
            else 
            {
                state2="OFF";
            }
            return "Status of FAN is: Color:"+ getColor() + "	Radius:" + getRadius()+"	State:"+state2+"	Speed:"+getSpeed();
            
        }
        
        public static void main(String args[])
        { 
            RakeshFan obj=new RakeshFan();//Calling constructor with no parameters.
            RakeshFan obj2=new RakeshFan(1,7,"blue");//calling constructor with parameters.
            
            System.out.println(obj);//Displays functionality of FAN.
            System.out.println(obj2);//Displays functionality of FAN.
        }//end main
    
    }// end RakeshFan