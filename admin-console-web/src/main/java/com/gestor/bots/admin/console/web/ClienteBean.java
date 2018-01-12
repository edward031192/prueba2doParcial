/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestor.bots.admin.console.web;

import com.gestor.bots.admin.console.model.Cliente;
import com.gestor.bots.admin.console.servicio.ClienteService;
import com.gestor.bots.admin.console.web.common.BaseBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.model.SelectItem;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Eduardo Vera
 */
@Named
@ViewScoped
public class ClienteBean extends BaseBean implements Serializable {
    
    @Inject
    private ClienteService clienteService;

    private List<Cliente> clienteList;
    private ArrayList<SelectItem> clientes=null;

    private Cliente cliente;
    private Cliente clienteSel;

    @PostConstruct
    public void init() {  
        
        this.clienteList = this.clienteService.obtenerTodos();
        
        this.clientes = getClientes();
    }

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public Cliente getCliente() {
  
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getClienteSel() {
        return clienteSel;
    }

    public void setClienteSel(Cliente clienteSel) {
        this.clienteSel = clienteSel;
    }
    
    
    public ArrayList<SelectItem> getClientes(){
        if(clientes==null){
            for(Cliente cli: this.clienteList){
                SelectItem s = new SelectItem(cli.getRuc(), cli.getRazonSocial());
                clientes.add(s);
            }
        }
        return clientes;
    }
    
    
}
