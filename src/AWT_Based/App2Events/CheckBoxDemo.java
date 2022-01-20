package AWT_Based.App2Events;

import java.awt.*;
import java.awt.event.*;

class MyFrame2 extends Frame implements ItemListener {
    Label l;
    Checkbox c1, c2, c3;

    public MyFrame2() {
        super (" Check Box Demo ");

        l = new Label("Nothing is Selected");
        c1 = new Checkbox("java");
        c2 = new Checkbox("Python");
        c3 = new Checkbox("C#");

        setLayout(new FlowLayout());

        add(l);
        add(c1);
        add(c2);
        add(c3);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
   }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // e.getItem() return the reference of which one was clicked.
        // e.getStateChange() whether it's selected or deselected.
        // e.getItemSelectable() whether it is selectable or not.
        // e.paramString() what is the name of the button that is selected.

        String str = "";
        // boolean c1.getState() if check box is selected or not.
        // c1.getLabel() name of the checkbox
        if(c1.getState())
            str += c1.getLabel() + " ";
        if(c2.getState())
            str += c2.getLabel() + " ";
        if(c3.getState())
            str += c3.getLabel() + " ";
        if(str.isEmpty())
            str = "Nothing is selected";

        l.setText(str);

    }
}

public class CheckBoxDemo {
    public static void main(String[] args) {
        MyFrame2 frame2 = new MyFrame2();
        frame2.setSize(400, 400);
        frame2.setVisible(true);
    }
}
