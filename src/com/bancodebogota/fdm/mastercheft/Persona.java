package com.bancodebogota.fdm.mastercheft;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jamm
 */
public abstract class Persona {

  private String nombre;
  private String telefono;
  private String tipoId;
  private String id;

    public String getTipoId() {
        return tipoId;
    }

    public void setTipoId(String TipoId) {
        this.tipoId = TipoId;
    }

    public String getId() {
        return id;
    }

    public void setId(String Id) {
        this.id = id;
    }

  
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String Telefono) {
        this.telefono = Telefono;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.nombre = nombre;
    }
        
}
