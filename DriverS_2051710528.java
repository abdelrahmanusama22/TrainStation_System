package abdelrahmanusama_2051710528;
public class DriverS_2051710528 extends Huaman_2051710528{//class DriverS_2051710528 extends class Huaman_2051710528
protected int age_driver;//attribute for the age driver
protected  String Address;//attribute for the address

    public DriverS_2051710528(int age_driver, String Address, String name, String human_ID, String blood_type, String Nationality)//two argument constructor
    {
        super(name, human_ID, blood_type, Nationality);
        this.age_driver = age_driver;
        this.Address = Address;
    }

    public DriverS_2051710528(int age_driver, String Address) //constructor
    {
        this.age_driver = age_driver;
        this.Address = Address;
    }
    public DriverS_2051710528()//zero argument constructor
    {
    this(0,null,null,null,null,null);
    }

    public int getAge_driver() // getter for the age driver
    {
        return age_driver;
    }

    public void setAge_driver(int age_driver)//setter for the age driver
    {
        this.age_driver = age_driver;
    }

    public String getAddress()// getter for the address
    {
        return Address;
    }

    public void setAddress(String Address)//setter for the address
    {
        this.Address = Address;
    }

    @Override
    public String toString()// to string method 
    {
        return     "Driver information  "+ super.toString()+ "age_driver=" + age_driver + ", Address=" + Address + '}';
    }
    
    
    
}
