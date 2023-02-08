package src.delivery;
//Abstract Window Toolkit imports for GUI
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Swing imports for GUI
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//import ThankYou and DeliveryDate for outro
import src.startend.ThankYou;
import src.startend.DeliveryDate;

public class DatePicker {
    src.startend.ThankYou ty = new ThankYou();
    src.startend.DeliveryDate deliverDateCheck = new DeliveryDate();
    String date;
    public void deliDateInstruct() {
        //Display date pick instructions
        System.out.println("Delivery Date:");
        System.out.println("- Only Press the 'Submit' button when you are done entering the desired date.");
    }
    public void userDate() {
        //DISPLAY=localhost:0.0;
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
                date = dateField.getText();
                frame.dispose();
                System.out.println("Your delivery date is: " + date);
                deliverDateCheck.deliverDate();
                //Embedded Outro
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
