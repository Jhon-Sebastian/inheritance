package org.century.pooherencia;

public class Persona {

    private String name;
    private String lastname;
    private Integer age;
    private String email;

    public Persona(){
        System.out.println("PERSONA: Inicializando constructor");
    }

    public Persona(String nombre, String apellido){
        this.name = nombre;
        this.lastname = apellido;
    }

    public Persona(String nombre, String apellido, Integer edad){
        this(nombre, apellido);
        this.age = edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Metodo saludar para ser sobreescrito y se cambie para probrar
    public String saludar(){
        return "Hola que tal!";
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", saludar=" + saludar() +
                '}';
    }
}
