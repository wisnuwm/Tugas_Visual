/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futsal;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author wisnu
 */
public class Booking extends javax.swing.JFrame {
private Connection conn = new koneksi().connect();
private DefaultTableModel tabmode;
private String tgl;
    /**
     * Creates new form Booking
     */
    public Booking() {
        initComponents();
        datatable();
    }

    private void datatable(){
        Object[] Baris = {"No Booking", "Nama Team","No Telp Team","Kode Petugas","Nama Petugas","Kode Lapangan","Nama Lapangan","Harga Perjam","Sewa","Total Harga","Tanggal Booking","Jam Masuk","Jam Keluar"};
        tabmode = new DefaultTableModel(null, Baris);
        tabel_transaksi.setModel(tabmode);
        String sql1 = "SELECT * FROM `book_lapangan`";
        try{
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql1);
            while(hasil.next()){
                String a = hasil.getString("no_book");
                String b = hasil.getString("nama_team");
                String c = hasil.getString("no_telp");
                String d = hasil.getString("kode_petugas");
                String e = hasil.getString("nama_petugas");
                String f = hasil.getString("kode_lapangan");
                String g = hasil.getString("nama_lapangan");
                String h = hasil.getString("harga_perjam");
                String i = hasil.getString("sewa");
                String j = hasil.getString("total_harga");
                String k = hasil.getString("tanggal_book");
                String l = hasil.getString("jam_masuk");
                String m = hasil.getString("jam_keluar");
                
                
                String[] data ={a,b,c,d,e,f,g,h,i,j,k,l,m};
                tabmode.addRow(data);
            }
            
            
        } catch (Exception e) { 
            JOptionPane.showMessageDialog(null,e);
    }
    }

private void aktif(){
        
        no_book.setEnabled(true);
        nama_team.setEnabled(true);
        no_telp.setEnabled(true);
        kode_petugas.setEnabled(true);
        nama_petugas.setEnabled(true);
        kode_lapangan.setEnabled(true);
        nama_lapangan.setEnabled(true);
        harga_perjam.setEnabled(true);
        sewa.setEnabled(true);
        total_harga.setEnabled(true);
        jam_masuk.setEnabled(true);
        jam_keluar.setEnabled(true);
        no_book.requestFocus();
    }

