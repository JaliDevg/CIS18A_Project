package order;
public class MenuDisplay {
    public void menuItems() {
        System.out.println("Menu:");
        System.out.println();
        String food[][] = {
        {"Cheeseburger -", "$5.50"},
        {"Hot Dog -", "$4.00"},
        {"French Fries -", "$2.05"},
        {"Ground Beef Burrito -", "$10.00"},
        {"Chicken Taco -", "$4.25"},
        {"12\" Pepperoni Pizza -", "$12.50"},
        {"10 Piece - Southern Fried Jumbo Shrimp -", "$10.50"},
        {"Fish and Chips -", "$11.50"}
    };
    int a, b;
    for(a=0; a < 8; a++) {
        for(b=0; b < 2; b++)
            System.out.print(food[a][b] + " ");
        System.out.println();
        }   
    }
}
