package com.frame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {

    public static void main(String[] args) {
        ActionListener OkListener =new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"welcome","Dialog",JOptionPane.PLAIN_MESSAGE);
            }
        };
        ActionListener cancleListener =new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"ICON","massage",JOptionPane.PLAIN_MESSAGE,new ImageIcon("https://img.freepik.com/premium-vector/contact-us-icon-set-fillio-black-icon-series_7243-217.jpg?w=2000"));
            }
        };
        JFrame fram = new MyFrame(500,500,"frame",new myButton("OK",OkListener),new myButton("Cancle",cancleListener));
        fram.setVisible(true);
        System.out.println(Thread.currentThread().getName());

    }

}


