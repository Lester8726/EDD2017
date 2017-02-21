/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_1_200819088;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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
    
    
    public void imprimir(){

        if (!esVacia()) {
            Nodo aux = inicio;
            int i = 0;
           // System.out.print("-> ");
            try {

             java.io.BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\grafos\\grafo1.txt"));  
              		bufferedWriter.append("digraph G");
			bufferedWriter.flush();
                        bufferedWriter.newLine();
                        bufferedWriter.append("{");
			bufferedWriter.flush();
                        bufferedWriter.newLine();
            do{

                                
        if(aux.getSiguiente() != inicio){
                System.out.print(i + ".( " + aux.getValor() + " )" + " ->  ");
                        
                        bufferedWriter.append(aux.getValor() + "->");
			bufferedWriter.flush(); 
                        aux = aux.getSiguiente();
                        i++;
                        }else{
        
                        System.out.print(i + ".( " + aux.getValor() + " )");
                        
                        bufferedWriter.append(aux.getValor()+ "->");
			bufferedWriter.flush(); 
                        bufferedWriter.append(aux.getSiguiente().getValor());
                        bufferedWriter.flush();
                        aux = aux.getSiguiente();
                        i++;
        }   
            }while(aux != inicio);
                    
     bufferedWriter.newLine();
    bufferedWriter.append("}");
    bufferedWriter.flush();
                }catch (IOException e) {
			e.printStackTrace();
		}
            
        }
    }
    
}
