/*
    Window Opened -> Establishing connection etc. when the application opens for the first time.
    Window Close
        1. Closing -> when clicked, while closing. // (Sys.Exit) to close the window.
        2. Close -> when window is closed.
    Window Activated -> window is in foreground.
    Window Deactivated -> window is in background.
    Window Iconified -> Window is minimized.
    Window De-Iconified -> Window is maximized.



 */

package AWT_Based.App2Events;

import java.awt.*;
import java.awt.event.*;

class WindowEventDemoFrame extends Frame implements WindowListener {

    Label l;

    public WindowEventDemoFrame() {
        super("Window Event Demo !");

        l = new Label("");
        l.setBounds(10,50,100,20);

        setLayout(new FlowLayout());
        add(l);

        addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        l.setText("Window Opened!");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        l.setText("Window Closing...");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        l.setText("Window Closed!");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        l.setText("Window Iconified!");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        l.setText("Window De-iconified!");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        l.setText("Window Activated!");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        l.setText("Window DeActivated!");
    }
}

public class WindowEventDemo {
    public static void main(String[] args) {
        WindowEventDemoFrame frame = new WindowEventDemoFrame();
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
