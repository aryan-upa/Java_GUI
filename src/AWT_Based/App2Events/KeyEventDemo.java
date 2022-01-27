/*
KeyEvent is seperated from the typing, in the textField the general behaviour of key pressed is to print the
    typed data, but in general, the key event is different from the normal typing.

    By hitting a key, three different events are generated.
        1. KeyPressed -> when we hit the key for the first time.
        2. KeyTyped -> when the key is held for a long time, this event is generated multiple times.
        3. KeyReleased -> when we release the pressed key.

 */


package AWT_Based.App2Events;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;

class KeyEventDemoFrame extends Frame implements KeyListener {

    Label l1, l2, l3, l4;

    public KeyEventDemoFrame() {
        super ("Key Event Demo!");

        l1 = new Label("");
        l2 = new Label("");
        l3 = new Label("");
        l4 = new Label("");

        setLayout(null);
        l1.setBounds(30, 50, 100, 20);
        l2.setBounds(30, 80, 100, 20);
        l3.setBounds(30, 100, 100, 20);
        l4.setBounds(30, 130, 100, 20);

        add(l1);
        add(l2);
        add(l3);
        add(l4);

        addKeyListener(this);
    }


    @Override
    public void keyPressed(KeyEvent e) {
        l1.setText("Key Pressed!");
        l2.setText("");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        l2.setText("Key Released!");
        l1.setText("");
        l3.setText("");
        l4.setText("");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        l3.setText(e.getKeyChar() + "");
        l4.setText(new Date(e.getWhen()) + "");
    }
}

public class KeyEventDemo {
    public static void main(String[] args) {
        KeyEventDemoFrame frame = new KeyEventDemoFrame();
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
