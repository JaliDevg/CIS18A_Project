package src.startend;
import src.delivery.DatePicker;

public class DeliveryDate extends Welcome {
    public void deliverDate() {
        src.delivery.DatePicker appointment = new DatePicker();
        if(currentTime.isBefore(am) & currentTime.isAfter(pm)) {
            System.out.println("Your order will be placed when we open again. Thank you!");
            System.out.println("Your delivery date is: " + appointment);
        }
        else {
            System.out.println("Your delivery date is: " + appointment);
        }
    }
}
