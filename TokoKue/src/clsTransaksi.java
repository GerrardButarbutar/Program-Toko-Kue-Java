import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Gerrard Butarbutar - 31200008
 */
public class clsTransaksi extends clsKoneksi{
    String Idtransaksi;
    Date Tgltransaksi;
    String Pembeli;
    String Kue;
    String Jumlah;
    String Total;
    
     //Method menampilkan data untuk tabel transaksi
    public void TampilData(){
        sql = "SELECT Id_transaksi, tgl_transaksi, pembeli, id_kue, nama_kue, harga, jumlah_beli, harga * jumlah_beli as totalharga FROM `tbltransaksi` left join tblkue using(id_kue);";
    }
    
    //Method menampilkan data untuk tabel kue
    public void TampilDataKue(){
        sql = "SELECT * FROM tblkue;";
    }
    
    //Method menyimpan data
    public void Simpan(){
        try{
            sql = "insert into tbltransaksi values ('"+ Idtransaksi +"', '"+ Tgltransaksi
                    +"', '"+ Pembeli +"', '"+ Kue +"', '"+ Jumlah +"')";
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    //Method mengedit data
    public void Edit(){
        try{
            sql = "update tbltransaksi set pembeli = '" + Pembeli + "', id_kue = '" + Kue +"', tgl_transaksi = '" + Tgltransaksi + "', jumlah_beli = '"+ Jumlah+ "' where id_transaksi = '" + Idtransaksi + "'";
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    //Method menghapus data
    public void Hapus(){
        try{
            sql = "delete from tbltransaksi where id_transaksi = '" + Idtransaksi + "'";
        }catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
}