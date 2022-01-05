import javax.swing.JOptionPane;

/**
 *
 * @author Gerrard Butarbutar - 31200008
 */
public class clsPembeli extends clsKoneksi{
    String Idpembeli;
    String Namapembeli;
    String Nomorhp;
    
     //Method menampilkan data
    public void TampilData(){
        sql = "select * from tblpembeli";
    }
    
    //Method menginput data baru
    public void Baru(){
        try{
            Idpembeli = "";
            Namapembeli = "";
            Nomorhp = "";
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    //Method menyimpan data
    public void Simpan(){
        try{
            sql = "insert into tblpembeli values ('"+ Idpembeli +"', '"+ Namapembeli +"', '"+ Nomorhp +"')";
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    //Method mengedit data
    public void Edit(){
        try{
            sql = "update tblpembeli set  Nama_pembeli = '" + Namapembeli + "', No_hp = '" + Nomorhp
                + "' where id_pembeli ='" + Idpembeli + "'";
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    //Method menghapus data
    public void Hapus(){
        try{
            sql = "delete from tblpembeli where id_pembeli = '" + Idpembeli + "'";
        }catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
}