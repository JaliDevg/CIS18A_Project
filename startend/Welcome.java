package startend;
import java.util.Date;

public class Welcome {
    public void greetWlc() {
        //Print Introduction
        System.out.println();
        System.out.println("\"REGULAR RESTAURANT\"");
        System.out.println("Business Hours:\nMonday - Sunday: 11 a.m. - 10 p.m.");
        System.out.println("Welcome!");
        //Print Current Time and Time
        Date currentTime = new Date();
        System.out.println(currentTime);
        if(currentTime >= ) {
            System.out.println("We are Open!");
            System.out.println("Place an order To Go:");
        }
        else {
            System.out.println("Sorry, we are closed.");
            System.out.println("Come again at an available time.");
            System.out.println("Hours: 11 a.m. - 10 p.m.");
        }
        
    }
}