package validador;

public class Materias {

    private String nombre;
    private int nota;


    public Materias(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Materias{" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota +
                '}';
    }

    public Materias() {
    }

    String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
