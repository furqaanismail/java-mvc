
package labs.mvc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Connect {

    
    private static Connection con;
    private Connect() {
    }

    public static Connection getCon() {
        if (con == null) {
            try{
                String host = "jdbc:mysql://localhost:3306/java_mvc";
                String user = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = (Connection) DriverManager.getConnection(host,user,pass);
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Connection Failed!");
            }
        }
        
        return con;
    }
    
    
    
}
