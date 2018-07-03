/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.mastercheft;

/**
 *
 * @author Jamm
 */
public class Receta {
    
    private String nombreReceta;
    private Ingrediente[] ingredientes;

    public String getNombreReceta() {
        return nombreReceta;
    }

    public void setNombreReceta(String nombreReceta) {
        this.nombreReceta = nombreReceta;
    }

    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    @Override
    public String toString() {
        return "Nueva receta:"+ getNombreReceta(); //To change body of generated methods, choose Tools | Templates.
    }
}
