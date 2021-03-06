package Practice.Proj2;

import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame {

    static TextArea Expression;
    static TextField result;
    Label name;

    static String DEF_RES = "Result : ";
    final static String NAME = "Aryan Upadhyay";

    Color c1 = new Color(220,211,101);
    Color c2 = new Color(200,157,232);
    Color c3 = new Color(225,127,39);

    Font resFont = new Font("Sans Serif", Font.BOLD, 14);
    Font f = new Font("Sans Serif", Font.BOLD, 16);
    Font nameFont = new Font("Engravers MT", Font.BOLD | Font.ITALIC, 18);

    public MyFrame() {
        super("Calculator [Only Integrals.]");

        Expression = new TextArea("Expression",5, 5,TextArea.SCROLLBARS_NONE);
        Expression.setBackground(c1);
        Expression.setFont(resFont);

        result = new TextField(DEF_RES, 50);
        result.setFont(resFont);
        result.setBackground(c2);
        result.setEditable(false);

        name = new Label(NAME, Label.CENTER);
        name.setBackground(c3);
        name.setFont(nameFont);

        MyButtons buttons = new MyButtons();
        buttons.setPropertyOfButtons(c1);

        Panel p1 = new Panel();
        p1.setLayout(new GridLayout(4,2));

        for (int i=0; i<buttons.getAllButtons().length; i++) {
            p1.add(buttons.getAllButtons()[i]); // Button solve is not added.
        }

        buttons.solve.setBackground(c2);
        resFont = new Font("SansSerif", Font.BOLD | Font.ITALIC, 15);
        buttons.solve.setFont(resFont);

        p1.setFont(f);
        Panel p2 = new Panel();

        p2.setLayout(new BorderLayout());
        p2.add(Expression, BorderLayout.NORTH);
        p2.add(result, BorderLayout.SOUTH);

        Panel p3 = new Panel();
        p3.setLayout(new BorderLayout());
        p3.add(buttons.solve, BorderLayout.NORTH);
        p3.add(name, BorderLayout.SOUTH);

        add(p2, BorderLayout.NORTH);
        add(p1, BorderLayout.CENTER);
        add(p3, BorderLayout.SOUTH);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        ActionListener listener = new MyActions();

        for (Button button: buttons.allButtons) {
            button.addActionListener(listener);
        }

        buttons.solve.addActionListener(listener);

    }
}

