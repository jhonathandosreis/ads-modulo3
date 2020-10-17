/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import classes.Aviao;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author JHONATHAN
 */
public class Tela extends javax.swing.JFrame {

    Aviao aviao = Aviao.getINSTANCE(); //Chamada Singleton
    
    public Tela() {
        initComponents();     
        this.setLocationRelativeTo(rootPane);
        disableInterect();
        updateGrid();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPainel = new javax.swing.JPanel();
        jScrollPanePainel = new javax.swing.JScrollPane();
        jTableAcentos = new javax.swing.JTable();
        jPanelOperacional = new javax.swing.JPanel();
        jLabelVaga = new javax.swing.JLabel();
        jLabelCliente = new javax.swing.JLabel();
        jLabelCheckIn = new javax.swing.JLabel();
        jTextFieldAcentos = new javax.swing.JTextField();
        jTextFieldPassageiros = new javax.swing.JTextField();
        jTextFieldCheckIn = new javax.swing.JTextField();
        jButtonCheckIn = new javax.swing.JButton();
        jButtonCheckOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelPainel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Painel Acentos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 18))); // NOI18N

        jTableAcentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Acentos", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAcentos.setRowSelectionAllowed(false);
        jTableAcentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableAcentosMousePressed(evt);
            }
        });
        jScrollPanePainel.setViewportView(jTableAcentos);

        javax.swing.GroupLayout jPanelPainelLayout = new javax.swing.GroupLayout(jPanelPainel);
        jPanelPainel.setLayout(jPanelPainelLayout);
        jPanelPainelLayout.setHorizontalGroup(
            jPanelPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPanePainel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );
        jPanelPainelLayout.setVerticalGroup(
            jPanelPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPainelLayout.createSequentialGroup()
                .addComponent(jScrollPanePainel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelOperacional.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 18))); // NOI18N

        jLabelVaga.setText("Acentos");

        jLabelCliente.setText("Passageiro");

        jLabelCheckIn.setText("Check-in");

        jTextFieldAcentos.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jTextFieldPassageiros.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jTextFieldCheckIn.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jButtonCheckIn.setText("Check-in");
        jButtonCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckInActionPerformed(evt);
            }
        });

        jButtonCheckOut.setText("Check-out");
        jButtonCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelOperacionalLayout = new javax.swing.GroupLayout(jPanelOperacional);
        jPanelOperacional.setLayout(jPanelOperacionalLayout);
        jPanelOperacionalLayout.setHorizontalGroup(
            jPanelOperacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOperacionalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOperacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelOperacionalLayout.createSequentialGroup()
                        .addComponent(jLabelCheckIn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelOperacionalLayout.createSequentialGroup()
                        .addGroup(jPanelOperacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelVaga)
                            .addComponent(jLabelCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(jPanelOperacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPassageiros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAcentos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCheckIn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40))
            .addGroup(jPanelOperacionalLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButtonCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanelOperacionalLayout.setVerticalGroup(
            jPanelOperacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOperacionalLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanelOperacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCliente))
                .addGap(18, 18, 18)
                .addGroup(jPanelOperacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAcentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelVaga))
                .addGap(18, 18, 18)
                .addGroup(jPanelOperacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCheckIn)
                    .addComponent(jTextFieldCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanelOperacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelOperacional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelOperacional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelPainel.getAccessibleContext().setAccessibleName("Painel de Acentos");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void disableInterect() {
        try {
            jTextFieldAcentos.setEnabled(false);
            jTextFieldPassageiros.setEnabled(false);
            jTextFieldCheckIn.setEnabled(false);
            jButtonCheckIn.setEnabled(false);
            jButtonCheckOut.setEnabled(false);
//            jTextFieldPassageiros.setText("");
        } catch (Exception e) {
        }
    }
    
    public void updateViewSelectAcentos() {
        try {
            int idAcentos = Integer.parseInt(jTableAcentos.getValueAt(jTableAcentos.getSelectedRow(), 0).toString());
            for (int i = 0; i < aviao.getIdDoAcento().size(); i++) {
                Object[] obj = aviao.toString(i).split(";");
                if (idAcentos == Integer.parseInt(obj[0] + "")) {
                    jTextFieldAcentos.setText(obj[0] + "");
                    jTextFieldPassageiros.setText(obj[30] + "");
                    jTextFieldCheckIn.setText(obj[5] + "");
                    if (jTextFieldCheckIn.getText().equals("null")) {
                        jTextFieldCheckIn.setText("-");
                    }
                }
            }

        } catch (Exception e) {
        }
    }  
    
    public void updateGrid() {
        try {
            DefaultTableModel model = (DefaultTableModel) jTableAcentos.getModel();
            model.setNumRows(0);
            for (int i = 0; i < aviao.getIdDoAcento().size(); i++) {
                Object[] obj = aviao.toString(i).split(";");
                model.addRow(obj);
            }

        } catch (Exception e) {
        }
    }
    
    private void jTableAcentosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAcentosMousePressed

        try {
            updateViewSelectAcentos();
            String statusAcentoDisponivel = jTableAcentos.getValueAt(jTableAcentos.getSelectedRow(), 1).toString();
            if (statusAcentoDisponivel.equalsIgnoreCase("DISPONÍVEL")) {
                jTextFieldPassageiros.setEnabled(true);
                jButtonCheckIn.setEnabled(true);
                jButtonCheckOut.setEnabled(false);
            } 
            if (statusAcentoDisponivel.equalsIgnoreCase("OCUPADO")) {
                jButtonCheckOut.setEnabled(true);
                jButtonCheckIn.setEnabled(false);
                jTextFieldPassageiros.setEnabled(false);
            } else {
                jButtonCheckOut.setEnabled(false);
                jButtonCheckIn.setEnabled(true);
                jTextFieldPassageiros.setEnabled(true);
            } 

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jTableAcentosMousePressed

    private void jButtonCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckInActionPerformed
        try {
            int arrayList = Integer.parseInt(jTextFieldAcentos.getText()) - 1;
            aviao.setPassageiro(arrayList, jTextFieldPassageiros.getText());
            aviao.setStatus(arrayList, "OCUPADO");
            aviao.setCheckIn(arrayList, new Date());
            jTextFieldCheckIn.setText(new Date() + "");

            JOptionPane.showMessageDialog(rootPane, "CHECK-IN CONFIRMADO!"
                + "\n" + jTextFieldCheckIn.getText() 
                + "\nAcentos: " + jTextFieldAcentos.getText()
                + "\nPassageiro: " + jTextFieldPassageiros.getText());
            disableInterect();
            updateGrid();

        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButtonCheckInActionPerformed

    private void jButtonCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckOutActionPerformed
        try {
            int arrayList = Integer.parseInt(jTextFieldAcentos.getText()) - 1;

            JOptionPane.showMessageDialog(rootPane, "CHECK-OUT CONFIRMADO!"
                + "\n" + new Date()
                + "\nAcentos: " + jTextFieldAcentos.getText()
                + "\nPassageiros: " + jTextFieldPassageiros.getText());
            
            aviao.setPassageiro(arrayList, "");
            aviao.setStatus(arrayList, "DISPONÍVEL");
            aviao.setCheckIn(arrayList, null);
            jTextFieldCheckIn.setText("-");
            jTextFieldPassageiros.setText("");
            disableInterect();
            updateGrid();

        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButtonCheckOutActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCheckIn;
    private javax.swing.JButton jButtonCheckOut;
    private javax.swing.JLabel jLabelCheckIn;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelVaga;
    private javax.swing.JPanel jPanelOperacional;
    private javax.swing.JPanel jPanelPainel;
    private javax.swing.JScrollPane jScrollPanePainel;
    private javax.swing.JTable jTableAcentos;
    private javax.swing.JTextField jTextFieldAcentos;
    private javax.swing.JTextField jTextFieldCheckIn;
    private javax.swing.JTextField jTextFieldPassageiros;
    // End of variables declaration//GEN-END:variables
}
