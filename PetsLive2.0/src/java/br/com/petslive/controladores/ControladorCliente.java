/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.petslive.controladores;

import br.com.petslive.negocio.Cliente;
import br.com.petslive.repositorios.implementacoes.FabricaRepositorio;
import br.com.petslive.repositorios.interfaces.RepositorioGenerico;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Erick
 */
@ManagedBean
@SessionScoped
public class ControladorCliente {
    
    private RepositorioGenerico<Cliente, Integer> repositorioCliente = null;
    
    
    private Cliente selectedCliente = null;
    private ArrayList<Cliente> cliente;
    
    public ControladorCliente(){
        this.repositorioCliente = FabricaRepositorio.criarRepositorio(FabricaRepositorio.CLIENTE, FabricaRepositorio.DB);
        cliente = new ArrayList<Cliente>();
        
    }
    
    
    public String inserirCliente(Cliente c){
        this.repositorioCliente.inserir(c);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage (  "Cliente cadastrado!"));
        return "listaClientes.xhtml";
    }
    
    public String alterarCliente (Cliente c){
        try{
            this.repositorioCliente.alterar(c);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cliente alterado com sucesso!"));
        }catch(Exception ex){
            Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "listaCliente.xhtml";
        
    }
    
    public Cliente recuperarClienteId(Integer id){
        return this.repositorioCliente.recuperar(id);
    }
    public void deletarCliente(Cliente c){
        this.repositorioCliente.deletar(c);
    }
    public List<Cliente> listarTodos(){
        return this.repositorioCliente.listarTodos();
    }
    public Cliente getSelectedCliente(){
        return selectedCliente;
    }
    public void setSelectedCliente(Cliente selectedCliente){
        this.selectedCliente = selectedCliente;
    }
    
    
}
