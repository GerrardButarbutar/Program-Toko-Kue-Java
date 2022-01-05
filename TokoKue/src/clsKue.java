import javax.swing.JOptionPane;

/**
 *
 * @author Gerrard Butarbutar - 31200008
 */
public class clsKue extends clsKoneksi{
    String Idkue;
    String Namakue;
    String Harga;
    
    //Method menampilkan data
    public void TampilData(){
        sql = "select * from tblkue";
    }
    
    //Method menginput data baru
    public void Baru(){
        try{
            Idkue = "";
            Namakue = "";
            Harga = "";
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    //Method menyimpan data
    public void Simpan(){
        try{
            sql = "insert into tblkue values ('"+ Idkue +"', '"+ Namakue +"', '"+ Harga +"')";
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    //Method mengedit data
    public void Edit(){
        try{
            sql = "update tblkue set nama_kue = '" + Namakue + "', Harga = '" + Harga
                + "' where id_kue ='" + Idkue + "'";
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    //Method menghapus data
    public void Hapus(){
        try{
            sql = "delete from tblkue where id_kue = '" + Idkue + "'";
        }catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
}