private void kosongkan()
{
        no_book.setText("");
        nama_team.setText(""); 
        no_telp.setText(""); 
        kode_petugas.setText("");
        nama_petugas.setText("");
        kode_lapangan.setText("");
        nama_lapangan.setText("");
        harga_perjam.setText("");
        sewa.setText("");
        total_harga.setText(""); 
        tanggal.setDateFormatString("");
        jam_masuk.setSelectedItem("");
        jam_keluar.setSelectedItem("");
        no_book.requestFocus();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        no_book = new javax.swing.JTextField();
        nama_team = new javax.swing.JTextField();
        kode_petugas = new javax.swing.JTextField();
        nama_petugas = new javax.swing.JTextField();
        kode_lapangan = new javax.swing.JTextField();
        nama_lapangan = new javax.swing.JTextField();
        harga_perjam = new javax.swing.JTextField();
        sewa = new javax.swing.JTextField();
        total_harga = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tanggal = new com.toedter.calendar.JDateChooser();
        cari_kode_petugas = new javax.swing.JButton();
        cari_kode_lapangan = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_transaksi = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        no_telp = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        print = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jam_masuk = new javax.swing.JComboBox<>();
        jam_keluar = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("BOOKING Lapangan Futsal");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setText("No Booking");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel3.setText("Nama Team");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel5.setText("Kode Lapangan");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        jLabel6.setText("Nama Lapangan");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        jLabel7.setText("Harga Perjam");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        jLabel8.setText("Total Harga");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));

        jLabel9.setText("Sewa");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        jLabel10.setText("Kode Petugas");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel11.setText("Nama Petugas");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));
        jPanel1.add(no_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 180, -1));
        jPanel1.add(nama_team, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 180, -1));
        jPanel1.add(kode_petugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 100, -1));

        nama_petugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_petugasActionPerformed(evt);
            }
        });
        jPanel1.add(nama_petugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 180, -1));
        jPanel1.add(kode_lapangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 100, -1));

        nama_lapangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_lapanganActionPerformed(evt);
            }
        });
        jPanel1.add(nama_lapangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 190, -1));
        jPanel1.add(harga_perjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 190, -1));

        sewa.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                sewaCaretUpdate(evt);
            }
        });
        jPanel1.add(sewa, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 90, -1));
        jPanel1.add(total_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 190, -1));

        jLabel12.setText("Tanggal Booking");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

        tanggal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tanggalPropertyChange(evt);
            }
        });
        jPanel1.add(tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 190, -1));

        cari_kode_petugas.setText("cari");
        cari_kode_petugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cari_kode_petugasActionPerformed(evt);
            }
        });
        jPanel1.add(cari_kode_petugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 60, -1));

        cari_kode_lapangan.setText("cari");
        cari_kode_lapangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cari_kode_lapanganActionPerformed(evt);
            }
        });
        jPanel1.add(cari_kode_lapangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 70, -1));

        jLabel13.setText("Jam Masuk");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        jLabel14.setText("Jam Keluar");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, -1, -1));

        tabel_transaksi.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel_transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_transaksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_transaksi);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 670, 230));

        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, -1));

        jLabel15.setText("No Telp Team");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));
        jPanel1.add(no_telp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 180, -1));

        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, 40));

        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jPanel1.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 60, 40));

        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, 40));

        hapus.setText("HAPUS");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        jPanel1.add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, -1, 40));

        print.setText("PRINT");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel1.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, 40));

        jLabel4.setText("Jam");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, -1, -1));

        jButton1.setText("Hitung");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 160, 70, -1));

        jam_masuk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "07.00", "08.00", "09.00", "10.00", "11.00", "12.00", "13.00", "14.00", "15.00", "16.00", "17.00" }));
        jPanel1.add(jam_masuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, -1, -1));

        jam_keluar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08.00", "09.00", "10.00", "11.00", "12.00", "13.00", "14.00", "15.00", "16.00", "17.00", "18.00", "19.00" }));
        jPanel1.add(jam_keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(714, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nama_petugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_petugasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_petugasActionPerformed

    private void nama_lapanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_lapanganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_lapanganActionPerformed

    private void cari_kode_petugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cari_kode_petugasActionPerformed
        // TODO add your handling code here:
        String sql = "select * from karyawan where nik ='"+kode_petugas.getText()+"'";
        try {
            java.sql.Statement stat= conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                String nmp = hasil.getString("nama");
                
                nama_petugas.setText(nmp);
                
                nama_petugas.setEnabled(false);
            }
        } catch (Exception e){
            
        }
    }//GEN-LAST:event_cari_kode_petugasActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        kosongkan();
    }//GEN-LAST:event_clearActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cari_kode_lapanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cari_kode_lapanganActionPerformed
        // TODO add your handling code here:
        String sql = "select * from lapangan where kode_lapangan='"+kode_lapangan.getText()+"'";
        try {
            java.sql.Statement stat= conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                String nm = hasil.getString("nama_lapangan");
                String hrg = hasil.getString("harga");
                
                nama_lapangan.setText(nm);
                harga_perjam.setText(hrg);
                
                nama_lapangan.setEnabled(false);
                harga_perjam.setEnabled(false);
            }
        } catch (Exception e){
            
        }
    }//GEN-LAST:event_cari_kode_lapanganActionPerformed

    private void sewaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_sewaCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_sewaCaretUpdate

    private void tanggalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tanggalPropertyChange
        // TODO add your handling code here:
        if(tanggal.getDate()!=null) {
            SimpleDateFormat format_tanggal = new SimpleDateFormat("yyyy-MM-dd");
            tgl= format_tanggal.format(tanggal.getDate());
        }
    }//GEN-LAST:event_tanggalPropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        double a;
        double b;
        double c;
        a = Double.parseDouble(harga_perjam.getText());
        b = Double.parseDouble(sewa.getText());
        c = a * b;
        total_harga.setText(String.valueOf(c));
        total_harga.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        String sql = "INSERT INTO `book_lapangan`(`no_book`, `nama_team`, `no_telp`, `kode_petugas`, `nama_petugas`, `kode_lapangan`, `nama_lapangan`, `harga_perjam`, `sewa`, `total_harga`, `tanggal_book`, `jam_masuk`, `jam_keluar`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement stat = conn.prepareStatement(sql);           
            stat.setString(1, no_book.getText());
            stat.setString(2, nama_team.getText());
            stat.setString(3, no_telp.getText());
            stat.setString(4, kode_petugas.getText());
            stat.setString(5, nama_petugas.getText());
            stat.setString(6, kode_lapangan.getText());
            stat.setString(7, nama_lapangan.getText());
            stat.setString(8, harga_perjam.getText());
            stat.setString(9, sewa.getText());
            stat.setString(10, total_harga.getText());
            stat.setString(11, tgl);
            stat.setString(12, (String) jam_masuk.getSelectedItem());
            stat.setString(13, (String) jam_keluar.getSelectedItem());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data Berhasil Disimpan");
            kosongkan();
            no_book.requestFocus();
            datatable();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan " +e);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "Update book_lapangan set nama_team=?,no_telp=?,kode_petugas=?,nama_petugas=?,kode_lapangan=?,nama_lapangan=?,harga_perjam=?,sewa=?,total_harga=?,tanggal_book=?,jam_masuk=?,jam_keluar=? where no_book=?";
            PreparedStatement stat = conn.prepareStatement (sql);
            stat.setString(1, nama_team.getText());
            stat.setString(2, no_telp.getText());
            stat.setString(3, kode_petugas.getText());
            stat.setString(4, nama_petugas.getText());
            stat.setString(5, kode_lapangan.getText());
            stat.setString(6, nama_lapangan.getText());
            stat.setString(7, harga_perjam.getText());
            stat.setString(8, sewa.getText());
            stat.setString(9, total_harga.getText());
            stat.setString(10, tanggal.getDateFormatString());
            stat.setString(11, (String) jam_masuk.getSelectedItem());
            stat.setString(12, (String) jam_keluar.getSelectedItem());
            stat.setString(13, no_book.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data Berhasil Diubah");
            kosongkan();
            no_book.requestFocus();
            datatable();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah" +e);
        }
    }//GEN-LAST:event_editActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        int ok = JOptionPane.showConfirmDialog(null,"Hapus","Konfirmasi Dialog", JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0){
            String sql = "delete from book_lapangan where no_book='"+no_book.getText()+"'";
            try{
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil diHapus");
                kosongkan();
                no_book.requestFocus();
                datatable();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Data Gagal di Hapus" +e);
            }
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void tabel_transaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_transaksiMouseClicked
        // TODO add your handling code here:
        int bar = tabel_transaksi.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        String d = tabmode.getValueAt(bar, 3).toString();
        String e = tabmode.getValueAt(bar, 4).toString();
        String f = tabmode.getValueAt(bar, 5).toString();
        String g = tabmode.getValueAt(bar, 6).toString();
        String h = tabmode.getValueAt(bar, 7).toString();
        String i = tabmode.getValueAt(bar, 8).toString();
        String j = tabmode.getValueAt(bar, 9).toString();
        String k = tabmode.getValueAt(bar, 10).toString();
        String l = tabmode.getValueAt(bar, 11).toString();
        String m = tabmode.getValueAt(bar, 12).toString();

        no_book.setText(a);
        nama_team.setText(b);
        no_telp.setText(c);
        kode_petugas.setText(d);
        nama_petugas.setText(e);
        kode_lapangan.setText(f);
        nama_lapangan.setText(g);
        harga_perjam.setText(h);
        sewa.setText(i);
        total_harga.setText(j);
        tanggal.setDateFormatString(k);
        jam_masuk.setSelectedItem(l);
        jam_keluar.setSelectedItem(m);
    }//GEN-LAST:event_tabel_transaksiMouseClicked

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
        try{
            String namaFile = "src/futsal/ReportBooking.jasper";
            Connection conn = new koneksi().connect();
            HashMap parameter = new HashMap();
            File report_file = new File (namaFile);
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(report_file.getPath());
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,parameter,conn);
            JasperViewer.viewReport(jasperPrint,false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        
            
        }
    }//GEN-LAST:event_printActionPerformed

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
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cari_kode_lapangan;
    private javax.swing.JButton cari_kode_petugas;
    private javax.swing.JButton clear;
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField harga_perjam;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jam_keluar;
    private javax.swing.JComboBox<String> jam_masuk;
    private javax.swing.JTextField kode_lapangan;
    private javax.swing.JTextField kode_petugas;
    private javax.swing.JTextField nama_lapangan;
    private javax.swing.JTextField nama_petugas;
    private javax.swing.JTextField nama_team;
    private javax.swing.JTextField no_book;
    private javax.swing.JTextField no_telp;
    private javax.swing.JButton print;
    private javax.swing.JButton save;
    private javax.swing.JTextField sewa;
    private javax.swing.JTable tabel_transaksi;
    private com.toedter.calendar.JDateChooser tanggal;
    private javax.swing.JTextField total_harga;
    // End of variables declaration//GEN-END:variables
}
