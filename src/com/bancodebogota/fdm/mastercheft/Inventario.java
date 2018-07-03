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
public class Inventario {
    
    private int idinventario;
    private Ingrediente[] ingredientes;

    public int getIdinventario() {
        return idinventario;
    }

    public void setIdinventario(int idinventario) {
        this.idinventario = idinventario;
    }

    
    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }
    
     public void agregarIngrediente(Ingrediente[] ingredientes)
    {
        for (int i = 0; i < ingredientes.length ; i++) {
            System.out.println(ingredientes[i]);
        }
    }
     @Override
    public String toString() {
        return "Nuevo Inventario --- IdInventario:"+ idinventario; //To change body of generated methods, choose Tools | Templates.
    }
    
}
