package src.startend;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.*;
import java.time.zone.*;

class UserTime {
    //Constructors    
        //Time Package: Local Time and Format (Reference - https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/time/package-summary.html)
    LocalTime currentTime = LocalTime.now();
    ZonedDateTime usercurrent = ZonedDateTime(ZoneId("Los Angeles"));
        //Stores hours for business hours
    LocalTime am = LocalTime.of(11, 0);
    LocalTime pm = LocalTime.of(22, 0);
        //Stores user's Zone Time
}
public class Welcome extends UserTime {
    public void checkTime() {
            //Print Current Time
        System.out.println("Current Time: " + currentTime.format(DateTimeFormatter.ofPattern("hh:mm a")));
            //Output based on the user's current time
        if (currentTime.isBefore(am) & currentTime.isAfter(pm)) {
            System.out.println("Sorry, we are closed.");
            System.out.println("You may still place your order. However it will not be delivered until we open again.");
            
        } else {
            System.out.println("We are Open!");
            System.out.println("Place an order To Go:");
        }
    }
    public void greetWlc() {
        //Print Introduction
        System.out.println();
        System.out.println("\"REGULAR RESTAURANT\"");
        System.out.println("Business Hours:\nMonday - Sunday: 11 a.m. - 10 p.m.");
        System.out.println("Welcome!");
       
    }
}