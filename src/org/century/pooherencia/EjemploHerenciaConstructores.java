package org.century.pooherencia;

public class EjemploHerenciaConstructores {
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
        System.out.println();
        System.out.println("----------DATOS PERSONA----------");
        System.out.println("NOMBRE: "+persona.getName()
        + " APELLIDO: " + persona.getLastname()
        + " EDAD: " + persona.getAge()
        + " EMAIL: " + persona.getEmail());

        //Validamos si la el Argumento es intancia de Alumno
        if(persona instanceof  Alumno){
            //Da error ya que una clase padre no puede acceder a los metodos hijos
            //entonces se hace un cast para que si pueda
            System.out.println("----------DATOS ALUMNO----------");
            System.out.println("Institucion " + ((Alumno) persona).getNameSchool());
            System.out.println("Nota matematicas " + ((Alumno) persona).getNoteMath());
            System.out.println("Nota Historia " + ((Alumno) persona).getNoteHistory());
            System.out.println("Nota Castellano " + ((Alumno) persona).getNoteLanguage());

            if(persona instanceof AlumnoInternacional){
                System.out.println("----------DATOS ALUMNOINTERNACIONAL----------");
                System.out.println("Nota Idiomas: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
            }
            System.out.println("*************Promedio*****************");
            System.out.println(((Alumno) persona).calcularPromedio());
        }

        if(persona instanceof Profesor){
            System.out.println("----------DATOS PROFESOR----------");
            System.out.println("Materia Dictada: " + ((Profesor) persona).getAsignature());
        }
        System.out.println("\n===================SOBREESCRITURA SALUDAR==========================");
        System.out.println(persona.saludar());
    }

}
