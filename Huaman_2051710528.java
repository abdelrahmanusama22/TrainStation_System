package abdelrahmanusama_2051710528;
public class Huaman_2051710528 {
    protected  String name;//attribute for the name
    protected String human_ID;//attribute for the human_id
    protected  String blood_type ; //attribute for the blood_type
    protected  String Nationality; //attribute for the national

    public Huaman_2051710528(String name, String human_ID, String blood_type, String Nationality) //two argument constructor
    {
        this.name = name;
        this.human_ID = human_ID;
        this.blood_type = blood_type;
        this.Nationality = Nationality;
    }
    public Huaman_2051710528()//zero argument constructor
    {
    this(null,null,null,null);
    }

    public String getName() // getter for the name human
    {
        return name;
    }

    public void setName(String name) // setter for the name human
    {
        this.name = name;
    }

    public String getHuman_ID() // getter for the name human_id
    {
        return human_ID;
    }

    public void setHuman_ID(String human_ID)// getter for the name human_id
    {
        this.human_ID = human_ID;
    }

    public String getBlood_type() // getter for the blood_type
    {
        return blood_type;
    }

    public void setBlood_type(String blood_type)// setter for the blood_type

    {
        this.blood_type = blood_type;
    }

    public String getNationality()// getter for the Nationality

    {
        return Nationality;
    }

    public void setNationality(String Nationality) // setter for the Nationality
    {
        this.Nationality = Nationality;
    }

    @Override
    public String toString()// to string method for class Huaman_2051710528
    {
        return "name=" + name + ", human_ID=" + human_ID + ", blood_type=" + blood_type + ", Nationality=" + Nationality + '}';
    }
    
    
}

