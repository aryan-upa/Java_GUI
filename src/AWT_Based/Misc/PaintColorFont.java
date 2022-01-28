package AWT_Based.Misc;

import java.awt.*;
import java.awt.event.*;

class PaintColorFontFrame extends Frame {

    int x = 0, y = 0;

    public PaintColorFontFrame() {
        super("Painting Font Frame Demo!");

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        int width = 30;
        int height = 30;
        g.setColor(Color.red);
//        g.fillOval(x-width/2,y-height/2,width,height);
        g.setFont(new Font("Broadway",Font.ITALIC, 30));
        g.drawString("Aryan Upadhyay",x,y);
    }
}

public class PaintColorFont {
    public static void main(String[] args) {
        PaintColorFontFrame frame = new PaintColorFontFrame();
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
//