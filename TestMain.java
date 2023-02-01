import delivery.*;
public class TestMain {
    public static void main(String args[]) {
        Hours timedisplay = new Hours();
        Address addressdisplay = new Address();
        timedisplay.userTime();
        System.out.println();
        addressdisplay.userAddress();
        System.out.println();
    }
}
