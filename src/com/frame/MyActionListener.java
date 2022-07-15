package com.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener {
    String massage;
    MyActionListener(String massage){
        this.massage=massage;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(massage);
    }
}
