package delivery;
import java.util.*;

public class Payment {
    double userTotPrice;
    int cardinfo;
    public int cardRead() {
        Scanner scanner = new Scanner(System.in);
        cardinfo = scanner.nextInt();
        scanner.close();
        return cardinfo;
    }
}
class UserPayment extends Payment {
    public static void main(String args[]) throws java.io.IOException {
        System.out.println("Enter Card Number Here: ");
        Payment UserPay = new Payment();
        UserPay.cardRead();
        System.out.println("__ charged to: " + UserPay.cardRead());
        
    }
}