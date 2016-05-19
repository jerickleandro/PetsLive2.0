/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.petslive.repositorios.implementacoes;


import br.com.petslive.negocio.Cliente;
import br.com.petslive.repositorios.interfaces.RepositorioGenerico;
import br.edu.ifpe.infraestrutura.dao.DaoManagerHiber;
import java.util.List;

/**
 *
 * @author Erick
 */
public class RepositorioClienteImplDB implements RepositorioGenerico<Cliente, Integer> {
    DaoManagerHiber dao = DaoManagerHiber.getInstance();
    
    
    
    @Override
    public void inserir(Cliente t) {
        dao.persist(t);
    }

    @Override
    public void alterar(Cliente t) throws Exception {
        dao.update(t);
    }

    @Override
    public Cliente recuperar(Integer g) {
        try{
        return ((Cliente)dao.recover("from Cliente where id_cliente="+g).get(0));
        }catch(IndexOutOfBoundsException  ex){
            return null;
        }
    }

    @Override
    public void deletar(Cliente t) {
        dao.delete(t);
    }

    @Override
    public List<Cliente> listarTodos() {
        return dao.recover("from Cliente");
    }
    
}
