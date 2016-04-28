/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.petslive.repositorios.implementacoes;

import br.com.petslive.negocio.Animal;
import br.com.petslive.repositorios.interfaces.RepositorioGenerico;
import br.edu.ifpe.infraestrutura.dao.DaoManagerHiber;
import java.util.List;

/**
 *
 * @author Erick
 */
public class RepositorioAnimalImplDB implements RepositorioGenerico<Animal, Integer>{
    DaoManagerHiber dao = DaoManagerHiber.getInstance(); 
    
    
    @Override
    public void inserir(Animal t) {
        dao.persist(t);
    }

    @Override
    public void alterar(Animal t) {
        dao.update(t);
    }

    @Override
    public Animal recuperar(Integer g) {
        
        return ((Animal)dao.recover("from Animal where id_animal="+g).get(0));
        
        }
    
    public void deletar(Animal t){
        dao.delete(t);
    }

    @Override
    public List<Animal> listarTodos() {
        return dao.recover("from Animal");
    }
    
}
