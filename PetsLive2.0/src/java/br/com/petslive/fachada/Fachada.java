/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.petslive.fachada;

import br.com.petslive.negocio.Animal;
import br.com.petslive.negocio.Cliente;
import br.com.petslive.repositorios.implementacoes.FabricaRepositorio;
import br.com.petslive.repositorios.implementacoes.RepositorioAnimalImplDB;
import br.com.petslive.repositorios.interfaces.RepositorioGenerico;
import java.util.List;

/**
 *
 * @author Erick
 */
public class Fachada {
    private RepositorioGenerico<Animal, Integer> repositorioAnimal = null;
    private RepositorioGenerico<Cliente, Integer> repositorioCliente = null;
    private static Fachada mySelf = null;
    private Fachada(){
    this.repositorioAnimal = FabricaRepositorio.criarRepositorio(FabricaRepositorio.ANIMAL, FabricaRepositorio.DB);
    this.repositorioCliente = FabricaRepositorio.criarRepositorio(FabricaRepositorio.CLIENTE, FabricaRepositorio.DB);
    }
    public static Fachada getInstance(){
        if(mySelf == null)
            mySelf = new Fachada();
        return mySelf;
    }
    
    public void inserirAnimal(Animal a){
        this.repositorioAnimal.inserir(a);
    }
    public void alterarAnimal(Animal a) throws Exception{
        this.repositorioAnimal.alterar(a);
    }
    public Animal recuperarAnimal(Integer id){
        return this.repositorioAnimal.recuperar(id);
    }
    public void deletarAnimal(Animal a){
        this.repositorioAnimal.deletar(a);
    }
    public List<Animal> listarTodosAnimal(){
        return this.repositorioAnimal.listarTodos();    
    }
    public void inserirCliente(Cliente c){
        this.repositorioCliente.inserir(c);
    }
    public void alterarCliente(Cliente c) throws Exception{
        this.repositorioCliente.alterar(c);
    }
    public Cliente recuperarCliente(Integer id){
        return this.repositorioCliente.recuperar(id);
    }
    public void deletarCliente(Cliente c){
        this.repositorioCliente.deletar(c);
    }
    public List<Cliente> listarTodosCliente(){
        return this.repositorioCliente.listarTodos();    
    }
    
    
    
    
}
