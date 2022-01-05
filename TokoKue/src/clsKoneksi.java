import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Gerrard Butarbutar - 31200008
 */
public class clsKoneksi {
    public Connection conn;
    public Statement res;
    public String sql;
    
    //method untuk menghubungkan program ke database
    public void AksesData(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtokokue","root","");
            res=conn.createStatement();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Koneksi Gagal");
            System.out.println(e.getMessage());
        }
    }
}