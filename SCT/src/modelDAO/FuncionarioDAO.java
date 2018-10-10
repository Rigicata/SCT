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
import model.Funcionario;


/**
 *
 * @author aluno
 */
public class FuncionarioDAO {
    Conexao conexao;
    PreparedStatement pst;
    
    
  public FuncionarioDAO(){
        this.conexao = new Conexao();
        
        
    }
  
  
    
  public void cadastrarFuncionario(Funcionario funcionario){
       try {
           Connection conecta =  this.conexao.conector();
           String sql = "insert into funcionario(nome_funcionario,endereco,bairro,complemento,numero,cep,cidade,estado,celular,telefone,email,nascimento,cpf,sexo,senha)"
                         +"values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"; //Script para o banco
                                      
           
          pst=conecta.prepareCall(sql); //Passando o script para o banco
          
          //Cadastro das informações
          
            pst.setString(1, funcionario.getNome()); 
            pst.setString(2, funcionario.getEndereco());
            pst.setString(3, funcionario.getBairro());      
            pst.setString(4, funcionario.getComplemento());
            pst.setString(5, funcionario.getNumero());
            pst.setString(6, funcionario.getCep());
            pst.setString(7, funcionario.getCidade());
            pst.setString(8, funcionario.getEstado());
            pst.setString(9, funcionario.getCelular());
            pst.setString(10, funcionario.getTelefone());
            pst.setString(11,  funcionario.getEmail());
            pst.setString(12, funcionario.getNascimento());
            pst.setString(13, funcionario.getCpf());
            pst.setString(14, funcionario.getSexo());
            pst.setString(15,funcionario.getSenha());
            
            
            pst.executeUpdate(); // Fazendo o Uptade no banco
          
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Erro no banco:"+e.getMessage());
       
       
       }
   }      
  
   
   
  public ArrayList<Funcionario> consultarFuncionario(){
           String sql = "select*from funcionario where cpf=?";
           ArrayList<Funcionario> funcionarios = new ArrayList<>();
           Funcionario funcionario;
           
           try {
             Connection conecta = this.conexao.conector();
             pst = conecta.prepareCall(sql);
             ResultSet rs = pst.executeQuery();
              while(rs.next()){
                funcionario= new Funcionario();
                funcionario.setBairro(rs.getString("bairro"));
                funcionario.setCelular(rs.getString("celular"));
                funcionario.setCep(rs.getString("cep"));
                funcionario.setCidade(rs.getString("cidade"));
                funcionario.setComplemento(rs.getString("complemento"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setEndereco(rs.getString("endereco"));
                funcionario.setEstado(rs.getString("estado"));
                funcionario.setNascimento(rs.getString("nascimento"));
                funcionario.setNumero(rs.getString("numero"));
                funcionario.setSexo(rs.getString("sexo"));
                funcionario.setTelefone(rs.getString("telefone"));
              }
             
             
             
             
           } catch (Exception e) {
               System.out.println("Erro: "+e.getMessage()); 
           }
           
           return funcionarios;
       }
  

   
  public void excluirFuncionario(Funcionario funcionario){
      
       try {
         Connection conecta = this.conexao.conector();
         String sql = "delete from funcionario where cpf=?";
         pst = conecta.prepareCall(sql);
         
          //Cadastro das informações
          
            pst.setString(1, funcionario.getNome()); 
            pst.setString(2, funcionario.getEndereco());
            pst.setString(3, funcionario.getBairro());      
            pst.setString(4, funcionario.getComplemento());
            pst.setString(5, funcionario.getNumero());
            pst.setString(6, funcionario.getCep());
            pst.setString(7, funcionario.getCidade());
            pst.setString(8, funcionario.getEstado());
            pst.setString(9, funcionario.getCelular());
            pst.setString(10, funcionario.getTelefone());
            pst.setString(11,  funcionario.getEmail());
            pst.setString(12, funcionario.getNascimento());
            pst.setString(13, funcionario.getCpf());
            pst.setString(14, funcionario.getSexo());
            pst.setString(15,funcionario.getSenha());
            
            
            pst.executeUpdate(); // Fazendo o Uptade no banco
           
       } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Erro no banco: "+e.getMessage());
       
       }
      
      
       
       
   }
   
   
  public void atualizarFuncionario(Funcionario funcionario){
         String sql ="update from funcionario set nome_funcionario=?,endereco=?,bairro=?,complemento=?                     ,numero,cep=?,cidade=?,estado=?,celular=?,telefone=?,email=?,nascimento=?,cpf=?,                      sexo=?,senha=?"; 
       
       try {
       Connection conecta = this.conexao.conector();
       pst=conecta.prepareCall(sql); //Passando o script para o banco

      //Cadastro das informações
          
            pst.setString(1, funcionario.getNome()); 
            pst.setString(2, funcionario.getEndereco());
            pst.setString(3, funcionario.getBairro());      
            pst.setString(4, funcionario.getComplemento());
            pst.setString(5, funcionario.getNumero());
            pst.setString(6, funcionario.getCep());
            pst.setString(7, funcionario.getCidade());
            pst.setString(8, funcionario.getEstado());
            pst.setString(9, funcionario.getCelular());
            pst.setString(10, funcionario.getTelefone());
            pst.setString(11,  funcionario.getEmail());
            pst.setString(12, funcionario.getNascimento());
            pst.setString(13, funcionario.getCpf());
            pst.setString(14, funcionario.getSexo());
            pst.setString(15,funcionario.getSenha());
            
            pst.executeUpdate();
       
       
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Erro no banco:"+e.getMessage());
       
       
       }
       
       
       
       
   }
        
       
    
}
    
    
    

