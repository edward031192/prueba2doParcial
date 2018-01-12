/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestor.bots.admin.console.servicio;

import com.gestor.bots.admin.console.dao.SocialMediaDAO;
import com.gestor.bots.admin.console.model.SocialMedia;
import com.gestor.bots.exception.CreacionException;
import com.gestor.bots.exception.EliminacionException;
import com.gestor.bots.exception.ModificacionException;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

/**
 *
 * @author Hendrix
 */
@LocalBean
@Stateless
public class SocialMediaService {
    
    @EJB
    private SocialMediaDAO socialMediaDAO;
    
    public List<SocialMedia> obtenerTodos() {
        return this.socialMediaDAO.findAll();
    }
    
    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void crear(SocialMedia socialMedia) throws CreacionException {
        try {
            this.socialMediaDAO.insert(socialMedia);
        } catch (Exception e) {
            throw new CreacionException("ERR100", "Error al crear: "+e.getMessage(), e);
        } 
    }
    
    public void modificar(SocialMedia socialMedia){
        try{
            this.socialMediaDAO.update(socialMedia);
        }catch (Exception e){
            throw new ModificacionException("ERR200", e.getMessage(), e);
        }
    }
    
    public void eliminar(SocialMedia socialMedia){
        try{
            this.socialMediaDAO.remove(socialMedia);
        }catch (Exception e){
            throw new EliminacionException("ERR300", e.getMessage(), e);
        }
    }
    
  
    
}
