import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Gerrard Butarbutar - 31200008
 */
public class frmPembeli extends javax.swing.JFrame {
    clsPembeli objPembeli = new clsPembeli();
    private TableColumn column;
    
    /**
     * Creates new form frmPembeli
     */
    public frmPembeli() {
        initComponents();
        objPembeli.AksesData();
        IsiTabel();
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
        txtIdpembeli = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNamapembeli = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNomorhp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        menuUser = new javax.swing.JMenuItem();
        menuKue = new javax.swing.JMenuItem();
        menuPembeli = new javax.swing.JMenuItem();
        menuTransaksi = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuCetakReport = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuLogout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel1.setText("Toko Kue");

        jLabel2.setText("ID Pembeli");

        txtIdpembeli.setEnabled(false);
        txtIdpembeli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdpembeliKeyPressed(evt);
            }
        });

        jLabel3.setText("Nama Pembeli");

        txtNamapembeli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNamapembeliKeyPressed(evt);
            }
        });

        jLabel4.setText("Nomor HP");

        txtNomorhp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomorhpKeyPressed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        jLabel5.setText("©Gerrard Butarbutar - 2021/2022");

        jLabel6.setText("Data Master Pembeli");

        jMenu1.setText("File");

        jMenu2.setText("Master");

        menuUser.setText("User");
        menuUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUserActionPerformed(evt);
            }
        });
        jMenu2.add(menuUser);

        menuKue.setText("Kue");
        menuKue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuKueActionPerformed(evt);
            }
        });
        jMenu2.add(menuKue);

        menuPembeli.setText("Pembeli");
        menuPembeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPembeliActionPerformed(evt);
            }
        });
        jMenu2.add(menuPembeli);

        jMenu1.add(jMenu2);

        menuTransaksi.setText("Transaksi");
        menuTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTransaksiActionPerformed(evt);
            }
        });
        jMenu1.add(menuTransaksi);

        jMenu4.setText("Report");

        menuCetakReport.setText("Cetak Report");
        menuCetakReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCetakReportActionPerformed(evt);
            }
        });
        jMenu4.add(menuCetakReport);

        jMenu1.add(jMenu4);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Log Out");

        menuLogout.setText("Log Out");
        menuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogoutActionPerformed(evt);
            }
        });
        jMenu3.add(menuLogout);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(txtIdpembeli)
                            .addComponent(jLabel3)
                            .addComponent(txtNamapembeli)
                            .addComponent(txtNomorhp, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMenu)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(218, 218, 218))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(346, 346, 346))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdpembeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNamapembeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomorhp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(btnSave)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete)
                    .addComponent(btnMenu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void AutoId(){
        try{
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtokokue","root","");
            Statement stat = koneksi.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM tblpembeli order by id_pembeli desc");
            if (rs.next()){
                String kode = rs.getString("id_pembeli").substring(1);
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
                
                txtIdpembeli.setText("P" + Nol + AN);
            }else{
               txtIdpembeli.setText("P001"); 
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        SimpanData();
        AutoId();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        BersihIsian();
        AutoId();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        frmMenu menu = new frmMenu();
        dispose();
        menu.show();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        if(txtIdpembeli.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Masukkan ID Pembeli");
        }
        else{
            try{
                objPembeli.AksesData();
                objPembeli.Idpembeli = txtIdpembeli.getText();
                objPembeli.Namapembeli = txtNamapembeli.getText();
                objPembeli.Nomorhp = txtNomorhp.getText();
                
                objPembeli.Edit();
                objPembeli.res.executeUpdate(objPembeli.sql);
                objPembeli.conn.close();
                BersihIsian();
                IsiTabel();
                AutoId();
                JOptionPane.showMessageDialog(null, "Data Pembeli Dengan ID " + objPembeli.Idpembeli + " Berhasil Diupdate");
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Proses penyimpanan gagal/koneksi gagal");
                
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try{
            objPembeli.AksesData();
            objPembeli.Idpembeli = txtIdpembeli.getText();
            objPembeli.Hapus();
            objPembeli.res.executeUpdate(objPembeli.sql);
            objPembeli.conn.close();
            IsiTabel();
            BersihIsian();
            AutoId();
            JOptionPane.showMessageDialog(null, "Data Pembeli Dengan ID " + objPembeli.Idpembeli + " Telah Dihapus");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Proses penghapusan gagal/koneksi gagal");
            
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtIdpembeliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdpembeliKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()== KeyEvent.VK_ENTER){
            if((txtIdpembeli.getText().length() < 8)||(txtIdpembeli.getText().isEmpty())){
                JOptionPane.showMessageDialog(this, "Panjang ID harus 8 digit", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                txtIdpembeli.requestFocus();
            }else{
                txtNamapembeli.requestFocus();
            }
        }  
    }//GEN-LAST:event_txtIdpembeliKeyPressed

    private void txtNamapembeliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamapembeliKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(txtNamapembeli.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Nama masih kosong", "informasi", JOptionPane.INFORMATION_MESSAGE);
                txtNamapembeli.requestFocus();
            }else{
                txtNomorhp.requestFocus();
            }
        }
    }//GEN-LAST:event_txtNamapembeliKeyPressed

    private void txtNomorhpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomorhpKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(txtNomorhp.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Nama masih kosong", "informasi", JOptionPane.INFORMATION_MESSAGE);
                txtNomorhp.requestFocus();
            }else{
                txtNomorhp.requestFocus();
            }
        }
    }//GEN-LAST:event_txtNomorhpKeyPressed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        // TODO add your handling code here:
        int baris = jTable.getSelectedRow();
        
        String kolom1 = jTable.getValueAt(baris, 0).toString();
        String kolom2 = jTable.getValueAt(baris, 1).toString();
        String kolom3 = jTable.getValueAt(baris, 2).toString();
        
        txtIdpembeli.setText(kolom1);
        txtNamapembeli.setText(kolom2);
        txtNomorhp.setText(kolom3);
    }//GEN-LAST:event_jTableMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        Dimension posisi=Toolkit.getDefaultToolkit().getScreenSize();
        int x = (posisi.width-this.getWidth())/2;
        int y = (posisi.height-this.getHeight())/2;
        this.setLocation(x,y);
    }//GEN-LAST:event_formWindowActivated

    private void menuUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUserActionPerformed
        // TODO add your handling code here:
        frmUser user = new frmUser();
        dispose();
        user.show();
    }//GEN-LAST:event_menuUserActionPerformed

    private void menuKueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuKueActionPerformed
        // TODO add your handling code here:
        frmKue kue = new frmKue();
        dispose();
        kue.show();
    }//GEN-LAST:event_menuKueActionPerformed

    private void menuPembeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPembeliActionPerformed
        // TODO add your handling code here:
        frmPembeli pembeli = new frmPembeli();
        dispose();
        pembeli.show();
    }//GEN-LAST:event_menuPembeliActionPerformed

    private void menuTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTransaksiActionPerformed
        // TODO add your handling code here:
        frmTransaksi transaksi = new frmTransaksi();
        dispose();
        transaksi.show();
    }//GEN-LAST:event_menuTransaksiActionPerformed

    private void menuCetakReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCetakReportActionPerformed
        // TODO add your handling code here:
        frmCetakReport report = new frmCetakReport();
        dispose();
        report.show();
    }//GEN-LAST:event_menuCetakReportActionPerformed

    private void menuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoutActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Sampai Jumpa, Semoga Hari Anda Menyenangkan :)");
        frmLogin login = new frmLogin();
        dispose();
        login.show();
    }//GEN-LAST:event_menuLogoutActionPerformed

    public void BersihIsian(){
        txtIdpembeli.setText("");
        txtNamapembeli.setText("");
        txtNomorhp.setText("");
    }
    
    public void AturKolom(){
        jTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        column = jTable.getColumnModel().getColumn(0);
        column.setPreferredWidth(160);
        column = jTable.getColumnModel().getColumn(1);
        column.setPreferredWidth(160);
        column = jTable.getColumnModel().getColumn(2);
        column.setPreferredWidth(160);
    }
    
    public void IsiTabel(){
        DefaultTableModel tabelmapel = new DefaultTableModel();
        
        tabelmapel.addColumn("ID Pembeli");
        tabelmapel.addColumn("Nama Pembeli");
        tabelmapel.addColumn("Nomor HP");
        try{
            objPembeli.AksesData();
            objPembeli.TampilData();
            
            Statement stat1 = objPembeli.conn.createStatement();
            ResultSet res1 = stat1.executeQuery(objPembeli.sql);
            while (res1.next()){
                tabelmapel.addRow(new Object[]{res1.getString(1), res1.getString(2), res1.getString(3)});
            }
            jTable.setModel(tabelmapel);
            AturKolom();
        }catch (Exception e){
        }
    }
    
    public void SimpanData(){
        if(txtIdpembeli.getText().equals("")||txtNamapembeli.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Semua Data Harus Diisi!!!");
        }
        else{
            try{
                objPembeli.AksesData();
                objPembeli.Idpembeli = txtIdpembeli.getText();
                objPembeli.Namapembeli = txtNamapembeli.getText();
                objPembeli.Nomorhp = txtNomorhp.getText();
                
                objPembeli.Simpan();
                
                objPembeli.res.executeUpdate(objPembeli.sql);
                objPembeli.conn.close();
                BersihIsian();
                IsiTabel();
                JOptionPane.showMessageDialog(null, "Data Pembeli Dengan ID " + objPembeli.Idpembeli + " Berhasil Disimpan");
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
            java.util.logging.Logger.getLogger(frmPembeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPembeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPembeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPembeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPembeli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JMenuItem menuCetakReport;
    private javax.swing.JMenuItem menuKue;
    private javax.swing.JMenuItem menuLogout;
    private javax.swing.JMenuItem menuPembeli;
    private javax.swing.JMenuItem menuTransaksi;
    private javax.swing.JMenuItem menuUser;
    private javax.swing.JTextField txtIdpembeli;
    private javax.swing.JTextField txtNamapembeli;
    private javax.swing.JTextField txtNomorhp;
    // End of variables declaration//GEN-END:variables
}