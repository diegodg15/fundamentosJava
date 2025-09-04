/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciaJava;

/**
 *
 * @author diego
 */
public class Herencia {

    public static void main(String[] args) {
        Empleado emple = new Empleado();/*Esto es un objeto*/
        emple.getNumeroEmpleado();
        emple.getNombre();/*Métodos heredados de persona*/

        Consultor consul = new Consultor();/*Esto es un objeto*/
        consul.getNumeroconsultor();
        consul.getApellido();/*Métodos heredados de persona*/

 /*Polimorfismo*/
        Persona vector[] = new Persona[5];
        vector[0] = new Persona();
        vector[1] = new Empleado();
        vector[2] = new Consultor();
        vector[3] = new Jefe();
        /*vector [4] = "Hola"; *//*---> Esto da error por que no puedo guardar un tipo string en un tipo Persona*/
        /**
         *
         * Esto pasa porque como Persona es la clase madre y Empleado, consultor
         * y Jefe son clases heredadas, son formas de representar una
         * persona(polimorfismo). Me permite que en un vector que pertenezca a
         * la clase padre yo pueda guardar distintos tipos que pertenezcan a
         * clases hijas.
         */
        
        Persona perso = new Persona ();
        Consultor consul2 = new Consultor();
        
        perso = consul2;/*Esto lo puedo hacer por el polimorfismo, funcion la asignacion de un hijo a padre, no al revés*/
        


    }

}
