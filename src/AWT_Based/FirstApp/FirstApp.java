package AWT_Based.FirstApp;

import java.awt.*;

public class FirstApp {
    public static void main(String[] args) {
        Frame f = new Frame("First APP");
        f.setLayout(new FlowLayout()); // Layout.

        Button b = new Button("A button");
        Label l = new Label("Name");
        TextField tf = new TextField(20);

        f.add(l); //add a label.
        f.add(b); //adding the button on the screen.
        f.add(tf); //add the text field.

        f.setSize(300,300); //sets the size in pixels.
        f.setVisible(true); // shows the frame.
    }

}
