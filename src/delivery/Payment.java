package src.delivery;

import java.util.Scanner;
import src.order.CalcTotal;

interface getCardNums {
    long nums1();
    long nums2();
    long nums3();
    long nums4();
}
interface getCardType {
    String type();
}
class CardDetails implements getCardNums, getCardType {
    Scanner scanner = new Scanner(System.in);
    int cardRead;
    String cardNums;
    String cardType;
    public String type() {
        //User Enters card option by inputting number
        int cardOption = scanner.nextInt();
        switch (cardOption) {
            case 1:
                cardType = "Visa";
                break;
            case 2:
                cardType = "Mastercard";
                break;
            case 3:
                cardType = "American Express";
                break;
            case 4:
                cardType = "Discover";
                break;
            default:
                cardType = "Invalid option. Try again.";
                break;
        }
        return cardType;
    }
    public long nums1() {
        cardRead = scanner.nextInt();
        return cardRead;
    }
    public long nums2() {
        cardRead = scanner.nextInt();
        return cardRead;
    }
    public long nums3() {
        cardRead = scanner.nextInt();
        return cardRead;
    }
    public long nums4() {
        cardRead = scanner.nextInt();
        return cardRead;
    } 
}
public class Payment extends CardDetails {
    //Constructors
        CardDetails numDetails = new CardDetails();
        CardDetails typeDetails = new CardDetails();
        String userCardType;
    
    public void userCharge() {
        System.out.println("\nPayment:");
        //Display instructions for entering card type
        System.out.println();
        System.out.println("Card Type:");
        System.out.println("- Enter the number next to the desired option to select the card type.");
        System.out.println("Allowed Payment Types:");
        System.out.println("1. Visa\n2. Mastercard\n3. American Express\n4. Discover");
        System.out.print("Enter Card Type Here: ");
        //Procedure for user entering card type and printing back later
        userCardType = typeDetails.type();
        //Display instructions for user number
        System.out.println();
        System.out.println("Card Number:");
        System.out.println("- Enter each set of four numbers on each line to get the card number.");
        System.out.println("Enter Card Number Here: ");
        //Procedure for user entering numbers and printing them back later
        long card1 = numDetails.nums1();
        long card2 = numDetails.nums2();
        long card3 = numDetails.nums3();
        long card4 = numDetails.nums4();
        cardNums = card1 + "-" + card2 + "-" + card3 + "-" + card4;
    }
    public void chargeDisplay() {
        //Import, run, and output the user's total for the food order
        src.order.CalcTotal totPrice = new CalcTotal();
        totPrice.plusTax();
        //Label plus the card information
        System.out.print(" charged to " + userCardType + " " + cardNums);
    }
}
