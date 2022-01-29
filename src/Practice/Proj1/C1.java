package Practice.Proj1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener {

    TextField tf;
    Button b;

    int count = 0;

    public MyFrame() {
        super("New Window C1 !");

        tf = new TextField("", 20);
        b = new Button("Click");

        setLayout(new FlowLayout());

        add(tf);
        add(b);

        b.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        tf.setText(String.valueOf(count));
    }
}

public class C1 {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
//        frame.setUndecorated(true); // when the frame is undecorated, we can not move it, and does not have close button
            // or menu bar.
        frame.setSize(300,300);
        frame.setLocation(200,200);
//        frame.setOpacity(0.3f); // Opacity sets low only when frame is Undecorated.
        frame.setVisible(true);
    }
}
