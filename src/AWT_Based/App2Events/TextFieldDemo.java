package AWT_Based.App2Events;

import java.awt.*;
import java.awt.event.*;

class TextFieldFrame extends Frame {

    Label l1, l2;
    TextField tf;

    public TextFieldFrame() {
        super ("TextField Demo");

        l1 = new Label("No Text is Entered Yet");
        l2 = new Label("Enter key is not yet hit");
        tf = new TextField(20);
        tf.setEchoChar('*');

        setLayout(new FlowLayout());

        add(l1);
        add(tf);
        add(l2);

        Handler h = new Handler();

        tf.addTextListener(h);
        tf.addActionListener(h);
    }

    class Handler implements TextListener, ActionListener {
        @Override
        public void textValueChanged(TextEvent e) {
            l1.setText(tf.getText());
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            l2.setText(tf.getText());
        }
    }
}

public class TextFieldDemo {
    public static void main(String[] args) {
        TextFieldFrame frame = new TextFieldFrame();
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
