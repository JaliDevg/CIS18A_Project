import greetings.*;
import order.*;
//import delivery.*;

public class Main {
    public static void main(String args[]) throws java.io.IOError {
        greetings.Welcome wlc = new Welcome();
        order.Menu menu = new Menu();
        order.FoodSelect select = new FoodSelect(); 
        order.TotalPrice totprice = new TotalPrice();
        greetings.ThankYou ty = new ThankYou();

        wlc.greetWlc();
        System.out.println();
        menu.menuItems();
        System.out.println();
        select.userSelect();
        System.out.println();
        totprice.userPrice();
        System.out.println();
        ty.greetTy();
        System.out.println();
    }
}
