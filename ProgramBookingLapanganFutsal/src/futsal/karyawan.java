/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futsal;
import com.mysql.jdbc.Statement;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;

/**
 *
 * @author LENOVO
 */
public class karyawan extends javax.swing.JFrame {
private Connection conn = new koneksi().connect();
private DefaultTableModel tabmode;
private Statement stat;
private ResultSet res;
private String t;

protected void aktif (){
    nik.setEnabled(true);
    nama_karyawan.setEnabled(true);
    jabatan.setEnabled(true);
    alamat.setEnabled(true);
    no_telp.setEnabled(true);
    nik.requestFocus();
}

private void kosongkan()
{ 
nik.setText(""); 
nama_karyawan.setText("");
jabatan.getSelectedItem();
alamat.setText("");
no_telp.setText("");
nik.requestFocus();
 } 

private void datatable(){
        Object[] Baris = {"Nomor Induk","Nama Karyawan","Jabatan","Alamat","No Telp"};
        tabmode = new DefaultTableModel(null, Baris);
        tabel_karyawan.setModel(tabmode);
        String sql = "select * from karyawan";
        try{
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                String a = hasil.getString("nik");
                String b = hasil.getString("nama");
                String c = hasil.getString("jabatan");
                String d = hasil.getString("alamat");
                String e = hasil.getString("telp");
                
                String[] data ={a,b,c,d,e};
                tabmode.addRow(data);
            }
        } catch (Exception e) { 
            
    }
    }
    /**
     * Creates new form karyawan
     */
    public karyawan() {
        initComponents();
        datatable();
      
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nik = new javax.swing.JTextField();
        nama_karyawan = new javax.swing.JTextField();
        no_telp = new javax.swing.JTextField();
        btn_tmbh = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        alamat = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jabatan = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_karyawan = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Data Karyawan");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        jLabel2.setText("Nomor Induk");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel3.setText("Nama");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel4.setText("Jabatan");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 20));

        jLabel5.setText("Alamat");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, 20));

        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));
        jPanel1.add(nik, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 200, -1));
        jPanel1.add(nama_karyawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 200, -1));

        no_telp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_telpActionPerformed(evt);
            }
        });
        jPanel1.add(no_telp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 200, -1));

        btn_tmbh.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_tmbh.setText("SAVE");
        btn_tmbh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tmbhActionPerformed(evt);
            }
        });
        jPanel1.add(btn_tmbh, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 100, 40));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("CLEAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 280, 100, 40));

        btn_hapus.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_hapus.setText("DELETE");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        jPanel1.add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 280, 110, 40));

        btn_edit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_edit.setText("EDIT");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel1.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 100, 40));
        jPanel1.add(alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 200, -1));

        jLabel8.setText("No.Telp");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jabatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Jabatan-", "Karyawan", "Manajer" }));
        jPanel1.add(jabatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 200, -1));

        tabel_karyawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tabel_karyawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_karyawanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel_karyawan);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 550, 170));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 979, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(995, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        new menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void btn_tmbhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tmbhActionPerformed
        // TODO add your handling code here:
        String sql = "insert into karyawan values(?,?,?,?,?)";
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, nik.getText());
            stat.setString(2, nama_karyawan.getText());
            stat.setString(3, (String) jabatan.getSelectedItem());
            stat.setString(4, alamat.getText());
            stat.setString(5, no_telp.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data Berhasil Disimpan");
            kosongkan();
            nik.requestFocus();
            datatable();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan" +e);
        }
    }//GEN-LAST:event_btn_tmbhActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        kosongkan();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        int ok = JOptionPane.showConfirmDialog(null,"Hapus","Konfirmasi Dialog", JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0){
            String sql = "delete from karyawan where nik='"+nik.getText()+"'";
            try{
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil diHapus");
                kosongkan();
                nik.requestFocus();
                datatable();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Data Gagal di Hapus" +e);
            }
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "Update karyawan set nama=?,jabatan=?,alamat=?,telp=? where nik=?";
            PreparedStatement stat = conn.prepareStatement (sql);
            stat.setString(1, nama_karyawan.getText());
            stat.setString(2, (String) jabatan.getSelectedItem());
            stat.setString(3, alamat.getText());
            stat.setString(4, no_telp.getText());
            stat.setString(5, nik.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data Berhasil Diubah");
            kosongkan();
            nik.requestFocus();
            datatable();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah" +e);
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void tabel_karyawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_karyawanMouseClicked
        // TODO add your handling code here:
        int bar = tabel_karyawan.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        String d = tabmode.getValueAt(bar, 3).toString();
        String e = tabmode.getValueAt(bar, 4).toString();

        nik.setText(a);
        nama_karyawan.setText(b);
        jabatan.setSelectedItem(c);
        alamat.setText(d);
        no_telp.setText(e);
    }//GEN-LAST:event_tabel_karyawanMouseClicked

    private void no_telpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_telpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_no_telpActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new karyawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_tmbh;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jabatan;
    private javax.swing.JTextField nama_karyawan;
    private javax.swing.JTextField nik;
    private javax.swing.JTextField no_telp;
    private javax.swing.JTable tabel_karyawan;
    // End of variables declaration//GEN-END:variables
}
