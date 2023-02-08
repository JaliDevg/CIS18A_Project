package src.delivery;

import java.util.Scanner;

interface GetAddress {
    int houseNums(int limit);
    String streetName();
    String city();
}
class DeliveryLimits {
    String state = "CA";
    String country = "United States";
}
class AddressDetails extends DeliveryLimits implements GetAddress {
    Scanner scanner = new Scanner(System.in);

    public int houseNums(int limit) {
        System.out.println("Enter house number (Up to " + limit + " numbers): ");
        int num = scanner.nextInt();
        return num;
    }

    public String streetName() {
        System.out.println("Enter street name: ");
        String name = scanner.nextLine();
        return name;
    }

    public String city() {
        System.out.println("Enter city: ");
        String city = scanner.nextLine();
        return city;
    }
}
public class Address extends AddressDetails {
    public void deliverAddress() {
        System.out.println("\nInsert Delivery Address: ");
        int houseNumber = houseNums(5);
        String streetName = streetName();
        String city = city();
        String address = houseNumber + " " + streetName + ", " + city + ", ";
        String limits = state + ", " + country;
        System.out.println("Delivery Address: " + address + limits);
        scanner.close();
    }
}

