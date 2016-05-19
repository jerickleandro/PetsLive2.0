/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.petslive.repositorios.implementacoes;

import br.com.petslive.repositorios.interfaces.RepositorioGenerico;

/**
 *
 * @author Erick
 */
public class FabricaRepositorio {
    public static final int DB = 1;
    public static final int ANIMAL = 1;
    public static final int CLIENTE = 2;
    
    public static RepositorioGenerico criarRepositorio (int tipoNegocio, int tipoPersistencia){
        if(tipoPersistencia == DB){
            if(tipoNegocio == ANIMAL){
                return new RepositorioAnimalImplDB();
            }
            if(tipoNegocio == CLIENTE){
                return new RepositorioClienteImplDB();
            }
        }
    return null;
    }
    
    
}
