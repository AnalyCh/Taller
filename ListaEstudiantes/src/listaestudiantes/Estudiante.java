/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaestudiantes;

/**
 *
 * @author USRGAM
 */
public class Estudiante {
    protected String nombre;
    protected String cedula;

    public Estudiante() {
    }

    public Estudiante(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "{" + "nombre=" + nombre + ", cedula=" + cedula + '}';
    }
    
    
    
}
