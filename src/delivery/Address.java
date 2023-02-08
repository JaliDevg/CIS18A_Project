package src.delivery;

import java.util.Scanner;

interface GetAddress {
    int houseNums(int ex1);
    String streetName(String ex2);
    String city(String ex3);
}
class DeliveryLimits {
    String state = "CA";
    String country = "United States";
}
class AddressDetails extends DeliveryLimits implements GetAddress {
    Scanner scanner = new Scanner(System.in);

    public int houseNums(int ex1) {
        System.out.println("Enter House Number:" + "(\'" + ex1 + "\')");
        int num = scanner.nextInt();
        return num;
    }
    public String streetName(String ex2) {
        System.out.println("Enter Street Name:" + ex2);
        scanner.nextLine();
        String name = scanner.nextLine();
        return name;
    }
    public String city(String ex3) {
        System.out.println("Enter city:" + ex3);
        String city = scanner.nextLine();
        return city;
    }
}
public class Address extends AddressDetails {
    public void deliverAddress() {
        System.out.println("\nInsert Delivery Address: ");
        int houseNumber = houseNums(12345);
        String streetName = streetName("(\"Main Street\")");
        String city = city("(\"Moreno Valley\")");
        String address = houseNumber + " " + streetName + ", " + city + ", ";
        String limits = state + ", " + country;
        System.out.println("Delivery Address: " + address + limits);
        scanner.close();
    }
}