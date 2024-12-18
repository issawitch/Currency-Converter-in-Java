/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import java.text.DecimalFormat;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class KonversiView extends javax.swing.JFrame {

    DefaultListModel modelList;
    private static final double KURS_DOLLAR_TO_RUPIAH = 14225.54, KURS_RINGGIT_TO_RUPIAH = 3403.96, 
            KURS_DOLLAR_TO_RINGGIT =  4.17, KURS_DOLLAR_TO_RIYAL = 3.75, KURS_RIYAL_TO_RUPIAH = 3787.36,
            KURS_RINGGIT_TO_RIYAL = 0.9;
    DecimalFormat df = new DecimalFormat ("0.00");
    /**
     * Creates new form KonversiView
     */
    public KonversiView() {
        initComponents();
        modelList = new DefaultListModel();
    }
    
    private void addElementList(double nominal, String mataUang) {
        modelList.addElement(df.format(nominal)+" - "+mataUang);
        listHistory.setModel(modelList);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        comboMataUang1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        comboMataUang2 = new javax.swing.JComboBox();
        RadioCetakYa = new javax.swing.JRadioButton();
        RadioCetakNo = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tombolKonversi = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listHistory = new javax.swing.JList();
        textNominal1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setMaximumSize(null);
        setMinimumSize(null);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("Konversi Mata Uang by 0012");
        jLabel1.setFocusable(false);

        comboMataUang1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        comboMataUang1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID Rupiah", "US Dollar", "MY Ringgit", "SA Riyal" }));
        comboMataUang1.setFocusable(false);
        comboMataUang1.setMaximumSize(null);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setText("Output Mata Uang");
        jLabel2.setFocusable(false);

        comboMataUang2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        comboMataUang2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID Rupiah", "US Dollar", "MY Ringgit", "SA Riyal" }));
        comboMataUang2.setFocusable(false);
        comboMataUang2.setMaximumSize(null);

        RadioCetakYa.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        RadioCetakYa.setText("Ya");
        RadioCetakYa.setFocusable(false);

        RadioCetakNo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        RadioCetakNo.setText("Tidak");
        RadioCetakNo.setFocusable(false);

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setText("Cetak");
        jLabel3.setFocusable(false);

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setText("History Konversi");
        jLabel4.setFocusable(false);

        tombolKonversi.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        tombolKonversi.setText("Konversi");
        tombolKonversi.setFocusable(false);
        tombolKonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolKonversiActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(listHistory);

        textNominal1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        textNominal1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textNominal1.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3)
                        .addGap(44, 44, 44)
                        .addComponent(RadioCetakYa)
                        .addGap(29, 29, 29)
                        .addComponent(RadioCetakNo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textNominal1))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboMataUang1, 0, 133, Short.MAX_VALUE)
                            .addComponent(comboMataUang2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(tombolKonversi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboMataUang1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(textNominal1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMataUang2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioCetakYa)
                    .addComponent(RadioCetakNo)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tombolKonversi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tombolKonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolKonversiActionPerformed
        // TODO add your handling code here:
        double nom1 = Double.parseDouble(textNominal1.getText());
        double hasilKonversi = 0.0;
        if (comboMataUang1.getSelectedIndex() == 0) {
            if (comboMataUang2.getSelectedIndex() == 1) {
                hasilKonversi = nom1/KURS_DOLLAR_TO_RUPIAH;
            } else if (comboMataUang2.getSelectedIndex() == 2) {
                hasilKonversi = nom1/KURS_RINGGIT_TO_RUPIAH;
            } else if (comboMataUang2.getSelectedIndex() == 3) {
                hasilKonversi = nom1/KURS_RIYAL_TO_RUPIAH;
            } else {
                hasilKonversi = nom1;
            }
        } else if (comboMataUang1.getSelectedIndex() == 1) {
            if (comboMataUang2.getSelectedIndex() == 0) {
                hasilKonversi = nom1 * KURS_DOLLAR_TO_RUPIAH;
            } else if (comboMataUang2.getSelectedIndex() == 2) {
                hasilKonversi = nom1 * KURS_DOLLAR_TO_RINGGIT;
            } else if (comboMataUang2.getSelectedIndex() == 3) {
                hasilKonversi = nom1 * KURS_DOLLAR_TO_RIYAL;
            }else {
                hasilKonversi = nom1; 
            }
        } else if (comboMataUang1.getSelectedIndex() == 2) {
            if (comboMataUang2.getSelectedIndex() == 0) {
                hasilKonversi = nom1 * KURS_RINGGIT_TO_RUPIAH;
            } else if (comboMataUang2.getSelectedIndex() == 1) {
                hasilKonversi = nom1 / KURS_DOLLAR_TO_RINGGIT;
            } else if (comboMataUang2.getSelectedIndex() == 3) {
                hasilKonversi = nom1 * KURS_RINGGIT_TO_RIYAL;
            } else {
                hasilKonversi = nom1; 
            }
        } else if (comboMataUang1.getSelectedIndex() == 3) {
            if (comboMataUang2.getSelectedIndex() == 0) {
                hasilKonversi = nom1 * KURS_RIYAL_TO_RUPIAH;
            } else if (comboMataUang2.getSelectedIndex() == 1) {
                hasilKonversi = nom1 / KURS_DOLLAR_TO_RIYAL;
            } else if (comboMataUang2.getSelectedIndex() == 2) {
                hasilKonversi = nom1 / KURS_RINGGIT_TO_RIYAL;
            } else {
                hasilKonversi = nom1; 
            }
        }
        String hasilMataUang = comboMataUang2.getSelectedItem().toString();
        addElementList(hasilKonversi, hasilMataUang);
        
        if (RadioCetakYa.isSelected()) {
            JOptionPane.showMessageDialog(this,
                    "Hasil Konversi : "+df.format(hasilKonversi) +" - "+hasilMataUang,
                    "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    
    }//GEN-LAST:event_tombolKonversiActionPerformed

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
            java.util.logging.Logger.getLogger(KonversiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonversiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonversiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonversiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioCetakNo;
    private javax.swing.JRadioButton RadioCetakYa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox comboMataUang1;
    private javax.swing.JComboBox comboMataUang2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listHistory;
    private javax.swing.JTextField textNominal1;
    private javax.swing.JButton tombolKonversi;
    // End of variables declaration//GEN-END:variables
}
