/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_1_200819088;

/**
 *
 * @author PC 1
 */
public class Lista_Simple {
    
    private Nodo inicio;
    private int tamanio;
    
    public void Lista(){
        inicio = null;
        tamanio = 0;
    }
    public boolean esVacia(){
        return inicio == null;
    }
    
    public int getTamanio(){
        return tamanio;
    }
    
    public void agregarAlFinal(String Dato){
        Nodo nuevo = new Nodo();
        nuevo.setValor(Dato);
        if (esVacia()) {
            inicio = nuevo;
        } else{
            Nodo Auxiliar = inicio;
            while(Auxiliar.getSiguiente() != null){
                Auxiliar = Auxiliar.getSiguiente();
            }
            Auxiliar.setSiguiente(nuevo);
        }
        tamanio++;
    }
    
    public void agregarAlInicio(String Dato){
        Nodo nuevo = new Nodo();
        nuevo.setValor(Dato);
        if (esVacia()) {
            inicio = nuevo;
        } else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        tamanio++;
    }
    
    public void imprimir(){

        if (!esVacia()) {
            Nodo aux = inicio;
            int i = 0;
            while(aux != null){
                System.out.print(i + ".( " + aux.getValor() + " )" + " ->  ");
                aux = aux.getSiguiente();
                i++;
            }
        }
    }

    
}

