package AWT_Based.WaysOfEventHandling;

import java.awt.*;
import java.awt.event.*;

class Method3Frame extends Frame {

    TextField tf;
    Button b;
    int count = 0;

    public Method3Frame() {
        super("Method 3!");

        tf = new TextField("0", 20);
        b = new Button("Click");

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setLayout(new FlowLayout());
        add(tf);
        add(b);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count++;
                tf.setText(String.valueOf(count));
            }
        });
    }
}

public class Method3 {
    public static void main(String[] args) {
        Method3Frame frame = new Method3Frame();
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
