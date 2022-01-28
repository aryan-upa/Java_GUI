/*
This program talks about adapter classes and how we can implement that so that, we don't have to implement the
    WindowListener add write all methods in it. rather we can only write the function we require.
 */

package AWT_Based.App2Events;

import java.awt.*;
import java.awt.event.*;

class AdapterDemoFrame extends Frame {
    public AdapterDemoFrame() {
        super("Adapter Demo Frame!");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

public class AdapterDemo {
    public static void main(String[] args) {
        AdapterDemoFrame frame = new AdapterDemoFrame();
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
