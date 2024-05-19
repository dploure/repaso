/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ccuenta;

/**
 * Clase Repaso para repasar para el examen
 * 
 * @author david
 * @version 1.0
 */

public class Repaso {
    
    /**
     * valor entero
     */
    public int a;
    
    /**
     * valor entero tambien
     */
    public int b;
    
    /**
     * Constructor de la clase que necesita dos argumentos
     * @param a es un entero
     * @param b es otro entero
     */
    public Repaso(int a, int b){
        
        this.a= a;
        this.b= b;
    }
    /**
     * método para sumar las dos variables
     * @return la suma de los dos parámetros
     */
    public int sumar(){
        return this.a+this.b;    
    }
    
    /**
     * método para multiplicar
     * @return el producto de los dos parámetros
     */
    public int multiplicar(){
        return this.a * this.b;
    }
    

}
