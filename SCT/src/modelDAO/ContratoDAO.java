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
import model.Contrato;

/**
 *
 * @author aluno
 */
public class ContratoDAO {
    Conexao conexao;
    PreparedStatement pst;
    
     public ContratoDAO(){
        this.conexao = new Conexao();
        
        
    }
  
  
    
  public void cadastrarContrato(Contrato contrato){
       try {
           Connection conecta =  this.conexao.conector();
           String sql = "insert into contrato(dia_Inicial,dia_Fim,horario_Inicio,horario_Final,localizacao,tipo,clausula)"
                         +"values(?,?,?,?,?,?,?)"; //Script para o banco
                                      
           
          pst=conecta.prepareCall(sql); //Passando o script para o banco
          
          //Cadastro das informações
          
            pst.setString(1,contrato.getDiafinal());
            pst.setString(2, contrato.getDiaincial());
            pst.setString(3, contrato.getHorariofinal());
            pst.setString(4, contrato.getHorarioinicial());
            pst.setString(5, contrato.getLocalizacao());
            pst.setString(6, contrato.getTipo());
            pst.setString(7, contrato.getClausula());
            pst.setInt(8, contrato.getId());
            pst.executeUpdate(); // Fazendo o Uptade no banco
          
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Erro no banco:"+e.getMessage());
       
       
       }
   }      
  
   
   
  public ArrayList<Contrato> consultarContrato(){
           String sql = "select*from contrato where idContrato=?";
           ArrayList<Contrato> contratos = new ArrayList<>();
           Contrato contrato;
           
           try {
             Connection conecta = this.conexao.conector();
             pst = conecta.prepareCall(sql);
             ResultSet rs = pst.executeQuery();
              while(rs.next()){
                contrato= new Contrato();
                contrato.setClausula(rs.getString("clausula"));
                contrato.setDiafinal(rs.getString("dia_Final"));
                contrato.setDiaincial(rs.getString("dia_Inicial"));
                contrato.setHorariofinal(rs.getString("horario_Final"));
                contrato.setHorarioinicial(rs.getString("horario_Inicial"));
                contrato.setId((rs.getInt("id")));
                contrato.setLocalizacao(rs.getString("localizacao"));
                contrato.setTipo(rs.getString("tipo"));
                
              }
             
             
             
             
           } catch (Exception e) {
               System.out.println("Erro: "+e.getMessage()); 
           }
           
           return contratos;
       }
  

   
  public void excluirContrato(Contrato contrato){
      
       try {
         Connection conecta = this.conexao.conector();
         String sql = "delete from contrato where idContrato=?";
         pst = conecta.prepareCall(sql);
         
          //Cadastro das informações
          
           
            pst.setString(1,contrato.getDiafinal());
            pst.setString(2, contrato.getDiaincial());
            pst.setString(3, contrato.getHorariofinal());
            pst.setString(4, contrato.getHorarioinicial());
            pst.setString(5, contrato.getLocalizacao());
            pst.setString(6, contrato.getTipo());
            pst.setString(7, contrato.getClausula());
            pst.setInt(8, contrato.getId());
            
            
            pst.executeUpdate(); // Fazendo o Uptade no banco
           
       } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Erro no banco: "+e.getMessage());
       
       }
      
      
       
       
   }
   
   
  public void atualizarContrato(Contrato contrato){
         String sql ="update from contrato set dia_Inicial=?,dia_Fim=?,horario_Inicio=?,horario_Final=?,localizacao=?,tipo=?,clausula=?"; 
       
       try {
       Connection conecta = this.conexao.conector();
       pst=conecta.prepareCall(sql); //Passando o script para o banco

      //Cadastro das informações
          
            pst.setString(1, contrato.getClausula()); 
            pst.setString(2, contrato.getDiafinal());
            pst.setString(3, contrato.getDiaincial());      
            pst.setString(4, contrato.getHorariofinal());
            pst.setString(5, contrato.getHorarioinicial());
            pst.setString(6, contrato.getLocalizacao());
            pst.setString(7, contrato.getTipo());
            pst.setInt(8, contrato.getId());
            
            pst.executeUpdate();
       
       
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Erro no banco:"+e.getMessage());
       
       
       }
       
       
       
       
   }
        
    
    
}
