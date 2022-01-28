package AWT_Based.WaysOfEventHandling;

import java.awt.*;
import java.awt.event.*;

class Method4Frame extends Frame {

    TextField tf;
    Button b;
    int count = 0;

    public Method4Frame() {

        super("Method 4!");

        tf = new TextField("0", 20);
        b = new Button("Click");

        setLayout(new FlowLayout());
        add(tf);
        add(b);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        b.addActionListener((ActionEvent e) -> {
            count++;
            tf.setText(String.valueOf(count));
        });
    }
}

public class Method4 {
    public static void main(String[] args) {
        Method4Frame frame = new Method4Frame();
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
