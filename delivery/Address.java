package delivery;
import java.util.*;
public class Address {
    public static void main(String args[]) throws java.io.IOException  {
        System.out.println("Insert Delivery Address: ");
        Scanner readtxt = new Scanner(System.in);
        String typein = readtxt;
        if (typein == "Send Food Order") {
            System.out.println("Estimated Delivery Time: 30 minutes.");
        }
    }
}