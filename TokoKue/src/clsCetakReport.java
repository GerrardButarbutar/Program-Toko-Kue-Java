import javax.swing.JOptionPane;

/**
 *
 * @author Gerrard Butarbutar - 31200008
 */
public class clsCetakReport extends clsKoneksi {
    String Kode1;
    String Kode2;
    
    //method mencetak data
    public void Cetak(String mKode1, String mKode2){
        try{
            Kode1 = mKode1;
            Kode2 = mKode2;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
}