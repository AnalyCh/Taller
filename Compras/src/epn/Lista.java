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
public class Lista {
    
    protected Nodo cabeza;
    protected long tam;

    public Lista() {
        this.cabeza= null;
        this.tam=0;
    }

    public Lista(long tam) {
        this.cabeza = null;
        this.tam = tam;
    }
    
    public boolean vacia(){
        return cabeza==null;
    }
    
    public void insertar(String nombre, int cant, boolean estado){
        if (vacia()){
            cabeza= new Nodo(nombre, cant, estado);
        }
        else{
            cabeza= new Nodo(cabeza,nombre,cant,estado);
        }
    }
    
    public void imprimir(){
        
        if(vacia()){
            System.out.println("Vacia");
        }
        
        Nodo actual=cabeza;
        System.out.println("ITEMS NO COMPRADOS: \n");
        while(actual!=null){
            
            if(!actual.isListo()){
                System.out.println("Item: "+actual.getItem()+"  Cantidad: "+actual.getCant());
            }
            actual=actual.getSiguiente();
        }
        System.out.println("");
        
    }
    
    
    
    
    
}
