package ex;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
      MyFrame(int width, int height, Component comp1,Component comp2,Component comp3,Component comp4,Component comp5){
          setSize(width,height);
          add(comp1, BorderLayout.PAGE_END);
          add(comp2, BorderLayout.PAGE_END);
          add(comp3, BorderLayout.PAGE_END);
          add(comp4, BorderLayout.PAGE_START);
          add(comp5, BorderLayout.PAGE_END);
          setDefaultCloseOperation(EXIT_ON_CLOSE);
          setLayout(new FlowLayout());
          setVisible(true);
      }
}
