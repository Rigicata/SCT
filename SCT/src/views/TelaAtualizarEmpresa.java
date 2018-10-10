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
public class TelaAtualizarEmpresa extends javax.swing.JFrame {

    Connection conexao = null;      
    PreparedStatement pst = null;  
    ResultSet rs = null;
    
    
    public TelaAtualizarEmpresa() {
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
    
public void limparTela()                          {
                   
            txtNomeEmpresa.setText(null);
            txtNomeFantasia.setText(null);
            txtEndereco.setText(null);      
            txtBairro.setText(null);
            txtComplemento.setText(null);
            txtNumeroRua.setText(null);
            ftCep.setText(null);
            txtCidade.setText(null);
            txtEstado.setText(null);
            ftCelular.setText(null);
            ftTelefoneFixo.setText(null);
            txtEmail.setText(null);
            txtRamoEmpresa.setText(null);
            ftCNPJ.setText(null);
            
    }   //Função para limpar a tela







private void consultarEmpresa()      {
         if (ftCNPJ.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor,informe o número do CNPJ");
        }else{
        String sql = "select * from Empresa where CNPJ = ?";
        
        try {
            
            pst = conexao.prepareStatement(sql);
            pst.setString(1,ftCNPJ.getText());

            
            rs = pst.executeQuery();
            if (rs.next()) {
                    
                    txtNomeEmpresa.setText(rs.getString(1));
                    txtNomeFantasia.setText(rs.getString(2));
                    txtEndereco.setText(rs.getString(3));
                    txtBairro.setText(rs.getString(4));
                    txtComplemento.setText(rs.getString(5));
                    txtNumeroRua.setText(rs.getString(6));
                    ftCep.setText(rs.getString(7));
                    txtCidade.setText(rs.getString(8));
                    txtEstado.setText(rs.getString(9));
                    ftCelular.setText(rs.getString(10));
                    ftTelefoneFixo.setText(rs.getString(11));
                    txtEmail.setText(rs.getString(12));
                    txtRamoEmpresa.setText(rs.getString(13));
                   
            }
           
            
        } catch (Exception e) {
        
            JOptionPane.showMessageDialog(null,e);
        }
        
        
        
    }  
   } 


  
   
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label_Empresa = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        txtNomeEmpresa = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtNomeFantasia = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        ftCNPJ = new javax.swing.JFormattedTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtEndereco = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        txtBairro = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        txtComplemento = new javax.swing.JTextField();
        label_CNPJ = new javax.swing.JLabel();
        ftCep = new javax.swing.JFormattedTextField();
        jSeparator7 = new javax.swing.JSeparator();
        label_CEP = new javax.swing.JLabel();
        txtNumeroRua = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        txtCidade = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        txtEstado = new javax.swing.JTextField();
        ftTelefoneFixo = new javax.swing.JFormattedTextField();
        jSeparator12 = new javax.swing.JSeparator();
        ftCelular = new javax.swing.JFormattedTextField();
        jSeparator13 = new javax.swing.JSeparator();
        label_telFixo = new javax.swing.JLabel();
        label_Celular = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        txtRamoEmpresa = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        Panel_Atualizar = new javax.swing.JPanel();
        label_Cadastrar = new javax.swing.JLabel();
        Panel_Voltar = new javax.swing.JPanel();
        label_Voltar = new javax.swing.JLabel();
        label_CNPJ1 = new javax.swing.JLabel();
        label_CNPJ2 = new javax.swing.JLabel();
        label_CNPJ3 = new javax.swing.JLabel();
        label_CNPJ4 = new javax.swing.JLabel();
        label_CNPJ5 = new javax.swing.JLabel();
        label_CNPJ6 = new javax.swing.JLabel();
        label_CNPJ7 = new javax.swing.JLabel();
        label_CNPJ8 = new javax.swing.JLabel();
        label_CNPJ9 = new javax.swing.JLabel();
        label_CNPJ10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Panel_Excluir = new javax.swing.JPanel();
        label_Cadastrar1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(19, 19, 70));

        label_Empresa.setBackground(new java.awt.Color(240, 255, 255));
        label_Empresa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_Empresa.setForeground(new java.awt.Color(240, 255, 255));
        label_Empresa.setText("ATUALIZAR DADOS EMPRESA");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-actualizar-40 (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(label_Empresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 453, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(label_Empresa)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 80));

        jPanel2.setBackground(new java.awt.Color(240, 255, 255));

        jSeparator1.setBackground(new java.awt.Color(19, 19, 70));
        jSeparator1.setForeground(new java.awt.Color(19, 19, 70));
        jSeparator1.setOpaque(true);

        txtNomeEmpresa.setBackground(new java.awt.Color(240, 255, 255));
        txtNomeEmpresa.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtNomeEmpresa.setToolTipText("NOME DA EMPRESA");
        txtNomeEmpresa.setBorder(null);

