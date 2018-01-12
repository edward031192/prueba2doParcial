/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestor.bots.admin.console.servicio;

import com.gestor.bots.admin.console.dao.UsuarioDAO;
import com.gestor.bots.admin.console.model.Usuario;
import com.gestor.bots.exception.CreacionException;
import com.gestor.bots.exception.EliminacionException;
import com.gestor.bots.exception.ModificacionException;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Gestor_1
 */
@LocalBean
@Stateless
public class UsuarioService {

    @EJB
    private UsuarioDAO usuarioDAO;

    public List<Usuario> obtenerTodos() {
        return this.usuarioDAO.findAll();
    }
    
    public void crear(Usuario usuario)  {
        try {
            this.usuarioDAO.insert(usuario);
        } catch (Exception e) {
            throw new CreacionException("ERR100", e.getMessage() ,e);
        }
    }
    
    public void modificar(Usuario usuario)  {
        try {
            this.usuarioDAO.update(usuario);
        } catch (Exception e) {
            throw new ModificacionException("ERR200", e.getMessage() ,e);
        }
    }
    
    public void eliminar(Usuario usuario)  {
        try {
            this.usuarioDAO.remove(usuario);
        } catch (Exception e) {
            throw new EliminacionException("ERR300", e.getMessage() ,e);
        }
    }

}
