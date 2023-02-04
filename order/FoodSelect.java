package order;
import java.util.Scanner;
import java.util.ArrayList;
import order.Menu;

public class FoodSelect {
    //Array List of Prices
    public static ArrayList<String> prices = new ArrayList<>();
    static {
        prices.add("$5.50");
        prices.add("$4.00");
        prices.add("$2.05");

    for(int j = 0; j < prices.size(); j++) {
        String allprices = prices.get(j);
        }
    }
    //Array List of Items
    public static ArrayList<String> items = new ArrayList<>();
        static {
        items.add("Cheeseburger");
        items.add("Hot Dog");
        items.add("French Fries");  
    for(int i = 0; i < items.size(); i++) {
        String allitems = items.get(i);
        }
    }
    public void userSelect() {
        System.out.println("Food Order:");
        System.out.println("- Please type in the food item name exact to that of the 'Menu' followed by ENTER.");
        System.out.println("- Enter 'Complete Order' when you have completed your food order.");
        System.out.println("Ex. \n\tCheeseburger\n\tHot Dog\n\tComplete Order");
        System.out.println("Enter Food Order Here: \n");
        Scanner scanner = new Scanner(System.in);

        if(!(items | prices)) System.out.println("Invalid Reponse");
        
        for (int i = 0; i < items(); i++) {
                System.out.println(items.get(i) + ": " + prices.get(i));
        allprices();
        
        while (true) {
            String systemread = scanner.nextLine();

            if (systemread.equals("Complete Order")) {
                break;
            }
            
            }
            switch (items()) {
                case "Cheeseburger":
                    food = systemread;
                    //Insert food = price
                    break;
                default:
                    food = food + ", " + systemread;
                    break;
            }
        }
        System.out.println("Food Item(s) Ordered: " + items() + " - " + prices());
    }
    boolean isValid(String itemstyped) throws java.io.IOError {
        if(itemstyped != (prices & items)) return false;
        else return true ;
    }
}