        jSeparator2.setBackground(new java.awt.Color(19, 19, 70));
        jSeparator2.setForeground(new java.awt.Color(19, 19, 70));
        jSeparator2.setOpaque(true);

        txtNomeFantasia.setBackground(new java.awt.Color(240, 255, 255));
        txtNomeFantasia.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtNomeFantasia.setToolTipText("NOME FANTASIA");
        txtNomeFantasia.setBorder(null);

        jSeparator3.setBackground(new java.awt.Color(19, 19, 70));
        jSeparator3.setForeground(new java.awt.Color(19, 19, 70));
        jSeparator3.setOpaque(true);

        ftCNPJ.setBackground(new java.awt.Color(240, 255, 255));
        ftCNPJ.setBorder(null);
        try {
            ftCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftCNPJ.setToolTipText("CNPJ");

        jSeparator4.setBackground(new java.awt.Color(19, 19, 70));
        jSeparator4.setForeground(new java.awt.Color(19, 19, 70));
        jSeparator4.setOpaque(true);

        txtEndereco.setBackground(new java.awt.Color(240, 255, 255));
        txtEndereco.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtEndereco.setToolTipText("ENDEREÇO");
        txtEndereco.setBorder(null);

        jSeparator9.setBackground(new java.awt.Color(19, 19, 70));
        jSeparator9.setForeground(new java.awt.Color(19, 19, 70));
        jSeparator9.setOpaque(true);

        txtBairro.setBackground(new java.awt.Color(240, 255, 255));
        txtBairro.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtBairro.setToolTipText("BAIRRO");
        txtBairro.setBorder(null);

        jSeparator6.setBackground(new java.awt.Color(19, 19, 70));
        jSeparator6.setForeground(new java.awt.Color(19, 19, 70));
        jSeparator6.setOpaque(true);

        txtComplemento.setBackground(new java.awt.Color(240, 255, 255));
        txtComplemento.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtComplemento.setToolTipText("COMPLEMENTO");
        txtComplemento.setBorder(null);

        label_CNPJ.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        label_CNPJ.setText("CNPJ");

        ftCep.setBackground(new java.awt.Color(240, 255, 255));
        ftCep.setBorder(null);
        try {
            ftCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftCep.setToolTipText("CEP");

        jSeparator7.setBackground(new java.awt.Color(19, 19, 70));
        jSeparator7.setForeground(new java.awt.Color(19, 19, 70));
        jSeparator7.setOpaque(true);

        label_CEP.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        label_CEP.setText("CEP");

        txtNumeroRua.setBackground(new java.awt.Color(240, 255, 255));
        txtNumeroRua.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtNumeroRua.setToolTipText("NÚMERO DA RUA");
        txtNumeroRua.setBorder(null);

        jSeparator8.setBackground(new java.awt.Color(19, 19, 70));
        jSeparator8.setForeground(new java.awt.Color(19, 19, 70));
        jSeparator8.setOpaque(true);

        jSeparator14.setBackground(new java.awt.Color(19, 19, 70));
        jSeparator14.setForeground(new java.awt.Color(19, 19, 70));
        jSeparator14.setOpaque(true);

        txtCidade.setBackground(new java.awt.Color(240, 255, 255));
        txtCidade.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtCidade.setToolTipText("CIDADE");
        txtCidade.setBorder(null);

        jSeparator10.setBackground(new java.awt.Color(19, 19, 70));
        jSeparator10.setForeground(new java.awt.Color(19, 19, 70));
        jSeparator10.setOpaque(true);

        txtEstado.setBackground(new java.awt.Color(240, 255, 255));
        txtEstado.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtEstado.setToolTipText("NOME FANTASIA");
        txtEstado.setBorder(null);

        ftTelefoneFixo.setBackground(new java.awt.Color(240, 255, 255));
        ftTelefoneFixo.setBorder(null);
        try {
            ftTelefoneFixo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftTelefoneFixo.setToolTipText("TELEFONE FIXO");

        jSeparator12.setBackground(new java.awt.Color(19, 19, 70));
        jSeparator12.setForeground(new java.awt.Color(19, 19, 70));
        jSeparator12.setOpaque(true);

        ftCelular.setBackground(new java.awt.Color(240, 255, 255));
        ftCelular.setBorder(null);
        try {
            ftCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftCelular.setToolTipText("TELEFONE CELULAR");

        jSeparator13.setBackground(new java.awt.Color(19, 19, 70));
        jSeparator13.setForeground(new java.awt.Color(19, 19, 70));
        jSeparator13.setOpaque(true);

        label_telFixo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        label_telFixo.setText("TELEFONE FIXO");

        label_Celular.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        label_Celular.setText("TELEFONE CELULAR");

        txtEmail.setBackground(new java.awt.Color(240, 255, 255));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtEmail.setToolTipText("E-MAIL");
        txtEmail.setBorder(null);

        jSeparator15.setBackground(new java.awt.Color(19, 19, 70));
        jSeparator15.setForeground(new java.awt.Color(19, 19, 70));
        jSeparator15.setOpaque(true);

        txtRamoEmpresa.setBackground(new java.awt.Color(240, 255, 255));
        txtRamoEmpresa.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtRamoEmpresa.setToolTipText("RAMO DA EMPRESA");
        txtRamoEmpresa.setBorder(null);

        jSeparator16.setBackground(new java.awt.Color(19, 19, 70));
        jSeparator16.setForeground(new java.awt.Color(19, 19, 70));
        jSeparator16.setOpaque(true);

        Panel_Atualizar.setBackground(new java.awt.Color(19, 19, 70));
        Panel_Atualizar.setToolTipText("ATUALIZAR");
        Panel_Atualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_Atualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_AtualizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_AtualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_AtualizarMouseExited(evt);
            }
        });

        label_Cadastrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_Cadastrar.setForeground(new java.awt.Color(240, 255, 255));
        label_Cadastrar.setText("ATUALIZAR");

        javax.swing.GroupLayout Panel_AtualizarLayout = new javax.swing.GroupLayout(Panel_Atualizar);
        Panel_Atualizar.setLayout(Panel_AtualizarLayout);
        Panel_AtualizarLayout.setHorizontalGroup(
            Panel_AtualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
            .addGroup(Panel_AtualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_AtualizarLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_Cadastrar)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        Panel_AtualizarLayout.setVerticalGroup(
            Panel_AtualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
            .addGroup(Panel_AtualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_AtualizarLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_Cadastrar)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        Panel_Voltar.setBackground(new java.awt.Color(19, 19, 70));
        Panel_Voltar.setToolTipText("VOLTAR");
        Panel_Voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_Voltar.setPreferredSize(new java.awt.Dimension(130, 44));
        Panel_Voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_VoltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_VoltarMouseExited(evt);
            }
        });

