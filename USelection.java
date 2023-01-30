public class USelection {
    //Constructors
    String price;
    String item;
}
class Slct {
    public static void main(String args[]) throws java.io.IOException {
        USelection chsBurger = new USelection();
        USelection htDg = new USelection();
        USelection fF = new USelection();
        USelection gbBurrito = new USelection();
        USelection chkTaco = new USelection();
        USelection pepPizza = new USelection();
        USelection sfjShrimp = new USelection();
        USelection fhChip = new USelection();

    //Cheeseburger Variables | Select | Print
    chsBurger.item = "Cheeseburger";
    chsBurger.price = "$5.50";
    if (System.in.read(chsBurger.item)) {
        System.out.print(chsBurger.item);
        System.out.println(chsBurger.price);
    }
    // Refer to Imput Char example chapter 3 '?' and Aidan's code
    // Add switch statement
    }
}
