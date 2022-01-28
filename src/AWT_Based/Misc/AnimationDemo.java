package AWT_Based.Misc;

import java.awt.*;
import java.awt.event.*;

class AnimationDemoFrame extends Frame implements Runnable{

    int x, y;
    int tx, ty; // translationX and translationY;

    public AnimationDemoFrame() {
        super ("Animation Demo !");

        x = 100;
        y = 100;

        Thread t = new Thread(this);
        t.start();

        tx = ty = 1;

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(x,y,50,50);
    }

    @SuppressWarnings("InfiniteLoopStatement")
    @Override
    public void run() {
        while(true) {
            x+=tx;
            y+=ty;
            if(x<0 || x>this.getWidth() - 50)
                tx*=-1;
            if(y<10 || y>this.getHeight() - 50)
                ty*=-1;
            repaint();
            try {Thread.sleep(1);} catch (InterruptedException e) {
                System.out.println();
            }
        }
    }
}

public class AnimationDemo {
    public static void main(String[] args) {
        AnimationDemoFrame frame = new AnimationDemoFrame();
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
