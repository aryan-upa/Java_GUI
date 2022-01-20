package AWT_Based.App2Events;

import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener {

    // In order to do some event when a button is clicked on our frame we need to implement the ActionListener interface.
    // ActionListener only has 1 method.

    int count = 0; // the value that changes on hitting the button.
    Label l;
    Button b1;
    Button b2;

    public MyFrame() {
        super ("Incrementer");
        l = new Label("    " + count); // just to have a bigger label, we've given spaces.
        b1 = new Button("Add 1");
        b1.addActionListener(this); // who is the listener, and as this class is the listener
           // we've set it to this.

        b2 = new Button("Sub 1");
        b2.addActionListener(this);

        setLayout(new FlowLayout());
        add(l);
        add(b1);
        add(b2);

        // b.addActionListener(); the method to register the listener.
        // b.getLabel === b.getActionCommand(); this return which button is pressed and returns the label of that button.
        // b.setLabel; changes the label of the button.

        // l.getText and l.setText to get and set the label of the button.
    }

    // this is our callback method, when the button is pressed this will be called.
    public void actionPerformed(ActionEvent e) {

        // e.getModifiers() tells you was shift or ctrl or alt was pressed with the key.
        // e.getWhen() tells you when the key was pressed.
        // e.paramString() for event logging and debugging.
        // e.getActionCommand() return the label of the button.
        if(e.getActionCommand().equals("Add 1")) {
            count++;
            l.setText("    " + count);
        }
        else if(e.getActionCommand().equals("Sub 1")) {
            count--;
            l.setText("    " + count);
        }

    }
}

public class ButtonDemo {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
