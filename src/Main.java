package src;
import src.order.*;
import src.startend.*;

public class Main {
    public static void main(String args[]) throws java.io.IOError {
        //Constuctors
        src.startend.Welcome wlc = new Welcome();
        src.order.Menu menu = new Menu();
        src.order.FoodSelect select = new FoodSelect(); 
        src.order.CalcTotal totprice = new CalcTotal();
        src.startend.ThankYou ty = new ThankYou();
        //Import And Print Methods
        wlc.greetWlc();
        wlc.checkTime();
        System.out.println();
        menu.menuItems();
        System.out.println();
        select.display();
        select.userSelect();
        System.out.println();
        totprice.displayTax();
        totprice.plusTax();
        System.out.println();
        ty.greetTy();
        System.out.println();
    }
}
