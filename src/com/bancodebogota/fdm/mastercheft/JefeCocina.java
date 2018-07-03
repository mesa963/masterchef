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
public class JefeCocina extends Persona{
    
    private String nivelAcademico;
    private int salario;
    private Cocina cocina;
    
    
     
    
    public String getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(String NivelAcademico) {
        this.nivelAcademico = NivelAcademico;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int Salario) {
        this.salario = Salario;
    }
    

    /**
     * @return the cocina
     */
    public Cocina getCocina() {
        return cocina;
    }

    /**
     * @param cocina the cocina to set
     */
    public void setCocina(Cocina cocina) {
        this.cocina = cocina;
    }
    
}
