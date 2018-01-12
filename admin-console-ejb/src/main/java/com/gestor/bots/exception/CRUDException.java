/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestor.bots.exception;

/**
 *
 * @author Hendrix
 */
public class CRUDException extends RuntimeException{
    
    private String codigo;

    public CRUDException(String codigo) {
        this.codigo = codigo;
    }

    public CRUDException(String codigo, String message) {
        super(message);
        this.codigo = codigo;
    }

    public CRUDException(String codigo, String message, Throwable cause) {
        super(message, cause);
        this.codigo = codigo;
    }
    
    public String getCodigo() {
        return codigo;
    }
}
