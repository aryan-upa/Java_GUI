package AWT_Based.App2Events;

import java.awt.*;
import java.awt.event.*;

class CalculatorAppFrame extends Frame {

    Label label;
    TextField textField;
    Button add, mul, div, sub, reset, answer, fact;
    String defStr = "NoData";
    int sumC = 0, divC = 1, mulC = 1, subC = 0, factC = 1, answerC = 0;
    int temp = 0;


    public CalculatorAppFrame() {
        super("Calculator App Try 1");

        label = new Label(defStr);
        textField = new TextField(20);

        add = new Button("ADD");
        mul = new Button("MUL");
        div = new Button("DIVIDE");
        sub = new Button("SUB");
        reset = new Button("RESET");
        answer = new Button("SOLVE");
        fact = new Button("FACT");

        HandlerEvents h = new HandlerEvents();

        add.addActionListener(h);
        mul.addActionListener(h);
        div.addActionListener(h);
        sub.addActionListener(h);
        reset.addActionListener(h);
        answer.addActionListener(h);
        fact.addActionListener(h);

        textField.addActionListener(h);
        textField.addTextListener(h);

        setLayout(new FlowLayout());

        add(textField);

        add(add);
        add(mul);
        add(div);
        add(sub);
        add(fact);
        add(reset);
//        add(answer);

        add(label);
    }

    class HandlerEvents implements TextListener, ActionListener {
        @Override
        public void textValueChanged(TextEvent e) {

        }

        ActionEvent event;
        @Override
        public void actionPerformed(ActionEvent e) {
            if (temp == 0 && e.getSource() != reset) {
                label.setText("");
                temp = Integer.parseInt(textField.getText());
                textField.setText("");
            }
            else if(e.getSource() == add) {
                sumC = temp + Integer.parseInt(textField.getText());
                answerC = sumC;
                label.setText("" + temp + '+' + textField.getText() + " = " + answerC);
                temp = 0;
                answerC = 0;
            }

            else if(e.getSource() == sub) {
                subC = temp - Integer.parseInt(textField.getText());
                answerC = subC;
                label.setText("" + temp + '-' + textField.getText() + " = " + answerC);
                temp = 0;
                answerC = 0;
            }
            else if(e.getSource() == mul) {
                mulC = temp * Integer.parseInt(textField.getText());
                answerC = mulC;
                label.setText("" + temp + '*' + textField.getText() + " = " + answerC);
                temp = 0;
                answerC = 0;
            }
            else if(e.getSource() == div) {
                divC = temp / Integer.parseInt(textField.getText());
                answerC = divC;
                label.setText("" + temp + '/' + textField.getText() + " = " + answerC);
                temp = 0;
                answerC = 0;
            }
            if(e.getSource() == fact) {
                int tempres = 1;
                for (int i=1; i<temp+1; i++)
                    tempres *= i;
                answerC = tempres;
                label.setText("" + temp + "! = " + answerC);
                temp = 0;
                answerC = 0;
            }
            if(e.getSource() == reset) {
                temp = 0;
                label.setText("");
            }
            textField.setText("");
        }
    }
}


public class CalculatorApp {
    public static void main(String[] args) {
        CalculatorAppFrame calculatorAppFrame = new CalculatorAppFrame();
        calculatorAppFrame.setSize(220,250);
        calculatorAppFrame.setVisible(true);
    }
}

