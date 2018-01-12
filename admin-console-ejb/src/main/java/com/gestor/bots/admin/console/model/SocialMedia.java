/*
 * GESTOR
 * Sistema: CONSOLA ADMNISTRACION BOT
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
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entidad que almacena las Redes Sociales 
 *
 * @author GESTOR
 * @version 1.0
 */
@Entity
@Table(name = "SOCIAL_MEDIA")
public class SocialMedia implements Serializable {

    /**
     * Constante autogenerada serialVersionUID.
     */
    private static final long serialVersionUID = -1139225623060582473L;

    /**
     * Propiedad que representa a la clave primaria de la entidad SocialMedia, 
     * se relaciona con la columna COD_SOCIAL_MEDIA.
     */
    @Id
    @Column(name = "COD_SOCIAL_MEDIA", nullable = false, length = 15)
    private String codigo;


    /**  
     * Representa a la columna NOMBRE. 
     */
    @Column(name = "NOMBRE" , nullable = false , length = 100)
    private String nombre;
    

    /**
     * Crea una nueva instancia de la entidad SocialMedia.
     */
    public SocialMedia() {
    }
	
    /** 
     * Crea una nueva instancia de la entidad SocialMedia de acuerdo a su clave primaria. 
     *  
     * @param codigo valor para la clave primaria de la entidad SocialMedia. 
     */ 
    public SocialMedia(String codigo) { 
        this.codigo = codigo; 
    }

   
    /** 
     * Obtiene el valor de la propiedad codigo relacionado con la columna COD_SOCIAL_MEDIA. 
     *  
     * @return el valor asignado a la propiedad codigo. 
     */ 
    public String getCodigo() { 
        return codigo; 
    } 
     
    /** 
     * Asigna un valor a la propiedad codigo, relacionado con la columna COD_SOCIAL_MEDIA. 
     *  
     * @param codigo el valor a ser asignado a la propiedad codigo. 
     */ 
    public void setCodigo(String codigo) { 
        this.codigo = codigo; 
    }

    /** 
     * Obtiene el valor de la propiedad nombre relacionado con la columna NOMBRE. 
     *  
     * @return el valor asignado a la propiedad nombre. 
     */ 
    public String getNombre() { 
        return nombre; 
    } 
     
    /** 
     * Asigna un valor a la propiedad nombre, relacionado con la columna NOMBRE. 
     *  
     * @param nombre el valor a ser asignado a la propiedad nombre. 
     */ 
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }


    /** 
     * {@inheritDoc} 
     */ 
    @Override 
    public int hashCode() { 
        int hash = (codigo != null) ? codigo.hashCode() : 0; 
        return hash; 
    }

    /** 
     * {@inheritDoc} 
     */ 
    @Override 
    public boolean equals(Object object) { 
        boolean igual = true; 
        if (!(object instanceof SocialMedia)) { 
            igual = false; 
        } 
        SocialMedia other = (SocialMedia) object; 
        if ((this.codigo == null && other.codigo != null) 
                || (this.codigo != null && !this.codigo 
                        .equals(other.codigo))) { 
            igual = false; 
        } 
        return igual; 
    }

    /** 
     * {@inheritDoc} 
     */ 
    @Override 
    public String toString() { 
        return "SocialMedia[codigo=" + codigo + "]"; 
    }     

} 
