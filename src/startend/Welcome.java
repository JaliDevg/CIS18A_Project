package src.startend;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.*;

class UserTime {
    // Constructors
    ZonedDateTime usercurrent = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
    LocalTime currentTime = LocalTime.now();
    LocalTime am = LocalTime.of(11, 0);
    LocalTime pm = LocalTime.of(22, 0);
}
public class Welcome extends UserTime {
    public void checkTime() {
        System.out.println("Current Time: " + currentTime.format(DateTimeFormatter.ofPattern("hh:mm a")));
        if (currentTime.isBefore(am) & currentTime.isAfter(pm)) {
            System.out.println("Sorry, we are closed.");
            System.out.println("You may still place your order. However it will not be delivered until we open again.");
        } else {
            System.out.println("We are Open!");
            System.out.println("Place an order To Go:");
        }
    }
    public void greetWlc() {
        System.out.println();
        System.out.println("\"REGULAR RESTAURANT\"");
        System.out.println("Business Hours:\nMonday - Sunday: 11 a.m. - 10 p.m.");
        System.out.println("Welcome!");
    }
}
