/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fundamentosjava;

/**
 *
 * @author diego
 */
public class variablesJava {

    public static void main(String args[]) {
        //INT variable tipo entero 
        int numero = 12;
        numero = 13;//reasignación de variable, en java no se puede redeclarar
        final double numero2 = Math.PI;//Variable constante 

        //----------------------------------------------------------------------
        //CHAR variable tipo caracter
        char textoLetra = 'a';

        //----------------------------------------------------------------------
        //String variable tipo cadena de texto
        String texto = "Saludos a todos";

        int numero3 = 2;
        if (numero3 % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número no es par");
        }

    }

}
