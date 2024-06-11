
package abdelrahmanusama_2051710528;

import java.util.ArrayList;

public class Passengers_2051710528 extends Huaman_2051710528//class Passengers_2051710528 extends class Huaman_2051710528
{
    protected  String genders;//attribute for the genders
    protected  int phoneNumber;//attribute for the phoneNumber
    protected Object getHuman_ID;

    public Passengers_2051710528(String genders, int phoneNumber, String name, String human_ID, String blood_type, String Nationality)//two argument constructor
    {
        super(name, human_ID, blood_type, Nationality);
        this.genders = genders;
        this.phoneNumber = phoneNumber;
        
    }
     public Passengers_2051710528()//zero argument constructor
     {
     this(null,0,null,null,null,null);
     
     }

    public String getGenders() // getter for the Genders
    {
        return genders;
    }

    public void setGenders(String genders)// setter for the Genders
    {
        this.genders = genders;
    }
   

    public int getPhoneNumber() // getter for the PhoneNumber
    {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber)//setter for the PhoneNumber
    {
        this.phoneNumber = phoneNumber;
    }

//    @Override
//    public String toString() {
//        return super.toString() + "genders=" + genders + ", phoneNumber=" + phoneNumber + '}';
//    }
    
    @Override
   public String toString()//toString method for class Passengers_2051710528
   {
        return "Passenger inforamtion "+super.toString() + "genders=" + genders + ", phoneNumber=" + phoneNumber + "human_ID"+human_ID+'}';
   }

    public boolean equals(Object c)// equals methods to compere btween two obj
    {
        Passengers_2051710528 p=(Passengers_2051710528)c;
        if(p.getHuman_ID().equals(this.getHuman_ID()))
            return true;
        else
            return false;
    }

    
    
}
