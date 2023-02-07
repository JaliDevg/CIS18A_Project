package src.startend;

public class DeliveryTime extends Welcome {
    public void deliverTime() {
        if(currentTime.isAfter(am) & currentTime.isBefore(pm)) {
            System.out.println("Your order will be placed when we open again. Thank you!");  
        }
        else {
            System.out.println("");
        }
    }
}
