package src;
import src.order.*;
import src.startend.*;
import src.delivery.*;

public class Main {
    public static void main(String args[]) throws java.io.IOError {
        //Constuctors
        src.startend.Welcome wlc = new Welcome();
        src.order.Menu menu = new Menu();
        src.order.FoodSelect select = new FoodSelect(); 
        src.order.CalcTotal totPrice = new CalcTotal();
        src.delivery.Payment cardPay = new Payment();
        src.startend.DeliveryTime deliTime = new DeliveryTime();
        src.startend.ThankYou ty = new ThankYou();
        //Import and output the Methods from other packages and classes
            //Insert space between each method display
        wlc.greetWlc();
        wlc.checkTime();
        System.out.println();
        menu.menuItems();
        System.out.println();
        select.display();
        select.userSelect();
        System.out.println();
        totPrice.displayTax();
        totPrice.plusTax();
        System.out.println();
        cardPay.userPayAmt();
        deliTime.deliverTime();
        System.out.println();
        ty.greetTy();
        System.out.println();
    }
}
