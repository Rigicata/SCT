/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Conexao;
import model.Empresa;


/**
 *
 * @author aluno
 */
public class EmpresaDAO {
    Conexao conexao; // Variável do tipo conexão da classe Conexão para verificar se a conexão com o banco irá acontecer
    PreparedStatement pst;
    
    
    public EmpresaDAO(){
      this.conexao = new Conexao();
    
      
}
    
    
        
/*  public void cadastrarEmpresa(Empresa empresa){
       try {
           Connection conecta =  this.conexao.conector();
           String sql = "insert into empresa (nome_empresa,nome_fantasia,endereco,bairro,complemento,                             numero,cep,cidade,estado,celular,telefone,email,ramo_empresa,cnpj,senha)"                              +"values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"; //Script para o banco
                                      
           
          pst=conecta.prepareCall(sql); //Passando o script para o banco
          
          //Cadastro das informações
          
            pst.setString(1, empresa.getNome()); 
            pst.setString(2, empresa.getEndereco());
            pst.setString(3, empresa.getBairro());      
            pst.setString(4, empresa.getComplemento());
            pst.setString(5, empresa.getNumero());
            pst.setString(6, empresa.getCep());
            pst.setString(7, empresa.getCidade());
            pst.setString(8, empresa.getEstado());
            pst.setString(9, empresa.getCelular());
            pst.setString(10,empresa.getTelefone());
            pst.setString(11,empresa.getEmail());
            pst.setString(12,empresa.getCnpj());
            pst.setString(13,empresa.getSenha());
            pst.setString(14, empresa.getNomefantasia());
            pst.setString(15, empresa.getRamoempresa());
            
            pst.executeUpdate(); // Fazendo o Uptade no banco
          
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Erro no banco:"+e.getMessage());
       
       
       }
   }  */    
  
   
  /*  public void excluirEmpresa(Empresa empresa){
      
       try {
         Connection conecta = this.conexao.conector();
         String sql = "delete from empresa where cnpj=?";
         pst = conecta.prepareCall(sql);
         
          //Cadastro das informações
          
           pst.setString(1, empresa.getNome()); 
            pst.setString(2, empresa.getEndereco());
            pst.setString(3, empresa.getBairro());      
            pst.setString(4, empresa.getComplemento());
            pst.setString(5, empresa.getNumero());
            pst.setString(6, empresa.getCep());
            pst.setString(7, empresa.getCidade());
            pst.setString(8, empresa.getEstado());
            pst.setString(9, empresa.getCelular());
            pst.setString(10,empresa.getTelefone());
            pst.setString(11,empresa.getEmail());
            pst.setString(12,empresa.getCnpj());
            pst.setString(13,empresa.getSenha());
            pst.setString(14, empresa.getNomefantasia());
            pst.setString(15, empresa.getRamoempresa());
            
            
            pst.executeUpdate(); // Fazendo o Uptade no banco
           
       } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Erro no banco: "+e.getMessage());
       
       }
      
      
       
       
   }*/
   
  public Empresa consultarEmpresa(){
           String sql = "select*from empresa where cnpj=?";
           Empresa empresa = null;
           
           try {
             Connection conecta = this.conexao.conector();
             pst = conecta.prepareCall(sql);
             ResultSet rs = pst.executeQuery();
              while(rs.next()){
                empresa= new Empresa();
                empresa.setCnpj("cnpj");
                empresa.setBairro(rs.getString("bairro"));
                empresa.setCelular(rs.getString("celular"));
                empresa.setCep(rs.getString("cep"));
                empresa.setCidade(rs.getString("cidade"));
                empresa.setComplemento(rs.getString("complemento"));
                empresa.setCnpj(rs.getString("cnpj"));
                empresa.setEmail(rs.getString("email"));
                empresa.setEndereco(rs.getString("endereco"));
                empresa.setEstado(rs.getString("estado"));
                empresa.setNumero(rs.getString("numero"));
                empresa.setTelefone(rs.getString("telefone"));
                empresa.setNomefantasia("nome_fantasia");
                empresa.setRamoempresa("ramo_empresa");
                
                
              }
             
             
             
             
           } catch (Exception e) {
               System.out.println("Erro: "+e.getMessage()); 
           }
           
           return empresa;
       }
  

   
 
   
  public void atualizarEmpresa(Empresa empresa){
         String sql ="update from empresa set nome_empresa=?,nome_fantasia=?,endereco=?,bairro=?,                           complemento=?,numero=?,cep=?,cidade=?,estado=?,celular=?,telefone=?,email=?,ramo_                     empresa=?,cnpj=?,senha=?";
       try {
       Connection conecta = this.conexao.conector();
       pst=conecta.prepareCall(sql); //Passando o script para o banco

      //Cadastro das informações
          
            pst.setString(1, empresa.getNome()); 
            pst.setString(2, empresa.getEndereco());
            pst.setString(3, empresa.getBairro());      
            pst.setString(4, empresa.getComplemento());
            pst.setString(5, empresa.getNumero());
            pst.setString(6, empresa.getCep());
            pst.setString(7, empresa.getCidade());
            pst.setString(8, empresa.getEstado());
            pst.setString(9, empresa.getCelular());
            pst.setString(10,empresa.getTelefone());
            pst.setString(11,empresa.getEmail());
            pst.setString(12,empresa.getCnpj());
            pst.setString(13,empresa.getSenha());
            pst.setString(14, empresa.getNomefantasia());
            pst.setString(15, empresa.getRamoempresa());
            
            pst.executeUpdate();
       
       
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Erro no banco:"+e.getMessage());
       
       
       }
       
       
       
       
   }
        
    
    
 
}
