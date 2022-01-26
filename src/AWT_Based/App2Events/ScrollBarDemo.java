/*
    Scrollbar: Can be both horizontal and vertical and has a minimum and maximum value...
        The left side has minimum value and the right side has maximum value.
        The value can be increased by the slider, or by the button on the button on the left and right
            to increase the value by 1. It is called unit increment.
        Using the block on the either side of the slider we can also increment the values this is called
            block increment and has higher value of increment than the unit increment.

    Using Scrollbar is a bit tricky in the AWT, as the programmer has to develop the code so that the page movement
        according to the scrollbar takes place correctly, and that work has to be done by the programmer.
 */

package AWT_Based.App2Events;

import java.awt.*;
import java.awt.event.*;

class ScrollBarDemoFrame extends Frame implements AdjustmentListener {

    Scrollbar red, green, blue;
    TextField tF;

    public ScrollBarDemoFrame() {
        super("Scrollbar demo");

        red = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 255);
        blue = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 255);
        green = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 255);

        tF = new TextField(20);

        tF.setBounds(50,50,300,50);
        red.setBounds(50,150,300,30);
        blue.setBounds(50,200,300,30);
        green.setBounds(50,250,300,30);

        setLayout(null);

        add(tF);
        add(red);
        red.addAdjustmentListener(this);
        add(blue);
        blue.addAdjustmentListener(this);
        add(green);
        green.addAdjustmentListener(this);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        tF.setBackground(new Color(red.getValue(),blue.getValue(),green.getValue()));
    }
}

public class ScrollBarDemo {
    public static void main(String[] args) {
        ScrollBarDemoFrame frame = new ScrollBarDemoFrame();
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
