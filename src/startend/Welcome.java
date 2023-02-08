package src.startend;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.*;
import java.util.Date;
// https://www.geeksforgeeks.org/java-program-to-display-current-date-and-time/ 
class UserTime {
    // Constructors
        //ZonedDateTime usercurrent = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
    Date currentTime = new Date();
    LocalTime time = LocalTime.now("America/Los_Angeles");
    LocalTime am = LocalTime.of(11, 0);
    LocalTime pm = LocalTime.of(22, 0);
    //ZonedDateTime java.time.ZonedDateTime.of(currentTime, "America/Los_Angeles");
}
public class Welcome extends UserTime {
    public void outWlc() {
        System.out.println();
        System.out.println("\"REGULAR RESTAURANT\"");
        System.out.println("Business Hours:\nMonday - Sunday: 11 a.m. - 10 p.m.");
        System.out.println("Welcome!");
    }
    public void checkTime() {
        System.out.println("Current Time: " + currentTime.format(DateTimeFormatter.ofPattern("hh:mm")));
        if (currentTime.isBefore(am) & currentTime.isAfter(pm)) {
            System.out.println("We are Open!");
            System.out.println("Place an order To Go:");
            System.out.println("Sorry, we are closed.");
            System.out.println("You may still place your order. However it will not be delivered until we open again.");
        } else {
            System.out.println("Sorry, we are closed.");
            System.out.println("You may still place your order. However it will not be delivered until we open again.");
        }
    }
}
