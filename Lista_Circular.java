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
public class Lista_Circular {
    private Nodo inicio;
    private Nodo ultimo;
    private int tamanio;
    
    public void Lista(){
        inicio = null;
        ultimo = null;
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
            ultimo = nuevo;
            ultimo.setSiguiente(inicio);
        } else{
            ultimo.setSiguiente(nuevo);
            nuevo.setSiguiente(inicio);
            ultimo = nuevo;
        }
        tamanio++;
    }  
    
    public void agregarAlInicio(String Dato){
        Nodo nuevo = new Nodo();
        nuevo.setValor(Dato);
        if (esVacia()) {
            inicio = nuevo;
            ultimo = nuevo;  
            ultimo.setSiguiente(inicio);
        } else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
            ultimo.setSiguiente(inicio);
        }
        tamanio++;
    }
    
    
    public void listar(){

        if (!esVacia()) {
            Nodo aux = inicio;
            int i = 0;
            System.out.print("-> ");
            do{
                System.out.print(i + ".( " + aux.getValor() + " )" + " ->  ");
                aux = aux.getSiguiente();
                i++;
            }while(aux != inicio);
        }
    }
    
}
