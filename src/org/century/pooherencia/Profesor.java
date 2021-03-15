package org.century.pooherencia;

import java.util.Collection;

public class Profesor extends Persona{

    public Profesor(){
        System.out.println("PROFESOR: Inicializando constructor");
    }

    private String asignature;

    public Profesor(String nombre, String apellido){
        super(nombre, apellido);
    }

    public Profesor(String nombre, String apellido, String asignature){
        this(nombre, apellido);
        this.asignature = asignature;
    }


    public String getAsignature() {
        return asignature;
    }

    public void setAsignature(String asignature) {
        this.asignature = asignature;
    }

    @Override
    public String saludar() {
        return "Buenos dias soy " + getName() +", profesor de " + this.asignature;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProfesor{" +
                "asignature='" + asignature + '\'' +
                '}';
    }
}
