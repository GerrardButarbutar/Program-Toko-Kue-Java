import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.Date;
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
public class frmTransaksi extends javax.swing.JFrame {
    clsTransaksi objTransaksi = new clsTransaksi();
    private TableColumn column;
    
    /**
     * Creates new form frmTransaksi
     */
    public frmTransaksi() {
        initComponents();
        objTransaksi.AksesData();
        IsiTabel();
        IsiTabelKue();
        IsicboPembeli();
        IsicboKue();
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        menuUser = new javax.swing.JMenuItem();
        menuKue = new javax.swing.JMenuItem();
        menuPembeli = new javax.swing.JMenuItem();
        menuTransaksi = new javax.swing.JMenuItem();
        menuReport = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuLogout = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdtransaksi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jxTgltransaksi = new org.jdesktop.swingx.JXDatePicker();
        jLabel4 = new javax.swing.JLabel();
        cboPembeli = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cboKue = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtJumlah = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        menuUser2 = new javax.swing.JMenuItem();
        menuKue2 = new javax.swing.JMenuItem();
        menuPembeli2 = new javax.swing.JMenuItem();
        menuTransaksi2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuCetakReport = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        menuLogout2 = new javax.swing.JMenuItem();

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

        menuReport.setText("Report");
        jMenu1.add(menuReport);

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel1.setText("Toko Kue");

        jLabel2.setText("ID Transaksi");

        txtIdtransaksi.setEnabled(false);
        txtIdtransaksi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdtransaksiKeyPressed(evt);
            }
        });

        jLabel3.setText("Tanggal Transaksi");

        jLabel4.setText("Pembeli");

        cboPembeli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Kue");

        cboKue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Jumlah");

        txtJumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtJumlahKeyPressed(evt);
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

        jLabel7.setText("?? Gerrard Butarbutar - 2021/2022");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.setEnabled(false);
        jScrollPane2.setViewportView(jTable2);

        jLabel8.setText("Data Transaksi");

        jLabel10.setText("Data Kue");

        jMenu7.setText("File");

        jMenu8.setText("Master");

        menuUser2.setText("User");
        menuUser2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUser2ActionPerformed(evt);
            }
        });
        jMenu8.add(menuUser2);

        menuKue2.setText("Kue");
        menuKue2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuKue2ActionPerformed(evt);
            }
        });
        jMenu8.add(menuKue2);

        menuPembeli2.setText("Pembeli");
        menuPembeli2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPembeli2ActionPerformed(evt);
            }
        });
        jMenu8.add(menuPembeli2);

        jMenu7.add(jMenu8);

        menuTransaksi2.setText("Transaksi");
        menuTransaksi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTransaksi2ActionPerformed(evt);
            }
        });
        jMenu7.add(menuTransaksi2);

        jMenu4.setText("Report");

        menuCetakReport.setText("Cetak Report");
        menuCetakReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCetakReportActionPerformed(evt);
            }
        });
        jMenu4.add(menuCetakReport);

        jMenu7.add(jMenu4);

        jMenuBar3.add(jMenu7);

        jMenu9.setText("Log Out");

        menuLogout2.setText("Log Out");
        menuLogout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogout2ActionPerformed(evt);
            }
        });
        jMenu9.add(menuLogout2);

        jMenuBar3.add(jMenu9);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(txtIdtransaksi)
                            .addComponent(jLabel3)
                            .addComponent(jxTgltransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(cboPembeli, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboKue, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtJumlah))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(221, 221, 221)
                                .addComponent(jLabel10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(312, 312, 312)
                            .addComponent(jLabel8)
                            .addGap(312, 312, 312))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNew)
                    .addComponent(btnSave)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete)
                    .addComponent(btnMenu))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(386, 386, 386))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(txtIdtransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jxTgltransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboPembeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboKue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMenu))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void AutoId(){
        try{
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtokokue","root","");
            Statement stat = koneksi.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM tbltransaksi order by id_transaksi desc");
            if (rs.next()){
                String kode = rs.getString("id_transaksi").substring(1);
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
                
                txtIdtransaksi.setText("T" + Nol + AN);
            }else{
               txtIdtransaksi.setText("T001"); 
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void BersihIsian(){
        txtIdtransaksi.setText("");
        jxTgltransaksi.setDate(null);
        txtJumlah.setText("");
        IsicboPembeli();
        IsicboKue();
    }
    
    public void IsicboPembeli(){
        try{
            cboPembeli.removeAllItems();
            objTransaksi.AksesData();
            String sql1 = "select concat(id_pembeli, ' - ', nama_pembeli) as pembeli from tblpembeli";
            Statement stat1 = objTransaksi.conn.createStatement();
            ResultSet res1=stat1.executeQuery(sql1);
            cboPembeli.addItem("Pilih Pembeli");
            while(res1.next()){
                cboPembeli.addItem(res1.getString("pembeli"));
            }
        }
        catch(Exception e){
        }
    }
    
    public void IsicboKue(){
        try{
            cboKue.removeAllItems();
            objTransaksi.AksesData();
            String sql1 = "select id_kue from tblkue";
            Statement stat1 = objTransaksi.conn.createStatement();
            ResultSet res1=stat1.executeQuery(sql1);
            cboKue.addItem("Pilih Kue");
            while(res1.next()){
                cboKue.addItem(res1.getString("id_kue"));
            }
        }
        catch(Exception e){
        }
    }
    
    public void AturKolom(){
        jTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        column = jTable.getColumnModel().getColumn(0);
        column.setPreferredWidth(87);
        column = jTable.getColumnModel().getColumn(1);
        column.setPreferredWidth(87);
        column = jTable.getColumnModel().getColumn(2);
        column.setPreferredWidth(135);
        column = jTable.getColumnModel().getColumn(3);
        column.setPreferredWidth(55);
        column = jTable.getColumnModel().getColumn(4);
        column.setPreferredWidth(135);
        column = jTable.getColumnModel().getColumn(5);
        column.setPreferredWidth(55);
        column = jTable.getColumnModel().getColumn(6);
        column.setPreferredWidth(55);
        column = jTable.getColumnModel().getColumn(7);
        column.setPreferredWidth(87);
    }
    
    public void AturKolomKue(){
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        column = jTable2.getColumnModel().getColumn(0);
        column.setPreferredWidth(150);
        column = jTable2.getColumnModel().getColumn(1);
        column.setPreferredWidth(150);
        column = jTable2.getColumnModel().getColumn(2);
        column.setPreferredWidth(150);
    }
    
    public void IsiTabel(){
        DefaultTableModel tabeltransaksi = new DefaultTableModel();
        
        tabeltransaksi.addColumn("ID Transaksi");
        tabeltransaksi.addColumn("Tanggal");
        tabeltransaksi.addColumn("Pembeli");
        tabeltransaksi.addColumn("ID Kue");
        tabeltransaksi.addColumn("Nama Kue");
        tabeltransaksi.addColumn("Harga");
        tabeltransaksi.addColumn("Jumlah");
        tabeltransaksi.addColumn("Total Harga");
        try{
            objTransaksi.AksesData();
            objTransaksi.TampilData();
            
            Statement stat1 = objTransaksi.conn.createStatement();
            ResultSet res1 = stat1.executeQuery(objTransaksi.sql);
            while (res1.next()){
                tabeltransaksi.addRow(new Object[]{res1.getString(1), res1.getDate(2), res1.getString(3), res1.getString(4), res1.getString(5), res1.getString(6), res1.getString(7), res1.getString(8)});
            }
            jTable.setModel(tabeltransaksi);
            AturKolom();
        }catch (Exception e){
        }
    }
    
    public void IsiTabelKue(){
        DefaultTableModel tabelkue = new DefaultTableModel();
        
        tabelkue.addColumn("ID Kue");
        tabelkue.addColumn("Nama Kue");
        tabelkue.addColumn("Harga");
        try{
            objTransaksi.AksesData();
            objTransaksi.TampilDataKue();
            
            Statement stat1 = objTransaksi.conn.createStatement();
            ResultSet res1 = stat1.executeQuery(objTransaksi.sql);
            while (res1.next()){
                tabelkue.addRow(new Object[]{res1.getString(1), res1.getString(2), res1.getString(3)});
            }
            jTable2.setModel(tabelkue);
            AturKolom();
        }catch (Exception e){
        }
    }
    
    public void SimpanData(){
        if(txtIdtransaksi.getText().equals("")||txtJumlah.getText().equals("")||cboPembeli.getSelectedItem().equals("")||cboKue.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null, "Semua Data Harus Diisi!!!");
        }
        else{
            try{
                objTransaksi.AksesData();
                objTransaksi.Idtransaksi = txtIdtransaksi.getText();
                objTransaksi.Tgltransaksi =new java.sql.Date(jxTgltransaksi.getDate().getTime());
                objTransaksi.Pembeli = cboPembeli.getSelectedItem().toString();
                objTransaksi.Kue = cboKue.getSelectedItem().toString();
                objTransaksi.Jumlah = txtJumlah.getText();
                
                objTransaksi.Simpan();
                
                objTransaksi.res.executeUpdate(objTransaksi.sql);
                objTransaksi.conn.close();
                BersihIsian();
                IsiTabel();
                JOptionPane.showMessageDialog(null, "Data Transaksi Dengan ID " + objTransaksi.Idtransaksi + " Berhasil Disimpan");
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Proses penyimpanan gagal/koneksi gagal");
                System.out.println(e.getMessage());
           }
        }
    }
    
    
    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        frmMenu menu = new frmMenu();
        dispose();
        menu.show();
    }//GEN-LAST:event_btnMenuActionPerformed

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

    private void menuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoutActionPerformed
        // TODO add your handling code here:
        frmLogin login = new frmLogin();
        dispose();
        login.show();
    }//GEN-LAST:event_menuLogoutActionPerformed

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

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        if(txtIdtransaksi.getText().equals("")||txtJumlah.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Masukkan ID Transaksi");
        }
        else{
            try{
                objTransaksi.AksesData();
                objTransaksi.Idtransaksi = txtIdtransaksi.getText();
                objTransaksi.Tgltransaksi = new java.sql.Date(jxTgltransaksi.getDate().getTime());
                objTransaksi.Pembeli = cboPembeli.getSelectedItem().toString();
                objTransaksi.Kue = cboKue.getSelectedItem().toString();
                objTransaksi.Jumlah = txtJumlah.getText();
                
                objTransaksi.Edit();
                objTransaksi.res.executeUpdate(objTransaksi.sql);
                objTransaksi.conn.close();
                BersihIsian();
                IsiTabel();
                AutoId();
                JOptionPane.showMessageDialog(null, "Data Transaksi Dengan ID " + objTransaksi.Idtransaksi + " Berhasil Diupdate");
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Proses penyimpanan gagal/koneksi gagal");
                
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try{
            objTransaksi.AksesData();
            objTransaksi.Idtransaksi = txtIdtransaksi.getText();
            objTransaksi.Hapus();
            objTransaksi.res.executeUpdate(objTransaksi.sql);
            objTransaksi.conn.close();
            IsiTabel();
            BersihIsian();
            AutoId();
            JOptionPane.showMessageDialog(null, "Data Transaksi Dengan ID " + objTransaksi.Idtransaksi + " Telah Dihapus");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Proses penghapusan gagal/koneksi gagal");
            
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        // TODO add your handling code here:
        int baris = jTable.getSelectedRow();
        
        String kolom1 = jTable.getValueAt(baris, 0).toString();
        Date kolom2 = (Date) jTable.getValueAt(baris, 1);
        String kolom3 = jTable.getValueAt(baris, 2).toString();
        String kolom4 = jTable.getValueAt(baris, 3).toString();
        String kolom5 = jTable.getValueAt(baris, 6).toString();

        txtIdtransaksi.setText(kolom1);
        jxTgltransaksi.setDate(kolom2);
        cboPembeli.setSelectedItem(kolom3);
        cboKue.setSelectedItem(kolom4);
        txtJumlah.setText(kolom5);
    }//GEN-LAST:event_jTableMouseClicked

    private void txtIdtransaksiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdtransaksiKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()== KeyEvent.VK_ENTER){
            if((txtIdtransaksi.getText().length() < 8)||(txtIdtransaksi.getText().isEmpty())){
                JOptionPane.showMessageDialog(this, "Panjang ID harus 8 digit", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                txtIdtransaksi.requestFocus();
            }else{
                jxTgltransaksi.requestFocus();
            }
        } 
    }//GEN-LAST:event_txtIdtransaksiKeyPressed

    private void txtJumlahKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJumlahKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(txtJumlah.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Jumlah masih kosong", "informasi", JOptionPane.INFORMATION_MESSAGE);
                txtJumlah.requestFocus();
            }else{
                btnSave.requestFocus();
            }
        }
    }//GEN-LAST:event_txtJumlahKeyPressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        Dimension posisi=Toolkit.getDefaultToolkit().getScreenSize();
        int x = (posisi.width-this.getWidth())/2;
        int y = (posisi.height-this.getHeight())/2;
        this.setLocation(x,y);
    }//GEN-LAST:event_formWindowActivated

    private void menuUser2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUser2ActionPerformed
        // TODO add your handling code here:
        frmUser user = new frmUser();
        dispose();
        user.show();
    }//GEN-LAST:event_menuUser2ActionPerformed

    private void menuKue2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuKue2ActionPerformed
        // TODO add your handling code here:
        frmKue kue = new frmKue();
        dispose();
        kue.show();
    }//GEN-LAST:event_menuKue2ActionPerformed

    private void menuPembeli2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPembeli2ActionPerformed
        // TODO add your handling code here:
        frmPembeli pembeli = new frmPembeli();
        dispose();
        pembeli.show();
    }//GEN-LAST:event_menuPembeli2ActionPerformed

    private void menuTransaksi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTransaksi2ActionPerformed
        // TODO add your handling code here:
        frmTransaksi transaksi = new frmTransaksi();
        dispose();
        transaksi.show();
    }//GEN-LAST:event_menuTransaksi2ActionPerformed

    private void menuCetakReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCetakReportActionPerformed
        // TODO add your handling code here:
        frmCetakReport report = new frmCetakReport();
        dispose();
        report.show();
    }//GEN-LAST:event_menuCetakReportActionPerformed

    private void menuLogout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogout2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Sampai Jumpa, Semoga Hari Anda Menyenangkan :)");
        frmLogin login = new frmLogin();
        dispose();
        login.show();
    }//GEN-LAST:event_menuLogout2ActionPerformed

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
            java.util.logging.Logger.getLogger(frmTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cboKue;
    private javax.swing.JComboBox<String> cboPembeli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable2;
    private org.jdesktop.swingx.JXDatePicker jxTgltransaksi;
    private javax.swing.JMenuItem menuCetakReport;
    private javax.swing.JMenuItem menuKue;
    private javax.swing.JMenuItem menuKue2;
    private javax.swing.JMenuItem menuLogout;
    private javax.swing.JMenuItem menuLogout2;
    private javax.swing.JMenuItem menuPembeli;
    private javax.swing.JMenuItem menuPembeli2;
    private javax.swing.JMenuItem menuReport;
    private javax.swing.JMenuItem menuTransaksi;
    private javax.swing.JMenuItem menuTransaksi2;
    private javax.swing.JMenuItem menuUser;
    private javax.swing.JMenuItem menuUser2;
    private javax.swing.JTextField txtIdtransaksi;
    private javax.swing.JTextField txtJumlah;
    // End of variables declaration//GEN-END:variables
}