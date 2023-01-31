public class Order {
    //Constructors
    String price;
    String item;
    private int num;
    void print() throws java.io.IOException {
        num = (int )System.in.read();
        if ((int) System.in.read() == num) {
            System.out.print("Added: " + item);
        }
    }    
}
class Selection extends Order{
    public static void main(String args[]) throws java.io.IOException {
        Order chsBurger = new Order();
        Order htDg = new Order();
        Order fF = new Order();
        Order gbBurrito = new Order();
        Order chkTaco = new Order();
        Order pepPizza = new Order();
        Order sfjShrimp = new Order();
        Order fhChip = new Order();
    System.out.println("Order:");
    //Items Variables
        //Cheeseburger
    chsBurger.print();
    chsBurger.item = "Cheeseburger";
    chsBurger.price = "$5.50";
        //Hot Dog
    htDg.print();
    htDg.item = "Hot Dog";
    htDg.price = "$4.00";
        //French Fries
    fF.print();
    fF.item = "French Fries";
    fF.price = "$5.50";
    int nitems = (int) System.in.read();
    for(nitems = 1; nitems <= 8; nitems++) {
        switch(nitems) {
        case '1':
            System.out.print(chsBurger.item);
            System.out.println(" " + chsBurger.price);
            break;
        case '2':
            System.out.print(chsBurger.item);
            System.out.println(" " + chsBurger.price);
            break;
        }
    }
    
    
    // Refer to Imput Char example chapter 3 '?' and Aidan's code
    }
}
