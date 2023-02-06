import JDPicker-master;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.toedter.calendar.JCalendar;

public class DatePicker extends JFrame {
    private JCalendar calendar;
    private Container content;

    public DatePicker() {
        setTitle("JCalendar Example");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        content = getContentPane();
        content.setLayout(new BorderLayout());

        calendar = new JCalendar();
        content.add(calendar, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        DatePicker example = new DatePicker();
        example.setVisible(true);
    }
}
