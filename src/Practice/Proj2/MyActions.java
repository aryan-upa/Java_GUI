package Practice.Proj2;

import java.awt.event.*;

public class MyActions implements ActionListener {

    int solution = 0;
    boolean solutionBool = false;
    int temp = 0;

    boolean solveFlag = false;

    boolean factFlag = false;
    boolean sumFlag = false;
    boolean isAFlag = false;
    boolean subFlag = false;
    boolean isPFlag = false;
    boolean mulFlag = false;
    boolean randFlag = false;
    boolean divFlag = false;

    @Override
    public void actionPerformed(ActionEvent e) {

        if (MyFrame.Expression.getText().length() != 0) {

            if (e.getActionCommand().equals("1")) {
                factFlag = true;
                solution = C2Math.fact(Integer.parseInt(MyFrame.Expression.getText()));
                solveFlag = true;
                MyFrame.Expression.setText(MyFrame.Expression.getText() + "!");
            }


            if(e.getActionCommand().equals("2")) {
                sumFlag = true;
                temp = Integer.parseInt(MyFrame.Expression.getText());
                MyFrame.Expression.setText("");
                MyFrame.result.setText(MyFrame.DEF_RES + temp + " + ");
                solveFlag = true;
            }


            if(e.getActionCommand().equals("3")) {
                isAFlag = true;
                solutionBool = C2Math.isArmstrong(Integer.parseInt(MyFrame.Expression.getText()));
                MyFrame.Expression.setText("isA(" + MyFrame.Expression.getText() + ")");
                solveFlag = true;
            }


            if(e.getActionCommand().equals("4")) {
                subFlag = true;
                temp = Integer.parseInt(MyFrame.Expression.getText());
                MyFrame.Expression.setText("");
                MyFrame.result.setText(MyFrame.DEF_RES + temp + " - ");
                solveFlag = true;
            }


            if(e.getActionCommand().equals("5")) {
                isPFlag = true;
                solutionBool = C2Math.isPrime(Integer.parseInt(MyFrame.Expression.getText()));
                MyFrame.Expression.setText("isP(" + MyFrame.Expression.getText() + ")");
                solveFlag = true;
            }


            if(e.getActionCommand().equals("6")) {
                mulFlag = true;
                temp = Integer.parseInt(MyFrame.Expression.getText());
                MyFrame.Expression.setText("");
                MyFrame.result.setText(MyFrame.DEF_RES + temp + " * ");
                solveFlag = true;
            }


            if(e.getActionCommand().equals("7")) {
                randFlag = true;
                solution = C2Math.random();
                MyFrame.Expression.setText("");
                solveFlag = true;
            }


            if(e.getActionCommand().equals("8")) {
                divFlag = true;
                temp = Integer.parseInt(MyFrame.Expression.getText());
                MyFrame.Expression.setText("");
                MyFrame.result.setText(MyFrame.DEF_RES + temp + " / ");
                solveFlag = true;
            }


            if(e.getActionCommand().equals("9") && solveFlag) {

                int newVal;
                if(sumFlag || subFlag || divFlag || mulFlag)
                    newVal = Integer.parseInt(MyFrame.Expression.getText());
                else
                    newVal = 0;

                if(factFlag) {
                    MyFrame.result.setText(MyFrame.DEF_RES + solution);
                }

                if(sumFlag) {
                    solution = temp + newVal;
                    MyFrame.result.setText(MyFrame.DEF_RES + temp + " + " + newVal + " = " + solution);
                }

                if(isAFlag) {
                    MyFrame.result.setText(MyFrame.DEF_RES + solutionBool);
                }

                if(subFlag) {
                    solution = temp - newVal;
                    MyFrame.result.setText(MyFrame.DEF_RES + temp + " - " + newVal + " = " + solution);
                }

                if(isPFlag) {
                    MyFrame.result.setText(MyFrame.DEF_RES + solutionBool);
                }

                if(mulFlag) {
                    solution = temp * newVal;
                    MyFrame.result.setText(MyFrame.DEF_RES + temp + " * " + newVal + " = " + solution);
                }

                if(randFlag) {
                    MyFrame.result.setText(MyFrame.DEF_RES + solution);
                }

                if(divFlag) {
                    float solution = (float) temp / newVal;
                    MyFrame.result.setText(MyFrame.DEF_RES + temp + " / " + newVal + " = " + solution);
                }

                MyFrame.Expression.setText("");

                solveFlag = false;

                factFlag = false;
                sumFlag = false;
                isAFlag = false;
                subFlag = false;
                isPFlag = false;
                mulFlag = false;
                randFlag = false;
                divFlag = false;

                temp = 0;
                solution = 0;
                solutionBool = false;
            }
        }

        else {
            MyFrame.result.setText(MyFrame.DEF_RES + "No Input Value");
        }

    }
}
