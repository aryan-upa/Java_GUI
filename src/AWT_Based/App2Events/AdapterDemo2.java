/*
This program talks about another approach in creating Adapter Class.
    In this approach we
 */

package AWT_Based.App2Events;

import java.awt.*;
import java.awt.event.*;

class AdapterDemo2Frame extends Frame {
    public AdapterDemo2Frame() {
        super("Adapter Demo!");
        addWindowListener(new MyWindowAdapter());
    }

    static class MyWindowAdapter extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
}

public class AdapterDemo2 {
    public static void main(String[] args) {
        AdapterDemo2Frame frame = new AdapterDemo2Frame();
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}