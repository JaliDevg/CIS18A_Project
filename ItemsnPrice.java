class ItemsnPrice {
    String price;
    String item;
}
class ItemPrice {
    public static void main(String args[]) {
    
    ItemsnPrice chsburger = new ItemsnPrice();   
    
    chsburger.item = "Cheeseburger";
    chsburger.price = "$4.50";
    
    System.out.print(chsburger.item + " ");
    System.out.println("- " + chsburger.price );
    }
}