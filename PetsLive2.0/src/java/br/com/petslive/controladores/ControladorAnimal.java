/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.petslive.controladores;

import br.com.petslive.negocio.Animal;
import br.com.petslive.repositorios.implementacoes.FabricaRepositorio;
import br.com.petslive.repositorios.implementacoes.RepositorioAnimalImplDB;
import br.com.petslive.repositorios.interfaces.RepositorioGenerico;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import sun.util.logging.PlatformLogger;



/**
 *
 * @author Erick
 */
@ManagedBean (name = "controleAnimal")
@SessionScoped
public class ControladorAnimal {
    
    private RepositorioGenerico<Animal, Integer> repositorioAnimal = null;
    private Animal selectedAnimal = null; 
    private ArrayList<Animal> animal; 
            
    public ControladorAnimal(){
        this.repositorioAnimal =FabricaRepositorio.criarRepositorio(FabricaRepositorio.ANIMAL, FabricaRepositorio.DB);
    
    animal = new ArrayList<Animal>();
    }        
            
            
    public String inserirAnimal(Animal a){
        this.repositorioAnimal.inserir(a);
         FacesContext.getCurrentInstance().
                addMessage(null, new FacesMessage("Parabéns!"+ "\n"+ "O Animal "+a.getNome_animal() +" "
                        + "foi cadastrado com sucesso!"));
         return "listaAnimais.xhtml";
    }
    public String alterarAnimal(Animal a) throws Exception{
        try{
        this.repositorioAnimal.alterar(a);
        FacesContext.getCurrentInstance().
                addMessage(null, new FacesMessage("Parabéns!"+ "\n"+ "O Animal "+a.getNome_animal() +" "
                        + "foi alterado com sucesso!"));
        }catch(Exception ex){
            Logger.getLogger(ControladorAnimal.class.getName()).log(Level.SEVERE,null,ex);
        }
        return "listaAnimais.xhtml";
    }
    public Animal recuperarAnimal(Integer id){
        return this.repositorioAnimal.recuperar(id);
    }
    public void deletarAnimal(Animal a){
        this.repositorioAnimal.deletar(a);
    }
    public List<Animal> listarTodos(){
        return this.repositorioAnimal.listarTodos();    
    }
    public Animal getSelectedAnimal(){
        return selectedAnimal;
    }
    public void setSelectedAnimal(Animal selectedAnimal){
        this.selectedAnimal = selectedAnimal;
    }
    
    
}
