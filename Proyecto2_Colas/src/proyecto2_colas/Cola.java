/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2_colas;

import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class Cola {

    private Nodo inicioCola, finalCola;
    String Cola = " ";

    public Cola() {

        inicioCola = null;
        finalCola = null;
    }

    public boolean ColaVacia() {
        
        if (inicioCola == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public void Insertar(int informacion){
        
        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.informacion = informacion;
        nuevo_nodo.siguiente = null;
        
        if (ColaVacia()) {
            
            inicioCola =  nuevo_nodo;
            finalCola = nuevo_nodo;
            
        } else {
            
            finalCola.siguiente = nuevo_nodo;
            finalCola = nuevo_nodo;
        }
    }
    
    public int Extraer(){
        if (!ColaVacia()) {
            int informacion = inicioCola.informacion;

            if (inicioCola == finalCola) {
                inicioCola = null;
                finalCola = null;               
            } else {
                
                inicioCola = inicioCola.siguiente;
            }
            return informacion;
        } else {
            return Integer.MAX_VALUE;
        }
    }
    
    public void MostrarContenido(){
        
        Nodo recorrido = inicioCola;
        String colaInvertida = "";
        
        while(recorrido != null){
            Cola += recorrido.informacion + " ";
            recorrido = recorrido.siguiente;
        }
        
        String cadena[] =  Cola.split(" ");
        
        for (int i = cadena.length - 1; i >= 0; i--) {
            colaInvertida += " " + cadena[i];
        }
        
        JOptionPane.showMessageDialog(null, colaInvertida);
        Cola = "";
    }
    
    public int CantLista (){
       
        Nodo actual = inicioCola;
        Nodo recorrido = inicioCola;
        
        int i = 0;
        
        while (actual != null) {            
           
            i++;
            actual = recorrido.siguiente;
            
        }
        return i;
    }
    
}
