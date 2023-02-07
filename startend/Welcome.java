package startend;
import java.time.LocalTime;
import java.time.format.*;

public class Welcome {
    public void greetWlc() {
        //Print Introduction
        System.out.println();
        System.out.println("\"REGULAR RESTAURANT\"");
        System.out.println("Business Hours:\nMonday - Sunday: 11 a.m. - 10 p.m.");
        System.out.println("Welcome!");
        //
        LocalTime currentTime = LocalTime.now();
            //Print Current Time
        System.out.println("Current Time: " + currentTime.format(DateTimeFormatter.ofPattern("hh:mm a")));
            //Check user's current time
        LocalTime startTime = LocalTime.of(11, 0);
        LocalTime endTime = LocalTime.of(22, 0);

        if (currentTime.isAfter(startTime) && currentTime.isBefore(endTime)) {
            System.out.println("We are Open!");
            System.out.println("Place an order To Go:");
        } else {
            System.out.println("Sorry, we are closed.");
            System.out.println("Come back at an available time.");
            System.out.println("Hours: 11 a.m. - 10 p.m.");
        }
    }
}