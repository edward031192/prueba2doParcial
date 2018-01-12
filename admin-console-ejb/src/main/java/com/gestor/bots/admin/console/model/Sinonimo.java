/*
 * GESTOR
 * Sistema: CURSO_JEE
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
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 *
 * @author Gestor
 * @version 1.0
 */
@Entity
@Table(name = "SINONIMO")
public class Sinonimo implements Serializable {

    /**
     * Constante autogenerada serialVersionUID.
     */
    private static final long serialVersionUID = -2695209643325560499L;

    /**
     * Propiedad que representa a la clave primaria de la entidad Sinonimo, 
     * se relaciona con la columna SEC_SINONIMO.
     */
    @Id
    @Column(name = "SEC_SINONIMO", nullable = false, length = 22)
    private Integer secuencia;


    /**  
     * Representa a la columna COD_BOT. 
     */
    @Column(name = "COD_BOT" , nullable = true , length = 10)
    private String codigoBot;
    
    /**  
     * Representa a la columna TERMINOS. 
     */
    @Column(name = "TERMINOS" , nullable = false , length = 500)
    private String terminos;
    
    /** Propiedad  bot representa una relación de muchos a uno con la Entidad Bot.*/;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "COD_BOT", referencedColumnName = "COD_BOT", insertable = false, updatable = false) 
    private Bot bot;


    /**
     * Crea una nueva instancia de la entidad Sinonimo.
     */
    public Sinonimo() {
    }
	
    /** 
     * Crea una nueva instancia de la entidad Sinonimo de acuerdo a su clave primaria. 
     *  
     * @param secuencia valor para la clave primaria de la entidad Sinonimo. 
     */ 
    public Sinonimo(Integer secuencia) { 
        this.secuencia = secuencia; 
    }

   
    /** 
     * Obtiene el valor de la propiedad secuencia relacionado con la columna SEC_SINONIMO. 
     *  
     * @return el valor asignado a la propiedad secuencia. 
     */ 
    public Integer getSecuencia() { 
        return secuencia; 
    } 
     
    /** 
     * Asigna un valor a la propiedad secuencia, relacionado con la columna SEC_SINONIMO. 
     *  
     * @param secuencia el valor a ser asignado a la propiedad secuencia. 
     */ 
    public void setSecuencia(Integer secuencia) { 
        this.secuencia = secuencia; 
    }

    /** 
     * Obtiene el valor de la propiedad codigoBot relacionado con la columna COD_BOT. 
     *  
     * @return el valor asignado a la propiedad codigoBot. 
     */ 
    public String getCodigoBot() { 
        return codigoBot; 
    } 
     
    /** 
     * Asigna un valor a la propiedad codigoBot, relacionado con la columna COD_BOT. 
     *  
     * @param codigoBot el valor a ser asignado a la propiedad codigoBot. 
     */ 
    public void setCodigoBot(String codigoBot) { 
        this.codigoBot = codigoBot; 
    }

    /** 
     * Obtiene el valor de la propiedad terminos relacionado con la columna TERMINOS. 
     *  
     * @return el valor asignado a la propiedad terminos. 
     */ 
    public String getTerminos() { 
        return terminos; 
    } 
     
    /** 
     * Asigna un valor a la propiedad terminos, relacionado con la columna TERMINOS. 
     *  
     * @param terminos el valor a ser asignado a la propiedad terminos. 
     */ 
    public void setTerminos(String terminos) { 
        this.terminos = terminos; 
    }

    /** 
     * Obtiene el valor de la propiedad bot relacionado con la entidad Bot. 
     *  
     * @return el valor asignado a la propiedad bot 
     */ 
    public Bot getBot() { 
        return bot; 
    } 
     
    /** 
     * Asigna un valor a la propiedad bot, relacionado con la entidad Bot. 
     *  
     * @param bot el valor a ser asignado a la propiedad bot 
     */ 
    public void setBot(Bot bot) { 
        this.bot = bot; 
    }


    /** 
     * {@inheritDoc} 
     */ 
    @Override 
    public int hashCode() { 
        int hash = (secuencia != null) ? secuencia.hashCode() : 0; 
        return hash; 
    }

    /** 
     * {@inheritDoc} 
     */ 
    @Override 
    public boolean equals(Object object) { 
        boolean igual = true; 
        if (!(object instanceof Sinonimo)) { 
            igual = false; 
        } 
        Sinonimo other = (Sinonimo) object; 
        if ((this.secuencia == null && other.secuencia != null) 
                || (this.secuencia != null && !this.secuencia 
                        .equals(other.secuencia))) { 
            igual = false; 
        } 
        return igual; 
    }

    /** 
     * {@inheritDoc} 
     */ 
    @Override 
    public String toString() { 
        return "Sinonimo[secuencia=" + secuencia + "]"; 
    }     

} 
