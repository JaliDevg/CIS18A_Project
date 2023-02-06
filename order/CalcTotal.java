package order;
import order.FoodSelect;

class Values{
    public double tax;
    double grandTotal;
    public Values(double tax) {
        order.FoodSelect totPrice = new order.FoodSelect();
        totPrice.userTotalPrice();
        return tax ;
    }
}
public class CalcTotal extends Values
    public void plusTax() {
    public static void main(String args[]) {
        Values userTotal = new Values();
        userTotal.tax = .0725;
        userTotal.getTotal(userTotal.tax);
        System.out.println();
    }
}