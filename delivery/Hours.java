package delivery;
import java.text.DecimalFormat;
import java.util.*;
public class Hours {
    public void userTime() {
        Calendar current = Calendar.getInstance();
        System.out.println("Current Time: " + current.getTime());
        DecimalFormat timeformat = new DecimalFormat("##.##");
        double am, pm;
        timeformat.am = 11.00;
        timeformat.pm = 10.00;
        System.out.println("Regular Restaurant Hours: " + timeformat.am + " a.m. " + "- " + timeformat.pm + " p.m.");
    }
}
//Restraunt Business Hours: 11 am = 10 pm