package validador;

import java.util.ArrayList;
import java.util.List;

public class Alumnos{

    private String nombre;
    private String legajo;
    private List<Inscripcion> inscripciones;

    public Alumnos(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.inscripciones = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Alumnos{" +
                "nombre='" + nombre + '\'' +
                ", legajo='" + legajo + '\'' +
                ", inscripciones=" + inscripciones +
                '}';
    }

    public void inscribirMateria(Materias materias) {
        Inscripcion inscripcion = new Inscripcion(this, materias);
        inscripciones.add(inscripcion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public List<Inscripcion> getInscripcion() {
        return inscripciones;
    }

    public boolean aprobada(Materias materias) {
        if (materias.getNota() >= 4) {
            return true;
        }
        return false;
    }
}
