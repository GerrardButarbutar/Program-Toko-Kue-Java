import javax.swing.JOptionPane;

/**
 *
 * @author Gerrard Butarbutar - 31200008
 */
public class clsSignup extends clsKoneksi{
    String IdPengguna;
    String Nama;
    String Password;
    
    public void Simpan(){
        try{
            sql = "insert into tbluser values ('"+ IdPengguna +"', '"+ Nama +"', '"+ Password +"')";
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
}