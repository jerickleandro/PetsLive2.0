/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.petslive.negocio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Erick
 */
@Entity
@Table
public class Animal {
    @Id
    @Column (name = "id_animal",nullable = false)
    private int id_animal;
    @Column (name = "nome_animal", nullable = false, length = 100)
    private String nome_animal;
    @Column (name = "especie", length = 50)
    private String especie;
    @Column (name = "raca", length = 50)
    private String raca;
    @Column (name = "idade") 
    private int idade;
    @Column (name = "sexo")
    private char sexo;
    
}
