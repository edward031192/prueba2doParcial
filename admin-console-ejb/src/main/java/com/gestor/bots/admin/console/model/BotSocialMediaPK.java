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
import javax.persistence.Embeddable;

/**
 * La Clase BotSocialMediaPK representa a la clave primaria de la tabla BOT_SOCIAL_MEDIA.
 *
 * @author Gestor
 * @version 1.0
 */
@Embeddable
public class BotSocialMediaPK implements Serializable {

    /**
     * Constante autogenerada serialVersionUID.
     */
    private static final long serialVersionUID = 944750260265083881L;

    /**  
     * Representa a la columna COD_SOCIAL_MEDIA. 
     */
    @Column(name = "COD_SOCIAL_MEDIA" , nullable = false , length = 15)
    private String codigoSocialMedia;
    
    /**  
     * Representa a la columna COD_BOT. 
     */
    @Column(name = "COD_BOT" , nullable = false , length = 10)
    private String codigoBot;
    

    /**
     * Crea una nueva instancia de la entidad BotSocialMediaPK.
     */
    public BotSocialMediaPK() {
    }
	
    /** 
     * Crea una nueva instancia de BotSocialMediaPK. 
     *  
     * @param codigoSocialMedia valor a ser asignado a la propiedad codigoSocialMedia
     * @param codigoBot valor a ser asignado a la propiedad codigoBot
 
     */ 
    public BotSocialMediaPK(String codigoSocialMedia, String codigoBot) { 
        this.codigoSocialMedia = codigoSocialMedia;
        this.codigoBot = codigoBot;
 
    }
   
    /** 
     * Obtiene el valor de la propiedad codigoSocialMedia relacionado con la columna COD_SOCIAL_MEDIA. 
     *  
     * @return el valor asignado a la propiedad codigoSocialMedia. 
     */ 
    public String getCodigoSocialMedia() { 
        return codigoSocialMedia; 
    } 
     
    /** 
     * Asigna un valor a la propiedad codigoSocialMedia, relacionado con la columna COD_SOCIAL_MEDIA. 
     *  
     * @param codigoSocialMedia el valor a ser asignado a la propiedad codigoSocialMedia. 
     */ 
    public void setCodigoSocialMedia(String codigoSocialMedia) { 
        this.codigoSocialMedia = codigoSocialMedia; 
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
     * {@inheritDoc} 
     */ 
    @Override 
    public int hashCode() { 
        int hash = 0; 
        hash += codigoSocialMedia != null ? codigoSocialMedia.hashCode() : 0;
        hash += codigoBot != null ? codigoBot.hashCode() : 0; 
        return hash; 
    }

    /** 
     * {@inheritDoc} 
     */ 
    @Override 
    public boolean equals(Object object) { 
        boolean igual = true; 
        if (!(object instanceof BotSocialMediaPK)) { 
            igual = false; 
        } 
        BotSocialMediaPK other = (BotSocialMediaPK) object; 
                if ((this.codigoSocialMedia == null && other.codigoSocialMedia != null) 
                || (this.codigoSocialMedia != null && !this.codigoSocialMedia 
                        .equals(other.codigoSocialMedia))) { 
            igual = false; 
        }
        if ((this.codigoBot == null && other.codigoBot != null) 
                || (this.codigoBot != null && !this.codigoBot 
                        .equals(other.codigoBot))) { 
            igual = false; 
        } 
        return igual; 
    }

    /** 
     * {@inheritDoc} 
     */ 
    @Override 
    public String toString() { 
        return "BotSocialMediaPK[" +  
                " codigoSocialMedia=" + codigoSocialMedia +
                ",codigoBot=" + codigoBot +
                "]";                        
    }

} 
