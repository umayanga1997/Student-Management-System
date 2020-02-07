
import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class My_Connection {
    
    public static Connection getConnection(){
        
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/abc_student_system","root","");
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        }
        
        return con;
    }
    
}
