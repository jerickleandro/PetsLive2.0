/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.petslive.controladores;

/**
 *
 * @author Erick
 */



import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
 
@ManagedBean (name = "controleSlide1")
public class ImagesViewSlide1 {
     private List<String> images;
     
    @PostConstruct
    public void init() {
        images = new ArrayList<String>();
        for (int i = 1; i <= 3; i++) {
            images.add("nature" + i + ".jpg");
        }
    }
 
    public List<String> getImages() {
        return images;
    }
}
