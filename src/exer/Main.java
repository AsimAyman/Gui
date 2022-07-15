package exer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        String data[][]={{"","",""},{"","",""},{"","",""},{"","",""},{"","",""},};

        String [] headers={"Id","Name","Grade"};
        JMenuBar menuBar =new JMenuBar();
        JMenuItem openMenuItem = new JMenuItem("Open",'O');
        JMenuItem saveMenuItem = new JMenuItem("Save",'S');
        JMenuItem exitMenuItem = new JMenuItem("Exit",'E');
        JRadioButton radioButton1=new JRadioButton("Radio 1");
        JRadioButton radioButton2=new JRadioButton("Radio 2");
        JCheckBoxMenuItem checkBox1 =new JCheckBoxMenuItem();
        JCheckBoxMenuItem checkBox2 =new JCheckBoxMenuItem();
        ButtonGroup radioGroup =new ButtonGroup();
        radioGroup.add(radioButton1);
        radioGroup.add(radioButton2);
        ButtonGroup checkGroup =new ButtonGroup();
        checkGroup.add(checkBox1);
         checkGroup.add(checkBox2);
         JMenu fileMenu =new JMenu("File");
         JMenu radioMenu =new JMenu("Radio");
         radioMenu.add(radioButton1);
         radioMenu.add(radioButton2);
         radioMenu.addSeparator();
         radioMenu.add(checkBox1);
         radioMenu.add(checkBox2);
         fileMenu.add(openMenuItem);
         fileMenu.add(saveMenuItem);
         fileMenu.addSeparator();
         fileMenu.add(exitMenuItem);
         menuBar.add(fileMenu);
         menuBar.add(radioMenu);


        JTable table =new JTable(data, headers);
        JTextField idTextField =new JTextField(15);
        JTextField nameTextField =new JTextField(15);
        JTextField gradeTextField =new JTextField(15);
        JLabel idLable =new JLabel("Id");
        JLabel nameLable =new JLabel("name");
        JLabel gradeLable =new JLabel("Grade");

        JFrame frame= new JFrame();
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setJMenuBar(menuBar);
        frame.add(new JScrollPane(table));
        frame.add(idLable);
        frame.add(idTextField);
        frame.add(nameLable);
        frame.add(nameTextField);
        frame.add(gradeLable);
        frame.add(gradeTextField);

        ActionListener listener =new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = idTextField.getText();
                String name =nameTextField.getText();
                String grade =gradeTextField.getText();
                data[0][0]=id;
                data[0][1]=name;
                data[0][2]=grade;

                for(int i=0;i<data.length;i++){
                    for(int j=0;j<3;j++){
                        System.out.println(data[i][j]);
                    }
                }
                table.updateUI();


            }
        };
        JButton button =new JButton("save");
        button.addActionListener(listener);
        frame.add(button);



    }


}
