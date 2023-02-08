package src.delivery;

import java.util.Scanner;
import src.order.CalcTotal;

interface CardNums {
    long nums1();
    long nums2();
    long nums3();
    long nums4();
}
class UserPayment implements CardNums {
    Scanner scanner = new Scanner(System.in);
        int cardRead = scanner.nextInt(4);
        Strinf userCard;
    nums1(long card1) {
        card1 = cardRead(4);
        return card1  + "-";
    }
    nums2(long card2) {
        card2 = cardRead(4);
        return card2 + "-";
    }
    nums3(long card3) {
        card3 = cardRead(4);
        return card3 + "-";
    }
    nums4(long card4) {
        card4 = cardRead(4);
        return card4 + "-";
    } 
}
public class Payment extends UserPayment {
    public void userPayAmt() {
        System.out.print("Enter Card Type Here:");

        System.out.println("Enter Card Number Here: ");
        System.out.println("Ex.\t0000-0000-0000");
        UserPayment userPay = new UserPayment();
        userCard = userPay.num1() + userPay.num2() + userPay.num3() + userPay.num4();
        CalcTotal totalNTax = new CalcTotal();
        totalNTax.plusTax();
        System.out.println(totalNTax.plusTax() + "charged to: " + userCard);
        scanner.close();
    }
}
