package src;
import src.order.*;
import src.startend.*;
import src.delivery.*;

public class Main {
    public static void main(String args[]) throws java.io.IOError {
        //Constuctors from imports
        src.startend.Welcome wlc = new Welcome();
        src.order.Menu menu = new Menu();
        src.order.FoodSelect select = new FoodSelect(); 
        src.order.CalcTotal totPrice = new CalcTotal();
        src.delivery.Payment cardPay = new Payment();
        src.delivery.Address userAddress = new Address();
        src.delivery.DatePicker deliverDate = new DatePicker();
        //Import and output the Methods from other packages and classes
            //Inserted space between each method display
        wlc.outWlc();//Introduction
        wlc.checkTime();//Checks user's time in accordance with business hours
        
        System.out.println();/*Space */
        menu.menuItems();//Display all menu options
        
        System.out.println();/*Space */
        select.display();//Display instructions for selecting food items for order
        select.userSelect();//Run method that allows user to pick only from menu items and holds in a array list
        
        System.out.println();//*Space */
        totPrice.displayTax();//Display Label "Total: "
        totPrice.plusTax();//Outputs user's total with tax and holds value
        
        System.out.println();/*Space */
        cardPay.userCharge();//Have user input their card information
        cardPay.chargeDisplay();//Display user's card information
        
        System.out.println();/*Space */
        userAddress.deliverAddress();//Have the user input the adress where they want the food order to be delivered
       
        System.out.println();/*Space */
        deliverDate.deliDateInstruct();//Displays instructions for picking date for when the order will be delivered
        deliverDate.userDate();//Determine what date the order will be placed from a Swing window pop-up that allows user to pick the date desired to deliver food
        //Embedded Outro - Thank user for order
    
        System.out.println();/*Space */
    }
}
