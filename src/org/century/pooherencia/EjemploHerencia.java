package org.century.pooherencia;

public class EjemploHerencia {
    public static void main(String[] args){

        System.out.println("====== Creando la instancia de la clase Alumno =======");
        //Alumno -> extends Persona
        Alumno alumno = new Alumno();
        alumno.setName("Sebastian");
        alumno.setLastname("Cagua");
        alumno.setNoteHistory(4.5);
        alumno.setNoteLanguage(3.5);
        alumno.setAge(19);
        alumno.setNoteMath(5.0);

        System.out.println("====== Creando la instancia de la clase AlumnoInternacional =======");
        // AlumnoInternacional -> extends de Alumno
        AlumnoInternacional alumnoInt= new AlumnoInternacional();
        alumnoInt.setName("Piter");
        alumnoInt.setLastname("Gosling");
        alumnoInt.setPais("Australia");
        alumnoInt.setAge(15);
        alumnoInt.setNameSchool("Institu Nacional");
        alumnoInt.setNotaIdiomas(4.8);

        System.out.println("====== Creando la instancia de la clase Profesor =======");
        Profesor profesor = new Profesor();
        profesor.setName("Carlos");
        profesor.setLastname("Alfonso");
        profesor.setAsignature("Matematicas");

        System.out.println(alumno.getName() + " " + alumno.getLastname() + "\n");
        System.out.println("Profesor [" + profesor.getAsignature() + "] => "
                + profesor.getName()
                + "" + profesor.getLastname());


        System.out.println("==========_- -----_ ================");
        System.out.println("\n" + "CLASE PADRE DE LAS CLASES HIJAS");
        //Class -> clase de java que contiene toda la metadata -> informacion de la clase
        // con su jerarquia, nombre y demas
        Class claseAlumnoInt = alumnoInt.getClass();

        //Hacemos una iteracion para que lo haga hasta que no encuentre una clase padre
        while(claseAlumnoInt.getSuperclass() != null){
            String claseHija = claseAlumnoInt.getName();
            String clasePadre = claseAlumnoInt.getSuperclass().getName();
            System.out.println("claseHija = " + claseHija + " -> clase padre [" + clasePadre + "]");
            claseAlumnoInt = claseAlumnoInt.getSuperclass();
        }

    }
}
