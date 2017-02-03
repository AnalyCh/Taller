/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaestudiantes;

import javax.swing.JOptionPane;

/**
 *
 * @author USRGAM
 */
public class ListaEstudiantes {
     protected Nodo inicio;
	 protected long tam;
	 
	public ListaEstudiantes() {
		inicio= null;
		tam=0;
	}
	
	
	public void insertarEstud(Estudiante elemento){
		Nodo aux= new Nodo(elemento);
		Nodo actual= inicio;
		if(vacio()){
			inicio= aux;
                        tam++;
		}
		else{
                    if(verificar(aux)){
			while(actual.getEnlace()!=null){
				actual= actual.getEnlace();
		}
			actual.setEnlace(aux);
                        tam++;
                    }
                    else{
                        System.out.println("Dato duplicado, no se insertará");
                    }
		}
		
	}
        
        public boolean verificar(Nodo elemento){
            Nodo aux= inicio;
            
            while(aux!=null){
                if(elemento.getInf().cedula.equals(aux.getInf().cedula)){
                    return false;
                }
                aux=aux.getEnlace();
        }
            return true;
        }
	
	

	public boolean vacio(){
		return (inicio==null);		
	}

    @Override
    public String toString() {
        return "ListaEstudiantes{\n"  + inicio + ", tamaño de la lista=" + tam + '}';
    }
        
        

}
