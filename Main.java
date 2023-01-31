import Greetings.*;
import UserInterface.*;

public class Main {
    public static void main(String args[]) throws java.io.IOException {
    Greetings.Welcome wlc = new Welcome();
    UserInterface.MenuDisplay menu = new MenuDisplay();
    Greetings.ThankYou ty = new ThankYou();
    wlc.GreetWlc();
    System.out.println();
    menu.Menu();
    System.out.println();
    ty.GreetTy();
    System.out.println();
    
    }
}
