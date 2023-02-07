package src.delivery;

import java.util.Scanner;

import src.startend.Welcome;

public class Address {
    public void userAddress() {
        System.out.println("Insert Delivery Address: ");
        Scanner readtxt = new Scanner(System.in);
        readtxt.close();
        String typein = readtxt.nextLine();
        System.out.println();
        System.out.println("Estimated Delivery Time: 30 minutes.");
        /*
         if (typein.nextLine(System.in)) {
            System.out.println("Estimated Delivery Time: 30 minutes.");
        }
         */
        //Make program type 1 line of text until 'ENTER' is clicked
    }
}
