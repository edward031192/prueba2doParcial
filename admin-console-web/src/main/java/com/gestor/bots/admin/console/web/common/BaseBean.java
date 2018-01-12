/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestor.bots.admin.console.web.common;

import java.io.Serializable;

/**
 *
 * @author Hendrix
 */
public class BaseBean<T>implements Serializable {

    private boolean enNuevo;
    private boolean enModificar;
    private boolean enConsulta;
    
    
    public void nuevo() {
        this.enNuevo = true;
        
    }
    
    public void modificar() {
        this.enModificar = true;
    }
    
    public void consultar() {
        this.enConsulta = true;
    }
    
    public void cancelar() {
        this.enNuevo = false;
        this.enModificar = false;
        this.enConsulta = false;
    }

    public boolean isEnNuevo() {
        return enNuevo;
    }

    public boolean isEnModificar() {
        return enModificar;
    }

    public boolean isEnConsulta() {
        return enConsulta;
    }


    
    
}
