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

import model.domain.EntidadeDominio;
import util.ConnectionFactory;

/**
 *
 * @author fernandotonooka
 */
public class ComponenteDAO implements IDAO {
        private Connection connection = null;

		@Override
		public void salvar(EntidadeDominio entidade) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void alterar(EntidadeDominio entidade) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void excluir(EntidadeDominio entidade) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public List<EntidadeDominio> consultar(EntidadeDominio entidade) {
			// TODO Auto-generated method stub
			return null;
		}
    
}
