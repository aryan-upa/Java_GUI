package AWT_Based.App2Events;

import java.awt.*;
import java.awt.event.*;

class textAreaDemoFrame extends Frame implements ActionListener{
    TextArea tA;
    TextField tF;
    Label l;
    Button b;

    public textAreaDemoFrame() {
        super("Text Area Demo!");

        l = new Label("No text Entered!");
        b = new Button("Click to Submit");
        tA = new TextArea(10,30);
        tF = new TextField(20);

        setLayout(new FlowLayout());

        add(tA);
        add(l);
        add(tF);
        add(b);
        b.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        tA.getSelectedText() // gets the text which has been selected in the text Area.
//        tA.append(); // appends the text in the text area.
        tA.insert(tF.getText(), tA.getCaretPosition()); //Inserts the text from the text field in the current position
            // of the cursor in the text Area.
    }
}

public class TextAreaDemo {
    public static void main(String[] args) {
        textAreaDemoFrame frame = new textAreaDemoFrame();
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
