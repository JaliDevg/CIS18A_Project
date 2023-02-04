package order;

class Menu {
    private String fooditems[][] = {
        {"Cheeseburger -", "$5.50"},
        {"Hot Dog -", "$4.00"},
        {"French Fries -", "$2.05"},
        {"Ground Beef Burrito -", "$10.00"},
        {"Chicken Taco -", "$4.25"},
        {"12\" Pepperoni Pizza -", "$12.50"},
        {"10 Piece - Southern Fried Jumbo Shrimp -", "$10.50"},
        {"Fish and Chips -", "$11.50"}
    };
    public void menuItems() {
        System.out.println("Menu:");
        int a, b;
        for(a=0; a < fooditems.length; a++) {
            for(b=0; b < fooditems.length; b++)
            System.out.print(fooditems[a][b] + " ");
        System.out.println();
        } 
    }       
}
