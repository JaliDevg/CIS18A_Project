package src.startend;

//Import swing DatePicker custom package for running swing pop-up
import src.delivery.DatePicker;
//Time Package: Local Time, Time Format, and Zoned Time (Reference - https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/time/package-summary.html)
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.*;

class UserTime {
    //Constructors
    LocalTime currentTime = LocalTime.now(ZoneId.of("America/Los_Angeles"));
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm a");
    String formattedTime = currentTime.format(formatter);
    LocalTime am = LocalTime.of(11, 0);
    LocalTime pm = LocalTime.of(22, 0);
}
public class Welcome extends UserTime {
    //Method to print out Introduction
    public void outWlc() {
        System.out.println();
        System.out.println("\"REGULAR RESTAURANT\"");
        System.out.println("Business Hours:\nMonday - Sunday: 11 a.m. - 10 p.m.");
        System.out.println("Welcome!");
        System.out.println("Current Time: " + formattedTime);
    }
    //Method to check user's time and print if user is within business hours
    public void checkTime() {
        if (currentTime.isAfter(am) & currentTime.isBefore(pm)) {
            System.out.println("We are Open!");
            System.out.println("Place an order To Go:");
        } else {
            System.out.println("Sorry, we are closed.");
            System.out.println("You may still place your order. However it will not be delivered until we open again.");
        }
    }
    //Method to check user's time and print order status at end of order
    public void deliverDate() {
        //Implement method to display DatePicker swing pop-up
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
