package UserInterface;

import java.util.Scanner;
import UserInterface.MenuDisplay;

public class Order {
    //Constructors
    String price;
    String item; 
}
class Selection extends Order{
    public static void main(String args[]) throws java.io.IOException {
        MenuDisplay menu = new MenuDisplay();
        menu.Menu();
        System.out.println();
        System.out.println("Order:");
        System.out.println("- Please type the food item exact to that of the 'Menu' followed by ENTER.");
        System.out.println("- Type 'Done' when you have completed your food order.");
        System.out.println("Ex. \n\tCheeseburger\n\tDone");
        //Intiate System to read Strings
        Scanner inread = new Scanner(System.in);
        String text = inread.nextLine();
        //Objects
        Order chsBurger = new Order();
        Order htDg = new Order();
        Order fF = new Order();
        Order gbBurrito = new Order();
        Order chkTaco = new Order();
        Order pepPizza = new Order();
        Order sfjShrimp = new Order();
        Order fsNChip = new Order();
    //Items Variables
        //Cheeseburger
    chsBurger.item = "Cheeseburger";
    chsBurger.price = "$5.50";
        //Hot Dog
    htDg.item = "Hot Dog";
    htDg.price = "$4.00";
        //French Fries
    fF.item = "French Fries";
    fF.price = "$2.05";
        //Ground Beef Burrito
    gbBurrito.item = "Ground Beef Burrito";
    gbBurrito.price = "$10.00";
        //Chicken Taco
    chkTaco.item = "Chicken Taco";
    chkTaco.price = "$4.25";
        //Pepperoni Pizza
    pepPizza.item = "12\" Pepperoni Pizza";
    pepPizza.price = "$12.50";
        //Fried Shrimp
    sfjShrimp.item = "10 Piece - Southern Fried Jumbo Shrimp";
    sfjShrimp.price = "$10.50";
        //Fish and Chips
    fsNChip.item = "Fish and Chips";
    fsNChip.price = "$11.50";
    
    if (text == "Done") {
        System.exit(0);
        }
    else{
        int numitems = 8;
        for(text = "Start Here -"; numitems >= 8; numitems++) {
            switch(text) {
            case "Cheeseburger":
                System.out.print(chsBurger.item + " -");
                System.out.println(" " + chsBurger.price);
                break;   
            case "Hot Dog":
                System.out.print(htDg.item + " -");
                System.out.println(" " + htDg.price);
                break;
            case "French Fries":
                System.out.print(fF.item + " -");
                System.out.println(" " + fF.price);
                break;
            case "Ground Beef Burrito":
                System.out.print(gbBurrito.item + " -");
                System.out.println(" " + gbBurrito.price);
                break;
            case "Chicken Taco":
                System.out.print(chkTaco.item + " -");
                System.out.println(" " + chkTaco.price);
                break;
            case "12\" Pepperoni Pizza":
                System.out.print(pepPizza.item + " -");
                System.out.println(" " + pepPizza.price);
                break;
            case "10 Piece - Southern Fried Jumbo Shrimp":    
                System.out.print(sfjShrimp.item + " -");
                System.out.println(" " + sfjShrimp.price);
                break;
            case "Fish and Chips":
                System.out.print(fsNChip.item + " -");
                System.out.println(" " + fsNChip.price);
                break;
            }    }
        
        //Firgure out type of loop(?) | output Invalid input if anything else is inputted
        }
    }
}
