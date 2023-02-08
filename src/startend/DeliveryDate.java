package src.startend;
import src.delivery.DatePicker;

public class DeliveryDate extends src.startend.Welcome {
    public void deliverDate() {
        src.delivery.DatePicker appointment = new DatePicker();
        if(currentTime.isBefore(am) & currentTime.isAfter(pm)) {
            System.out.println("You order was successful!");
            appointment.userDate();
        }
        else {
            
            System.out.println("Your order will be placed when we open again. Thank you!");
            appointment.userDate();
        }
    }
}
