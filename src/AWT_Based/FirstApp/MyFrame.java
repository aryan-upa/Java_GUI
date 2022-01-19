package AWT_Based.FirstApp;

import java.awt.*;

// Another way of creating a frame by extending the Frame class.
// and then creating an object of it in the main class and using the hasA relationship.

public class MyFrame extends Frame{
    Label label;
    TextField textField;
    Button button;

    public MyFrame() {
        super("My App");

        setLayout(new FlowLayout());

        label = new Label("Name");
        textField = new TextField(20);
        button = new Button("OK");

        add(label);
        add(textField);
        add(button);

    }
}

// Instead of writing another class we can also include the frame in hte application class.

class FirstApp2 extends Frame{

    Label label;
    TextField textField;
    Button button;

    public FirstApp2() {
        super("My App using the Application class.");

        setLayout(new FlowLayout());

        label = new Label("Name");
        textField = new TextField(20);
        button = new Button("OK");

        add(label);
        add(textField);
        add(button);

    }

    public static void main(String[] args) {
        // creating a frame using the MyFrame class.
        MyFrame myFrame = new MyFrame();
        myFrame.setSize(400, 400);
        myFrame.setVisible(true);

        // creating a frame using the FirstApp2 class
        FirstApp2 myFrame2 = new FirstApp2();
        myFrame2.setSize(400, 400);
        myFrame2.setVisible(true);

        // Up until now, we are not able to close the application using the cross button on the application
        // but, we have to learn the event handling for that.
        // also, the abstract nature of the window in Mac-OS is far more sexy than of windows, just saying.
    }
}
