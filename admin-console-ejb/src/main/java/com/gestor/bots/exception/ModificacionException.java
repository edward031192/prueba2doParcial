/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestor.bots.exception;

/**
 *
 * @author David
 */
public class ModificacionException extends CRUDException {

    public ModificacionException(String codigo) {
        super(codigo);
    }

    public ModificacionException(String codigo, String message) {
        super(codigo, message);
    }

    public ModificacionException(String codigo, String message, Throwable cause) {
        super(codigo, message, cause);
    }

    

}
