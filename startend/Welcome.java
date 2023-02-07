package startend;
import java.util.Calendar;

public class Welcome {
    public void greetWlc() {
        //Print Introduction
        System.out.println();
        System.out.println("\"REGULAR RESTAURANT\"");
        System.out.println("Business Hours:\nMonday - Sunday: 11 a.m. - 10 p.m.");
        System.out.println("Welcome!");
    }
    public static userTime() {
        //Print Current Time and check the user's current Time(reference - https://docs.oracle.com/javase/8/docs/api/java/time/package-summary.html)
        Calendar currentTime = new Calendar.getInstance();
        currentTime().
        System.out.println(currentTime);
   
        int hour = 12;
        //When the user is placing order during allo
        if(hour <= 11) {
            System.out.println("We are Open!");
            System.out.println("Place an order To Go:");
        }
        else {
            System.out.println("Sorry, we are closed.");
            System.out.println("Come back later at an available time.");
            System.out.println("Hours: 11 a.m. - 10 p.m.");
        }
    }
}