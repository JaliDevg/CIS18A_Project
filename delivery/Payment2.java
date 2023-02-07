package delivery;

import java.util.Scanner;

interface CardDetails {
    long getCardNumber();
    String getCardType();
}

class UserCard implements CardDetails {
    static Scanner scanner = new Scanner(System.in);
    long cardNumber;
    String cardType;

    public getCardNumber() {
        System.out.print("Enter 16 digit card number: ");
        cardNumber = scanner.nextLong();
        return cardNumber;
    }

    public String getCardType() {
        System.out.println("Allowed Payment Types:");
        System.out.println("1. Visa\n2. Mastercard\n3. American Express\n4. Discover");
        System.out.println("- Enter the number next to the desried option to select the card type.");
        System.out.println("Ex.\n1\nCard Type: Visa");

        int cardOption = scanner.nextInt();
        switch (cardOption) {
            case 1:
                cardType = "Visa";
                break;
            case 2:
                cardType = "Mastercard";
                break;
            case 3:
                cardType = "American Express";
                break;
            case 4:
                cardType = "Discover";
                break;
            default:
                cardType = "Invalid option. Try again.";
                break;
        }
        return cardType;
    }
}

public class Payment2 extends UserCard{
    public static void main(String[] args) {
        UserCard userCard = new UserCard();
        System.out.println();
        System.out.println("Card type: " + cardType + "Card #:" + cardNumber);
        System.out.println();
        scanner.close();
    }
}

