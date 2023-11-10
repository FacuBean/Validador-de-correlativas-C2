package validador;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;



public class Inscripcion {
  private Alumnos alumnos;
  private Materias materias;

  private static final Map<String, List<String>> correlativasMap = new HashMap<>();

  static {
    correlativasMap.put("Diseño de Sistemas", Arrays.asList("Paradigmas de Programacion"));

    correlativasMap.put("Paradigmas de Programacion", Arrays.asList("Algoritmos y Estructura de Datos"));
  }

  public Inscripcion(Alumnos alumnos, Materias materias) {
    this.alumnos = alumnos;
    this.materias = materias;
  }

  public Inscripcion() {
  }

  public boolean aprobada() {
    return alumnos.aprobada(materias);
  }
}