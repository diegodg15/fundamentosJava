/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesJava;

/**
 *
 * @author diego
 */
public class POO {

    public static void main(String[] args) {

        Alumno alumno01 = new Alumno();//Llamada a constructor, sin parámetros.
        Alumno alumno02 = new Alumno(5, "Alan", "González");//Creando nuevo alumo con parámetros.

        //Para mostrar los datos por pantalla:
        System.out.println("La id del alumno 2 es:" + alumno02.getId());
        System.out.println("El nombre del alumno es:" + alumno02.getNombre());

        Alumno alumno03 = new Alumno(6, "Luis", "Ortiz");//Creando nuevo alumo con parámetros.
        //otra forma de imprimir:
        int idAlumno3 = alumno03.getId();
        System.out.println("El id del alumno 3 es:" + idAlumno3);

        //Setear/asignación valores:
        alumno01.setId(8);
        alumno01.setNombre("Nuevo nombre");
        alumno01.setApellido("Nuevo Apellido");

        System.out.println("La id del alumno 1 es:" + alumno01.getId());
        System.out.println("El nombre del alumno 1 es:" + alumno01.getNombre());
        //----------------------------------------------------------------------
        
        //Modificar valores:
        alumno01.setId(44);
        System.out.println("Ahora el id del alumno 1 es:" + alumno01.getId());

    }
}
