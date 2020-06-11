/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.Date;

/**
 *
 * @author fernandotonooka
 */
public class EntidadeDominio {
	
    private int id;
    private String descricao;

    public EntidadeDominio() {
    	
    }
    
    
    public EntidadeDominio(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}


	/**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
    
    
    
    
}
