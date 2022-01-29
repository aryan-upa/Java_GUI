package Practice.Proj2;

import java.awt.*;

public class MyButtons extends Button {

    Button fact, isP, isA, rand, sum, sub, mul, div, solve;
    Button[] allButtons;

    {
        fact = new Button("Factorial");
        isP = new Button("isPrime");
        isA = new Button("isArmstrong");
        rand = new Button("Random");
        sum = new Button("Addition");
        sub = new Button("Subtract");
        mul = new Button("Multiply");
        div = new Button("Divide");
        solve = new Button("Solve");

        allButtons = new Button[]{fact, sum, isA, sub, isP, mul, rand, div};

        fact.setActionCommand("1");
        sum.setActionCommand("2");
        isA.setActionCommand("3");
        sub.setActionCommand("4");
        isP.setActionCommand("5");
        mul.setActionCommand("6");
        rand.setActionCommand("7");
        div.setActionCommand("8");
        solve.setActionCommand("9");

    }

    MyButtons() {
    }

    public Button[] getAllButtons() {
        return this.allButtons;
    }

    public void setPropertyOfButtons(Color c) {
        for (Button button: allButtons) {
            button.setBackground(c);
        }
    }
}
