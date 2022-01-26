package AWT_Based.Layouts;

import java.awt.*;

class BorderLayoutDemoFrame extends Frame {

    Button b1,b2,b3,b4,b5,b6;

    public BorderLayoutDemoFrame() {
        super("Border Layout Demo!");

        b1 = new Button("First");
        b2 = new Button("Second");
        b3 = new Button("Third");
        b4 = new Button("Fourth");
        b5 = new Button("Fifth");
        b6 = new Button("Sixth");

        //Border layout is the default layout in java a frame.
        // We don't have to define it externally to use it.

        add(b1, BorderLayout.NORTH);
//        add(b2, BorderLayout.EAST);
        add(b3, BorderLayout.SOUTH);
        add(b4, BorderLayout.WEST);
        add(b5, BorderLayout.CENTER);
//        add(b6);

        Panel p = new Panel();
        // Panel is another type of container
        p.setLayout(new GridLayout(3,1));
        p.add(new Button("Mon")); // these are anonymous buttons, they don't have references.
        p.add(new Button("Tues"));
        p.add(new Button("Wed"));
        add(p, BorderLayout.EAST);

    }
}

public class BorderLayoutDemo {
    public static void main(String[] args) {
        BorderLayoutDemoFrame frame = new BorderLayoutDemoFrame();
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
