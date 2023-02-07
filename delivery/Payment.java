package delivery;

import order.CalcTotal;
import java.util.Scanner;

interface CardNums {
    long nums1();
    long nums2();
    long nums3();
    long nums4();
}
class UserPayment implements CardNums {
    Scanner scanner = new Scanner(System.in);
        long cardRead = scanner.nextInt(4);
        long userCard;
    public long cardFormat(long limit) {
        if(userCard == cardFormat(16)) {
            scanner.close();
            System.out.println(userCard);
        }
        return limit;
    }
    nums1(long card1) {
        cardFormat(4);
        userCard = cardRead(card1);
        return userCard + "-";
    }
    nums2(long card2) {
        cardFormat(4);
        userCard = cardRead(card2);
        return userCard + "-";
    }
    nums3(long card3) {
        cardFormat(4);
        userCard = cardRead(card3);
        return userCard + "-";
    }
    nums4(long card4) {
        cardFormat(4);
        userCard = cardRead(card4);
        return userCard + "-";
    } 
}
public class Payment extends UserPayment {
    public void userPayAmt() {
        System.out.println("0000-0000-0000");
        System.out.print("Enter Card Number Here: ");
        UserPayment userPay = new UserPayment();
        CalcTotal totalNTax = new CalcTotal();
        totalNTax.plusTax();
        System.out.print("charged to: " + userPay.userCard);
    }
}
