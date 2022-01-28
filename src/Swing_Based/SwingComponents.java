package Swing_Based;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class SwingComponentsFrame extends JFrame implements ActionListener {

    JLabel l;
    JButton b;
    int count = 0;

    public SwingComponentsFrame() {
        super("Swing Demo!");

        l = new JLabel("Clicked " + count + "Times.");
        b = new JButton("Click");

        setLayout(new FlowLayout());

        add(l);
        add(b); // default button.
        add(new JButton("Cancel")); // another button

        b.addActionListener(this);

        // Pane -> Panel
        // Default Button on Pane that is executed on a complete frame.
        // frame has a root pane.

        getRootPane().setDefaultButton(b);

        // b.setIcon(new ImageIcon("D:/new.png")); // Sets the image as icon of the button.
        l.setToolTipText("Counter"); // when we hover over the item, a popup comes showing this.

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText("Clicked " + count + "Times.");
    }
}

public class SwingComponents {
    public static void main(String[] args) {
        SwingComponentsFrame frame = new SwingComponentsFrame();

        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
