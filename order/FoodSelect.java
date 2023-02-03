package order;
import java.util.Scanner;
import order.Menu;

public class FoodSelect {
    public void userSelect() {
        System.out.println("Food Order:");
        System.out.println("- Please type in the food item name exact to that of the 'Menu' followed by ENTER.");
        System.out.println("- Enter 'Complete Order' when you have completed your food order.");
        System.out.println("Ex. \n\tCheeseburger\n\tHot Dog\n\tComplete Order");
        System.out.println("Enter Food Order Here: \n");
        Scanner scanner = new Scanner(System.in);
        Menu food = new Menu();
        //add items constraint
        food.allItems();
        food.allPrices();
        while (true) {
            String systemread = scanner.nextLine();

            if (systemread.equals("Complete Order")) {
                break;
            }
            switch (food.allItems()) {
                case "":
                    food = systemread;
                    //Insert food = price
                    break;
                default:
                    food = food + ", " + systemread;
                    break;
            }
        }
        System.out.println("Food Item(s) Ordered: " + food.allItems() + " - " + food.allPrices());
    }
}
