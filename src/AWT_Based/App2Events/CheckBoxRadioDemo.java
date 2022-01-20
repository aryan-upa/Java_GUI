package AWT_Based.App2Events;

import java.awt.*;
import java.awt.event.*;

class Frame3 extends Frame implements ItemListener {

    Label l;
    CheckboxGroup cbg;
    Checkbox c1, c2, c3;
    String def = "Nothing is selected";

    Frame3() {
        super("This is a new Frame with radio buttons.");

        l = new Label(def);
        cbg = new CheckboxGroup();

        c1 = new Checkbox("Java", false, cbg);
        c2 = new Checkbox("Python", false, cbg);
        c3 = new Checkbox("C#", false, cbg);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        setLayout(new FlowLayout());

        add(l);
        add(c1);
        add(c2);
        add(c3);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String nstr = "";

        if(c1.getState())
            nstr += c1.getLabel() + " ";
        if(c2.getState())
            nstr += c2.getLabel() + " ";
        if(c3.getState())
            nstr += c3.getLabel() + " ";

        if(nstr.isEmpty())
            nstr = def;

        l.setText(nstr);
    }
}

public class CheckBoxRadioDemo {
    public static void main(String[] args) {
        Frame3 frame3 = new Frame3();
        frame3.setSize(400, 400);
        frame3.setVisible(true);
    }
}
