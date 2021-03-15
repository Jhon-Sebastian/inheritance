package org.century.pooherencia;

public class Alumno extends Persona{

    private String nameSchool;
    private Double noteMath;
    private Double noteLanguage;
    private Double noteHistory;

    public Alumno(){
        System.out.println("ALUMNO: Inicializando constructor");
    }
    public Alumno(String nombre, String apellido){
        super(nombre,apellido);
    }

    public Alumno(String nombre, String apellido, Integer edad){
        super(nombre,apellido,edad);
    }

    public Alumno(String nombre, String apellido, Integer edad, String nameSchool){
        this(nombre,apellido,edad);
        this.nameSchool = nameSchool;
    }

    public String getNameSchool() {
        return nameSchool;
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    public Double getNoteMath() {
        return noteMath;
    }

    public void setNoteMath(Double noteMath) {
        this.noteMath = noteMath;
    }

    public Double getNoteLanguage() {
        return noteLanguage;
    }

    public void setNoteLanguage(Double noteLanguage) {
        this.noteLanguage = noteLanguage;
    }

    public Double getNoteHistory() {
        return noteHistory;
    }

    public void setNoteHistory(Double noteHistory) {
        this.noteHistory = noteHistory;
    }

    @Override
    public String saludar(){
        return  super.saludar() + " soy un alumno y mi nombre es " + getName();
    }

    public double calcularPromedio(){
        System.out.println("calcular promedio: " + Alumno.class.getCanonicalName());
        return ((this.noteMath + this.noteHistory + this.noteLanguage)/3);
    }

    @Override
    public String toString() {
        return super.toString()+"\nAlumno{" +
                "nameSchool='" + nameSchool + '\'' +
                ", noteMath=" + noteMath +
                ", noteLanguage=" + noteLanguage +
                ", noteHistory=" + noteHistory +
                ", calcularPromedio=" + calcularPromedio() +
                '}';
    }
}
