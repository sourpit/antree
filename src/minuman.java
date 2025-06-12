package projectkel3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC-R251-04
 */
public class minuman extends javax.swing.JFrame {

    /**
     * Creates new form
     */
    public minuman() {
        initComponents();
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        KosongForm();
        TampilData();
    }

    public void KosongForm() {
        jTextField1.setEditable(true);
        jTextField1.setText(null);
        jTextField2.setText(null);
        jComboBox1.setSelectedItem(this);
        jTextField3.setText(null);

    }

    public void TampilData() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("NAMA");
        model.addColumn("STATUS");
        model.addColumn("HARGA");

        try {

            String sql = "SELECT * FROM minuman";
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {
                model.addRow(new Object[]{
                    res.getString(1),
                    res.getString(2),
                    res.getString(3),
                    res.getString(4)});
            }
            jTable1.setModel(model);
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DETAIL MENU");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(230, 10, 130, 22);

        jButton2.setText("Simpan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(10, 200, 67, 23);

        jButton3.setText("Edit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(90, 200, 51, 23);

        jButton4.setText("Hapus");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(150, 200, 63, 23);

        jButton5.setText("Batal");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(230, 200, 57, 23);

        jButton6.setText("Keluar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(300, 200, 63, 23);

        jButton8.setText("TRANSAKSI");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(380, 200, 89, 23);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(10, 250, 534, 200);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Minuman");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 60, 80, 14);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama Minuman");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 90, 90, 14);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Status");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 120, 70, 14);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Harga");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 150, 70, 14);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(110, 150, 140, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "tersedia", "habis" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(110, 120, 87, 20);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(110, 90, 140, 20);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(110, 60, 140, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 511, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            String sql = "DELETE FROM minuman WHERE id_minuman='" + jTextField1.getText() + "'";

            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Hapus Data Berhasil");
            TampilData();
            KosongForm();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            String sql = "UPDATE minuman SET id_minuman='" + jTextField1.getText() + "',"
                    + "nama_minuman='" + jTextField2.getText() + "',"
                    + "status='" + jComboBox1.getSelectedItem() + "',"
                    + "harga='" + jTextField3.getText() + "' WHERE id_minuman='" + jTextField1.getText() + "'";

            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Update Data Berhasil");
            TampilData();
            KosongForm();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            String sql = "INSERT INTO minuman VALUES('" + jTextField1.getText() + "','"
                    + jTextField2.getText() + "','"
                    + jComboBox1.getSelectedItem() + "','"
                    + jTextField3.getText() + "')";

            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Simpan Data Baru Berhasil");
            TampilData();
            KosongForm();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        jTextField1.setEditable(false);

        int baris = jTable1.rowAtPoint(evt.getPoint());
        String id_minuman = jTable1.getValueAt(baris, 0).toString();
        jTextField1.setText(id_minuman);

        String nama_minuman = jTable1.getValueAt(baris, 1).toString();
        jTextField2.setText(nama_minuman);

        String status = jTable1.getValueAt(baris, 2).toString();
        jComboBox1.setSelectedItem(status);

        String harga = jTable1.getValueAt(baris, 3).toString();
        jTextField3.setText(harga);


    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        KosongForm();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        transaksi trans = new transaksi();
        trans.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(minuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(minuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(minuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(minuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new minuman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
