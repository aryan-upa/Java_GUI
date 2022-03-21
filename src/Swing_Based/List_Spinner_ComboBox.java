package Swing_Based;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class List_Spinner_ComboBoxFrame extends JFrame implements ActionListener, ListSelectionListener, ChangeListener {

    JSpinner sp1, sp2;
    JList<String> list;
    JComboBox<String> comboBox;
    JTextField tF;

    public List_Spinner_ComboBoxFrame() {
        super("Spinner, List, ComboBox Demo");
        String[] countries = {"India", "Nepal", "Myanmar", "Nepal", "Bhutan"};
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "September", "October",
                "November", "December"};
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        comboBox = new JComboBox<>(countries);
        list = new JList<>(months);
        list.setVisibleRowCount(5);
        tF = new JTextField(15);

        sp1 = new JSpinner(new SpinnerNumberModel(1,1,31,1));
        sp2 = new JSpinner(new SpinnerListModel(days));

        setLayout(new FlowLayout());
        add(comboBox);
        add(sp1);
        add(sp2);
        add(new JScrollPane(list));
        add(tF);

        comboBox.addActionListener(this);
        list.addListSelectionListener(this);
        sp1.addChangeListener(this);
        sp2.addChangeListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tF.setText((String) comboBox.getSelectedItem());
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        tF.setText(list.getSelectedValue());
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if(e.getSource() == sp1)
            tF.setText(sp1.getValue() + "");
        else
            tF.setText(sp2.getValue() + "");
    }


}

public class List_Spinner_ComboBox {
    public static void main(String[] args) {
        List_Spinner_ComboBoxFrame frame = new List_Spinner_ComboBoxFrame();
        frame.setSize(800,800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
