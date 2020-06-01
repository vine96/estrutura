/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade3;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class Unidade3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ArrayList<Integer> Lista = new ArrayList<>(5);
    ArrayDeque<Integer> Pilha = new ArrayDeque<>(5);
    ArrayDeque<Integer> Fila = new ArrayDeque<>(10);
    
    Lista.add(1);
    Lista.add(2);
    Lista.add(3);
    Lista.add(4);
    Lista.add(5);
    
    

    while(!Lista.isEmpty()) {
        int numero = Lista.remove(0);
        Pilha.push(numero);
    }
    

    while(!Pilha.isEmpty()) {
        int numero = Pilha.pop();
         System.out.println(Pilha);
        System.out.println(numero);
        Fila.add(numero);
        System.out.println(Fila);
    }
    Lista.add(6);
    Lista.add(7);
    Lista.add(8);
    Lista.add(9);
    Lista.add(10);
     System.out.println(Lista);
 System.out.println("-------------------------------");
    while(!Lista.isEmpty()) {
        int numero = Lista.remove(0);
        Pilha.push(numero);
        System.out.println(Pilha);
    }

    while(!Pilha.isEmpty()) {
        int numero = Pilha.pop();
        Fila.add(numero);
        System.out.println(Fila);
    }
     
    System.out.println(Fila);
}   
     
}    