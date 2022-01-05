import javax.swing.JOptionPane;

/**
 *
 * @author Gerrard Butarbutar - 31200008
 */
public class clsUser extends clsKoneksi{
    String Idpengguna;
    String Nama;
    String Password;
    
    //Method menampilkan data
    public void TampilData(){
        sql = "select * from tbluser";
    }
    
    //Method menginput data baru
    public void Baru(){
        try{
            Idpengguna = "";
            Nama = "";
            Password = "";
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    //Method menyimpan data
    public void Simpan(){
        try{
            sql = "insert into tbluser values ('"+ Idpengguna +"', '"+ Nama +"', '"+ Password +"')";
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    //Method mengedit data
    public void Edit(){
        try{
            sql = "update tbluser set Nama_user = '" + Nama + "', Password = '" + Password
                + "' where id_user ='" + Idpengguna + "'";
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    //Method menghapus data
    public void Hapus(){
        try{
            sql = "delete from tbluser where id_user = '" + Idpengguna + "'";
        }catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
}