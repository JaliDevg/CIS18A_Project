class ItemsnPrice {
double price;
String item;
    public double Food(double price, String item) {
        item = "" + "-";
        price = price * .075;
        return item;
        //Fix
    }
}
class ItemPrice {
    public static void main(String args[]) {
    ItemsnPrice chsburger = new ItemsnPrice();   
    chsburger.item = "Cheeseburger";
    System.out.println(chsburger.item);
    }
}