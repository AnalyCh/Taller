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
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante nuevo1= new Estudiante("Analy", "1716426901");
        Estudiante nuevo2= new Estudiante("tivo", "1234567890");
        Estudiante nuevo3= new Estudiante("Pancrasio", "0987654321");
        
        ListaEstudiantes lista= new ListaEstudiantes();
        lista.insertarEstud(nuevo1);
        lista.insertarEstud(nuevo2);
        lista.insertarEstud(nuevo3);
        
        System.out.println(lista);
        
        Estudiante nuevo4= new Estudiante("Analy", "1716426901");
        lista.insertarEstud(nuevo4);
        System.out.println(lista);
    }
    
   
    
}