        label_Voltar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_Voltar.setForeground(new java.awt.Color(240, 255, 255));
        label_Voltar.setText("VOLTAR");

        javax.swing.GroupLayout Panel_VoltarLayout = new javax.swing.GroupLayout(Panel_Voltar);
        Panel_Voltar.setLayout(Panel_VoltarLayout);
        Panel_VoltarLayout.setHorizontalGroup(
            Panel_VoltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
            .addGroup(Panel_VoltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_VoltarLayout.createSequentialGroup()
                    .addContainerGap(28, Short.MAX_VALUE)
                    .addComponent(label_Voltar)
                    .addContainerGap(29, Short.MAX_VALUE)))
        );
        Panel_VoltarLayout.setVerticalGroup(
            Panel_VoltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
            .addGroup(Panel_VoltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_VoltarLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_Voltar)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        label_CNPJ1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        label_CNPJ1.setText("NOME DA EMPRESA");

        label_CNPJ2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        label_CNPJ2.setText("NOME FANTASIA");

        label_CNPJ3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        label_CNPJ3.setText("ENDEREÇO");

        label_CNPJ4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        label_CNPJ4.setText("COMPLEMENTO");

        label_CNPJ5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        label_CNPJ5.setText("BAIRRO");

        label_CNPJ6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        label_CNPJ6.setText("CIDADE");

        label_CNPJ7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        label_CNPJ7.setText("ESTADO");

        label_CNPJ8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        label_CNPJ8.setText("NÚMERO DA RUA");

        label_CNPJ9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        label_CNPJ9.setText("E-MAIL");

        label_CNPJ10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        label_CNPJ10.setText("RAMO DA EMPRESA");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-search-24 (1).png"))); // NOI18N
        jLabel2.setToolTipText("PESQUISAR");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        Panel_Excluir.setBackground(new java.awt.Color(19, 19, 70));
        Panel_Excluir.setToolTipText("ATUALIZAR");
        Panel_Excluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_Excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_ExcluirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_ExcluirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_ExcluirMouseExited(evt);
            }
        });

        label_Cadastrar1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_Cadastrar1.setForeground(new java.awt.Color(240, 255, 255));
        label_Cadastrar1.setText("EXCLUIR");

        javax.swing.GroupLayout Panel_ExcluirLayout = new javax.swing.GroupLayout(Panel_Excluir);
        Panel_Excluir.setLayout(Panel_ExcluirLayout);
        Panel_ExcluirLayout.setHorizontalGroup(
            Panel_ExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
            .addGroup(Panel_ExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ExcluirLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_Cadastrar1)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        Panel_ExcluirLayout.setVerticalGroup(
            Panel_ExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
            .addGroup(Panel_ExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ExcluirLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_Cadastrar1)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_CNPJ1)
                            .addComponent(txtNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_CNPJ)
                            .addComponent(ftCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(633, 633, 633)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(label_CNPJ2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_CEP)
                            .addComponent(ftCep, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(633, 633, 633)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(label_CNPJ3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addComponent(label_telFixo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(label_CNPJ4)
                        .addGap(502, 502, 502)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ftTelefoneFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(label_CNPJ5)
                        .addGap(152, 152, 152)
                        .addComponent(label_CNPJ6)
                        .addGap(146, 146, 146)
                        .addComponent(label_CNPJ7)
                        .addGap(167, 167, 167)
                        .addComponent(label_Celular))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(ftCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(label_CNPJ8)
                        .addGap(98, 98, 98)
                        .addComponent(label_CNPJ9)
                        .addGap(148, 148, 148)
                        .addComponent(label_CNPJ10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(txtNumeroRua, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(txtRamoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Panel_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(167, 167, 167)
                                .addComponent(Panel_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Panel_Atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(197, 197, 197)))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(label_CNPJ1)
                        .addGap(4, 4, 4)
                        .addComponent(txtNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(label_CNPJ)
                        .addGap(11, 11, 11)
                        .addComponent(ftCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(label_CNPJ2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(label_CEP)
                        .addGap(0, 0, 0)
                        .addComponent(ftCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(label_CNPJ3)
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_telFixo))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(label_CNPJ4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ftTelefoneFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_Celular)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_CNPJ5)
                            .addComponent(label_CNPJ6)
                            .addComponent(label_CNPJ7))))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ftCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_CNPJ8)
                    .addComponent(label_CNPJ9)
                    .addComponent(label_CNPJ10))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumeroRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRamoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel_Atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 74, 870, 650));

        setSize(new java.awt.Dimension(855, 599));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Panel_AtualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_AtualizarMouseEntered
     setColorBtn(Panel_Atualizar);
    }//GEN-LAST:event_Panel_AtualizarMouseEntered

    private void Panel_AtualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_AtualizarMouseExited
      resetColorBtn(Panel_Atualizar);
    }//GEN-LAST:event_Panel_AtualizarMouseExited

    private void Panel_VoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_VoltarMouseEntered
      setColorBtn(Panel_Voltar);
    }//GEN-LAST:event_Panel_VoltarMouseEntered

    private void Panel_VoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_VoltarMouseExited
      resetColorBtn(Panel_Voltar);
    }//GEN-LAST:event_Panel_VoltarMouseExited

    private void Panel_AtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_AtualizarMouseClicked
       
    }//GEN-LAST:event_Panel_AtualizarMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        consultarEmpresa();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void Panel_ExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ExcluirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_ExcluirMouseClicked

    private void Panel_ExcluirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ExcluirMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_ExcluirMouseEntered

    private void Panel_ExcluirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ExcluirMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_ExcluirMouseExited

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
            java.util.logging.Logger.getLogger(TelaAtualizarEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizarEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizarEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizarEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new TelaAtualizarEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Atualizar;
    private javax.swing.JPanel Panel_Excluir;
    private javax.swing.JPanel Panel_Voltar;
    private javax.swing.JFormattedTextField ftCNPJ;
    private javax.swing.JFormattedTextField ftCelular;
    private javax.swing.JFormattedTextField ftCep;
    private javax.swing.JFormattedTextField ftTelefoneFixo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel label_CEP;
    private javax.swing.JLabel label_CNPJ;
    private javax.swing.JLabel label_CNPJ1;
    private javax.swing.JLabel label_CNPJ10;
    private javax.swing.JLabel label_CNPJ2;
    private javax.swing.JLabel label_CNPJ3;
    private javax.swing.JLabel label_CNPJ4;
    private javax.swing.JLabel label_CNPJ5;
    private javax.swing.JLabel label_CNPJ6;
    private javax.swing.JLabel label_CNPJ7;
    private javax.swing.JLabel label_CNPJ8;
    private javax.swing.JLabel label_CNPJ9;
    private javax.swing.JLabel label_Cadastrar;
    private javax.swing.JLabel label_Cadastrar1;
    private javax.swing.JLabel label_Celular;
    private javax.swing.JLabel label_Empresa;
    private javax.swing.JLabel label_Voltar;
    private javax.swing.JLabel label_telFixo;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNomeEmpresa;
    private javax.swing.JTextField txtNomeFantasia;
    private javax.swing.JTextField txtNumeroRua;
    private javax.swing.JTextField txtRamoEmpresa;
    // End of variables declaration//GEN-END:variables
}
