package AWT_Based.WaysOfEventHandling;

import java.awt.*;
import java.awt.event.*;

class Method1Frame extends Frame implements ActionListener {

    TextField tf;
    Button b;
    int count = 0;

    public Method1Frame() {
        super("Method 1");

        tf = new TextField("0");
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
        b.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        tf.setText(String.valueOf(count));
    }
}

public class Method1 {
    public static void main(String[] args) {
        Method1Frame frame = new Method1Frame();
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
