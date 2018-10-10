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

/**
 *
 * @author Maresia-
 */
public class TelaInicial extends javax.swing.JFrame {

    Connection conexao = null;      
    PreparedStatement pst = null;  
    ResultSet rs = null;    
    
    public TelaInicial() {
        initComponents();
        conexao = Conexao.conector(); 
    }
    
    /*
     public void logar() {
        String sql = "SELECT * FROM administrador WHERE login = ?  and senha = ?";
        
        try {
            
            pst = conexao.prepareStatement(sql);
            pst.setString(1,txtUsuario.getText());
            pst.setString(2,new String (txtSenha.getPassword()));
           
            
            rs = pst.executeQuery();
            
            
            if (rs.next()){
                
                teste menu = new teste();
                menu.setVisible(true);
                this.dispose();
                conexao.close();
                
            }else{
                JOptionPane.showMessageDialog(null,"Usuário ou Senha inválido ");
            }
            
        } catch (Exception e) {
        
            JOptionPane.showMessageDialog(null, e);
            
        }
        
    } 
    
    */
    
////// PARTE EMPRESA ////////////////////////////////////////////////
public void setColorEmpresa(JPanel panel){

    panel.setBackground(new java.awt.Color(204,204,255));
}

public void resetColorEmpresa(JPanel panel){
 
    panel.setBackground(new java.awt.Color(240,255,255));

}
 //////////////////////////////////////////////////////////////   
    

//////////PARTE FUNCIONARIO ////////////////////////////////////////
public void setColorFuncionario(JPanel panel){

    panel.setBackground(new java.awt.Color(204,204,255));
}

public void resetColorFuncionario(JPanel panel){
 
    panel.setBackground(new java.awt.Color(240,255,255));

}
/////////////////////////////////////////////////////////////////////    



//////////PARTE Termo de Uso ////////////////////////////////////////
public void setColorTermo(JPanel panel){

    panel.setBackground(new java.awt.Color(204,204,255));
}

public void resetColorTermo(JPanel panel){
 
    panel.setBackground(new java.awt.Color(240,255,255));

}
/////////////////////////////////////////////////////////////////////   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator5 = new javax.swing.JSeparator();
        Painel_Branco_Cinza = new javax.swing.JPanel();
        Painel_Azul = new javax.swing.JPanel();
        Painel_Logo_Empresa1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        bem_vindo6 = new javax.swing.JLabel();
        Painel_Branco = new javax.swing.JPanel();
        Painel_Empresa = new javax.swing.JPanel();
        logo_Empresa = new javax.swing.JLabel();
        label_Empresa = new javax.swing.JLabel();
        Painel_Funcionario = new javax.swing.JPanel();
        logo_Empresa1 = new javax.swing.JLabel();
        label_Empresa1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Painel_TermoDeUso = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        bem_vindo4 = new javax.swing.JLabel();

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Painel_Branco_Cinza.setBackground(new java.awt.Color(204, 204, 204));
        Painel_Branco_Cinza.setLayout(null);

        Painel_Azul.setBackground(new java.awt.Color(19, 19, 70));
        Painel_Azul.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        Painel_Azul.setPreferredSize(new java.awt.Dimension(414, 560));
        Painel_Azul.setLayout(null);

