package foodselect;

import java.util.Scanner;

public class FoodOrder {
    //Constructors
    String price;
    String item; 
}
class Selection extends FoodOrder{
    public static void main(String args[]) throws java.io.IOException {
        System.out.println("Order:");
        System.out.println("- Please type the food item exact to that of the 'Menu' followed by ENTER.");
        System.out.println("- Type 'Done' when you have completed your food order.");
        System.out.println("Ex. \n\tCheeseburger\n\tHot Dog\n\tDone");
        //Intiate System to read Strings
        Scanner inread = new Scanner(System.in);
        String text = inread.nextLine();
        //Objects
        FoodOrder chsBurger = new FoodOrder();
        FoodOrder htDg = new FoodOrder();
        FoodOrder fF = new FoodOrder();
        FoodOrder gbBurrito = new FoodOrder();
        FoodOrder chkTaco = new FoodOrder();
        FoodOrder pepPizza = new FoodOrder();
        FoodOrder sfjShrimp = new FoodOrder();
        FoodOrder fsNChip = new FoodOrder();
    
    if (text == "Done") {
        System.exit(0);
        }
    else{
        int numitems = 8;
        for(text = "Start Here -"; numitems <= 8; numitems++) {
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
