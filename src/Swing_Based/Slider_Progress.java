package Swing_Based;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

class Slider_ProgressFrame extends JFrame implements ChangeListener {

    JSlider slider;
    JPanel p1, p2;
    JProgressBar pBar;

    int w = 50;

    public Slider_ProgressFrame() {
        slider = new JSlider(SwingConstants.HORIZONTAL,0,100,0);
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setPaintTrack(true);

        pBar = new JProgressBar();
        pBar.setString("50%");
        pBar.setStringPainted(true);
        pBar.setIndeterminate(true);

        p1 = new JPanel() {
            @Override
            public void paint(Graphics g) {
                g.drawOval(50,50,w,w);
            }
        };

        p2 = new JPanel();
        p2.add(pBar);

        slider.addChangeListener(this);

        add(slider, BorderLayout.NORTH);
        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        w = slider.getValue();
        p1.repaint();
        pBar.setString(w + "%");
        pBar.setValue(w);
        pBar.setIndeterminate(false);
    }
}

public class Slider_Progress {
    public static void main(String[] args) {
        Slider_ProgressFrame frame = new Slider_ProgressFrame();
        frame.setSize(800,800);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

