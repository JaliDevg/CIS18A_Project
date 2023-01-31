import foodselect.*;
import greetings.*;

public class Main {
    public static void main(String args[]) throws java.io.IOException {
        greetings.Welcome wlc = new Welcome();
        foodselect.MenuDisplay menu = new MenuDisplay();
        greetings.ThankYou ty = new ThankYou();
        wlc.GreetWlc();
        System.out.println();
        menu.Menu();
        System.out.println();
        ty.GreetTy();
        System.out.println();
    
    }
}
