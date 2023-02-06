import startend.*;
import order.*;
//import delivery.*;

public class Main {
    public static void main(String args[]) throws java.io.IOError {
        //Constuctors
        startend.Welcome wlc = new Welcome();
        order.Menu menu = new Menu();
        order.FoodSelect select = new FoodSelect(); 
        //order.CalcTotal totprice = new CalcTotal();
        startend.ThankYou ty = new ThankYou();
        //Import Methods
        wlc.greetWlc();
        System.out.println();
        menu.menuItems();
        System.out.println();
        select.display();
        select.userSelect();
        System.out.println();
        //totprice.plusTax();
        System.out.println();
        ty.greetTy();
        System.out.println();
    }
}
