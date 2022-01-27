/*
Card Layout has cards, that when changed, changes the complete components of the frame.
    Card Layout works on Panel.
 */

package AWT_Based.Layouts;

import java.awt.*;
import java.awt.event.*;

class CardLayoutDemoFrame extends Frame implements ItemListener {

    Button b1, b2, b3;
    TextField t1, t2, t3;
    Panel p1, p2, cp;

    Panel mainPanel;
    Checkbox c1, c2;
    CardLayout cL;

    public CardLayoutDemoFrame() {

        super("Card Layout Demo Frame !");

        CheckboxGroup cg = new CheckboxGroup();

        c1 = new Checkbox("One", false, cg);
        c2 = new Checkbox("Two", false, cg);

        c1.addItemListener(this);
        c2.addItemListener(this);

        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");

        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);

        cp = new Panel(); // default layout is flow layout.
        cp.add(c1);
        cp.add(c2);

        p1 = new Panel();
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);

        p2 = new Panel();
        p2.add(t1);
        p2.add(t2);
        p2.add(t3);

        mainPanel = new Panel();
        cL = new CardLayout();
        mainPanel.setLayout(cL);

        mainPanel.add("One", p1);
        mainPanel.add("Two", p2);

        add(cp, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(c1.getState()) {
            cL.first(mainPanel);
        }
        else {
            cL.last(mainPanel);
        }
    }
}


public class CardLayoutDemo {
    public static void main(String[] args) {
        CardLayoutDemoFrame frame = new CardLayoutDemoFrame();
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
