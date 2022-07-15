package ui3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) {

        JMenuItem saveMenuItem =new JMenuItem("Save");
        JMenuItem exitMenueIrem =new JMenuItem("Exit",'E');
        JMenuItem backMenueItem =new JMenuItem("Back");
        backMenueItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveMenuItem.setMnemonic('S');
                System.out.println("\nSSSSSSSSSSSSSSSSSSSSSS");
            }
        });
        backMenueItem.setAccelerator(KeyStroke.getKeyStroke('S', KeyEvent.ALT_DOWN_MASK));
        JCheckBox checkBox1 = new JCheckBox("frist");
        JCheckBox checkBox2 = new JCheckBox("second");
        JRadioButton radioButton1 =new JRadioButton("radio 1");
        JRadioButton radioButton2 =new JRadioButton("radio 2");

        JMenu fileMenu =new JMenu("File");
        fileMenu.add(saveMenuItem);
        fileMenu.add(backMenueItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenueIrem);

        JMenu editMenu =new JMenu("Edit");
        editMenu.add(checkBox1);
        editMenu.add(checkBox2);
        editMenu.addSeparator();
        editMenu.add(radioButton1);
        editMenu.add(radioButton2);


        JMenuBar menuBar =new JMenuBar();
        menuBar.add(fileMenu);
        menuBar.add(editMenu);



        JFrame frame =new JFrame();
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setJMenuBar(menuBar);


    }
}
