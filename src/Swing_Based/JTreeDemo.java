/* The current issue is that, it does not work with empty folder */

package Swing_Based;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.io.File;
import java.util.Objects;

class JTreeDemoFrame extends JFrame implements TreeSelectionListener {

    JTree tree;
    JLabel label;

    public DefaultMutableTreeNode returnTree(File f) {
        if(f.isDirectory()) {
            DefaultMutableTreeNode tempNode = new DefaultMutableTreeNode(f.getName());
            for (File y: Objects.requireNonNull(f.listFiles())) {
                tempNode.add(returnTree(y));
            }
            return tempNode;
        }
        else {
            return new DefaultMutableTreeNode(f.getName());
        }
    }

    JTreeDemoFrame() {
        super("JTree Demo!");

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("E:\\");
        File f = new File("E:\\");

        root.add(returnTree(f));

        tree = new JTree(root);
        tree.addTreeSelectionListener(this);
        label = new JLabel("No file selected");

        JScrollPane sp = new JScrollPane(tree);

        add(sp, BorderLayout.CENTER);
        add(label, BorderLayout.SOUTH);

    }


    @Override
    public void valueChanged(TreeSelectionEvent e) {
        label.setText(e.getPath().toString());
    }
}

public class JTreeDemo {
    public static void main(String[] args) {
        JTreeDemoFrame frame = new JTreeDemoFrame();
        frame.setSize(800,800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
