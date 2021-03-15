package org.century.pooherencia;

public class EjemploHerenciaToString {
    public static void main(String[] args) {

        System.out.println("CREANDO INSTANCIAS ALUMNO");
        Alumno alumno = new Alumno("Sebastian","Cagua",19,"Instituto Nacional");
        alumno.setNoteLanguage(4.0);
        alumno.setNoteHistory(3.5);
        alumno.setNoteMath(5.0);
        alumno.setEmail("alumno@mail.com");

        System.out.println("CREANDO INSTANCIAS ALUMNO INTERNACIONAL");
        AlumnoInternacional alumnoInter = new AlumnoInternacional("Peter","Gosling","Australia");
        alumnoInter.setNameSchool("Fusacatan");
        alumnoInter.setNoteLanguage(1.0);
        alumnoInter.setNoteHistory(2.5);
        alumnoInter.setNoteMath(3.0);
        alumnoInter.setNameSchool("New Yersey");
        alumnoInter.setEmail("algun@mail.com");
        alumnoInter.setNotaIdiomas(6.0);

        System.out.println("CREANDO INSTANCIA DE PROFESOR");
        Profesor profesor = new Profesor("Yamit","Gúzman","Matematicas");
        profesor.setAge(34);
        profesor.setEmail("profe@mail.com");

        imprimir(alumno);
        imprimir(alumnoInter);
        imprimir(profesor);

    }

    public static void imprimir(Persona persona){
        System.out.println("==============INICIO=============");
        System.out.println(persona);
        System.out.println("==============FIN=================");
    }

}
