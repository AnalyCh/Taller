/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epn;

/**
 *
 * @author USRGAM
 */
public class Nodo {
    
    private Nodo siguiente;
    private String item;
    private int cant;
    private boolean listo;

    public Nodo(Nodo siguiente, String item, int cant, boolean listo) {
        this.siguiente = siguiente;
        this.item = item;
        this.cant = cant;
        this.listo = listo;
    }
    
    public Nodo(String item, int cant, boolean listo){
        this.item=item;
        this.cant=cant;
        this.listo=listo;
        this.siguiente=null;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public String getItem() {
        return item;
    }

    public int getCant() {
        return cant;
    }

    public boolean isListo() {
        return listo;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public void setListo(boolean listo) {
        this.listo = listo;
    }
    
    
    
    
    
    
    
}
