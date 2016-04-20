/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.petslive.controladores;

import br.com.petslive.negocio.Animal;
import br.com.petslive.repositorios.interfaces.RepositorioGenerico;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



/**
 *
 * @author Erick
 */
@ManagedBean (name = "controleAnimal")
@SessionScoped
public class ControladorAnimal {
    
    private RepositorioGenerico<Animal, Integer> repositorioAnimal = null;
    private Animal selectedAnimal = null;        
            
            
            
            
    public void inserirAnimal(Animal a){
        this.repositorioAnimal.inserir(a);
    }
    public void alterarAnimal(Animal a){
        this.repositorioAnimal.alterar(a);
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
