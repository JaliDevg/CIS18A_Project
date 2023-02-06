import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import java.util.Calendar;
import java.util.Date;
import org.jdatepicker.impl.*;
import org.jdatepicker.util.*;
import org.jdatepicker.*;

    //import org.jdatepicker.graphics.*;
class date2 {

    void GUI() {
        JFrame f1 = new JFrame();
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setSize(300, 300);
        f1.setVisible(true);

        Container conn = f1.getContentPane();
        conn.setLayout(null);

        UtilDateModel model = new UtilDateModel();
        //model.setDate(20,04,2014);
        JDatePanelImpl datePanel = new JDatePanelImpl(model);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
        f1.add(datePicker);

    }

}

class testDate2 {

    public void main(String[] args) {

        date2 d1 = new date2();
        d1.GUI();

    }

}