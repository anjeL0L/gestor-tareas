package org.example;

public class Tarea {
    private String descripcion;
    private boolean completada;

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.completada = false;
    }

    public void marcarComoCompletada() {
        this.completada = true;
    }

    @Override
    public String toString() {
        String estado = completada ? "[Completada]" : "[Pendiente]";
        return estado + " " + descripcion;
    }
}
