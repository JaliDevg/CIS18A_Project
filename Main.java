import java.util.Scanner;
import Greetings.*;
import UserInterface.*;

public class Main {
    public static void main(String args[]) throws java.io.IOException {
    Scanner sc = new Scanner (System.in);
    Greetings.Welcome wlc = new Greetings.Welcome();
    Greetings.ThankYou ty = new Greetings.ThankYou();
    wlc.GreetWlc();
    System.out.println();
    ty.GreetTy();
    System.out.println();
    }
}
