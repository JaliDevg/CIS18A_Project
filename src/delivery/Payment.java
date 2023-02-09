package src.delivery;

/*Utility Package: Scanner (References - https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/util/Scanner.html and
Java A Begineer's Guide Eighth Edition -> page 377)*/
import java.util.Scanner;
//Import CalcTotal custom package for how much the card should charge
import src.order.CalcTotal;

//First interface for card numbers
interface getCardNums {
    long nums1();
    long nums2();
    long nums3();
    long nums4();
}
//Second interface for card type
interface getCardType {
    String type();
}
class CardDetails implements getCardNums, getCardType {
    Scanner scanner = new Scanner(System.in);
    //Numbers
    int cardRead;
    String cardAllNums;
    //Type
    String cardType;
    //User Enters card option by inputting number
    public String type() {
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
    //Enter four numbers on each line for card numbers
    public long nums1() {
        int cardRead = scanner.nextInt();
        return cardRead;
    }
    public long nums2() {
        int cardRead = scanner.nextInt();
        return cardRead;
    }
    public long nums3() {
        int cardRead = scanner.nextInt();
        return cardRead;
    }
    public long nums4() {
        int cardRead = scanner.nextInt();
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
        System.out.println("- Enter the first set of four numbers, then enter the second set of four numbers, then enter the third set of four numbers, and then enter the last set of four numbers. \n- Each set of four on different lines to correctly input the card number.");
        System.out.println("Enter Card Number Here: ");
        //Procedure for user entering numbers and printing them back later
        long card1 = numDetails.nums1();
        long card2 = numDetails.nums2();
        long card3 = numDetails.nums3();
        long card4 = numDetails.nums4();
        cardAllNums = card1 + "-" + card2 + "-" + card3 + "-" + card4;
    }
    public void chargeDisplay() {
        //Import, run, and output the user's total for the food order
        src.order.CalcTotal totPrice = new CalcTotal();
        totPrice.plusTax();
        //Label plus the card information
        System.out.print(" charged to " + userCardType + " " + cardAllNums);
    }
}
