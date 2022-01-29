package Practice.Proj2;

import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener {

    TextArea Expression;
    TextField result, name;

    String DEF_RES = "Result : ";
    final String NAME = "Aryan Upadhyay";

    Color c1 = new Color(220,211,101);
    Color c2 = new Color(200,157,232);

    public MyFrame() {
        super("Calculator App 2!");

        Font resFont = new Font("Sans Serif", Font.BOLD, 14);
        Expression = new TextArea("Expression",7, 0,TextArea.SCROLLBARS_NONE);
        Expression.setBackground(c1);
        Expression.setFont(resFont);
        result = new TextField(DEF_RES, 50);
        result.setFont(resFont);
        result.setBackground(c2);
        name = new TextField(NAME);

        MyButtons buttons = new MyButtons();
        buttons.setPropertyOfButtons(c1);

        GridBagLayout bag = new GridBagLayout();
        GridBagConstraints bagC = new GridBagConstraints();

        Panel p1 = new Panel();
        p1.setLayout(new GridLayout(4,2));

        for (int i=0; i<buttons.getAllButtons().length; i++) {
            p1.add(buttons.getAllButtons()[i]); // Button solve is not added.
        }

        Font f = new Font("Sans Serif", Font.BOLD, 16);
        p1.setFont(f);

        Panel p2 = new Panel();
        p2.setLayout(new BorderLayout());
        p2.add(Expression, BorderLayout.NORTH);
        p2.add(result, BorderLayout.SOUTH);

        add(p2, BorderLayout.NORTH);
        add(p1, BorderLayout.CENTER);
        buttons.solve.setBackground(c2);
        resFont = new Font("SansSerif", Font.BOLD | Font.ITALIC, 15);
        buttons.solve.setFont(resFont);
        Label l = new Label("Solve = ", Label.LEFT);
        buttons.solve.setLabel(l.getText());
        add(buttons.solve, BorderLayout.SOUTH);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

public class C2 {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setSize(307,426);
        frame.setVisible(true);
    }
}
