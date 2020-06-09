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
    private Date dtEntrada;

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

    /**
     * @return the dtEntrada
     */
    public Date getDtEntrada() {
        return dtEntrada;
    }

    /**
     * @param dtEntrada the dtEntrada to set
     */
    public void setDtEntrada(Date dtEntrada) {
        this.dtEntrada = dtEntrada;
    }
    
    
}
