package validador;

public class Main {
    public static void main(String[] args) {

        Alumnos alumno = new Alumnos("Juan", "123");
        Materias algoritmos = new Materias("Algoritmos y Estructura de Datos", 8);
        Materias paradigmas = new Materias("Paradigmas de Programacion", 7);
        Materias diseño = new Materias("Diseño de Sistemas", 9);

        alumno.inscribirMateria(algoritmos);
        alumno.inscribirMateria(paradigmas);
        alumno.inscribirMateria(diseño);

        Inscripcion inscripcionAlgoritmos = new Inscripcion(alumno, algoritmos);
        Inscripcion inscripcionParadigmas = new Inscripcion(alumno, paradigmas);
        Inscripcion inscripcionDiseno = new Inscripcion(alumno, diseño);

        System.out.println("¿Algoritmos aprobada? " + inscripcionAlgoritmos.aprobada());
        System.out.println("¿Paradigmas aprobada? " + inscripcionParadigmas.aprobada());
        System.out.println("¿Diseño aprobada? " + inscripcionDiseno.aprobada());

    }
}