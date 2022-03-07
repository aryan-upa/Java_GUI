// Frame inside a Frame.

package Swing_Based;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class MyInternalFrame extends JInternalFrame {

    static int count = 1;

    JTextArea textArea;
    JScrollPane scrollPane;
    MyInternalFrame() {
        super("Document" + count++, true, true, false, true);

        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea);

        add(scrollPane);

        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem m1 = new JMenuItem("Save");

        file.add(m1);
        menuBar.add(file);
        setJMenuBar(menuBar);

        setSize(300,300);
        setLocation(50,50);

        setVisible(true);
    }
}

public class InternalFrameDemo extends JFrame implements ActionListener {
    JDesktopPane pane;

    InternalFrameDemo() {
        super("Internal Frame Demo!!");

        pane = new JDesktopPane();
        setContentPane(pane);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Document");
        JMenuItem m1 = new JMenuItem("New");

        menu.add(m1);
        menuBar.add(menu);
        setJMenuBar(menuBar);

        m1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        MyInternalFrame frame = new MyInternalFrame();
        pane.add(frame);
    }

    public static void main(String[] args) {
        InternalFrameDemo frame = new InternalFrameDemo();
        frame.setSize(800,800);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}



