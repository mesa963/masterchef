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
public class Cocina {
    private int idcocina;
    private String especialidad;
    private String direccion;
    private Receta [] recetas;
    private Inventario invetario;
    

    public Receta[] getRecetas() {
        return recetas;
    }

    public void setRecetas(Receta[] recetas) {
        this.recetas = recetas;
    }
    
    

    public Inventario getIdinvetario() {
        return invetario;
    }

    public void setIdinvetario(Inventario idinvetario) {
        this.invetario = idinvetario;
    }



    public int getIdcocina() {
        return idcocina;
    }

    public void setIdcocina(int idcocina) {
        this.idcocina = idcocina;
    }
    private String telefono;
    private JefeCocina jefecocina;

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public JefeCocina getJefecocina() {
        return jefecocina;
    }

    public void setJefecocina(JefeCocina jefecocina) {
        this.jefecocina = jefecocina;
    }
    
    
    public void crearCocina(Cocina nuevacocina)
    {
        System.out.println(nuevacocina);
    }
    
    @Override
   public String toString() {
     return "Nueva Cocina :ID: "+ idcocina +" -- "+"Especialidad: "+especialidad+" -- "+"Direccion: "+direccion; //To change body of generated methods, choose Tools | Templates.
   }
    
    
    
}
