package delivery;
//import Summary.*;
import java.util.*;

public class Payment {
    long cardinfo;
    public long cardRead(int radix) {
        Scanner scanner = new Scanner(System.in);
        cardinfo = scanner.nextLong(radix);
        //Summary TotalPay = new Summary();
        //System.out.println(TotalPay.total + " charged to: " + UserPay.cardRead(10));
        scanner.close();
        return cardinfo;
    }
}