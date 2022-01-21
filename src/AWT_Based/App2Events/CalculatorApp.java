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
        add(answer);

        add(label);
    }

    class HandlerEvents implements TextListener, ActionListener {
        @Override
        public void textValueChanged(TextEvent e) {
            label.setText(textField.getText());
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == add) {
                if(textField.getText().isEmpty()) {
                    label.setText("NoneEntered");
                }
                else {
                    if (temp == 0) {
                        temp = Integer.parseInt(textField.getText());
                        label.setText(label.getText() + '+');
                        textField.setText("");
                    }
                    else {
                            sumC = temp + Integer.parseInt(textField.getText());
                            answerC = sumC;
                            label.setText( label.getText() + textField.getText());
                            textField.setText(String.valueOf(answerC));
                            temp = answerC;
                        }
                    }
            }


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

