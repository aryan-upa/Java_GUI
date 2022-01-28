/*
Menu :
    A Menu has multiple options, It is placed inside the menu bar.
    A Menu can have multiple submenus in it.
        and it can hold checkbox Menu Item as well.
    Clicking menu item creates actionEvent and can be handled as such.

    menuItem, checkBoxMenuItem is added in -> menu is added in -> menuBar -> Frame.

 */

package AWT_Based.Menu;

import java.awt.*;
import java.awt.event.*;

class MenuDemoFrame extends Frame {

    TextField tf;
    MenuBar mB;
    Menu file, sub;

    MenuItem open, save, close, closeAll;
    CheckboxMenuItem auto;

    public MenuDemoFrame() {
        super("Menu Demo!");

        tf = new TextField("", 20);
        mB = new MenuBar();
        open = new MenuItem("Open");
        save = new MenuItem("Save");
        close = new MenuItem("Close");
        closeAll = new MenuItem("Close All");

        auto = new CheckboxMenuItem("AutoSave");

        file = new Menu("File");
        sub = new Menu("Close");

        file.add(open);
        file.add(save);
        file.add(sub);
        file.add(auto);

        sub.add(close);
        sub.add(closeAll);

        mB.add(file);

        setMenuBar(mB);

        setLayout(new FlowLayout());
        add(tf);

        open.addActionListener(e -> tf.setText(e.getActionCommand()));
        save.addActionListener(e -> tf.setText(e.getActionCommand()));
        close.addActionListener(e -> tf.setText(e.getActionCommand()));
        closeAll.addActionListener(e -> tf.setText(e.getActionCommand()));

        auto.addItemListener(e -> {
            if(auto.getState())
                tf.setText("Auto On!");
            else
                tf.setText("Auto Off!");
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

public class MenuDemo {
    public static void main(String[] args) {
        MenuDemoFrame frame = new MenuDemoFrame();
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
