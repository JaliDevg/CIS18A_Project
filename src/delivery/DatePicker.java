package src.delivery;

//Abstract Window Toolkit imports for GUI (Reference - https://docs.oracle.com/en/java/javase/19/docs/api/java.desktop/java/awt/package-summary.html)
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*Swing imports for GUI (References - https://docs.oracle.com/en/java/javase/19/docs/api/java.desktop/javax/swing/package-summary.html and
Java A Begineer's Guide Eighth Edition -> page 555) */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//Import ThankYou and DeliveryDate custom package for outro
import src.startend.ThankYou;
import src.startend.Welcome;

public class DatePicker {
//Insert constructors for imports thank you outro method and delivery status method
    src.startend.ThankYou ty = new ThankYou();
    src.startend.Welcome deliverDateCheck = new Welcome();
    String date;
    public void deliDateInstruct() {
        //Allow swing application to be displayed by setting default display to 0
        String display = System.getenv("DISPLAY");
        if (display == null) {
        System.setProperty("DISPLAY", "localhost:0.0");
        }
        //Display date pick instructions
        System.out.println("Delivery Date:");
        System.out.println("- Only Press the 'Submit' button when you are done entering the desired date.");
    }
    public void userDate() {
        //Create the frame
        JFrame frame = new JFrame("REGULAR RESTAURANT");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(new Dimension(250, 150));
        //Create the label and text field for the date
        JLabel label = new JLabel("Enter date (MM/DD/YYYY):");
        JTextField dateField = new JTextField(10);
        //Create the submit button
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Holds entered date in text box into date variable and prints it back
                date = dateField.getText();
                frame.dispose();
                System.out.println("Your delivery date is: " + date);
                //Embedded Order Status method
                deliverDateCheck.deliverDate();
                //Embedded Outro method
                System.out.println();
                ty.outTy();
            }
        });
        //Add the label, text field, and button to the frame
        frame.add(label);
        frame.add(dateField);
        frame.add(submitButton);
        //Show the frame
        frame.setVisible(true);
    }
}
