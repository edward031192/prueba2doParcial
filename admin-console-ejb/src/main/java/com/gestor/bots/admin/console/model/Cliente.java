/*
 * ${COMPANY}
 * Sistema: ${SYSTEM_NAME}
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
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Almacena los datos de un cliente.
 *
 * @author ${AUTHOR}
 * @version 1.0
 */
@Entity
@Table(name = "CLIENTE")
public class Cliente implements Serializable {

    /**
     * Constante autogenerada serialVersionUID.
     */
    private static final long serialVersionUID = 1386734332781043678L;

    /**
     * Propiedad que representa a la clave primaria de la entidad Cliente, 
     * se relaciona con la columna RUC.
     */
    @Id
    @Column(name = "RUC", nullable = false, length = 13)
    private String ruc;


    /** ${COL_COMMENT}. 
     * Representa a la columna RAZON_SOCIAL. 
     */
    @Column(name = "RAZON_SOCIAL" , nullable = false , length = 100)
    private String razonSocial;
    
    /** ${COL_COMMENT}. 
     * Representa a la columna NOMBRE_COMERCIAL. 
     */
    @Column(name = "NOMBRE_COMERCIAL" , nullable = true , length = 100)
    private String nombreComercial;
    
    /** ${COL_COMMENT}. 
     * Representa a la columna DIRECCION. 
     */
    @Column(name = "DIRECCION" , nullable = false , length = 200)
    private String direccion;
    
    /** ${COL_COMMENT}. 
     * Representa a la columna PERSONA_CONTACTO. 
     */
    @Column(name = "PERSONA_CONTACTO" , nullable = false , length = 100)
    private String personaContacto;
    
    /** ${COL_COMMENT}. 
     * Representa a la columna MAIL_CONTACTO. 
     */
    @Column(name = "MAIL_CONTACTO" , nullable = false , length = 100)
    private String mailContacto;
    
    /** ${COL_COMMENT}. 
     * Representa a la columna FECHA_REGISTRO. 
     */
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_REGISTRO" , nullable = false , length = 7)
    private Date fechaRegistro;
    

    /**
     * Crea una nueva instancia de la entidad Cliente.
     */
    public Cliente() {
    }
	
    /** 
     * Crea una nueva instancia de la entidad Cliente de acuerdo a su clave primaria. 
     *  
     * @param ruc valor para la clave primaria de la entidad Cliente. 
     */ 
    public Cliente(String ruc) { 
        this.ruc = ruc; 
    }

   
    /** 
     * Obtiene el valor de la propiedad ruc relacionado con la columna RUC. 
     *  
     * @return el valor asignado a la propiedad ruc. 
     */ 
    public String getRuc() { 
        return ruc; 
    } 
     
    /** 
     * Asigna un valor a la propiedad ruc, relacionado con la columna RUC. 
     *  
     * @param ruc el valor a ser asignado a la propiedad ruc. 
     */ 
    public void setRuc(String ruc) { 
        this.ruc = ruc; 
    }

    /** 
     * Obtiene el valor de la propiedad razonSocial relacionado con la columna RAZON_SOCIAL. 
     *  
     * @return el valor asignado a la propiedad razonSocial. 
     */ 
    public String getRazonSocial() { 
        return razonSocial; 
    } 
     
    /** 
     * Asigna un valor a la propiedad razonSocial, relacionado con la columna RAZON_SOCIAL. 
     *  
     * @param razonSocial el valor a ser asignado a la propiedad razonSocial. 
     */ 
    public void setRazonSocial(String razonSocial) { 
        this.razonSocial = razonSocial; 
    }

    /** 
     * Obtiene el valor de la propiedad nombreComercial relacionado con la columna NOMBRE_COMERCIAL. 
     *  
     * @return el valor asignado a la propiedad nombreComercial. 
     */ 
    public String getNombreComercial() { 
        return nombreComercial; 
    } 
     
    /** 
     * Asigna un valor a la propiedad nombreComercial, relacionado con la columna NOMBRE_COMERCIAL. 
     *  
     * @param nombreComercial el valor a ser asignado a la propiedad nombreComercial. 
     */ 
    public void setNombreComercial(String nombreComercial) { 
        this.nombreComercial = nombreComercial; 
    }

    /** 
     * Obtiene el valor de la propiedad direccion relacionado con la columna DIRECCION. 
     *  
     * @return el valor asignado a la propiedad direccion. 
     */ 
    public String getDireccion() { 
        return direccion; 
    } 
     
    /** 
     * Asigna un valor a la propiedad direccion, relacionado con la columna DIRECCION. 
     *  
     * @param direccion el valor a ser asignado a la propiedad direccion. 
     */ 
    public void setDireccion(String direccion) { 
        this.direccion = direccion; 
    }

    /** 
     * Obtiene el valor de la propiedad personaContacto relacionado con la columna PERSONA_CONTACTO. 
     *  
     * @return el valor asignado a la propiedad personaContacto. 
     */ 
    public String getPersonaContacto() { 
        return personaContacto; 
    } 
     
    /** 
     * Asigna un valor a la propiedad personaContacto, relacionado con la columna PERSONA_CONTACTO. 
     *  
     * @param personaContacto el valor a ser asignado a la propiedad personaContacto. 
     */ 
    public void setPersonaContacto(String personaContacto) { 
        this.personaContacto = personaContacto; 
    }

    /** 
     * Obtiene el valor de la propiedad mailContacto relacionado con la columna MAIL_CONTACTO. 
     *  
     * @return el valor asignado a la propiedad mailContacto. 
     */ 
    public String getMailContacto() { 
        return mailContacto; 
    } 
     
    /** 
     * Asigna un valor a la propiedad mailContacto, relacionado con la columna MAIL_CONTACTO. 
     *  
     * @param mailContacto el valor a ser asignado a la propiedad mailContacto. 
     */ 
    public void setMailContacto(String mailContacto) { 
        this.mailContacto = mailContacto; 
    }

    /** 
     * Obtiene el valor de la propiedad fechaRegistro relacionado con la columna FECHA_REGISTRO. 
     *  
     * @return el valor asignado a la propiedad fechaRegistro. 
     */ 
    public Date getFechaRegistro() { 
        return fechaRegistro; 
    } 
     
    /** 
     * Asigna un valor a la propiedad fechaRegistro, relacionado con la columna FECHA_REGISTRO. 
     *  
     * @param fechaRegistro el valor a ser asignado a la propiedad fechaRegistro. 
     */ 
    public void setFechaRegistro(Date fechaRegistro) { 
        this.fechaRegistro = fechaRegistro; 
    }


    /** 
     * {@inheritDoc} 
     */ 
    @Override 
    public int hashCode() { 
        int hash = (ruc != null) ? ruc.hashCode() : 0; 
        return hash; 
    }

    /** 
     * {@inheritDoc} 
     */ 
    @Override 
    public boolean equals(Object object) { 
        boolean igual = true; 
        if (!(object instanceof Cliente)) { 
            igual = false; 
        } 
        Cliente other = (Cliente) object; 
        if ((this.ruc == null && other.ruc != null) 
                || (this.ruc != null && !this.ruc 
                        .equals(other.ruc))) { 
            igual = false; 
        } 
        return igual; 
    }

    /** 
     * {@inheritDoc} 
     */ 
    @Override 
    public String toString() { 
        return "${CLASS_PK_TS}[ruc=" + ruc + "]"; 
    }     

} 
