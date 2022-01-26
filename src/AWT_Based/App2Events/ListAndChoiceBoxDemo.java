/*
List is a scroll menu, while Choice is the one that pops up when we select an item in the list box.
List has Item event -> selecting Item
    and Action event -> selecting Item and Hitting enter.

In List, we can select multiple items, but in Choice we can only select 1 item.
 */

package AWT_Based.App2Events;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

class ListAndChoiceBoxDemoFrame extends Frame implements ItemListener, ActionListener{
    List l;
    Choice c;
    TextArea tA;

    public ListAndChoiceBoxDemoFrame() {
        super("ListBox Demo!");

        l = new List(4, true);
        c = new Choice();
        tA = new TextArea(20,30);

        l.add("Monday");
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");

        c.add("january");
        c.add("february");
        c.add("march");
        c.add("april");

        setLayout(new FlowLayout());

        add(l);
        l.addItemListener(this);
        l.addActionListener(this);
        add(c);
        c.addItemListener(this);
        add(tA);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // Inside every event there's a method called getSource, this gives the reference to the item that initiated
        // that Item state change.

        if(e.getSource() == l){
            tA.append("\n" + Arrays.toString(l.getSelectedItems()));
        }
        else
            tA.append("\n" + c.getSelectedItem());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String[] ls = l.getSelectedItems();
        String txt = "";
        for(String x : ls) {
            txt += "\n" + x;
        }
        tA.setText(txt);
    }
}

public class ListAndChoiceBoxDemo {
    public static void main(String[] args) {
        ListAndChoiceBoxDemoFrame frame = new ListAndChoiceBoxDemoFrame();
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
