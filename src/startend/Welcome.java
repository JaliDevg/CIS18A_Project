package src.startend;

import src.delivery.DatePicker;
import java.time.LocalTime;
import java.time.ZoneId;

class UserTime {
    // Constructor
    LocalTime currentTime = LocalTime.now(ZoneId.of("America/Los_Angeles"));
    LocalTime am = LocalTime.of(11, 0);
        LocalTime pm = LocalTime.of(22, 0);
}
public class Welcome extends UserTime {
    public void outWlc() {
        System.out.println();
        System.out.println("\"REGULAR RESTAURANT\"");
        System.out.println("Business Hours:\nMonday - Sunday: 11 a.m. - 10 p.m.");
        System.out.println("Welcome!");
        System.out.println("Current Time: " + currentTime);
    }
    public void checkTime() {
        if (currentTime.isAfter(am) & currentTime.isBefore(pm)) {
            System.out.println("We are Open!");
            System.out.println("Place an order To Go:");
            System.out.println("Sorry, we are closed.");
            System.out.println("You may still place your order. However it will not be delivered until we open again.");
        } else {
            System.out.println("Sorry, we are closed.");
            System.out.println("You may still place your order. However it will not be delivered until we open again.");
        }
    }
    public void deliverDate() {
        src.delivery.DatePicker appointment = new DatePicker();
        
        if(currentTime.isAfter(am) & currentTime.isBefore(pm)) {
            System.out.println("You order was successful!");
            appointment.userDate();
        }
        else {
            System.out.println("Your order will be placed when we open again. Thank you!");
            appointment.userDate();
        }
    }
}
