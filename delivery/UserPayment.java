package delivery;

public class UserPayment extends Payment {
    public static void main(String args[]) throws IllegalArgumentException {
        System.out.println("Payment:");
        System.out.println("Enter Card Number Here: ");
        Payment UserPay = new Payment();
        System.out.println("__ charged to: " + UserPay.cardRead(4) + "-" + UserPay.cardRead(4) + "-" + UserPay.cardRead(4) + "-" + UserPay.cardRead(4) + "-");
    }
}