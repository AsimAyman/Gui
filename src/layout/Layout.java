package layout;

import javax.swing.*;
import java.awt.*;

public class Layout extends JFrame {

    public static void main(String[] args) {
        JButton button1 =new JButton("Button 1");
        JButton button2 =new JButton("Button 2");
        JButton button3 =new JButton("Button 3");
        JFrame frame =new JFrame();
        frame.setSize(500,500);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setVisible(true);


    }
}
