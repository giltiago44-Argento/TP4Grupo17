/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4grupo17;

/**
 *
 * @author Agos
 */
public class Materia {
    private int id_materia;
    private String nombre;
    private int anio;

    public Materia(int id_materia, String nombre, int anio) {
        this.id_materia = id_materia;
        this.nombre = nombre;
        this.anio = anio;
    }

    public int getId_materia() {
        return id_materia;
    }

    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
}
