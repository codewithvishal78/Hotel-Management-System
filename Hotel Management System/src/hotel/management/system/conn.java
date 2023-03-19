
package hotel.management.system;
import java.sql.*;


public class Conn {
    
    Connection c; //connection (this is uder sql packege)
    Statement s;  //crete the statement
    
    Conn()
    {
        try {
        //my driver name ("com.mysql.cj.jdbc.driver")
        Class.forName("com.mysql.cj.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/HotelManagementSystem","root","root"); //create connection with mysql
        s = c.createStatement();
        } catch (Exception e)
     {
        e.printStackTrace();
      }
        
    } 
   
    
}















// five step of JDBC connectivity
// 1=resister the driver class(driver:mysql)
// 2=create the connetion
// 3=crete the statement
// 4=executing mysql queiry
// 5=close and connection