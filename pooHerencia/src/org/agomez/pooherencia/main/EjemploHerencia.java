package org.agomez.pooherencia.main;

import org.agomez.pooherencia.models.Alumno;
import org.agomez.pooherencia.models.AlumnoInternacional;
import org.agomez.pooherencia.models.Profesor;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("Andrés");
        alumno.setApellidos("Gómez");
        alumno.setCalificacionMatematicas(8.5);
        alumno.setCalificacionHistoria(10);
        alumno.setCalificacionQuimica(9.78);

        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Peter");
        alumnoInt.setApellidos("Parker");
        alumnoInt.setNombreColegio("Cambridge");
        alumnoInt.setIdiomas(10);
        alumnoInt.setPais("USA");

        //Ejemplo de herencia con sobrecarga de constructores
        AlumnoInternacional alumnoInt1 = new AlumnoInternacional("Leo", "Messi", 37,
                            "Colegio del Futbol", "Argemtina");


        Profesor profesor = new Profesor();
        profesor.setNombre("Arturo");
        profesor.setApellidos("Hernandez");
        profesor.setMateria("Matemáticas");


        System.out.println("Alumno: " + alumno.getNombre() + " " + alumno.getApellidos());
        System.out.println("Profesor: " + profesor.getNombre() + " " + profesor.getApellidos());
        System.out.println("\t Materia: " + profesor.getMateria());

        // COMO RECORRER LA HERENCIA DE UNA CLASE:
        Class clase = alumnoInt.getClass();
        while(clase.getSuperclass() != null) {
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }

        System.out.println(alumno.saludar());
        System.out.println(profesor.saludar());
        System.out.println(alumnoInt.saludar());

    }

}
