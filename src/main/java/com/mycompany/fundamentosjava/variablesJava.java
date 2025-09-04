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

    //TIPOS DE VARIABLES:
    /*
        Variables locales
        Variables de instancia(o miembro)
        variables de clase(estáticas)
     */
    //----------------------------------------------------------------------
    //VARIBLES LOCALES:
    /**
     * Estas variables se declaran dentro de un método, constructor o bloque de
     * código. Son efímeras, lo que significa que solo existen mientras se
     * ejecuta ese bloque de código. Una vez que el método o bloque termina, la
     * variable se destruye. No tienen un valor por defecto, por lo que debes
     * inicializarlas antes de usarlas; de lo contrario, el compilador mostrará
     * un error.
     *
     */
    public void miMetodo() {
        int edad = 30; // 'edad' es una variable local
        System.out.println(edad);

    }

    //----------------------------------------------------------------------
    //VARIABLES DE INSTANCIA (o miembro):
    /**
     * Se declaran dentro de una clase, pero
     * fuera de cualquier método o constructor. Cada objeto (o instancia) de la
     * clase tendrá su propia copia de estas variables. A diferencia de las
     * locales, las variables de instancia tienen valores por defecto. Por
     * ejemplo, un int se inicializa en 0, un boolean en false, y los objetos en
     * null.
     */
    public class Coche {

        String color; // 'color' es una variable de instancia
        int velocidad; // 'velocidad' es una variable de instancia
    }

    //----------------------------------------------------------------------
    //VARIABLES DE CLASE (o estáticas):
    /**
     * Se declaran dentro de una clase, usando la palabra clave static. Hay una
     * sola copia de una variable estática para toda la clase, no para cada
     * objeto. Esto significa que si un objeto cambia el valor de una variable
     * estática, ese cambio será visible para todos los demás objetos de la
     * misma clase. Son útiles para datos que son compartidos por todas las
     * instancias, como un contador o una constante.
     *
     *
     */
    public class Coche2 {
    static int numeroDeRuedas = 4; // 'numeroDeRuedas' es una variable estática
}
}
