package ex;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
     String data[][] ={
             {"1","Asim","good"},
     };
     int index=data.length;
     String [] headers={"Id","Name","Grade"};
        JButton button =new JButton("Save");
        JTextField textField = new JTextField(15);
        JPasswordField passwordField= new JPasswordField(15);
        TextArea textArea =new TextArea(5,50);
        JTable table =new JTable(data,headers);
        JFrame frame =new JFrame();
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        frame.add(table);
        frame.add(new JLabel("Name"));
        frame.add(textField);
        frame.add( new JLabel("Password"));
        frame.add(passwordField);
        frame.add(new Label("Adress"));
        frame.add(new ScrollPane().add(textArea));
         frame.add(button);


        frame.add(button,BorderLayout.PAGE_END);
        ActionListener listener=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              String userName =textField.getText();
              String password =passwordField.getText();
              String address = textArea.getText();

              JOptionPane.showMessageDialog(null,""+"user name :  "+userName+"\npassword : "+password+"\naddress : "+address,"Info",JOptionPane.INFORMATION_MESSAGE);
             // data[index]={userName, password, address};

            }
        };
        button.addActionListener(listener);


    }
}