package notpad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class NotPad extends JFrame {
    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu openMenu;
    JMenuItem openItem;
    JTextArea textArea;
    NotPad(String string){
        super(string);
        textArea =new JTextArea();
        menuBar =new JMenuBar();
        fileMenu=new JMenu("File");
        openItem= new JMenuItem("Open",'O');
        openItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("OOOOOOOOOOOOOOO");
            }
        });
        openItem.setAccelerator(KeyStroke.getKeyStroke('O', KeyEvent.CTRL_DOWN_MASK));
        fileMenu.add(openItem);
        openMenu=new JMenu("Open");
        menuBar.add(fileMenu);
        menuBar.add(openMenu);

       add(new JScrollPane(textArea));


        setJMenuBar(menuBar);
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
       new  NotPad("Not Pad Demo").setVisible(true);
    }
}
