package AWT_Based.Layouts;

import java.awt.*;

class GridLayoutDemoFrame extends Frame {

    Button b1,b2,b3,b4,b5,b6;

    public GridLayoutDemoFrame() {
        super("Grid Layout Demo!");

        setLayout(new GridLayout(3,2));

        b1 = new Button("First");
        b2 = new Button("Second");
        b3 = new Button("Third");
        b4 = new Button("Fourth");
        b5 = new Button("Fifth");
        b6 = new Button("Sixth");


        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
    }

}


public class GridLayoutDemo {
    public static void main(String[] args) {
        GridLayoutDemoFrame frame = new GridLayoutDemoFrame();
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
