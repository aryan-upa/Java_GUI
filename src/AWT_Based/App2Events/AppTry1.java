/*
    This is a basic app which I made for just checking and revising the concepts of basic components of the Frame and
    basic buttons ( both radio and button ) and using ActionListener and ItemListener we performed some actions in
    the application.

    This has 2 radio buttons chooseA and chooseB which helps the user to choose between on which value, value1 or value2
    the operation of increment or decrement will work, then with the help of several buttons it performs several
    actions such as add, multiply, divide etc.
    Components...
        Checkbox Radio button...
            chooseA : sets the current selection to a.
            chooseB : sets the current selection to b.
        Buttons...
            Increment : increment the choice by 1.
            Decrement : decrement the choice by 1.
            Subtract : produce the result of a-b in the result label.
            Add : produce the result of a+b in the result label.
            Multiply : produce the result of a*b in the result label.
            Reset : reset all the counter and result to 0.
        Label...
            a : displays the value of a.
            b : displays the value of b.
            Result : displays the value of result after the operation performed on a and b.
 */

package AWT_Based.App2Events;

import java.awt.*;
import java.awt.event.*;

class AppTry1Frame extends Frame implements ActionListener, ItemListener {

    int resC, aC, bC;
    Label a, b, res;
    Button incr, decr, addB, sub, mul, resNull;
    CheckboxGroup cbg;
    Checkbox chooseA, chooseB;
    String currentSelection = "Null";


    public AppTry1Frame() {
        super("Trying the First App! ");

        a = new Label("  " + aC);
        b = new Label("  " + bC);
        res = new Label("    " + resC);

        incr = new Button("Increment " + currentSelection);
        incr.addActionListener(this);
        decr = new Button("Decrement " + currentSelection);
        decr.addActionListener(this);
        addB = new Button("Add A & B");
        addB.addActionListener(this);
        sub = new Button("Subtract (A-B)");
        sub.addActionListener(this);
        mul = new Button("Multiply");
        mul.addActionListener(this);
        resNull = new Button("Nullify All!");
        resNull.addActionListener(this);

        cbg = new CheckboxGroup();

        chooseA = new Checkbox("Choose A", false, cbg);
        chooseA.addItemListener(this);
        chooseB = new Checkbox("Choose B", false, cbg);
        chooseB.addItemListener(this);

        setLayout(new FlowLayout());
        add(chooseA);
        add(a);

        add(chooseB);
        add(b);

        add(incr);
        add(decr);
        add(sub);
        add(addB);
        add(mul);
        add(resNull);

        add(res);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == addB) {
            resC = aC + bC;
            res.setText("   " + resC);
        }

        else if(e.getSource() == sub) {
            resC = aC - bC;
            res.setText("   " + resC);
        }

        else if(e.getSource() == mul) {
            resC = aC * bC;
            res.setText("   " + resC);
        }

        else if(e.getSource() == resNull) {
            resC = 0;
            aC = 0;
            bC = 0;
        }

        if(e.getSource() == incr) {
            if(currentSelection.equals("a"))
                aC++;
            if(currentSelection.equals("b"))
                bC++;
        }

        if(e.getSource() == decr) {
            if(currentSelection.equals("a"))
                aC--;
            if (currentSelection.equals("b"))
                bC--;
        }

        a.setText("   " + aC);
        b.setText("   " + bC);
        res.setText("   " + resC);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(chooseA.getState()) {
            currentSelection = "a";
        }
        if(chooseB.getState()) {
            currentSelection = "b";
        }

        incr.setLabel("Increment " + currentSelection);
        decr.setLabel("Decrement " + currentSelection);
    }
}

public class AppTry1 {
    public static void main(String[] args) {
        AppTry1Frame frame = new AppTry1Frame();
        frame.setSize(250, 400);
        frame.setVisible(true);
    }
}
