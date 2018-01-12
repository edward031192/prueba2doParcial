/*
 * GESTOR
 * Sistema: CONSOLA ADMINISTRACION BOT
 * Creado: 22-dic-2017 - 09:43:30
 * 
 * Los contenidos de este archivo son propiedad intelectual de Gestorinc S.A.
 * y se encuentran protegidos por la licencia: "GESTOR FIDUCIA/FONDOS G5".
 * 
 * Usted puede encontrar una copia de esta licencia en: 
 *   http://www.gestorinc.com
 * 
 * Copyright 2015-2018 Gestorinc S.A. Todos los derechos reservados.
 */

package com.gestor.bots.admin.console.enums;

/**
 *
 * @author Gestor
 */
public enum EstadoReglaEnum {
    DEF("Definido"),

    ACT("Activo"),
    
    INA("Inactivo");
    private final String etiqueta;
    
    private EstadoReglaEnum(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

}
