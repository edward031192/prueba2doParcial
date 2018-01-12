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
 
import com.gestor.bots.admin.console.enums.EstadoUsuarioEnum;
import com.gestor.bots.admin.console.enums.TipoUsuarioEnum;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 *
 * @author ${AUTHOR}
 * @version 1.0
 */
@Entity
@Table(name = "USUARIO")
public class Usuario implements Serializable {

    /**
     * Constante autogenerada serialVersionUID.
     */
    private static final long serialVersionUID = -3289051719797652600L;

    /**
     * Propiedad que representa a la clave primaria de la entidad Usuario, 
     * se relaciona con la columna MAIL_USUARIO.
     */
    @Id
    @Column(name = "MAIL_USUARIO", nullable = false, length = 100)
    private String mail;


    /** 
     * Representa a la columna CLAVE. 
     */
    @Column(name = "CLAVE" , nullable = false , length = 100)
    private String clave;
    
    /** 
     * Representa a la columna NOMBRE. 
     */
    @Column(name = "NOMBRE" , nullable = false , length = 100)
    private String nombre;
    
    /** 
     * Representa a la columna FECHA_CRACION. 
     */
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_CRACION" , nullable = false , length = 7)
    private Date fechaCreacion;
    
    /** 
     * Representa a la columna ESTADO. 
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "ESTADO" , nullable = false , length = 3)
    private EstadoUsuarioEnum estado;
    
    /** 
     * Representa a la columna TIPO. 
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO" , nullable = false , length = 3)
    private TipoUsuarioEnum tipo;
    

    /**
     * Crea una nueva instancia de la entidad Usuario.
     */
    public Usuario() {
    }
	
    /** 
     * Crea una nueva instancia de la entidad Usuario de acuerdo a su clave primaria. 
     *  
     * @param mail valor para la clave primaria de la entidad Usuario. 
     */ 
    public Usuario(String mail) { 
        this.mail = mail; 
    }

   
    /** 
     * Obtiene el valor de la propiedad mail relacionado con la columna MAIL_USUARIO. 
     *  
     * @return el valor asignado a la propiedad mail. 
     */ 
    public String getMail() { 
        return mail; 
    } 
     
    /** 
     * Asigna un valor a la propiedad mail, relacionado con la columna MAIL_USUARIO. 
     *  
     * @param mail el valor a ser asignado a la propiedad mail. 
     */ 
    public void setMail(String mail) { 
        this.mail = mail; 
    }

    /** 
     * Obtiene el valor de la propiedad clave relacionado con la columna CLAVE. 
     *  
     * @return el valor asignado a la propiedad clave. 
     */ 
    public String getClave() { 
        return clave; 
    } 
     
    /** 
     * Asigna un valor a la propiedad clave, relacionado con la columna CLAVE. 
     *  
     * @param clave el valor a ser asignado a la propiedad clave. 
     */ 
    public void setClave(String clave) { 
        this.clave = clave; 
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
     * Obtiene el valor de la propiedad fechaCreacion relacionado con la columna FECHA_CRACION. 
     *  
     * @return el valor asignado a la propiedad fechaCreacion. 
     */ 
    public Date getFechaCreacion() { 
        return fechaCreacion; 
    } 
     
    /** 
     * Asigna un valor a la propiedad fechaCreacion, relacionado con la columna FECHA_CRACION. 
     *  
     * @param fechaCreacion el valor a ser asignado a la propiedad fechaCreacion. 
     */ 
    public void setFechaCreacion(Date fechaCreacion) { 
        this.fechaCreacion = fechaCreacion; 
    }

    /** 
     * Obtiene el valor de la propiedad estado relacionado con la columna ESTADO. 
     *  
     * @return el valor asignado a la propiedad estado. 
     */ 
    public EstadoUsuarioEnum getEstado() { 
        return estado; 
    } 
     
    /** 
     * Asigna un valor a la propiedad estado, relacionado con la columna ESTADO. 
     *  
     * @param estado el valor a ser asignado a la propiedad estado. 
     */ 
    public void setEstado(EstadoUsuarioEnum estado) { 
        this.estado = estado; 
    }

    /** 
     * Obtiene el valor de la propiedad tipo relacionado con la columna TIPO. 
     *  
     * @return el valor asignado a la propiedad tipo. 
     */ 
    public TipoUsuarioEnum getTipo() { 
        return tipo; 
    } 
     
    /** 
     * Asigna un valor a la propiedad tipo, relacionado con la columna TIPO. 
     *  
     * @param tipo el valor a ser asignado a la propiedad tipo. 
     */ 
    public void setTipo(TipoUsuarioEnum tipo) { 
        this.tipo = tipo; 
    }


    /** 
     * {@inheritDoc} 
     */ 
    @Override 
    public int hashCode() { 
        int hash = (mail != null) ? mail.hashCode() : 0; 
        return hash; 
    }

    /** 
     * {@inheritDoc} 
     */ 
    @Override 
    public boolean equals(Object object) { 
        boolean igual = true; 
        if (!(object instanceof Usuario)) { 
            igual = false; 
        } 
        Usuario other = (Usuario) object; 
        if ((this.mail == null && other.mail != null) 
                || (this.mail != null && !this.mail 
                        .equals(other.mail))) { 
            igual = false; 
        } 
        return igual; 
    }

    /** 
     * {@inheritDoc} 
     */ 
    @Override 
    public String toString() { 
        return "Usuario[mail=" + mail + "]"; 
    }     

} 
