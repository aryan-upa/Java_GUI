package AWT_Based.WaysOfEventHandling;

import java.awt.*;
import java.awt.event.*;

class Method2Frame extends Frame {

    TextField tf;
    Button b;
    static int count = 0;

    public Method2Frame() {
        super("Method 2!");

        tf = new TextField("0",20);
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
        b.addActionListener(new MyListener());

    }

    class MyListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            count++;
            tf.setText(String.valueOf(count));
        }
    }

}

public class Method2 {
    public static void main(String[] args) {
        Method2Frame frame = new Method2Frame();
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
