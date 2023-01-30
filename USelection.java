public class USelection {
    //Constructors
    String price;
    String item;
    int num;
    void print() throws java.io.IOException {
        if ((int) System.in.read() == num) {
            System.out.println("Order:");
        }
    }    
}
class Slct extends USelection{
    public static void main(String args[]) throws java.io.IOException {
        USelection chsBurger = new USelection();
        USelection htDg = new USelection();
        USelection fF = new USelection();
        USelection gbBurrito = new USelection();
        USelection chkTaco = new USelection();
        USelection pepPizza = new USelection();
        USelection sfjShrimp = new USelection();
        USelection fhChip = new USelection();
    //Items Variables
        //Cheeseburger
    chsBurger.num = 1;
    chsBurger.item = "Cheeseburger";
    chsBurger.price = "$5.50";
        //Hot Dog
    htDg.num = 2;
    htDg.item = "Hot Dog";
    htDg.price = "$4.00";
        //French Fries
    fF.num = 3;
    fF.item = "French Fries";
    fF.price = "$5.50";
    boolean ignition = true;
    int nitems = 1;
    while(ignition == true) {
        switch(nitems) {
        case '1':
            System.out.print(chsBurger.item);
            System.out.println(" " + chsBurger.price);
            break;
        case '2':
            System.out.print(chsBurger.item);
            System.out.println(" " + chsBurger.price);
            break;
        default:
            System.out.println("Please Select an Item.");
        }
    }
    
    
    // Refer to Imput Char example chapter 3 '?' and Aidan's code
    }
}
