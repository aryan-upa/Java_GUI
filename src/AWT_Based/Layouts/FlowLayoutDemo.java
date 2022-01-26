package AWT_Based.Layouts;

import java.awt.*;

class FlowLayoutDemoFrame extends Frame {

    Button b1,b2,b3,b4,b5,b6;

    public FlowLayoutDemoFrame() {
        super("Flow Layout Demo!");

        b1 = new Button("First");
        b2 = new Button("Second");
        b3 = new Button("Third");
        b4 = new Button("Fourth");
        b5 = new Button("Fifth");
        b6 = new Button("Sixth");

        FlowLayout fl = new FlowLayout();
        fl.setAlignment(FlowLayout.RIGHT); // what is the orientation of all the components in the Frame.
        setLayout(fl);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
    }
}

public class FlowLayoutDemo {
    public static void main(String[] args) {
        FlowLayoutDemoFrame frame = new FlowLayoutDemoFrame();
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
