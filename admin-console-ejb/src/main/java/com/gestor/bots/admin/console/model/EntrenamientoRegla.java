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
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Clase de entrenamiento de la regla
 *
 * @author GESTOR
 * @version 1.0
 */
@Entity
@Table(name = "ENTRENAMIENTO_REGLA")
public class EntrenamientoRegla implements Serializable {

    /**
     * Constante autogenerada serialVersionUID.
     */
    private static final long serialVersionUID = -6721241685977292009L;

    /** Propiedad que representa a la clave primaria de la entidad EntrenamientoRegla. */
    @EmbeddedId
    private EntrenamientoReglaPK pk = new EntrenamientoReglaPK();
    

    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_INICIO" , nullable = false , length = 7)
    private Date fechaInicio;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_FIN" , nullable = true , length = 7)
    private Date fechaFin;
    

    @Column(name = "LINEAS_ENTRENAMIENTO" , nullable = false , length = 5)
    private Integer lineasEntrenamiento;
    
    @Column(name = "ESTADO" , nullable = false , length = 3)
    private String estado;
    
    /** Propiedad  regla representa una relación de muchos a uno con la Entidad Regla.*/;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "COD_REGLA", referencedColumnName = "COD_REGLA", insertable = false, updatable = false) 
    private Regla regla;


    /**
     * Crea una nueva instancia de la entidad EntrenamientoRegla.
     */
    public EntrenamientoRegla() {
    }
	
    /** 
     * Crea una nueva instancia de la entidad EntrenamientoRegla de acuerdo a su clave primaria. 
     *  
     * @param pk valor para la clave primaria de la entidad EntrenamientoRegla. 
     */ 
    public EntrenamientoRegla(EntrenamientoReglaPK pk) { 
        this.pk = pk; 
    }

   
    /** 
     * Obtiene el valor de la propiedad pk relacionado con la columna . 
     *  
     * @return el valor asignado a la propiedad pk. 
     */ 
    public EntrenamientoReglaPK getPk() { 
        return pk; 
    } 
     
    /** 
     * Asigna un valor a la propiedad pk, relacionado con la columna . 
     *  
     * @param pk el valor a ser asignado a la propiedad pk. 
     */ 
    public void setPk(EntrenamientoReglaPK pk) { 
        this.pk = pk; 
    }

    /** 
     * Obtiene el valor de la propiedad fechaInicio relacionado con la columna FECHA_INICIO. 
     *  
     * @return el valor asignado a la propiedad fechaInicio. 
     */ 
    public Date getFechaInicio() { 
        return fechaInicio; 
    } 
     
    /** 
     * Asigna un valor a la propiedad fechaInicio, relacionado con la columna FECHA_INICIO. 
     *  
     * @param fechaInicio el valor a ser asignado a la propiedad fechaInicio. 
     */ 
    public void setFechaInicio(Date fechaInicio) { 
        this.fechaInicio = fechaInicio; 
    }

    /** 
     * Obtiene el valor de la propiedad fechaFin relacionado con la columna FECHA_FIN. 
     *  
     * @return el valor asignado a la propiedad fechaFin. 
     */ 
    public Date getFechaFin() { 
        return fechaFin; 
    } 
     
    /** 
     * Asigna un valor a la propiedad fechaFin, relacionado con la columna FECHA_FIN. 
     *  
     * @param fechaFin el valor a ser asignado a la propiedad fechaFin. 
     */ 
    public void setFechaFin(Date fechaFin) { 
        this.fechaFin = fechaFin; 
    }

    /** 
     * Obtiene el valor de la propiedad lineasEntrenamiento relacionado con la columna LINEAS_ENTRENAMIENTO. 
     *  
     * @return el valor asignado a la propiedad lineasEntrenamiento. 
     */ 
    public Integer getLineasEntrenamiento() { 
        return lineasEntrenamiento; 
    } 
     
    /** 
     * Asigna un valor a la propiedad lineasEntrenamiento, relacionado con la columna LINEAS_ENTRENAMIENTO. 
     *  
     * @param lineasEntrenamiento el valor a ser asignado a la propiedad lineasEntrenamiento. 
     */ 
    public void setLineasEntrenamiento(Integer lineasEntrenamiento) { 
        this.lineasEntrenamiento = lineasEntrenamiento; 
    }

    /** 
     * Obtiene el valor de la propiedad estado relacionado con la columna ESTADO. 
     *  
     * @return el valor asignado a la propiedad estado. 
     */ 
    public String getEstado() { 
        return estado; 
    } 
     
    /** 
     * Asigna un valor a la propiedad estado, relacionado con la columna ESTADO. 
     *  
     * @param estado el valor a ser asignado a la propiedad estado. 
     */ 
    public void setEstado(String estado) { 
        this.estado = estado; 
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
        int hash = (pk != null) ? pk.hashCode() : 0; 
        return hash; 
    }

    /** 
     * {@inheritDoc} 
     */ 
    @Override 
    public boolean equals(Object object) { 
        boolean igual = true; 
        if (!(object instanceof EntrenamientoRegla)) { 
            igual = false; 
        } 
        EntrenamientoRegla other = (EntrenamientoRegla) object; 
        if ((this.pk == null && other.pk != null) 
                || (this.pk != null && !this.pk 
                        .equals(other.pk))) { 
            igual = false; 
        } 
        return igual; 
    }

    /** 
     * {@inheritDoc} 
     */ 
    @Override 
    public String toString() { 
        return "${CLASS_PK_TS}[pk=" + pk + "]"; 
    }     

} 
