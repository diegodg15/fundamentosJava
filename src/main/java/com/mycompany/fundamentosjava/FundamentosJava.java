/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.fundamentosjava;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class FundamentosJava {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        System.out.println("Hola mundo");

        System.out.println("Ingrese numero");
        int numero1 = entrada.nextInt();

        System.out.println("Ingrese el segundo numero");
        int numero2 = entrada.nextInt();

        int sumaNumeros = numero1 + numero2;

        System.out.println("La suma de ambos números es:" + "" + sumaNumeros);

    }
}
