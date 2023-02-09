package src.delivery;

/*Utility Package: Scanner (References - https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/util/Scanner.html and
Java A Begineer's Guide Eighth Edition -> page 377)*/
import java.util.Scanner;

interface GetAddress {
    //Abstract Classes for interface
    int houseNums(int ex1);
    String streetName(String ex2);
    String city(String ex3);
}
class DeliveryLimits {
    //Inherited variables
    String state = "CA";
    String country = "United States";
}
class AddressDetails extends DeliveryLimits implements GetAddress {
    Scanner scanner = new Scanner(System.in);
    //Method for user to input house number and print label
    public int houseNums(int ex1) {
        System.out.println("Enter House Number:" + "(\'" + ex1 + "\')");
        int num = scanner.nextInt();
        return num;
    }
    //Method for user to input street name and print label
    public String streetName(String ex2) {
        System.out.println("Enter Street Name:" + ex2);
        scanner.nextLine();
        String name = scanner.nextLine();
        return name;
    }
    //Method for user to input city name and print label
    public String city(String ex3) {
        System.out.println("Enter city:" + ex3);
        String city = scanner.nextLine();
        return city;
    }
}
public class Address extends AddressDetails {
    public void deliverAddress() {
        //Label for inserting address
        System.out.println("\nInsert Delivery Address: ");
        //Access method for user to input house numbers
        int houseNumber = houseNums(12345);
        //Access method for user to input street name
        String streetName = streetName("(\"Main Street\")");
        //Access method for user to input city name
        String city = city("(\"Moreno Valley\")");
        //Output entire delivery address
        String address = houseNumber + " " + streetName + ", " + city + ", ";
        String limits = state + ", " + country;
        System.out.println("Delivery Address: " + address + limits);
        //Close scanner for entire project
        scanner.close();
    }
}