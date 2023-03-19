/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.color.*;

public class JInternalFrames
{
    public static void main(String[] args)
    {
        new JInternalFrames();
    }
    JInternalFrames()
    {
        JFrame jfrm=new JFrame("multiple document interface");
        jfrm.setBackground(Color.white);
        JDesktopPane desktop=new JDesktopPane();
        jfrm.add(desktop,BorderLayout.CENTER);
        desktop.setBackground(Color.white);
        jfrm.setSize(450,400);
        jfrm.setVisible(true);
        JMenuBar mb = new JMenuBar();
        mb.setBounds(0, 0, 1920, 40);
        mb.setBackground(Color.white);
        //image.add(mb);
        
        JMenu hotel = new JMenu("Hotel Management");
        hotel.setForeground(Color.red);
        mb.add(hotel);
        
        JMenuItem reception = new JMenuItem("RECEPTION");
        hotel.add(reception);
        
        JMenu admin = new JMenu("ADMIN");
        admin.setForeground(Color.blue);
        mb.add(admin);
        
        JMenuItem addemployee = new JMenuItem("ADD EMPLOYEE");
        admin.add(addemployee);
        addemployee.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ev) {
              AddEmployee emp = new AddEmployee();
              emp.setVisible(true);
              desktop.add(emp);
              emp.moveToFront();
            }
          });
        JMenuItem addroom = new JMenuItem("ADD ROOMS");
        admin.add(addroom);
        
        JMenuItem adddriver = new JMenuItem("ADD DRIVER");
        admin.add(adddriver);
        desktop.add(mb);
//        for (int i=0; i<5; i++)
//        {
//            JInternalFrame frame=new JInternalFrame(("MDI'S forms"),true, true,true,true);
//            frame.setLocation(i*50+10,i*50+10);
//            frame.setSize(200,150);
//            frame.setBackground(Color.red);
//            frame.setVisible(true);
//            desktop.add(frame);
//            frame.moveToFront();
//        }
    }
}