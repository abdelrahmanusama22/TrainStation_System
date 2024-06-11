/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abdelrahmanusama_2051710528;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Abdel Rahman Usama
 */
public class AbdelrahmanUsama_2051710528 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        // test  DriverS_2051710528 class
        DriverS_2051710528 d1=new DriverS_2051710528(35,"alex","ahmed","1118","AB+","egypt");//add odject d1 to DriverS_2051710528
        DriverS_2051710528 d2=new DriverS_2051710528(33,"suez","ali","46546","B+","egypt");//add odject d2 to DriverS_2051710528
        DriverS_2051710528 d3=new DriverS_2051710528(21,"cairo","omar","8413210","O+","egypt");//add odject d3 to DriverS_2051710528
        DriverS_2051710528 d4=new DriverS_2051710528(45,"tanta","fady","15484","A+","egypt");//add odject d4 to DriverS_2051710528
        DriverS_2051710528 d5=new DriverS_2051710528(55,"sina","abdelrahman","24586465222","AB-","egypt");//add odject d5 to DriverS_2051710528
       
        //test setter and getter
        System.out.println(d5.getAge_driver());//print age driver of obj d5
       d1.setBlood_type("AB+");//set blood type to obj d1
       d3.setHuman_ID("515614321");//setHuman_ID to obj d3
       
       //test tostring
        System.out.println(d1.toString());
         System.out.println(d2.toString());
          System.out.println(d3.toString());
           System.out.println(d4.toString());
            System.out.println(d5.toString());
        
        
          
          
       // make  Passengers_2051710528
         Passengers_2051710528 p1=new Passengers_2051710528("male", 5151,"abdo","56465","o+","egypt");
        Passengers_2051710528 p2=new Passengers_2051710528("female",5151,"aliya","56465","B","sudan");
        Passengers_2051710528 p3=new Passengers_2051710528("female",89484,"mona","5456","A","sudan");
        Passengers_2051710528 p4=new Passengers_2051710528("male",89489120,"ali","894956","AB","sudan");
        Passengers_2051710528 p5=new Passengers_2051710528("female",01024437,"sara","2556","C+","sudan");
        //tostring Passengers_2051710528
        System.out.println(p1);
         System.out.println(p2);
          System.out.println(p3);
           System.out.println(p4);
            System.out.println(p5);
            //test Trip_2051710528 class
        Trip_2051710528 t1=new Trip_2051710528("1111","19/11/2022",d1,60,"suez","BUS",4);
        Trip_2051710528 t2=new Trip_2051710528("6526","19/11/2022",d2,60,"ALEX","BUS",4);
        Trip_2051710528 t3=new Trip_2051710528("5754","20/11/2022",d3,60,"CAIRO","BUS",4);
        Trip_2051710528 t4=new Trip_2051710528("1185","21/11/2022",d4,60,"TANTA","BUS",4);
        Trip_2051710528 t5=new Trip_2051710528("1189","22/11/2022",d5,60,"ASWIM","BUS",4);
         Trip_2051710528 t6=new Trip_2051710528("1111","18/11/2022",d1,60,"suez","BUS",4);
        Trip_2051710528 t7=new Trip_2051710528("6526","19/11/2022",d2,60,"ALEX","BUS",4);
       
        
        System.out.println(t1.toString());
         System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        System.out.println(t6);
        System.out.println(t7);

     

                ////add trip
             MethodAndArray_2051710528.tripadd(t1);//add object1 from trip at tripadd method
             MethodAndArray_2051710528.tripadd(t2);//add object2 from trip at tripadd method
             MethodAndArray_2051710528.tripadd(t3);//add object3 from trip from trip at tripadd method
             MethodAndArray_2051710528.tripadd(t4);//add object4 from trip at tripadd method
             MethodAndArray_2051710528.tripadd(t5);//add object5 from trip at tripadd method
              MethodAndArray_2051710528.tripadd(t6);//add object6 from trip at tripadd method
             MethodAndArray_2051710528.tripadd(t7);//add object7 from trip at tripadd method
             // passenger to trip
             MethodAndArray_2051710528.addpass(t1,p1);//add object1 from trip and object1 from passenger  at addpass method
             MethodAndArray_2051710528.addpass(t2, p2);//add object2 from trip and object2 from passenger  at addpass method
             MethodAndArray_2051710528.addpass(t3, p3);//add object3 from trip and object3 from passenger  at addpass method
             MethodAndArray_2051710528.addpass(t4, p4);//add object4 from trip and object4 from passenger  at addpass method
             MethodAndArray_2051710528.Removepass(t4, p4);//remove object4 from trip and object4 from passenger  at removepass method
             MethodAndArray_2051710528.addpass(t6, p5);//add object6 from trip and object5 from passenger  at addpass method
             MethodAndArray_2051710528.addpass(t7, p2);//add object7 from trip and object5 from passenger  at addpass method
           
//             MethodAndArray_2051710528.Removepass(t2, p2);
             
             MethodAndArray_2051710528.maxpass();//
             MethodAndArray_2051710528.display();// this methods to display
             Collections.sort(MethodAndArray_2051710528.trips);//this method to sort
             MethodAndArray_2051710528.display();// this methods to display
             MethodAndArray_2051710528.savefile();// this methods to save file
            
             
             
             
        
       
       
      
        
        

        
    }
    
}
