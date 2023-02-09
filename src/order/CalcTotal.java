package src.order;

//Utility Package: Array List (Reference - https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/util/ArrayList.html)
import java.util.ArrayList;

class Values{
    //Tax plus the addition of prices for all food items selected
    final double tax = .0725;
    double granTotal;
    public double getGrandTotal(ArrayList<Double> realPrice) {
        for(double t : realPrice) {
            granTotal += t;
        }
        granTotal = granTotal * (1 + tax);
        return granTotal;
    }
}
public class CalcTotal extends Values {
    public void displayTax() {
        //Display Total label
        System.out.print("Total: ");

    }
    public void plusTax() {
        //Access totalPrice array from FoodSelect text file and convert to new double array
        src.order.FoodSelect granTotal = new FoodSelect();
        ArrayList<Double> realPrice = new ArrayList<>();
        granTotal.getList();
        for (String str : granTotal.getList()) {
            realPrice.add(Double.parseDouble(str));
        }
        //Print the total with tax included
        System.out.print("$" + String.format("%.2f", getGrandTotal(realPrice)));
    }    
}