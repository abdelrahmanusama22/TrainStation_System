/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abdelrahmanusama_2051710528;
import java.io.File;//to print output in txt file
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;// import the array list package
import java.util.Collections;// import the collection package
import java.util.*;// import all packages


/**
 *
 * @author Abdel Rahman Usama
 */
public class MethodAndArray_2051710528 
{
   static ArrayList<Trip_2051710528> trips=new ArrayList<>();//STATIC arraylist to store trip 
    static void tripadd(Trip_2051710528 s){

        for (Trip_2051710528 i:trips) {
            if(s.equals(i))
                System.out.println(" trip allready Exists");
                break;
        }
        trips.add(s); //add obj to arraylist
        System.out.println("added  trip Succesfully");
    }
    static void addpass(Trip_2051710528 s,Passengers_2051710528 p)//method to add trip and passengers 
    {
        if(!trips.contains(s)){
            
                    System.out.println("passengers allready Exists");
                
            }
            
             else {
       if (s.getU().size() <= 5)// less than five passinger 
        {
            s.getU().add(p);
            System.out.println( "trip number"+s.getNumber_trip() +" " + s.getU().size() + " pass");
        }
       else
            System.out.println("trip complete passingers");
       
            
        }
                     

        
    }
    
    public static void maxpass()//
{
    int maxpassenger = 0;
    for(Trip_2051710528 tip : trips)
    {
        if(tip.getU().size()<=5)
            maxpassenger++;
    }
    System.out.println("The passengers in trip : " + maxpassenger + "passenger");
}
        static void Removepass(Trip_2051710528 s,Passengers_2051710528 t){
            if(MethodAndArray_2051710528.trips.contains(s)){
                for (Passengers_2051710528 a:s.getU()) {
                    if(a.equals(t)) {
                        s.getU().remove(t);
                        System.out.println(" remov Successfully");
                        break;
                    }
                }

            }

    }
        
        
        static void avg(String Specific_date_trip){
            int passengersCount = 0;
        int tripcount = 0;
        double average = 0.0;
        for (Trip_2051710528 tripp : trips) {
            if (tripp.getSpecific_date_trip().equals(Specific_date_trip)) {
                tripcount++;
                passengersCount += tripp.getU().size();
            }
        }
        System.out.println("all passengers in the trip: " + passengersCount);
        if (passengersCount > 0 && tripcount > 0) {
            average = passengersCount / tripcount;
            System.out.println("Average passengers per trip for the specific date(" + Specific_date_trip + "): " + average);
        } else {
            System.out.println("Average  passengers per trip for the specific date(" + Specific_date_trip + "): " + 0.0);
        }
    }
        
        public static void display()//display method
{
    for(Trip_2051710528 c: trips)
        System.out.println(c);
}
    static StringBuilder displayd()//dispayd method
    {
        StringBuilder sb =  new StringBuilder();
        Collections.sort(trips);
        ArrayList<String> time = new ArrayList<>();
        for (Trip_2051710528 o :trips) {
            if(time.contains(o))
            time.add(o.getSpecific_date_trip());
        }
        Collections.sort(time);
        for (String d : time){
            sb.append(d);
            for(Trip_2051710528 s:trips){
                if(d.equals(s.getSpecific_date_trip())){
                    sb.append(s);
}

            } 
        }
        
        return sb;
        

    }

public static void savefile()//saveTofile method
{
    try {
        PrintWriter out = new PrintWriter("Abdelrahman Usama.txt");
        System.out.println("runway ");
        for (Trip_2051710528 c: trips)
        {
            System.out.println("\t - " +c);
        }
        System.out.close();
        System.out.println("Save to file");
    }catch(FileNotFoundException e)
    {
        System.out.println("file not found");
    }


}

    @Override
    public String toString() {
        return "Number Trips: " + trips.size();
    }

}
