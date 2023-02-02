package order;
import java.util.Scanner;

public class FoodSelect {
    //Constructors
    String price;
    String item;
    public boolean hasNextLine(String done) {
        done = "Complete Order.";
        return true;
    }
}
class Selection extends FoodSelect{
    public void userOrder() throws java.io.IOException, IllegalStateException{
        System.out.println("Order:");
        System.out.println("- Please type the food item exact to that of the 'Menu' followed by ENTER.");
        System.out.println("- Type 'Done' when you have completed your food order.");
        System.out.println("Ex. \n\tCheeseburger\n\tHot Dog\n\tDone");
        //Intiate System to read Strings
        Scanner inread = new Scanner(System.in);
        String text = inread.nextLine();
        boolean textbool = false;
        //Objects
        FoodSelect chsBurger = new FoodSelect();
        FoodSelect htDg = new FoodSelect();
        FoodSelect fF = new FoodSelect();
        FoodSelect gbBurrito = new FoodSelect();
        FoodSelect chkTaco = new FoodSelect();
        FoodSelect pepPizza = new FoodSelect();
        FoodSelect sfjShrimp = new FoodSelect();
        FoodSelect fsNChip = new FoodSelect();
    
    /*
        if (text.hasNextLine(true)) {
        System.exit(0);
        }
    else{
        int numitems = 8;
        while(inread hasNextLine()) {
            switch(FoodSelect.class<hasNextLine) {
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
     */
   
    }
}
