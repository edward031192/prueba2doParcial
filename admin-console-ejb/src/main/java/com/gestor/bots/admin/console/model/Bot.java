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
package com.gestor.bots.admin.console.model;
 
import com.gestor.bots.admin.console.enums.EstadoBotEnum;
import com.gestor.bots.admin.console.enums.TipoBotEnum;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Entidad que registra la informaci\u00f3n especifica de cada Bot
 *
 * @author Gestor
 * @version 1.0
 */
@Entity
@Table(name = "BOT")
public class Bot implements Serializable {

    /**
     * Constante autogenerada serialVersionUID.
     */
    private static final long serialVersionUID = 7737499040108913823L;

    /**
     * Propiedad que representa a la clave primaria de la entidad Bot, 
     * se relaciona con la columna COD_BOT.
     */
    @Id
    @Column(name = "COD_BOT", nullable = false, length = 10)
    private String codigo;


    /** 
     * Representa a la columna RUC. 
     */
    @Column(name = "RUC" , nullable = false , length = 13)
    private String ruc;
    
    /** 
     * Representa a la columna NOMBRE. 
     */
    @Column(name = "NOMBRE" , nullable = false , length = 100)
    private String nombre;
    
    /** 
     * Representa a la columna AVATAR. 
     */
    @Column(name = "AVATAR" , nullable = false , length = 200)
    private String avatar;
    
    /** 
     * Representa a la columna DESCRIPCION. 
     */
    @Column(name = "DESCRIPCION" , nullable = false , length = 500)
    private String descripcion;
    
