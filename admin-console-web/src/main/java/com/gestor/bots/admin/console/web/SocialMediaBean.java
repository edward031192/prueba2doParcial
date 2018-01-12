/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestor.bots.admin.console.web;

import com.gestor.bots.admin.console.model.SocialMedia;
import com.gestor.bots.admin.console.servicio.SocialMediaService;
import com.gestor.bots.admin.console.web.common.BaseBean;
import com.gestor.bots.exception.CreacionException;
import com.gestor.bots.exception.ModificacionException;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.commons.beanutils.BeanUtils;

/**
 *
 * @author Hendrix
 */
@Named
@ViewScoped
public class SocialMediaBean extends BaseBean implements Serializable {

    @Inject
    private SocialMediaService socialMediaService;

    private List<SocialMedia> socialMediaList;

    private SocialMedia socialMedia;
    private SocialMedia socialMediaSel;

    @PostConstruct
    public void init() {
        this.socialMediaList = this.socialMediaService.obtenerTodos();
    }

    @Override
    public void nuevo() {
        super.nuevo();
        this.socialMedia = new SocialMedia();
    }

    @Override
    public void modificar() {
        super.modificar();
        this.socialMedia = new SocialMedia();
        try {
            BeanUtils.copyProperties(this.socialMedia, this.socialMediaSel);
        } catch (Exception ex) {

        }
    }

    @Override
    public void consultar() {
        super.consultar();
        this.socialMedia = this.socialMediaSel;
    }

    public void guardar() {
        try {
            if (super.isEnModificar()) {
                this.socialMediaService.modificar(socialMedia);
                FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Modificacion", "Se modifico la red social: " + this.socialMedia.getNombre());
                FacesContext.getCurrentInstance().addMessage(null, msg);
            } else {
                this.socialMediaService.crear(socialMedia);
                FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Creacion", "Se creo la red social: " + this.socialMedia.getNombre());
                FacesContext.getCurrentInstance().addMessage(null, msg);
            }
        } catch (Exception e) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error ", "Ocurrio un error");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }

    public List<SocialMedia> getSocialMediaList() {
        return socialMediaList;
    }

    public SocialMedia getSocialMedia() {
        return socialMedia;
    }

    public void setSocialMedia(SocialMedia socialMedia) {
        this.socialMedia = socialMedia;
    }

    public SocialMedia getSocialMediaSel() {
        return socialMediaSel;
    }

    public void setSocialMediaSel(SocialMedia socialMediaSel) {
        this.socialMediaSel = socialMediaSel;
    }

}
