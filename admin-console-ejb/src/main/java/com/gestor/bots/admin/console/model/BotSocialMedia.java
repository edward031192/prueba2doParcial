/*
 * Gestor
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
 
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * CLASE DE REDES SOCIALES
 *
 * @author Gestor
 * @version 1.0
 */
@Entity
@Table(name = "BOT_SOCIAL_MEDIA")
public class BotSocialMedia implements Serializable {

    /**
     * Constante autogenerada serialVersionUID.
     */
    private static final long serialVersionUID = -3888435954597978090L;

    /** Propiedad que representa a la clave primaria de la entidad BotSocialMedia. */
    @EmbeddedId
    private BotSocialMediaPK pk = new BotSocialMediaPK();
    

    /**  
     * Representa a la columna USUARIO. 
     */
    @Column(name = "USUARIO" , nullable = false , length = 100)
    private String usuario;
    
    /**  
     * Representa a la columna NOMBRE. 
     */
    @Column(name = "NOMBRE" , nullable = false , length = 100)
    private String nombre;
    
    /**  
     * Representa a la columna URL. 
     */
    @Column(name = "URL" , nullable = false , length = 200)
    private String url;
    
    /** Propiedad  socialMedia representa una relación de muchos a uno con la Entidad SocialMedia.*/;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "COD_SOCIAL_MEDIA", referencedColumnName = "COD_SOCIAL_MEDIA", insertable = false, updatable = false) 
    private SocialMedia socialMedia;

    /** Propiedad  bot representa una relación de muchos a uno con la Entidad Bot.*/;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "COD_BOT", referencedColumnName = "COD_BOT", insertable = false, updatable = false) 
    private Bot bot;


    /**
     * Crea una nueva instancia de la entidad BotSocialMedia.
     */
    public BotSocialMedia() {
    }
	
    /** 
     * Crea una nueva instancia de la entidad BotSocialMedia de acuerdo a su clave primaria. 
     *  
     * @param pk valor para la clave primaria de la entidad BotSocialMedia. 
     */ 
    public BotSocialMedia(BotSocialMediaPK pk) { 
        this.pk = pk; 
    }

   
    /** 
     * Obtiene el valor de la propiedad pk relacionado con la columna . 
     *  
     * @return el valor asignado a la propiedad pk. 
     */ 
    public BotSocialMediaPK getPk() { 
        return pk; 
    } 
     
    /** 
     * Asigna un valor a la propiedad pk, relacionado con la columna . 
     *  
     * @param pk el valor a ser asignado a la propiedad pk. 
     */ 
    public void setPk(BotSocialMediaPK pk) { 
        this.pk = pk; 
    }

    /** 
     * Obtiene el valor de la propiedad usuario relacionado con la columna USUARIO. 
     *  
     * @return el valor asignado a la propiedad usuario. 
     */ 
    public String getUsuario() { 
        return usuario; 
    } 
     
    /** 
     * Asigna un valor a la propiedad usuario, relacionado con la columna USUARIO. 
     *  
     * @param usuario el valor a ser asignado a la propiedad usuario. 
     */ 
    public void setUsuario(String usuario) { 
        this.usuario = usuario; 
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
     * Obtiene el valor de la propiedad url relacionado con la columna URL. 
     *  
     * @return el valor asignado a la propiedad url. 
     */ 
    public String getUrl() { 
        return url; 
    } 
     
    /** 
     * Asigna un valor a la propiedad url, relacionado con la columna URL. 
     *  
     * @param url el valor a ser asignado a la propiedad url. 
     */ 
    public void setUrl(String url) { 
        this.url = url; 
    }

    /** 
     * Obtiene el valor de la propiedad socialMedia relacionado con la entidad SocialMedia. 
     *  
     * @return el valor asignado a la propiedad socialMedia 
     */ 
    public SocialMedia getSocialMedia() { 
        return socialMedia; 
    } 
     
    /** 
     * Asigna un valor a la propiedad socialMedia, relacionado con la entidad SocialMedia. 
     *  
     * @param socialMedia el valor a ser asignado a la propiedad socialMedia 
     */ 
    public void setSocialMedia(SocialMedia socialMedia) { 
        this.socialMedia = socialMedia; 
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
        int hash = (pk != null) ? pk.hashCode() : 0; 
        return hash; 
    }

    /** 
     * {@inheritDoc} 
     */ 
    @Override 
    public boolean equals(Object object) { 
        boolean igual = true; 
        if (!(object instanceof BotSocialMedia)) { 
            igual = false; 
        } 
        BotSocialMedia other = (BotSocialMedia) object; 
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
        return "BotSocialMedia[pk=" + pk + "]"; 
    }     

} 
