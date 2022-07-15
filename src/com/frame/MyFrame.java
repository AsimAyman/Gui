package com.frame;

import javax.swing.JFrame;
import java.awt.*;

public class MyFrame extends JFrame {

     MyFrame(int width, int height, String title, Component compo1,Component compo2){
          super(title);
          setSize(width,height);
          setDefaultCloseOperation(EXIT_ON_CLOSE);
          add(compo1);
          add(compo2);
          setLayout(new FlowLayout());
     }
}