        Painel_Logo_Empresa1.setBackground(new java.awt.Color(19, 19, 70));
        Painel_Logo_Empresa1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 255, 255), 10));
        Painel_Logo_Empresa1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagem_Contrato5.png"))); // NOI18N
        Painel_Logo_Empresa1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 240, 280));

        Painel_Azul.add(Painel_Logo_Empresa1);
        Painel_Logo_Empresa1.setBounds(90, 180, 250, 290);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("E   WESLEY ARAÚJO");
        Painel_Azul.add(jLabel1);
        jLabel1.setBounds(280, 530, 140, 14);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("2018.2");
        Painel_Azul.add(jLabel2);
        jLabel2.setBounds(190, 490, 50, 15);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DESENVOLVIDO POR :");
        Painel_Azul.add(jLabel4);
        jLabel4.setBounds(60, 530, 140, 15);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ITALVAR FERREIRA");
        Painel_Azul.add(jLabel6);
        jLabel6.setBounds(180, 530, 140, 14);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PROFESSORA : FRANCISLEIDE ALMEIDA");
        Painel_Azul.add(jLabel7);
        jLabel7.setBounds(110, 510, 230, 14);

        jSeparator4.setBackground(new java.awt.Color(240, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(240, 255, 255));
        Painel_Azul.add(jSeparator4);
        jSeparator4.setBounds(-40, 120, 470, 10);

        bem_vindo6.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        bem_vindo6.setForeground(new java.awt.Color(240, 255, 255));
        bem_vindo6.setText("SISTEMA DE CONT");
        Painel_Azul.add(bem_vindo6);
        bem_vindo6.setBounds(80, 60, 340, 50);

        Painel_Branco_Cinza.add(Painel_Azul);
        Painel_Azul.setBounds(0, 0, 420, 570);

        Painel_Branco.setBackground(new java.awt.Color(240, 255, 255));
        Painel_Branco.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        Painel_Empresa.setBackground(new java.awt.Color(240, 255, 255));
        Painel_Empresa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 19, 70), 10));
        Painel_Empresa.setToolTipText("ÁREA PARA EMPRESA");
        Painel_Empresa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Painel_Empresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Painel_EmpresaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Painel_EmpresaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Painel_EmpresaMouseExited(evt);
            }
        });
        Painel_Empresa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo_Empresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-skyscrapers-80.png"))); // NOI18N
        Painel_Empresa.add(logo_Empresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 88, 80));

        label_Empresa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_Empresa.setForeground(new java.awt.Color(19, 19, 70));
        label_Empresa.setText("EMPRESA");
        Painel_Empresa.add(label_Empresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 100, -1));

        Painel_Funcionario.setBackground(new java.awt.Color(240, 255, 255));
        Painel_Funcionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 19, 70), 10));
        Painel_Funcionario.setToolTipText("ÁREA PARA FUNCIONÁRIO");
        Painel_Funcionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Painel_Funcionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Painel_FuncionarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Painel_FuncionarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Painel_FuncionarioMouseExited(evt);
            }
        });
        Painel_Funcionario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo_Empresa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-chamada-em-conferência-80.png"))); // NOI18N
        Painel_Funcionario.add(logo_Empresa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 30, 90, 85));

        label_Empresa1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_Empresa1.setForeground(new java.awt.Color(19, 19, 70));
        label_Empresa1.setText("FUNCIONÁRIO");
        Painel_Funcionario.add(label_Empresa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 170, -1));

        jLabel3.setBackground(new java.awt.Color(19, 19, 70));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(19, 19, 70));
        jLabel3.setText("TERMO DE USO");

        Painel_TermoDeUso.setBackground(new java.awt.Color(240, 255, 255));
        Painel_TermoDeUso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 19, 70), 2));
        Painel_TermoDeUso.setToolTipText("TERMO DE USO ");
        Painel_TermoDeUso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Painel_TermoDeUsoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Painel_TermoDeUsoMouseExited(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-documento-48.png"))); // NOI18N
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout Painel_TermoDeUsoLayout = new javax.swing.GroupLayout(Painel_TermoDeUso);
        Painel_TermoDeUso.setLayout(Painel_TermoDeUsoLayout);
        Painel_TermoDeUsoLayout.setHorizontalGroup(
            Painel_TermoDeUsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
            .addGroup(Painel_TermoDeUsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Painel_TermoDeUsoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        Painel_TermoDeUsoLayout.setVerticalGroup(
            Painel_TermoDeUsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
            .addGroup(Painel_TermoDeUsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Painel_TermoDeUsoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jSeparator1.setBackground(new java.awt.Color(19, 19, 70));
        jSeparator1.setForeground(new java.awt.Color(19, 19, 70));

        bem_vindo4.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        bem_vindo4.setForeground(new java.awt.Color(19, 19, 70));
        bem_vindo4.setText("RATO TEMPORÁRIO");

        javax.swing.GroupLayout Painel_BrancoLayout = new javax.swing.GroupLayout(Painel_Branco);
        Painel_Branco.setLayout(Painel_BrancoLayout);
        Painel_BrancoLayout.setHorizontalGroup(
            Painel_BrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(Painel_BrancoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Painel_Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Painel_Funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(Painel_BrancoLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(Painel_TermoDeUso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(Painel_BrancoLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(Painel_BrancoLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(bem_vindo4, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Painel_BrancoLayout.setVerticalGroup(
            Painel_BrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_BrancoLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(bem_vindo4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(Painel_BrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Painel_Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Painel_Funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(Painel_TermoDeUso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Painel_Branco_Cinza.add(Painel_Branco);
        Painel_Branco.setBounds(420, 0, 430, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel_Branco_Cinza, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel_Branco_Cinza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(855, 599));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Painel_EmpresaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Painel_EmpresaMouseEntered
        setColorEmpresa(Painel_Empresa);
    }//GEN-LAST:event_Painel_EmpresaMouseEntered

    private void Painel_EmpresaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Painel_EmpresaMouseExited
      resetColorEmpresa(Painel_Empresa);
    }//GEN-LAST:event_Painel_EmpresaMouseExited

    private void Painel_FuncionarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Painel_FuncionarioMouseEntered
     setColorFuncionario(Painel_Funcionario);
    }//GEN-LAST:event_Painel_FuncionarioMouseEntered

    private void Painel_FuncionarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Painel_FuncionarioMouseExited
     resetColorFuncionario(Painel_Funcionario);
    }//GEN-LAST:event_Painel_FuncionarioMouseExited

    private void Painel_TermoDeUsoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Painel_TermoDeUsoMouseEntered
    setColorTermo(Painel_TermoDeUso);
    }//GEN-LAST:event_Painel_TermoDeUsoMouseEntered

    private void Painel_TermoDeUsoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Painel_TermoDeUsoMouseExited
    resetColorTermo(Painel_TermoDeUso);
    }//GEN-LAST:event_Painel_TermoDeUsoMouseExited

    private void Painel_EmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Painel_EmpresaMouseClicked
    TelaLoginEmpresa telaLoginEmpresa = new TelaLoginEmpresa();
    telaLoginEmpresa.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_Painel_EmpresaMouseClicked

    private void Painel_FuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Painel_FuncionarioMouseClicked
    TelaLoginFuncionario telaLoginFuncionario = new TelaLoginFuncionario();
    telaLoginFuncionario.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_Painel_FuncionarioMouseClicked

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Painel_Azul;
    private javax.swing.JPanel Painel_Branco;
    private javax.swing.JPanel Painel_Branco_Cinza;
    private javax.swing.JPanel Painel_Empresa;
    private javax.swing.JPanel Painel_Funcionario;
    private javax.swing.JPanel Painel_Logo_Empresa1;
    private javax.swing.JPanel Painel_TermoDeUso;
    private javax.swing.JLabel bem_vindo4;
    private javax.swing.JLabel bem_vindo6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel label_Empresa;
    private javax.swing.JLabel label_Empresa1;
    private javax.swing.JLabel logo_Empresa;
    private javax.swing.JLabel logo_Empresa1;
    // End of variables declaration//GEN-END:variables
}
