import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Gerrard Butarbutar -31200008
 */
public class frmSignup extends javax.swing.JFrame {
    clsSignup objSignup = new clsSignup();
    /**
     * Creates new form frmSignup
     */
    public frmSignup() {
        initComponents();
        objSignup.AksesData();
        AutoId();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdpengguna = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnSignup = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel1.setText("Toko Kue");

        jLabel2.setText("ID User");

        jLabel3.setText("Nama");

        jLabel4.setText("Password");

        txtIdpengguna.setEnabled(false);
        txtIdpengguna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdpenggunaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdpenggunaKeyTyped(evt);
            }
        });

        txtNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNamaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNamaKeyTyped(evt);
            }
        });

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });

        btnSignup.setText("Sign up");
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        jLabel5.setText("©Gerrard Butarbutar - 2021/2022");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabel1)
                .addContainerGap(151, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSignup)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addComponent(btnKeluar))
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(txtIdpengguna)
                    .addComponent(txtNama)
                    .addComponent(txtPassword))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(109, 109, 109))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdpengguna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSignup)
                    .addComponent(btnKeluar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void AutoId(){
        try{
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtokokue","root","");
            Statement stat = koneksi.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM tbluser order by id_user desc");
            if (rs.next()){
                String kode = rs.getString("id_user").substring(1);
                String AN = "" + (Integer.parseInt(kode) + 1);
                String Nol = "";
                
                if(AN.length()==1){
                    Nol = "00";
                }
                else if (AN.length()==2){
                    Nol = "0";
                }
                else if (AN.length()==3){
                    Nol = "";
                }
                
                txtIdpengguna.setText("U" + Nol + AN);
            }else{
               txtIdpengguna.setText("U001"); 
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        // TODO add your handling code here:
        objSignup.AksesData();
        SimpanData();
        AutoId();
        frmLogin login = new frmLogin();
        dispose();
        login.show();
    }//GEN-LAST:event_btnSignupActionPerformed

    private void txtIdpenggunaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdpenggunaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()== KeyEvent.VK_ENTER){
            if (txtIdpengguna.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Masukkan ID Pengguna","Informasi",
                JOptionPane.INFORMATION_MESSAGE);
                txtIdpengguna.requestFocus();
            }
            else{
                txtNama.requestFocus();
            }
        }
    }//GEN-LAST:event_txtIdpenggunaKeyPressed

    private void txtNamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()== KeyEvent.VK_ENTER){
            if (txtNama.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Masukkan Nama Pengguna","Informasi",
                JOptionPane.INFORMATION_MESSAGE);
                txtNama.requestFocus();
            }
            else{
                txtPassword.requestFocus();
            }
        }
    }//GEN-LAST:event_txtNamaKeyPressed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()== KeyEvent.VK_ENTER){
            if (txtPassword.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Masukkan password","Informasi",
                JOptionPane.INFORMATION_MESSAGE);
                txtPassword.requestFocus();
            }
            else{
                btnSignup.requestFocus();
            }
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void txtIdpenggunaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdpenggunaKeyTyped
        // TODO add your handling code here:
        if(txtIdpengguna.getText().length() >= 8)
        evt.consume();
    }//GEN-LAST:event_txtIdpenggunaKeyTyped

    private void txtNamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaKeyTyped
        // TODO add your handling code here:
        if(txtNama.getText().length() >= 30)
        evt.consume();
    }//GEN-LAST:event_txtNamaKeyTyped

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        // TODO add your handling code here:
        if(txtPassword.getText().length() >= 10)
        evt.consume();
    }//GEN-LAST:event_txtPasswordKeyTyped

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        frmLogin login = new frmLogin();
        dispose();
        login.show();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        Dimension posisi=Toolkit.getDefaultToolkit().getScreenSize();
        int x = (posisi.width-this.getWidth())/2;
        int y = (posisi.height-this.getHeight())/2;
        this.setLocation(x,y);
    }//GEN-LAST:event_formWindowActivated

    public void SimpanData(){
        if(txtIdpengguna.getText().equals("")||txtNama.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Data Harus Diisi Semua");
        }
        else{
            try{
                objSignup.AksesData();
                objSignup.IdPengguna=txtIdpengguna.getText();
                objSignup.Nama=txtNama.getText();
                objSignup.Password = txtPassword.getText();
                
                objSignup.Simpan();
                
                objSignup.res.executeUpdate(objSignup.sql);
                objSignup.conn.close();
                JOptionPane.showMessageDialog(null,"Sign Up Berhasil\nSalam Kenal Admin " + objSignup.Nama + "\nSilakan Log In!");               
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Proses penyimpanan gagal/koneksi gagal");
                System.out.println(e.getMessage());
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSignup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtIdpengguna;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}