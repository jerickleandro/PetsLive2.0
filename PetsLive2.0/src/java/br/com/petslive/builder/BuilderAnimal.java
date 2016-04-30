/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.petslive.builder;

import br.com.petslive.negocio.Animal;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Erick
 */
@ManagedBean (name = "bAnimal")
@RequestScoped
public class BuilderAnimal {
    private int id_animal;
    private String nome_animal;
    private String especie;
    private String raca;
    private int idade;
    private char sexo;
    
    @Deprecated
    public BuilderAnimal(){}
    
    
    /**
     * @return the id_animal
     */
    public int getId_animal() {
        return id_animal;
    }

    /**
     * @param id_animal the id_animal to set
     */
    public void setId_animal(int id_animal) {
        this.id_animal = id_animal;
    }

    /**
     * @return the nome_animal
     */
    public String getNome_animal() {
        return nome_animal;
    }

    /**
     * @param nome_animal the nome_animal to set
     */
    public void setNome_animal(String nome_animal) {
        this.nome_animal = nome_animal;
    }

    /**
     * @return the especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * @return the raca
     */
    public String getRaca() {
        return raca;
    }

    /**
     * @param raca the raca to set
     */
    public void setRaca(String raca) {
        this.raca = raca;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
   public Animal builderAnimal(){
       return new Animal(this.id_animal, this.nome_animal, this.especie, this.raca, this.idade, this.sexo);
   } 
    
}
