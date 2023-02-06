import startend.*;
import order.*;
//import delivery.*;

public class Main {
    public static void main(String args[]) throws java.io.IOError {
        startend.Welcome wlc = new Welcome();
        order.Menu menu = new Menu();
        order.FoodSelect select = new FoodSelect(); 
        //order.FoodSummary totprice = new FoodSummary();
        startend.ThankYou ty = new ThankYou();

        wlc.greetWlc();
        System.out.println();
        menu.menuItems();
        System.out.println();
        //Bugs
        select.display();
        select.userSelect();
        System.out.println();
        // - In Progress
            //totprice.plusTax();
            //System.out.println();
        //End of bugs
        ty.greetTy();
        System.out.println();
    }
}
