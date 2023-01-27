class ItemsnPrice {
    String price;
    String item;
}
class Menu {
    public static void main(String args[]) {
    //Constuctors
    ItemsnPrice chsbgr = new ItemsnPrice();   
    ItemsnPrice htDg = new ItemsnPrice(); 

    //Cheeseburger Variables | Print
    chsbgr.item = "Cheeseburger";
    chsbgr.price = "$5.50";
    System.out.print(chsbgr.item + " ");
    System.out.println("- " + chsbgr.price );

    //HotDog Variables | Print
    htDg.item = "Hot Dog";
    htDg.price = "$4.00";
    System.out.print(htDg.item + " ");
    System.out.println("- " + htDg.price );
    //French Fries Variables
    
    
    }
}