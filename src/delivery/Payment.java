package src.delivery;

import java.util.Scanner;
import src.order.CalcTotal;

interface CardNums {
    long nums1();
    long nums2();
    long nums3();
    long nums4();
}
interface CardType {
    String type();
}

class UserPayment implements CardNums {
    Scanner scanner = new Scanner(System.in);
    int cardRead = 0;
    String userCard;
    public long nums1() {
        cardRead = scanner.nextInt(4);
        return cardRead;
    }
    public long nums2() {
        cardRead = scanner.nextInt(4);
        return cardRead;
    }
    public long nums3() {
        cardRead = scanner.nextInt(4);
        return cardRead;
    }
    public long nums4() {
        cardRead = scanner.nextInt(4);
        return cardRead;
    } 
}
public class Payment extends UserPayment {
    public void userPayAmt() {
        System.out.print("Enter Card Type Here:");
        userCard = scanner.nextLine();

        System.out.println("Enter Card Number Here: ");
        System.out.println("Ex.\t0000-0000-0000");
        UserPayment userPay = new UserPayment();
        long card1 = userPay.nums1();
        long card2 = userPay.nums2();
        long card3 = userPay.nums3();
        long card4 = userPay.nums4();
        userCard = card1 + "-" + card2 + "-" + card3 + "-" + card4;
        src.order.CalcTotal totPrice = new CalcTotal();
        totPrice.plusTax();
        System.out.print(" charged to: " + userCard);
        scanner.close();
    }
}
