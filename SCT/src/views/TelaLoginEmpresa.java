/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import model.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;



/**
 *
 * @author Maresia-
 */
public class TelaLoginEmpresa extends javax.swing.JFrame {

    Connection conexao = null;      
    PreparedStatement pst = null;  
    ResultSet rs = null;
    
    
    public TelaLoginEmpresa() {
        initComponents();
        conexao = Conexao.conector(); 
        
    }
    
    //////////PARTE Termo de Uso ////////////////////////////////////////
public void setColorBtn(JPanel panel){

    panel.setBackground(new java.awt.Color(0,102,102));
}

public void resetColorBtn(JPanel panel){
 
    panel.setBackground(new java.awt.Color(19,19,70));

}
/////////////////////////////////////////////////////////////////////  
    










  
   
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label_Empresa = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ftCep = new javax.swing.JFormattedTextField();
        label_CEP = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        label_CNPJ = new javax.swing.JLabel();
        ftCNPJ = new javax.swing.JFormattedTextField();
        jSeparator3 = new javax.swing.JSeparator();
        label_Senha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label_Cadastrar1 = new javax.swing.JLabel();
        label_Cadastrar2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Panel_Cadastrar = new javax.swing.JPanel();
        label_Cadastrar7 = new javax.swing.JLabel();
        Painel_Entrar = new javax.swing.JPanel();
        label_Cadastrar8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(19, 19, 70));

        label_Empresa.setBackground(new java.awt.Color(240, 255, 255));
        label_Empresa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_Empresa.setForeground(new java.awt.Color(240, 255, 255));
        label_Empresa.setText("LOGIN EMPRESA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(label_Empresa)
                .addContainerGap(676, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(label_Empresa)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 80));

        jPanel2.setBackground(new java.awt.Color(240, 255, 255));

        ftCep.setBackground(new java.awt.Color(240, 255, 255));
        ftCep.setBorder(null);
        try {
            ftCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftCep.setToolTipText("CEP");

        label_CEP.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        label_CEP.setText("CEP");

        jPanel3.setBackground(new java.awt.Color(240, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 19, 70), 8));

        label_CNPJ.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_CNPJ.setText("CNPJ");

        ftCNPJ.setBackground(new java.awt.Color(240, 255, 255));
        ftCNPJ.setBorder(null);
        try {
            ftCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftCNPJ.setToolTipText("CNPJ");

        jSeparator3.setBackground(new java.awt.Color(19, 19, 70));
        jSeparator3.setForeground(new java.awt.Color(19, 19, 70));
        jSeparator3.setOpaque(true);

        label_Senha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_Senha.setText("SENHA");

        txtSenha.setBackground(new java.awt.Color(240, 255, 255));
        txtSenha.setToolTipText("SENHA");
        txtSenha.setBorder(null);

        jSeparator11.setBackground(new java.awt.Color(19, 19, 70));
        jSeparator11.setForeground(new java.awt.Color(19, 19, 70));
        jSeparator11.setOpaque(true);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-diploma-2-40.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-setas-horizontais-de-classificação-35.png"))); // NOI18N

        label_Cadastrar1.setBackground(new java.awt.Color(19, 19, 70));
        label_Cadastrar1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_Cadastrar1.setForeground(new java.awt.Color(19, 19, 70));
        label_Cadastrar1.setText("SISTEMA DE CONTRATO ");

        label_Cadastrar2.setBackground(new java.awt.Color(19, 19, 70));
        label_Cadastrar2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_Cadastrar2.setForeground(new java.awt.Color(19, 19, 70));
        label_Cadastrar2.setText("TEMPORÁRIO");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-usuário-de-gênero-neutro-50.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_Cadastrar1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(label_Cadastrar2)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_CNPJ)
                    .addComponent(ftCNPJ)
                    .addComponent(jSeparator3)
                    .addComponent(label_Senha)
                    .addComponent(jSeparator11)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(label_CNPJ)
                        .addGap(10, 10, 10)
                        .addComponent(ftCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(label_Senha)
                        .addGap(5, 5, 5)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(label_Cadastrar1)
                        .addGap(10, 10, 10)
                        .addComponent(label_Cadastrar2)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        Panel_Cadastrar.setBackground(new java.awt.Color(19, 19, 70));
        Panel_Cadastrar.setToolTipText("CADASTRAR");
        Panel_Cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_Cadastrar.setPreferredSize(new java.awt.Dimension(95, 44));
        Panel_Cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_CadastrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_CadastrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_CadastrarMouseExited(evt);
            }
        });

        label_Cadastrar7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        label_Cadastrar7.setForeground(new java.awt.Color(240, 255, 255));
        label_Cadastrar7.setText("CADASTRAR");

        javax.swing.GroupLayout Panel_CadastrarLayout = new javax.swing.GroupLayout(Panel_Cadastrar);
        Panel_Cadastrar.setLayout(Panel_CadastrarLayout);
        Panel_CadastrarLayout.setHorizontalGroup(
            Panel_CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
            .addGroup(Panel_CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_CadastrarLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_Cadastrar7)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        Panel_CadastrarLayout.setVerticalGroup(
            Panel_CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
            .addGroup(Panel_CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_CadastrarLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_Cadastrar7)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        Painel_Entrar.setBackground(new java.awt.Color(19, 19, 70));
        Painel_Entrar.setToolTipText("ENTRAR");
        Painel_Entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Painel_Entrar.setPreferredSize(new java.awt.Dimension(95, 44));
        Painel_Entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Painel_EntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Painel_EntrarMouseExited(evt);
            }
        });

        label_Cadastrar8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        label_Cadastrar8.setForeground(new java.awt.Color(240, 255, 255));
        label_Cadastrar8.setText("ENTRAR");

        javax.swing.GroupLayout Painel_EntrarLayout = new javax.swing.GroupLayout(Painel_Entrar);
        Painel_Entrar.setLayout(Painel_EntrarLayout);
        Painel_EntrarLayout.setHorizontalGroup(
            Painel_EntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
            .addGroup(Painel_EntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_EntrarLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_Cadastrar8)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        Painel_EntrarLayout.setVerticalGroup(
            Painel_EntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
            .addGroup(Painel_EntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_EntrarLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_Cadastrar8)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-voltar-30.png"))); // NOI18N
        jLabel1.setToolTipText("VOLTAR");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Panel_Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(362, 362, 362)
                                .addComponent(Painel_Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(580, 580, 580)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_CEP)
                            .addComponent(ftCep, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(label_CEP))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(ftCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(287, 287, 287))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Painel_Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(207, 207, 207))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 74, 870, 650));

        setSize(new java.awt.Dimension(855, 599));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Panel_CadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_CadastrarMouseClicked
        TelaCadastroEmpresa telaCadastroEmpresa = new TelaCadastroEmpresa();
        telaCadastroEmpresa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Panel_CadastrarMouseClicked

    private void Panel_CadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_CadastrarMouseEntered
      setColorBtn(Panel_Cadastrar);  
    }//GEN-LAST:event_Panel_CadastrarMouseEntered

    private void Panel_CadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_CadastrarMouseExited
      resetColorBtn(Panel_Cadastrar); 
    }//GEN-LAST:event_Panel_CadastrarMouseExited

    private void Painel_EntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Painel_EntrarMouseEntered
      setColorBtn(Painel_Entrar); 
    }//GEN-LAST:event_Painel_EntrarMouseEntered

    private void Painel_EntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Painel_EntrarMouseExited
       resetColorBtn(Painel_Entrar); 
    }//GEN-LAST:event_Painel_EntrarMouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
      TelaInicial telaInicial = new TelaInicial();
      telaInicial.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(TelaLoginEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLoginEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLoginEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLoginEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new TelaLoginEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Painel_Entrar;
    private javax.swing.JPanel Panel_Cadastrar;
    private javax.swing.JFormattedTextField ftCNPJ;
    private javax.swing.JFormattedTextField ftCep;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel label_CEP;
    private javax.swing.JLabel label_CNPJ;
    private javax.swing.JLabel label_Cadastrar1;
    private javax.swing.JLabel label_Cadastrar2;
    private javax.swing.JLabel label_Cadastrar7;
    private javax.swing.JLabel label_Cadastrar8;
    private javax.swing.JLabel label_Empresa;
    private javax.swing.JLabel label_Senha;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
