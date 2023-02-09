package src.startend;

import src.delivery.DatePicker;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.*;

class UserTime {
    // Constructor
    LocalTime currentTime = LocalTime.now(ZoneId.of("America/Los_Angeles"));
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm a");
    String formattedTime = currentTime.format(formatter);
    LocalTime am = LocalTime.of(11, 0);
    LocalTime pm = LocalTime.of(22, 0);
}
public class Welcome extends UserTime {
    public void outWlc() {
        System.out.println();
        System.out.println("\"REGULAR RESTAURANT\"");
        System.out.println("Business Hours:\nMonday - Sunday: 11 a.m. - 10 p.m.");
        System.out.println("Welcome!");
        System.out.println("Current Time: " + formattedTime);
    }
    public void checkTime() {
        if (currentTime.isAfter(am) & currentTime.isBefore(pm)) {
            System.out.println("We are Open!");
            System.out.println("Place an order To Go:");
        } else {
            System.out.println("Sorry, we are closed.");
            System.out.println("You may still place your order. However it will not be delivered until we open again.");
        }
    }
    public void deliverDate() {
        src.delivery.DatePicker appointment = new DatePicker();
        
        if(currentTime.isAfter(am) & currentTime.isBefore(pm)) {
            appointment.userDate();
            System.out.println("You order was successful!");
            
        }
        else {
            appointment.userDate();
            System.out.println("Your order will be placed when we open again. Thank you!");
            
        }
    }
}