    /** 
     * Representa a la columna TIPO. 
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO" , nullable = false , length = 3)
    private TipoBotEnum tipo;
    
    /** 
     * Representa a la columna ESTADO. 
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "ESTADO" , nullable = false , length = 3)
    private EstadoBotEnum estado;
    
    /** Propiedad  cliente representa una relación de muchos a uno con la Entidad Cliente.*/;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "RUC", referencedColumnName = "RUC", insertable = false, updatable = false) 
    private Cliente cliente;

    /** Propiedad  contactosSocialMedia representa una relación de uno a muchos con la Entidad BotSocialMedia.*/;
    @Transient
    private List<BotSocialMedia> contactosSocialMedia;
    
    /** Propiedad  reglas representa una relación de uno a muchos con la Entidad Regla.*/;
    @Transient
    private List<Regla> reglas;
    
    /** Propiedad  sinonimos representa una relación de uno a muchos con la Entidad Sinonimo.*/;
    @Transient
    private List<Sinonimo> sinonimos;
    

    /**
     * Crea una nueva instancia de la entidad Bot.
     */
    public Bot() {
    }
	
    /** 
     * Crea una nueva instancia de la entidad Bot de acuerdo a su clave primaria. 
     *  
     * @param codigo valor para la clave primaria de la entidad Bot. 
     */ 
    public Bot(String codigo) { 
        this.codigo = codigo; 
    }

   
    /** 
     * Obtiene el valor de la propiedad codigo relacionado con la columna COD_BOT. 
     *  
     * @return el valor asignado a la propiedad codigo. 
     */ 
    public String getCodigo() { 
        return codigo; 
    } 
     
    /** 
     * Asigna un valor a la propiedad codigo, relacionado con la columna COD_BOT. 
     *  
     * @param codigo el valor a ser asignado a la propiedad codigo. 
     */ 
    public void setCodigo(String codigo) { 
        this.codigo = codigo; 
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
     * Obtiene el valor de la propiedad avatar relacionado con la columna AVATAR. 
     *  
     * @return el valor asignado a la propiedad avatar. 
     */ 
    public String getAvatar() { 
        return avatar; 
    } 
     
    /** 
     * Asigna un valor a la propiedad avatar, relacionado con la columna AVATAR. 
     *  
     * @param avatar el valor a ser asignado a la propiedad avatar. 
     */ 
    public void setAvatar(String avatar) { 
        this.avatar = avatar; 
    }

    /** 
     * Obtiene el valor de la propiedad descripcion relacionado con la columna DESCRIPCION. 
     *  
     * @return el valor asignado a la propiedad descripcion. 
     */ 
    public String getDescripcion() { 
        return descripcion; 
    } 
     
    /** 
     * Asigna un valor a la propiedad descripcion, relacionado con la columna DESCRIPCION. 
     *  
     * @param descripcion el valor a ser asignado a la propiedad descripcion. 
     */ 
    public void setDescripcion(String descripcion) { 
        this.descripcion = descripcion; 
    }

    /** 
     * Obtiene el valor de la propiedad tipo relacionado con la columna TIPO. 
     *  
     * @return el valor asignado a la propiedad tipo. 
     */ 
    public TipoBotEnum getTipo() { 
        return tipo; 
    } 
     
    /** 
     * Asigna un valor a la propiedad tipo, relacionado con la columna TIPO. 
     *  
     * @param tipo el valor a ser asignado a la propiedad tipo. 
     */ 
    public void setTipo(TipoBotEnum tipo) { 
        this.tipo = tipo; 
    }

    /** 
     * Obtiene el valor de la propiedad estado relacionado con la columna ESTADO. 
     *  
     * @return el valor asignado a la propiedad estado. 
     */ 
    public EstadoBotEnum getEstado() { 
        return estado; 
    } 
     
    /** 
     * Asigna un valor a la propiedad estado, relacionado con la columna ESTADO. 
     *  
     * @param estado el valor a ser asignado a la propiedad estado. 
     */ 
    public void setEstado(EstadoBotEnum estado) { 
        this.estado = estado; 
    }

    /** 
     * Obtiene el valor de la propiedad cliente relacionado con la entidad Cliente. 
     *  
     * @return el valor asignado a la propiedad cliente 
     */ 
    public Cliente getCliente() { 
        return cliente; 
    } 
     
    /** 
     * Asigna un valor a la propiedad cliente, relacionado con la entidad Cliente. 
     *  
     * @param cliente el valor a ser asignado a la propiedad cliente 
     */ 
    public void setCliente(Cliente cliente) { 
        this.cliente = cliente; 
    }

    /** 
     * Obtiene el valor de la propiedad contactosSocialMedia relacionado con la entidad BotSocialMedia. 
     *  
     * @return el valor asignado a la propiedad contactosSocialMedia 
     */ 
    public List<BotSocialMedia> getContactosSocialMedia() { 
        return contactosSocialMedia; 
    } 
     
    /** 
     * Asigna un valor a la propiedad contactosSocialMedia, relacionado con la entidad BotSocialMedia. 
     *  
     * @param contactosSocialMedia el valor a ser asignado a la propiedad contactosSocialMedia 
     */ 
    public void setContactosSocialMedia(List<BotSocialMedia> contactosSocialMedia) { 
        this.contactosSocialMedia = contactosSocialMedia; 
    }

    /** 
     * Obtiene el valor de la propiedad reglas relacionado con la entidad Regla. 
     *  
     * @return el valor asignado a la propiedad reglas 
     */ 
    public List<Regla> getReglas() { 
        return reglas; 
    } 
     
    /** 
     * Asigna un valor a la propiedad reglas, relacionado con la entidad Regla. 
     *  
     * @param reglas el valor a ser asignado a la propiedad reglas 
     */ 
    public void setReglas(List<Regla> reglas) { 
        this.reglas = reglas; 
    }

    /** 
     * Obtiene el valor de la propiedad sinonimos relacionado con la entidad Sinonimo. 
     *  
     * @return el valor asignado a la propiedad sinonimos 
     */ 
    public List<Sinonimo> getSinonimos() { 
        return sinonimos; 
    } 
     
    /** 
     * Asigna un valor a la propiedad sinonimos, relacionado con la entidad Sinonimo. 
     *  
     * @param sinonimos el valor a ser asignado a la propiedad sinonimos 
     */ 
    public void setSinonimos(List<Sinonimo> sinonimos) { 
        this.sinonimos = sinonimos; 
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
        if (!(object instanceof Bot)) { 
            igual = false; 
        } 
        Bot other = (Bot) object; 
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
        return "Bot[codigo=" + codigo + "]"; 
    }     

} 
