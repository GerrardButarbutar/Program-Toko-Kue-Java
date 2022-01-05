import javax.swing.JOptionPane;

/**
 *
 * @author Gerrard Butarbutar - 31200008
 */
public class clsLogin extends clsKoneksi{
    String IdPengguna;
    String Nama;
    String Password;
    
    //method untuk login
    public void Masuk(){
        try{
            sql="select * from tbluser where nama_user = '"+Nama+"' and password ='"+Password+"'";
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    //method untuk keluar dari form login
    public void Keluar(){
        try{
            JOptionPane.showMessageDialog(null,"Sampai Jumpa, Semoga Hari Anda Menyenangkan :)");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    } 
}