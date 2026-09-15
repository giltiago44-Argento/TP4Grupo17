/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4grupo17;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Agos
 */
public class Alumno {
    private int num_legajo;
    private String apellido;
    private String nombre;
    private Set<Materia> materias = new HashSet<>();

    public Alumno(int num_legajo, String apellido, String nombre) {
        this.num_legajo = num_legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public void agregarMateria(Materia materia){
        materias.add(materia);
        
    }
    
    public int cantidadMaterias(){
    return materias.size();   
    }
    
    
    
    public int getNum_legajo() {
        return num_legajo;
    }

    public void setNum_legajo(int num_legajo) {
        this.num_legajo = num_legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(Set<Materia> materias) {
        this.materias = materias;
    }



}
