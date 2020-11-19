/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import classes.Aluno;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.*;

/**
 *
 * @author JHONATHAN
 */
public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
        setLocationRelativeTo(null);
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
        jButton_Nome_ = new javax.swing.JButton();
        jButton_Sobrenome_ = new javax.swing.JButton();
        jButton_Enfase_Nome_ = new javax.swing.JButton();
        jButton_Curso_Nome_ = new javax.swing.JButton();
        jButton_Situacao_Nome_ = new javax.swing.JButton();
        jButton_Situacao_Curso_Nome_ = new javax.swing.JButton();
        jButton_Enfase_Curso_Nome_ = new javax.swing.JButton();
        jButton_Curso_Enfase_Nome_ = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableGridAlunos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Template Method Ordenação");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Listar por:");

        jButton_Nome_.setText("NOME");
        jButton_Nome_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Nome_ActionPerformed(evt);
            }
        });

        jButton_Sobrenome_.setText("SOBRENOME");
        jButton_Sobrenome_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Sobrenome_ActionPerformed(evt);
            }
        });

        jButton_Enfase_Nome_.setText("ENFASE - NOME");
        jButton_Enfase_Nome_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Enfase_Nome_ActionPerformed(evt);
            }
        });

        jButton_Curso_Nome_.setText("CURSO - NOME");
        jButton_Curso_Nome_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Curso_Nome_ActionPerformed(evt);
            }
        });

        jButton_Situacao_Nome_.setText("SITUAÇÃO - NOME");
        jButton_Situacao_Nome_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Situacao_Nome_ActionPerformed(evt);
            }
        });

        jButton_Situacao_Curso_Nome_.setText("SITUAÇÃO - CURSO - NOME");
        jButton_Situacao_Curso_Nome_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Situacao_Curso_Nome_ActionPerformed(evt);
            }
        });

        jButton_Enfase_Curso_Nome_.setText("ENFASE - CURSO - NOME");
        jButton_Enfase_Curso_Nome_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Enfase_Curso_Nome_ActionPerformed(evt);
            }
        });

        jButton_Curso_Enfase_Nome_.setText("CURSO - ENFASE - NOME");
        jButton_Curso_Enfase_Nome_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Curso_Enfase_Nome_ActionPerformed(evt);
            }
        });

        jTableGridAlunos.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTableGridAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME", "CURSO", "SITUAÇÃO", "ENFASE"
            }
        ));
        jTableGridAlunos.setRowHeight(30);
        jScrollPane1.setViewportView(jTableGridAlunos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton_Sobrenome_, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jButton_Situacao_Nome_, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(10, 10, 10)
                                            .addComponent(jButton_Situacao_Curso_Nome_, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jButton_Nome_, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton_Enfase_Curso_Nome_, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_Enfase_Nome_, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton_Curso_Enfase_Nome_, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_Curso_Nome_, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 968, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 99, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton_Enfase_Nome_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jButton_Sobrenome_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Nome_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Curso_Nome_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Situacao_Nome_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Situacao_Curso_Nome_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Enfase_Curso_Nome_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Curso_Enfase_Nome_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void imprimirNaGrid(ArrayList<Aluno> dados) {
        try {
            DefaultTableModel model = (DefaultTableModel) jTableGridAlunos.getModel();
            model.setNumRows(0);
            int pos = 1;
            while (pos < dados.size()) {
                String[] linha = new String[4];
                Aluno obj = dados.get(pos);
                linha[0] = obj.getNome();
                linha[1] = obj.getCurso();
                linha[2] = obj.getSituacao();
                linha[3] = obj.getEnfase();
                model.addRow(linha);
                pos++;
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }

    private void imprimirNaGridTratandoNome(ArrayList<Aluno> dados) {
        try {
            DefaultTableModel model = (DefaultTableModel) jTableGridAlunos.getModel();
            model.setNumRows(0);
            int pos = 1;
            while (pos < dados.size()) {
                String[] linha = new String[4];
                Aluno obj = dados.get(pos);

                String[] nome = obj.getNome().split(" ");
                String sobrenome = nome[nome.length - 1];

                if (sobrenome.equalsIgnoreCase("junior")
                        || sobrenome.equalsIgnoreCase("neto")
                        || sobrenome.equalsIgnoreCase("filho")) {
                    sobrenome = nome[nome.length - 2];
                }

                linha[0] = sobrenome.toUpperCase() + ", " + nome[0];
                linha[1] = obj.getCurso();
                linha[2] = obj.getSituacao();
                linha[3] = obj.getEnfase();
                model.addRow(linha);
                pos++;
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }
    
    private void jButton_Nome_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Nome_ActionPerformed
        try {
            String arquivo = "./src/dados/RelatorioDasEnfases.csv";
            Por_Nome objeto = new Por_Nome(arquivo);
            imprimirNaGrid(objeto.listagemDeAlunos());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }//GEN-LAST:event_jButton_Nome_ActionPerformed

    private void jButton_Sobrenome_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Sobrenome_ActionPerformed
        try {
            String arquivo = "./src/dados/RelatorioDasEnfases.csv";
            Por_Sobrenome objeto = new Por_Sobrenome(arquivo);
            imprimirNaGridTratandoNome(objeto.listagemDeAlunos());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }//GEN-LAST:event_jButton_Sobrenome_ActionPerformed

    private void jButton_Enfase_Nome_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Enfase_Nome_ActionPerformed
        try {
            String arquivo = "./src/dados/RelatorioDasEnfases.csv";
            Por_Enfase_Nome objeto = new Por_Enfase_Nome(arquivo);
            imprimirNaGrid(objeto.listagemDeAlunos());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }//GEN-LAST:event_jButton_Enfase_Nome_ActionPerformed

    private void jButton_Curso_Nome_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Curso_Nome_ActionPerformed
        try {
            String arquivo = "./src/dados/RelatorioDasEnfases.csv";
            Por_Curso_Nome objeto = new Por_Curso_Nome(arquivo);
            imprimirNaGrid(objeto.listagemDeAlunos());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }//GEN-LAST:event_jButton_Curso_Nome_ActionPerformed

    private void jButton_Situacao_Nome_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Situacao_Nome_ActionPerformed
        try {
            String arquivo = "./src/dados/RelatorioDasEnfases.csv";
            Por_Situacao_Nome objeto = new Por_Situacao_Nome(arquivo);
            imprimirNaGrid(objeto.listagemDeAlunos());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }//GEN-LAST:event_jButton_Situacao_Nome_ActionPerformed

    private void jButton_Situacao_Curso_Nome_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Situacao_Curso_Nome_ActionPerformed
        try {
            String arquivo = "./src/dados/RelatorioDasEnfases.csv";
            Por_Situacao_Curso_Nome objeto = new Por_Situacao_Curso_Nome(arquivo);
            imprimirNaGrid(objeto.listagemDeAlunos());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }//GEN-LAST:event_jButton_Situacao_Curso_Nome_ActionPerformed

    private void jButton_Enfase_Curso_Nome_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Enfase_Curso_Nome_ActionPerformed
        try {
            String arquivo = "./src/dados/RelatorioDasEnfases.csv";
            Por_Enfase_Curso_Nome objeto = new Por_Enfase_Curso_Nome(arquivo);
            imprimirNaGrid(objeto.listagemDeAlunos());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }//GEN-LAST:event_jButton_Enfase_Curso_Nome_ActionPerformed

    private void jButton_Curso_Enfase_Nome_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Curso_Enfase_Nome_ActionPerformed
        try {
            String arquivo = "./src/dados/RelatorioDasEnfases.csv";
            Por_Curso_Enfase_Nome objeto = new Por_Curso_Enfase_Nome(arquivo);
            imprimirNaGrid(objeto.listagemDeAlunos());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }//GEN-LAST:event_jButton_Curso_Enfase_Nome_ActionPerformed

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
    private javax.swing.JButton jButton_Curso_Enfase_Nome_;
    private javax.swing.JButton jButton_Curso_Nome_;
    private javax.swing.JButton jButton_Enfase_Curso_Nome_;
    private javax.swing.JButton jButton_Enfase_Nome_;
    private javax.swing.JButton jButton_Nome_;
    private javax.swing.JButton jButton_Situacao_Curso_Nome_;
    private javax.swing.JButton jButton_Situacao_Nome_;
    private javax.swing.JButton jButton_Sobrenome_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableGridAlunos;
    // End of variables declaration//GEN-END:variables
}