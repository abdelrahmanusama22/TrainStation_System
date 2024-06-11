package abdelrahmanusama_2051710528;
import java.util.*;  
import java.util.ArrayList;

public  class Trip_2051710528 implements Comparable<Trip_2051710528>{
   protected String number_trip;//attribute for the number_trip
   protected String specific_date_trip;//attribute for the specific_date_trip
   protected DriverS_2051710528 DRIVER_TRIP ;//attribute for the DRIVER_TRIP
   protected int seats;//attribute for the seats
   protected String location;//attribute for the location
   protected String type_vehicle;//attribute for the type_vehicle
   protected int maxpassengers;//attribute for the maxpassengers
    static  ArrayList<Passengers_2051710528> u;//ArrayList for class passengers
    private Object getNumber_trip;
    private Object getSpecific_date_trip;

    public Trip_2051710528(String number_trip, String specific_date_trip, DriverS_2051710528  DRIVER_TRIP, int seats, String location, String type_vehicle,int maxpassenger) //two argument constructor
    {
        this.number_trip = number_trip;
        this.specific_date_trip = specific_date_trip;
        this.DRIVER_TRIP = DRIVER_TRIP;
        this.seats = seats;
        this.location = location;
        this.type_vehicle = type_vehicle;
        this.maxpassengers=maxpassengers;
        u = new ArrayList<>();
           
    }
     public Trip_2051710528()//zero argument constructor
     {
     this(null,null,null,0,null,null,0);
     }

    public  ArrayList<Passengers_2051710528> getU() //getter for the ArrayList
    {
        return u;
    }
     
    public void setU(ArrayList<Passengers_2051710528> u) //setter for the ArrayList
    {
        Trip_2051710528.u = u;
    }

    

    public String getNumber_trip()//getter for the Number_trip
    {
        return number_trip;
    }

    public void setNumber_trip(String number_trip)//setter for the Number_trip 
    {
        this.number_trip = number_trip;
    }

    public int getMaxpassengers() //getter for the Maxpassengers 
    {
        return maxpassengers;
    }

    public void setMaxpassengers(int maxpassengers)//setter for the Maxpassengers 
    {
        this.maxpassengers = maxpassengers;
    }

    
   

    public String getSpecific_date_trip()//getter for the Specific_date_trip 
    {
        return specific_date_trip;
    }

    public void setSpecific_date_trip(String specific_date_trip)//etter for the Specific_date_trip
    {
        this.specific_date_trip = specific_date_trip;
    }

    public DriverS_2051710528  getDRIVER_TRIP()//getter for the DRIVER_TRIP 
    {
        return DRIVER_TRIP;
    }

    public void setDRIVER_TRIP(DriverS_2051710528  DRIVER_TRIP)//setter for the DRIVER_TRIP
    {
        this.DRIVER_TRIP = DRIVER_TRIP;
    }

    public int getSeats()//getter for the seats
    {
        return seats;
    }

    public void setSeats(int seats)//setter for the seats
    {
        this.seats = seats;
    }

    public String getLocation()//getter for the location
    {
        return location;
    }

    public void setLocation(String location) //setter for the location
    {
        this.location = location;
    }

    public String getType_vehicle() //getter for the Type_vehicle
    {
        return type_vehicle;
    }

    public  void setType_vehicle(String type_vehicle)//setter for the Type_vehicle
    {
        this.type_vehicle = type_vehicle;
    }
    public void addPassenger(Passengers_2051710528 p)//addpassenger is methods to add passenger at arraylist U()
    {
        if (u.size() < maxpassengers) {
                u.add(p);
        System.out.println(" add passengers.");
        } else {
            System.out.println("maxpassengers");
        }
    }
    public boolean equals(Trip_2051710528 c)
    {
    Trip_2051710528 t=(Trip_2051710528)c;
    if(t.getNumber_trip().equals(c.getNumber_trip())){
    return true;}
    else{
        return false;}
        }
   
   @Override
    public int compareTo(Trip_2051710528 o) {
        if(getNumber_trip()!= o.getNumber_trip()){
            return 1;
        
        
    }
        else
       return 0;
    }

    
    @Override
    public String toString() //tostring method for class trip
    {
        String f = "";
        if(!u.isEmpty()) {
            f = "trip " + super.toString() + "number_trip=" + number_trip + ", specific_date_trip=" + specific_date_trip + ", DRIVER_TRIP=" + DRIVER_TRIP + ", seats=" + seats + ", location=" + location + ", type_vehicle=" + type_vehicle + ","+"Passengers : \n";
            for (Passengers_2051710528 o : u)
                f += o + "\n";
        }
        else {
            f+= "No passenger";
        }
        return f;
    }
       
    }

    

   
   
    

    

    

    
           
   
   
    

