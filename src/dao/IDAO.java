/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

import model.domain.EntidadeDominio;
/**
 *
 * @author fernandotonooka
 */
public interface IDAO {
    
    public void salvar (EntidadeDominio entidade);
    public void alterar(EntidadeDominio entidade);
    public void excluir(EntidadeDominio entidade);
    public List<EntidadeDominio>consultar(EntidadeDominio entidade);
        
}
