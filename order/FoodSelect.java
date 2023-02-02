package order;
import java.util.Scanner;

public class FoodSelect {
    public void userSelect() {
        System.out.println("Food Order:");
        System.out.println("- Please type in the food item name exact to that of the 'Menu' followed by ENTER.");
        System.out.println("- Enter 'Complete Order' when you have completed your food order.");
        System.out.println("Ex. \n\tCheeseburger\n\tHot Dog\n\tComplete Order");
        System.out.println("Enter Food Order Here: \n");
        Scanner scanner = new Scanner(System.in);
        String item = "";
        while (true) {
            String systemread = scanner.nextLine();

            if (systemread.equals("Complete Order")) {
                break;
            }
            switch (item) {
                case "":
                    item = systemread;
                    break;
                default:
                    item = item + ", " + systemread;
                    break;
            }
        }
        System.out.println("Food Item(s) Ordered: " + item);
    }
}
