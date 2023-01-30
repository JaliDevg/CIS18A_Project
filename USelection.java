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
    String i;
    //Items Variables
        //Cheeseburger
    chsBurger.item = "Cheeseburger";
    chsBurger.price = "$5.50";
        //Hot Dog
    htDg.item = "Hot Dog";
    htDg.price = "$4.00";
        //French Fries
    fF.item = "French Fries";
    fF.price = "$5.50";
    switch(i) {
        case 0:
            if ((String) System.in.read(chsBurger.item)) {
            System.out.print(chsBurger.item);
            System.out.println(chsBurger.price);
            }
            break;
        case 1:
            if ((String) System.in.read(htDg.item)) {
            System.out.print(chsBurger.item);
            System.out.println(chsBurger.price);
            }
            break;

    }
    
    // Refer to Imput Char example chapter 3 '?' and Aidan's code
    }
}
