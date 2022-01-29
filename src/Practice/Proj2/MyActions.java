package Practice.Proj2;

import java.awt.event.*;

public class MyActions implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("1")) {
            int val = C2Math.fact(Integer.parseInt(MyFrame.Expression.getText()));
            MyFrame.result.setText(MyFrame.DEF_RES + val);
        }
    }
}
