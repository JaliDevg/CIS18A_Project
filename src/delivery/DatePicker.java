package src.delivery;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DatePicker {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Date Input");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(new Dimension(250, 150));
        // Create the label and text field for the date
        JLabel label = new JLabel("Enter date (MM/DD/YYYY):");
        JTextField dateField = new JTextField(10);
        // Create the submit button
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String date = dateField.getText();
                System.out.println("Entered date: " + date);
            }
        });
        // Add the label, text field, and button to the frame
        frame.add(label);
        frame.add(dateField);
        frame.add(submitButton);
        // Show the frame
        frame.setVisible(true);
    }
}
