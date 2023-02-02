import java.util.Scanner;

public class FruitProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String item = "";

        System.out.println("Enter 'Complete Order' to end the program.");
        System.out.print("Enter Food Order Here: \n");

        while (true) {
            String systemread = scanner.nextLine();

            if (systemread.equals("Complete Order")) {
                break;
            }
            switch (item) {
                case "":
                    item = systemread;
                    break;
                default:
                    item = item + ", " + systemread;
                    break;
            }
        }
        System.out.println("Order: " + item);
    }
}