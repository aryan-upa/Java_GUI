/*
    When mouse enters the frame, it initiates the mouse entered event.
    When mouse exits the frame, it initiates the mouse exited event.

    When we hit the left button on mouse, it initiates the mouse clicked event.
    Clicked comprises two other events -> Mouse Pressed & mouse Released.

    When mouse pointer moves it generates mouse moved.
    When mouse is clicked and dragged it generates the mouse dragged event.

    Mouse Entered
    Mouse Exited
    Mouse Clicked
    Mouse Pressed
    Mouse Released
        Listeners are in : MouseListener.
    Mouse Moved
    Mouse Dragged
        Listeners are in : MouseMotionListener.

    Read the JavaDoc of this to get the insight.
 */

package AWT_Based.App2Events;

import java.awt.*;
import java.awt.event.*;

class MouseEventDemoFrame extends Frame implements MouseListener, MouseMotionListener {

    Label l, l2;

    public MouseEventDemoFrame() {
        super("Mouse Event Demo Frame!");

        l = new Label("");
        l2 = new Label("");

        setLayout(null);

        l.setBounds(10,50,100,20);
        l2.setBounds(10, 80, 100, 20);

        add(l);
        add(l2);

        addMouseListener(this);
        addMouseMotionListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked!");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        l.setText("Mouse Dragged");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        l.setText("Mouse ");
        l2.setText( "(" + e.getX() + "," + e.getY() + ")");
    }
}

public class MouseEventDemo {
    public static void main(String[] args) {
        MouseEventDemoFrame frame = new MouseEventDemoFrame();
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
