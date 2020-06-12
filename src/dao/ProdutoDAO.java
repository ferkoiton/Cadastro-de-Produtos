/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.List;
import java.util.ArrayList;

import model.domain.EntidadeDominio;
import model.domain.Produto;

import java.util.logging.Level;
import java.util.logging.Logger;

import util.ConnectionFactory;

/**
 *
 * @author fernandotonooka
 */
public class ProdutoDAO implements IDAO {
        private Connection connection = null;
        
        @Override
        public void salvar (EntidadeDominio entidade) {
            Produto produto = (Produto)entidade;
            
            PreparedStatement pst = null;
            
            try {
                    
                    connection = ConnectionFactory.getConnectionMySQL();
                    
                    String sql = "insert into produto" + "nome, valorCompra, dtEntrada, quantidade, comprador" + 
                                 "values(?, ?, ?, ?, ?)";
                    
                    pst = connection.prepareStatement(sql);
                    
                    pst.setString(1, produto.getNome());
                    pst.setDouble(2, produto.getValorCompra());
                    Timestamp time = new Timestamp (produto.getDataEntrada().getTime());
                    pst.setTimestamp(3, time);
                    pst.setInt(4, produto.getQuantidade());
                    pst.setString(5, produto.getComprador());
                    
                    pst.execute();
                    pst.close();
                    
                    System.out.println("Gravado!");
                    connection.close();
                    
            } catch ( SQLException e) {
                            throw new RuntimeException (e);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            } 
}
        
        public void alterar(EntidadeDominio entidade){
        
        
    };
    
    
    
    public void excluir(EntidadeDominio entidade) {
    	
    };
    
    
    
    public List<EntidadeDominio>consultar() {
            
            PreparedStatement pst = null;
            
            try {
                
                    connection = ConnectionFactory.getConnectionMySQL();
                    
                    String sql = "select * from produto";
                    
                    pst = connection.prepareStatement(sql);
                    ResultSet rs = pst.executeQuery();
                    
                    List<EntidadeDominio> produtos = new ArrayList <>();
                    
                    while (rs.next()) {
                        Produto produto = new Produto();
                        produto.setNome(rs.getString("nome"));
                        produto.setValorCompra(rs.getDouble("valorCompra"));
                        produto.setDataEntrada(rs.getDate("dtEntrada").getTime());
                        produto.setComprador(rs.getString("comprador"));
                        
                        produtos.add(produto);
                    }
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
    };
    
}
