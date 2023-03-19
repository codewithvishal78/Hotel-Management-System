package hotel.management.system;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import  java.awt.AWTEvent;
import java.sql.*;

public class Login extends JInternalFrame implements ActionListener{
    
    JTextField username,password;
    JButton login,cancel;
    
    Login()
    {
        getContentPane().setBackground(Color.ORANGE);
        
        setLayout(null);
        
        JLabel user = new JLabel("Username");
        user.setBounds(40, 20, 100, 30);
        add(user);
        
        username = new JTextField();//jtextfield fuc are use to create a text box
        username.setBounds(150, 20, 150, 30);
        add(username);
        
        
        JLabel pwd = new JLabel("Password");
        pwd.setBounds(40, 70, 100, 30);
        add(pwd);
        
        password = new JPasswordField();
        password.setBounds(150, 70, 150, 30);
        add(password);
        
        login = new JButton("Login");
        login.setBounds(40, 150, 120, 30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
       // login.setBorderPainted(false);
        add(login);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(180, 150, 120, 30);
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.addActionListener(this);
        add(cancel);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT); //resize the image
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 10, 200, 200);
        add(image);

        
        
        setBounds(500, 200, 600, 300); //set position and size
        setVisible(true);
    }
    
    //@Override
    public void actionPerformed(ActionEvent ae)
    {
        //getsouse function are use to check the click button
        if(ae.getSource() == login)
        {
           String user = username.getText();
            String pass = password.getText(); 
            
            try{ //hit on mysql
                Conn c = new Conn();
                
               String  query = "select * from login where username = '" + user + "' and password = '"+ pass +"'";
             //   String  query = "select * from login where username = "" + user + "" and password = "" + pwd + """;
                //execute query
                
                ResultSet rs=c.s.executeQuery(query);
                
                if(rs.next())
                {
                    setVisible(false);
                   new Dashboard();
                    
                    //System.out.print("jheooo0");
                    
                }
                else
                {
                    JOptionPane.showInputDialog(null,"invaled username and password");
                    setVisible(false);
                }
                
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        else if(ae.getSource() == cancel)
        {
            setVisible(false);
        }
      
    }    
}