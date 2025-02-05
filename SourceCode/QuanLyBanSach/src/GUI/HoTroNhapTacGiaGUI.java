/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.TacGiaBUS;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import static GUI.MainFrameGUI.txHoLotTacGia;
import static GUI.MainFrameGUI.txTenTacGia;

/**
 *
 * @author Ha
 */
public class HoTroNhapTacGiaGUI extends javax.swing.JFrame {

    /**
     * Creates new form HoTroNhapTacGiaGUI
     */
    public HoTroNhapTacGiaGUI() {
        initComponents();
        
        try {
            TacGiaBUS tacGiaBus = new TacGiaBUS();
            
            tacGiaBus.docDuLieuTacGia();
            tbTacGia.setModel(tacGiaBus.hienThiTacGia());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        lbSachDaNhap6 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbTacGia = new javax.swing.JTable(){
            public boolean isCellEditable(int row,int column) {
                return false;
            }
        };
        btnTimkiem6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel7.setBackground(new java.awt.Color(102, 102, 255));

        lbSachDaNhap6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbSachDaNhap6.setForeground(new java.awt.Color(255, 255, 255));
        lbSachDaNhap6.setText("Tác giả");

        tbTacGia.getTableHeader().setFont(new Font("Arial",Font.PLAIN,14));
        tbTacGia.setBackground(new java.awt.Color(204, 204, 255));
        tbTacGia.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tbTacGia.setForeground(new java.awt.Color(51, 0, 51));
        tbTacGia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã tác giả", "Họ lót tác giả", "Tên tác giả"
            }
        ));
        tbTacGia.setSelectionBackground(new java.awt.Color(102, 102, 255));
        tbTacGia.setShowHorizontalLines(true);
        tbTacGia.setShowVerticalLines(true);
        tbTacGia.getTableHeader().setReorderingAllowed(false);
        tbTacGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTacGiaMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tbTacGia);

        btnTimkiem6.setBackground(new java.awt.Color(204, 204, 255));
        btnTimkiem6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnTimkiem6.setForeground(new java.awt.Color(0, 0, 0));
        btnTimkiem6.setText("Chọn");
        btnTimkiem6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimkiem6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTimkiem6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(lbSachDaNhap6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbSachDaNhap6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTimkiem6)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbTacGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTacGiaMouseClicked

    }//GEN-LAST:event_tbTacGiaMouseClicked

    private void btnTimkiem6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimkiem6MouseClicked
        int row = tbTacGia.getSelectedRow();
        
        if (row >= 0) {
            txHoLotTacGia.setText((String) tbTacGia.getModel().getValueAt(row, 1));
            txTenTacGia.setText((String) tbTacGia.getModel().getValueAt(row, 2));
            
            dispose();
            
        } else
            JOptionPane.showMessageDialog(null, "Bạn hãy chọn 1 dòng trước");
    }//GEN-LAST:event_btnTimkiem6MouseClicked

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
            java.util.logging.Logger.getLogger(HoTroNhapTacGiaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoTroNhapTacGiaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoTroNhapTacGiaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoTroNhapTacGiaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HoTroNhapTacGiaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTimkiem6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel lbSachDaNhap6;
    private javax.swing.JTable tbTacGia;
    // End of variables declaration//GEN-END:variables
}
