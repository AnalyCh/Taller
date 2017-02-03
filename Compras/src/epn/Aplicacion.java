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
public class Aplicacion {
    public static void main(String[] args) {
    
    Lista listaCompras= new Lista();
    
    listaCompras.insertar("Manzana", 2, false);
    listaCompras.insertar("Pera", 1, false);
    listaCompras.insertar("Atun", 4, true);
    listaCompras.insertar("Sandia", 10, false);
    listaCompras.imprimir();
        
    }
    
}
