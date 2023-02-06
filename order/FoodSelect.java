package order;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class FoodSelect {
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
        double allPrices[] = {
            5.501, 
            4.001, 
            2.051, 
            10.001,
            4.25,
            12.501,
            10.501,
            11.501
        };
        //Allow allPrices to be accessed later
        double chsBurger = allPrices[0];
        double htDog = allPrices[1];
        double fF = allPrices[2];
        double gbBurro = allPrices[3];
        double ChkTaco = allPrices[4];
        double pepPizza = allPrices[4];
        double sfjShrimp = allPrices[5];
        double fshChips = allPrices[6];
        //Constructors for the User's Input
        Scanner scanner = new Scanner(System.in);
        String selectedItem = "";
        double selectedPrice = 0.00;
        List<String> selectedOrders = new ArrayList<>();
        List<Double> totalPrice = new ArrayList<>();
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
                System.out.println("\n" + order + " - $" + totalPrice.get(pricePerItem));
                pricePerItem++;
            }
        scanner.close(); 
    }
    
    /*
     * public static userTotalPrice() {
        for (Double totprice : totalPrice) {
            System.out.print("\n" + totalPrice);
        }
    }
     */
    
}