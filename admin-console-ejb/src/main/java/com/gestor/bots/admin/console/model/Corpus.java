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
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entidad que almacena los datos de entrenamiento de cada regla
 *
 * @author GESTOR
 * @version 1.0
 */
@Entity
@Table(name = "CORPUS")
public class Corpus implements Serializable {

    /**
     * Constante autogenerada serialVersionUID.
     */
    private static final long serialVersionUID = -2281706503878107971L;

    /**
     * Propiedad que representa a la clave primaria de la entidad Corpus, 
     * se relaciona con la columna ID_CORPUS.
     */
    @Id
    @Column(name = "ID_CORPUS", nullable = false, length = 22)
    private Integer id;


    /**  
     * Representa a la columna COD_REGLA. 
     */
    @Column(name = "COD_REGLA" , nullable = true , length = 16)
    private String codigoRegla;
    
    /**  
     * Representa a la columna TEXTO. 
     */
    @Column(name = "TEXTO" , nullable = false , length = 500)
    private String texto;
    
    /** Propiedad  regla representa una relación de muchos a uno con la Entidad Regla.*/;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "COD_REGLA", referencedColumnName = "COD_REGLA", insertable = false, updatable = false) 
    private Regla regla;


    /**
     * Crea una nueva instancia de la entidad Corpus.
     */
    public Corpus() {
    }
	
    /** 
     * Crea una nueva instancia de la entidad Corpus de acuerdo a su clave primaria. 
     *  
     * @param id valor para la clave primaria de la entidad Corpus. 
     */ 
    public Corpus(Integer id) { 
        this.id = id; 
    }

   
    /** 
     * Obtiene el valor de la propiedad id relacionado con la columna ID_CORPUS. 
     *  
     * @return el valor asignado a la propiedad id. 
     */ 
    public Integer getId() { 
        return id; 
    } 
     
    /** 
     * Asigna un valor a la propiedad id, relacionado con la columna ID_CORPUS. 
     *  
     * @param id el valor a ser asignado a la propiedad id. 
     */ 
    public void setId(Integer id) { 
        this.id = id; 
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
     * Obtiene el valor de la propiedad texto relacionado con la columna TEXTO. 
     *  
     * @return el valor asignado a la propiedad texto. 
     */ 
    public String getTexto() { 
        return texto; 
    } 
     
    /** 
     * Asigna un valor a la propiedad texto, relacionado con la columna TEXTO. 
     *  
     * @param texto el valor a ser asignado a la propiedad texto. 
     */ 
    public void setTexto(String texto) { 
        this.texto = texto; 
    }

    /** 
     * Obtiene el valor de la propiedad regla relacionado con la entidad Regla. 
     *  
     * @return el valor asignado a la propiedad regla 
     */ 
    public Regla getRegla() { 
        return regla; 
    } 
     
    /** 
     * Asigna un valor a la propiedad regla, relacionado con la entidad Regla. 
     *  
     * @param regla el valor a ser asignado a la propiedad regla 
     */ 
    public void setRegla(Regla regla) { 
        this.regla = regla; 
    }


    /** 
     * {@inheritDoc} 
     */ 
    @Override 
    public int hashCode() { 
        int hash = (id != null) ? id.hashCode() : 0; 
        return hash; 
    }

    /** 
     * {@inheritDoc} 
     */ 
    @Override 
    public boolean equals(Object object) { 
        boolean igual = true; 
        if (!(object instanceof Corpus)) { 
            igual = false; 
        } 
        Corpus other = (Corpus) object; 
        if ((this.id == null && other.id != null) 
                || (this.id != null && !this.id 
                        .equals(other.id))) { 
            igual = false; 
        } 
        return igual; 
    }

    /** 
     * {@inheritDoc} 
     */ 
    @Override 
    public String toString() { 
        return "Corpus[id=" + id + "]"; 
    }     

} 
