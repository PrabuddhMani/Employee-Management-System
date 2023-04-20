package EmployeeManagementSystem;

import javax.print.DocFlavor.STRING;
import javax.swing.*;
import java.awt.*;
// import java.awt.event.ActionListener;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener {

    JTextField tfusername, tfuserpass;

    Login(){

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);


        JLabel lblusername = new JLabel("Username:");
        lblusername.setBounds(40,20,100,30);
        add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(150,20,150,30);
        add(tfusername);
        

        JLabel lbluserpass = new JLabel("Password:");
        lbluserpass.setBounds(40,80,100,30);
        add(lbluserpass);
        
        tfuserpass = new JTextField();
        tfuserpass.setBounds(150,80,150,30);
        add(tfuserpass);

        JButton login = new JButton("LOGIN");
        login.setBounds(150,140,150,70);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.BLUE);
        login.addActionListener(this);
        add(login);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3); 
        image.setBounds(350,0,200,200);
        add(image);


        setSize(600,300);
        setLocation(450,200);
        setVisible(true);
    }

    public void actionperformed(ActionEvent ae){

        try{
            String username = tfusername.getText();
            String password = tfuserpass.getText();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String S[]){
        new Login();
    }
}
