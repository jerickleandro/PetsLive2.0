/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.petslive.fachada;

import br.com.petslive.negocio.Animal;
import br.com.petslive.repositorios.implementacoes.RepositorioAnimalImplDB;
import br.com.petslive.repositorios.interfaces.RepositorioGenerico;
import java.util.List;

/**
 *
 * @author Erick
 */
public class Fachada {
    private RepositorioGenerico<Animal, Integer> repositorioAnimal = null;
    private static Fachada mySelf = null;
    private Fachada(){
    this.repositorioAnimal = new RepositorioAnimalImplDB();
    }
    public static Fachada getInstance(){
        if(mySelf == null)
            mySelf = new Fachada();
        return mySelf;
    }
    
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

    
    
    
    
}
