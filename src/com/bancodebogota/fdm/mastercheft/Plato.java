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
public class Plato {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getPorcion() {
        return porcion;
    }

    public void setPorcion(String porcion) {
        this.porcion = porcion;
    }
    private String nombre;
    private int valor ;
    private String porcion;
    
      @Override
    public String toString() {
        return "Nuevo Plato --- Nombre Plato:"+ nombre +"-- valor:"+valor+" -- porcion:"+porcion; //To change body of generated methods, choose Tools | Templates.
    }
    
}
  