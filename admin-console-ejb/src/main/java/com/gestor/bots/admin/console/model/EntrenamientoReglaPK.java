/*
 * GESTOR
 * Sistema: CONSOLA BOT
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
package com.gestor.bots.admin.console.model;
 
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * La Clase EntrenamientoReglaPK representa a la clave primaria de la tabla ENTRENAMIENTO_REGLA.
 *
 * @author GESTOR
 * @version 1.0
 */
@Embeddable
public class EntrenamientoReglaPK implements Serializable {

    /**
     * Constante autogenerada serialVersionUID.
     */
    private static final long serialVersionUID = 7921325202506445074L;

    @Column(name = "SEC_ENTRENAMIENTO" , nullable = false , length = 5)
    private Integer secuenciaEntrenamiento;
    
    @Column(name = "COD_REGLA" , nullable = false , length = 16)
    private String codigoRegla;
    

    /**
     * Crea una nueva instancia de la entidad EntrenamientoReglaPK.
     */
    public EntrenamientoReglaPK() {
    }
	
    /** 
     * Crea una nueva instancia de EntrenamientoReglaPK. 
     *  
     * @param secuenciaEntrenamiento valor a ser asignado a la propiedad secuenciaEntrenamiento
     * @param codigoRegla valor a ser asignado a la propiedad codigoRegla
 
     */ 
    public EntrenamientoReglaPK(Integer secuenciaEntrenamiento, String codigoRegla) { 
        this.secuenciaEntrenamiento = secuenciaEntrenamiento;
        this.codigoRegla = codigoRegla;
 
    }
   
    /** 
     * Obtiene el valor de la propiedad secuenciaEntrenamiento relacionado con la columna SEC_ENTRENAMIENTO. 
     *  
     * @return el valor asignado a la propiedad secuenciaEntrenamiento. 
     */ 
    public Integer getSecuenciaEntrenamiento() { 
        return secuenciaEntrenamiento; 
    } 
     
    /** 
     * Asigna un valor a la propiedad secuenciaEntrenamiento, relacionado con la columna SEC_ENTRENAMIENTO. 
     *  
     * @param secuenciaEntrenamiento el valor a ser asignado a la propiedad secuenciaEntrenamiento. 
     */ 
    public void setSecuenciaEntrenamiento(Integer secuenciaEntrenamiento) { 
        this.secuenciaEntrenamiento = secuenciaEntrenamiento; 
    }
    /** 
     * Obtiene el valor de la propiedad codigoRegla relacionado con la columna COD_REGLA. 
     *  
     * @return el valor asignado a la propiedad codigoRegla. 
     */ 
    public String getCodigoRegla() { 
        return codigoRegla; 
    } 
     
    /** 
     * Asigna un valor a la propiedad codigoRegla, relacionado con la columna COD_REGLA. 
     *  
     * @param codigoRegla el valor a ser asignado a la propiedad codigoRegla. 
     */ 
    public void setCodigoRegla(String codigoRegla) { 
        this.codigoRegla = codigoRegla; 
    }

    /** 
     * {@inheritDoc} 
     */ 
    @Override 
    public int hashCode() { 
        int hash = 0; 
        hash += secuenciaEntrenamiento != null ? secuenciaEntrenamiento.hashCode() : 0;
        hash += codigoRegla != null ? codigoRegla.hashCode() : 0; 
        return hash; 
    }

    /** 
     * {@inheritDoc} 
     */ 
    @Override 
    public boolean equals(Object object) { 
        boolean igual = true; 
        if (!(object instanceof EntrenamientoReglaPK)) { 
            igual = false; 
        } 
        EntrenamientoReglaPK other = (EntrenamientoReglaPK) object; 
                if ((this.secuenciaEntrenamiento == null && other.secuenciaEntrenamiento != null) 
                || (this.secuenciaEntrenamiento != null && !this.secuenciaEntrenamiento 
                        .equals(other.secuenciaEntrenamiento))) { 
            igual = false; 
        }
        if ((this.codigoRegla == null && other.codigoRegla != null) 
                || (this.codigoRegla != null && !this.codigoRegla 
                        .equals(other.codigoRegla))) { 
            igual = false; 
        } 
        return igual; 
    }

    /** 
     * {@inheritDoc} 
     */ 
    @Override 
    public String toString() { 
        return "EntrenamientoReglaPK[" +  
                " secuenciaEntrenamiento=" + secuenciaEntrenamiento +
                ",codigoRegla=" + codigoRegla +
                "]";                        
    }

} 
