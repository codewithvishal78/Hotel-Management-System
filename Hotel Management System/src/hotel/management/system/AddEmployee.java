
package hotel.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.*;


public class AddEmployee extends JInternalFrame implements ActionListener{
    
    JTextField fname,fage,fsalary,tpno,fgmail,faadhar;
    JRadioButton mgender,fgender;
    JButton sumit;
    JLabel tname,tage,gender,job,gmail,salary,pno,taadhar;
    JComboBox choosejob;
    AddEmployee()
    {
        super(("Add Employee"),true, true,true,true);
        setLayout(null);
        
        tname = new JLabel("NAME");
        tname.setBounds(60, 30, 120, 30);
        tname.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(tname);
         fname = new JTextField();
         fname.setBounds(200,30,180,30);
         add(fname);
         
         tage = new JLabel("AGE");
         tage.setBounds(60, 80, 120, 30);
        tage.setFont(new Font("Tahoma",Font.PLAIN,17));
         add(tage);
         fage = new JTextField();
         fage.setBounds(200,80,180,30);
         add(fage);
         
        /* ButtonGroup bg = new ButtonGroup();
              bg.add(mgender);
              bg.add(fgender);*/ 
         
        gender = new JLabel("GENDER");
        gender.setBounds(60, 130, 120, 30);
        gender.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(gender);
         mgender = new JRadioButton("Male");
        mgender.setBounds(200, 130, 70, 30);
        mgender.setBackground(Color.white);
        add(mgender);
         fgender = new JRadioButton("Female");
        fgender.setBounds(310, 130, 70, 30);
        fgender.setBackground(Color.white);
        add(fgender);
        
        
       job = new JLabel("JOB");
        job.setBounds(60, 180, 120, 30);
        job.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(job);
        
        //JComboBox fuction is used to create a drop down list
        String str[] = {"Hotel manager"," Director of housekeeping","Executive chef","attendant","Food director","event manager","Restaurant general manager","Sommelier","Hotel Receptionist","Housekeeper"};
        choosejob = new JComboBox(str);
        choosejob.setBounds(200, 180, 180, 30);
        choosejob.setBackground(Color.white);
        add(choosejob); 
        
        salary = new JLabel("SALARY");
        salary.setBounds(60, 230, 120, 30);
        salary.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(salary);
        fsalary = new JTextField();
        fsalary.setBounds(200,230,180,30);
        add(fsalary);
         
        pno = new JLabel("PHONE NO.");
        pno.setBounds(60, 280, 120, 30);
        pno.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(pno);
        tpno = new JTextField();
        tpno.setBounds(200,280,180,30);
        add(tpno);
         
        gmail = new JLabel("GMAIL");
        gmail.setBounds(60, 330, 120, 30);
        gmail.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(gmail);
        fgmail = new JTextField();
        fgmail.setBounds(200,330,180,30);
        add(fgmail);
         
        taadhar = new JLabel("AADHAR");
        taadhar.setBounds(60, 380, 120, 30);
        taadhar.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(taadhar);
        faadhar = new JTextField();
        faadhar.setBounds(200,380,180,30);
        add(faadhar);
         
        sumit = new JButton("SUMIT");
        sumit.setBounds(120, 435, 120, 30);
        sumit.setBackground(Color.black);
        sumit.setForeground(Color.WHITE);
        sumit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                String name = fname.getText();
                String  age = fage.getText();
                String asalary = fsalary.getText();
                String phone = pno.getText();
                String agmail = fgmail.getText(); 
                String aadhar= faadhar.getText();
        
                String gender = null;  
        
                if(mgender.isSelected())
                {
                    gender ="male";
                }
                else if(fgender.isSelected()){
                    gender = "female";
                }

                String ajob = (String) choosejob.getSelectedItem();

                try
                {
                    Conn conn = new Conn();
                    String query = "insert into employee value ('"+name+"','"+age+"','"+gender+"','"+ajob+"','"+asalary+"','"+phone+"','"+agmail+"','"+aadhar+"')";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "employee add successfully");
                    

                }catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
          });
         add(sumit);
         
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/tenth.jpg"));
        Image i2 = i1.getImage().getScaledInstance(450, 450, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400, 30, 410, 350);
       // image.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT);
        add(image);
        
        getContentPane().setBackground(Color.WHITE);
        setBounds(350,200,850,540);
        
        //setVisible(true); 
        
      }
    
  //@overring
    public void actionPerformed(ActionEvent ae)
    {
        
            
    }
    
    
    
}
