/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Maresia-
 */
public class Conexao {
    
    public Connection conector() {
        java.sql.Connection conexao = null;

        String driver = "com.mysql.jdbc.Driver"; //DRIVER PARA CONEXÃO COM O BANCO
        String url = "jdbc:mysql://localhost:3306/dbsct"; // NOME DO BANCO DE DADOS
        String user = "root";  //USUÁRIO DO BANCO
        String password = "cimatec"; // NÃO COLOCAR ESPAÇO 
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user , password);
            return conexao;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no banco: "+e.getMessage());
            
            return null;
        }
    }
}

   