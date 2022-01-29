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
