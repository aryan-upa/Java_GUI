package Swing_Based;

import java.awt.Color;
import javax.swing.*;
import javax.swing.event.*;

class SplitPaneFrame extends JFrame implements ListSelectionListener {

    JSplitPane splitPane;
    JList<String> list;
    JLabel label;

    SplitPaneFrame() {
        super("SplitFrameDemo!!");

        label = new JLabel("This is a label!!");

        String[] colors = {
                "RED", "GREEN", "BLUE", "YELLOW", "MAGENTA", "ORANGE", "BLACK",
                "WHITE", "LIGHT_GRAY", "GRAY", "DARK_GRAY", "PINK", "CYAN"};
        list = new JList<>(colors);
        list.setSelectedIndex(0);
        list.addListSelectionListener(this);
        JScrollPane scrollPane1 = new JScrollPane(list);

        label = new JLabel(" ");
        label.setOpaque(true);
        label.setBackground(Color.red);
        JScrollPane scrollPane2 = new JScrollPane(label);

        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, scrollPane1, scrollPane2);
        splitPane.setDividerLocation(100);
        add(splitPane);

    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        String selectedColor = list.getSelectedValue();

        switch (selectedColor) {
            case "RED" -> label.setBackground(Color.red);
            case "GREEN" -> label.setBackground(Color.green);
            case "BLUE" -> label.setBackground(Color.blue);
            case "YELLOW" -> label.setBackground(Color.yellow);
            case "MAGENTA" -> label.setBackground(Color.magenta);
            case "ORANGE" -> label.setBackground(Color.orange);
            case "BLACK" -> label.setBackground(Color.black);
            case "WHITE" -> label.setBackground(Color.white);
            case "LIGHT_GRAY" -> label.setBackground(Color.lightGray);
            case "GRAY" -> label.setBackground(Color.gray);
            case "DARK_GRAY" -> label.setBackground(Color.darkGray);
            case "PINK" -> label.setBackground(Color.pink);
            case "CYAN" -> label.setBackground(Color.cyan);
        }
    }
}

public class SplitPaneDemo {
    public static void main(String[] args) {
        SplitPaneFrame frame = new SplitPaneFrame();
        frame.setSize(800,800);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
