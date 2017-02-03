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
public class Nodo {
    private Estudiante inf;
    private Nodo enlace;

    public Nodo(Estudiante inf) {
        this.inf= inf;
        this.enlace=null;
    }

    public Nodo(Estudiante inf, Nodo enlace) {
        this.inf = inf;
        this.enlace = enlace;
    }

    public Estudiante getInf() {
        return inf;
    }

    public void setInf(Estudiante inf) {
        this.inf = inf;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }

    @Override
    public String toString() {
        return "" + "" + inf + "\n" + enlace ;
    }

    
    

    
    
}
