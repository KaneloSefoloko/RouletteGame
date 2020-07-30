package main.java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TimerReader {

    Random random = new Random();
    static int currNum;

    TimerReader() {
        currNum = random.nextInt(37);
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currNum = random.nextInt(37);
            }
        };
        Timer timer = new Timer(30000, listener);
        timer.start();
    }
}
