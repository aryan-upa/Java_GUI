package AWT_Based.Layouts;

import java.awt.*;

class GridBagLayoutDemoFrame extends Frame {

    Button b1,b2,b3,b4,b5,b6;

    public GridBagLayoutDemoFrame() {
        super("GridBag Layout Demo!");

        GridBagLayout gb = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        setLayout(gb);

        b1 = new Button("First");
        b2 = new Button("Second");
        b3 = new Button("Third");
        b4 = new Button("Fourth");
        b5 = new Button("Fifth");
        b6 = new Button("Sixth");


        // These are the x and y coordinates that we alter to add components at a particular place in the grid
        // Here we have the option to leave positions in the matrix as empty, and fill the positions with our choice.

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(b1,gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        add(b2, gbc);

        gbc.gridx = 3;
        gbc.gridy = 3;
        add(b3, gbc);

        gbc.gridx = 4;
        gbc.gridy = 4;
        add(b4, gbc);

        gbc.gridx = 5;
        gbc.gridy = 5;
        add(b5, gbc);

        gbc.gridx = 6;
        gbc.gridy = 6;
        add(b6, gbc);
    }
}


public class GridBagLayoutDemo {
    public static void main(String[] args) {
        GridBagLayoutDemoFrame frame = new GridBagLayoutDemoFrame();
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
