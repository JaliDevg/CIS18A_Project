package order;
import order.FoodSelect;

class Values{
    final double tax = .0725;
    double grandTotal;
    public double getGrandTotal() {
        return this.tax;
    }
}
public class CalcTotal extends Values {
    //public void plusTax() {
    public static void main(String args[]) {
        Values userTotal = new Values();
        FoodSelect tprice = new userTotalPrice();
        System.out.println();
    }
}