package com.frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myButton extends JButton {
    myButton(String title,ActionListener myListener){
        super(title);
        addActionListener(myListener);
    }

}
