package hotel.management.system;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HotelManagementSystem extends JFrame implements ActionListener{

    HotelManagementSystem()
    {
        setSize(1366,565); //set frame size
        setLocation(100, 100); //set frame length
        setBounds(100,100,1366,565);
        setLayout(null);
        
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));//take pic
        //JLabel class is use to stick a pic in frame
        JLabel image = new JLabel(il);
        //setBounds fuctions contain locationX,locationY,width and hight 
        // setBound fuction work combination of setSize and SetLOcation
        image.setBounds(0, 0, 1366, 565); 
        add(image);
        
        //JLabel, main use for text write on the frame
        JLabel text = new JLabel("HOTEL MANAGEMENT SYSTEM");
        text.setBounds(20, 430, 1000, 90); //set size
        text.setForeground(Color.white); //chage font color
        text.setFont(new Font("serif",Font.PLAIN,50));
         //image call use because without image call text hide
        image.add(text);
        
        //JButton are use to create a button 
        JButton next = new JButton("NEXT");
        next.setBounds(1150, 450, 150, 50);
        next.setBackground(Color.white);
        next.setForeground(Color.black);
        next.addActionListener(this);
        next.setFont(new Font("serif",Font.PLAIN,25));
        image.add(next); 
        
        setVisible(true); //setvisible by defualt false working
        
        //diper light by using ifinite loop
        while(true)
        {
            text.setVisible(false);
            try
            {
                Thread.sleep(500);//my text 500ms in sleep mode
            } catch (Exception e)
            {
                e.printStackTrace();
            }
            text.setVisible(true);
            try
            {
                Thread.sleep(500);
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }  
        
    }
       @Override
    public void actionPerformed(ActionEvent ae) //method override applying 
    {
        setVisible(false);
        new Login();
    }
    
    
}
