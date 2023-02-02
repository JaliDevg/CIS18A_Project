import greetings.*;
import order.*;
//import delivery.*;

public class Main {
    public static void main(String args[]) throws java.io.IOException {
        greetings.Welcome wlc = new Welcome();
        order.MenuDisplay menu = new MenuDisplay();
        order.FoodSelect select = new FoodSelect(); 
        greetings.ThankYou ty = new ThankYou();
        wlc.greetWlc();
        System.out.println();
        menu.menuItems();
        System.out.println();
        select.userSelect();
        System.out.println();
        ty.greetTy();
        System.out.println();
    }
}
