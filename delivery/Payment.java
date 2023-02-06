package delivery;
//import Summary.*;
import java.util.*;

public class Payment {
    long cardinfo;
    public long cardRead(int radix) {
        Scanner scanner = new Scanner(System.in);
        cardinfo = scanner.nextLong(radix);
        scanner.close();
        return cardinfo;
    }
}
class UserPayment extends Payment {
    public void userPayAmt() throws IllegalArgumentException {
        System.out.print("Enter Card Number Here: ");
        Payment UserPay = new Payment();
        //Summary TotalPay = new Summary();
        //System.out.println(TotalPay.total + " charged to: " + UserPay.cardRead(10));
        System.out.println("__ charged to: " + UserPay.cardRead(16));
    }
}