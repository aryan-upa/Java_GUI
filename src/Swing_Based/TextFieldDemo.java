package Swing_Based;

import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.text.*;
import java.util.Locale;

class TextFieldDemoFrame extends JFrame {

    JTextField tf1;
    JFormattedTextField tf2, tf3, tf4;

    public TextFieldDemoFrame() {
        super("Swing TextField Demo!");

        DateFormat dF = new SimpleDateFormat("dd/MMMM/yyyy");

        tf1 = new JTextField(15);
        tf2 = new JFormattedTextField(dF); // specialized for one format, may be date, currency or
            // anything.
        tf2.setColumns(15);

        NumberFormat nF = NumberFormat.getInstance();
        NumberFormatter numberFormatter = new NumberFormatter(nF); // part of swing.text;
        numberFormatter.setAllowsInvalid(false);
        numberFormatter.setMaximum(10000);
        tf3 = new JFormattedTextField(numberFormatter);
        tf3.setColumns(12);

        NumberFormat nF2 = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormatter numberFormatter1 = new NumberFormatter(nF2);
        numberFormatter1.setAllowsInvalid(false);
        tf4 = new JFormattedTextField(numberFormatter1);
        tf4.setColumns(10);
        tf4.setValue(0);

        JTextArea tA = new JTextArea(10,10);
        tA.setText("Nothing here!");
        tA.setToolTipText("Some Blank space.");

        setLayout(new FlowLayout());
        add(tf1);
        add(tf2);
        add(tf3);
        add(tf4);
        add(tA);

//        tf2.setValue(0); sets date to the initial date.
        tf2.setValue(new Date()); // sets date to today's date.
    }
}

public class TextFieldDemo {
    public static void main(String[] args) {
        TextFieldDemoFrame frame = new TextFieldDemoFrame();

        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
