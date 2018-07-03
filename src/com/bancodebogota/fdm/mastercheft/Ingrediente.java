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
public class Ingrediente {
    
    private String nombre;
    private int cantidad;
    private String tipoIngrediente;
    private String estadoIngrediente;
    private String unidadMedida;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipoIngrediente() {
        return tipoIngrediente;
    }

    public void setTipoIngrediente(String tipoIngrediente) {
        this.tipoIngrediente = tipoIngrediente;
    }

    public String getEstadoIngrediente() {
        return estadoIngrediente;
    }

    public void setEstadoIngrediente(String estadoIngrediente) {
        this.estadoIngrediente = estadoIngrediente;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    @Override
    public String toString() {
        return "Nuevo Ingrediente ---- Cantidad: "+getCantidad() +" -- "+"Estado: "+getEstadoIngrediente()+" -- "+"Nombre: "+getNombre()+" -- "+"Tipo Ingrediente: "+getTipoIngrediente()+" -- "+"Unidad de medida: "+getUnidadMedida(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
 
    
    
}
