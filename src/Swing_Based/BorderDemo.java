package Swing_Based;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

class BorderDemoFrame extends JFrame {

    JLabel l;
    JTextField tf;
    JButton b;
    JPanel p;

    BorderDemoFrame() {
        super("Border Demo!");

        l = new JLabel("Name");
        tf = new JTextField(20);
        b = new JButton("OK");
        p = new JPanel();

        p.add(l);
        p.add(tf);
        p.add(b);

        Border br = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.CYAN), "Login",
                TitledBorder.CENTER, TitledBorder.TOP, new Font("Sans Serif", Font.BOLD, 17));
        p.setBorder(br);

        setLayout(new FlowLayout());
        add(p);
    }
}


public class BorderDemo {
    public static void main(String[] args) {
        BorderDemoFrame frame = new BorderDemoFrame();
        frame.setSize(800,800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
