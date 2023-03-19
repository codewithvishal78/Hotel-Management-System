
package hotel.management.system;

import java.awt.*;
import javax.swing.ImageIcon;
//import javax.swing.RootPaneContainer;
import javax.swing.*;


public class Dashboard extends JFrame{
 
    Dashboard()
    {
        JFrame jfrm=new JFrame("multiple document interface");
        jfrm.setBackground(Color.white);
        JDesktopPane desktop=new JDesktopPane();
        jfrm.add(desktop,BorderLayout.CENTER);
        desktop.setBackground(Color.white);
        jfrm.setSize(450,400);
        jfrm.setVisible(true);
        setBounds( 0, 0, 1920, 1080);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1920, 1080, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds( 0, 0, 1920, 1080);
        jfrm.add(image);
        jfrm.setVisible(true);
//        JLabel text = new JLabel("THE SAHU HOTEL WELCOME YOU");
//        text.setBounds(330, 80, 1000, 50);
//        text.setFont(new Font("Tahoma",Font.PLAIN,60));
//        text.setForeground(Color.WHITE);
//        image.add(text);
//        
//        JMenuBar mb = new JMenuBar();
//        mb.setBounds(0, 0, 1920, 40);
//        mb.setBackground(Color.white);
//        image.add(mb);
//        
//        JMenu hotel = new JMenu("Hotel Management");
//        hotel.setForeground(Color.red);
//        mb.add(hotel);
//        
//        JMenuItem reception = new JMenuItem("RECEPTION");
//        hotel.add(reception);
//        
//        JMenu admin = new JMenu("ADMIN");
//        admin.setForeground(Color.blue);
//        mb.add(admin);
//        
//        JMenuItem addemployee = new JMenuItem("ADD EMPLOYEE");
//        admin.add(addemployee);
//        
//        JMenuItem addroom = new JMenuItem("ADD ROOMS");
//        admin.add(addroom);
//        
//        JMenuItem adddriver = new JMenuItem("ADD DRIVER");
//        admin.add(adddriver);
//        
//        setVisible(true);
    }
    
    public static void main(String[] args)
    {
        new Dashboard();
    }
}
