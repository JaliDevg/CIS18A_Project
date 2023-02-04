import order.*;
//import delivery.*;
import startend.*;

public class Main {
    public static void main(String args[]) throws java.io.IOError {
        startend.Welcome wlc = new Welcome();
        order.Menu menu = new Menu();
        order.FoodSelect select = new FoodSelect(); 
        order.TotalPrice totprice = new TotalPrice();
        startend.ThankYou ty = new ThankYou();

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
