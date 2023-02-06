package order;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class FoodSelect {
    //Constructors for the User's Input
    Scanner scanner = new Scanner(System.in);
    String selectedItem = "";
    String selectedPrice = "";
    List<String> selectedOrders = new ArrayList<>();
    static List<String> totalPrice = new ArrayList<>();

    public void display() {
        //Display Instructions
        System.out.println("Order:");
        System.out.println("- Please type in the food item name to that of the 'Menu' followed by ENTER.");
        System.out.println("- Enter 'Complete Order' when you have completed your food order.");
        System.out.println("Ex. \n\tCheeseburger\n\tHot Dog\n\tComplete Order");
        System.out.println("Enter Food Order Here:");
    }
    public void userSelect() {
        //Array of all the prices for each food items
        String allPrices[] = {
            "5.50", 
            "4.00", 
            "2.05", 
            "10.00",
            "4.25",
            "12.50",
            "10.50",
            "11.50"
        };
        String chsBurger = allPrices[0];
        String htDog = allPrices[1];
        String fF = allPrices[2];
        String gbBurro = allPrices[3];
        String ChkTaco = allPrices[4];
        String pepPizza = allPrices[5];
        String sfjShrimp = allPrices[6];
        String fshChips = allPrices[7];
        //The User's Input
        while (true) {
            String systemread = scanner.nextLine();
            //Finish the food order
            if (systemread.equals("Complete Order")) {
                break;
            }
            //Print Price for each Food Item typed
            switch (systemread) {
                case "Cheeseburger":
                selectedItem = systemread;
                selectedOrders.add(selectedItem);
                selectedPrice = chsBurger;
                totalPrice.add(selectedPrice);
                break;
                case "Hot Dog":
                selectedItem = systemread;
                selectedOrders.add(selectedItem);
                selectedPrice = htDog;
                totalPrice.add(selectedPrice);
                break;
                case "French Fries":
                selectedItem = systemread;
                selectedOrders.add(selectedItem);
                selectedPrice = fF;
                totalPrice.add(selectedPrice);
                break;
                case "Ground Beef Burrito":
                selectedItem = systemread;
                selectedOrders.add(selectedItem);
                selectedPrice = gbBurro;
                totalPrice.add(selectedPrice);
                break;
                case "Chicken Taco":
                selectedItem = systemread;
                selectedOrders.add(selectedItem);
                selectedPrice = ChkTaco;
                totalPrice.add(selectedPrice);
                break;
                case "12\" Pepperoni Pizza":
                selectedItem = systemread;
                selectedOrders.add(selectedItem);
                selectedPrice = pepPizza;
                totalPrice.add(selectedPrice);
                break;
                case "10 Pieces of Southern Fried Jumbo Shrimp":
                selectedItem = systemread;
                selectedOrders.add(selectedItem);
                selectedPrice = sfjShrimp;
                totalPrice.add(selectedPrice);
                break;
                case "Fish and Chips":
                selectedItem = systemread;
                selectedOrders.add(selectedItem);
                selectedPrice = fshChips;
                totalPrice.add(selectedPrice);
                break;
            }
            //Error and Final Display
            if (!selectedOrders.contains(systemread)) {
                System.out.println("Invalid item. Please Try Again.");
                continue;
            }         
        }
        //Food Summary
        System.out.print("\nFood Item(s) Order:");
        int pricePerItem = 0;
            for (String order : selectedOrders) {
                System.out.print("\n" + order + " - $" + totalPrice.get(pricePerItem));
                pricePerItem++;
            }
        scanner.close(); 
    }
    public static List<String> userTotalPrice() {
        return totalPrice;
    }
}