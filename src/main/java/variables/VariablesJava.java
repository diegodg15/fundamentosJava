/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variables;

/**
 *
 * @author diego
 */
public class VariablesJava {
    //El método principal: El main()método es obligatorio y lo verás en todos los programas Java:
    public static void main(String[] args) {
        //Cualquier código dentro del main()método se ejecutará.
        
        /**
         * Cada línea de código que se ejecuta en Java debe estar dentro de un
         * class. Y el nombre de la clase siempre debe empezar con mayúscula
         * inicial. En nuestro ejemplo, llamamos a la clase Main .
         *
         * Nota: Java distingue entre mayúsculas y minúsculas: "MyClass" y
         * "myclass" tienen significados diferentes.
         */

        //----------------------------------------------------------------------
        //Tipos de datos primitivos:
        //variables de tipo texto Tipo de carácter
        String textoString = "texto";//almacena texto, cadena de texto .

        char textocaracter = 't';//almacena caracteres individuales. Los valores se escriben entre comillas simples.
        //----------------------------------------------------------------------

        // 1 byte = 8 bits
        //variables de tipo números enteros Tipos enteros
        byte numeroByte = 123;//almacena números pequeños (8 bits).

        short numeroShort = 12345;//almacenanúmeros más grandes que un byte (16 bits).

        int numeroInt = 2;//almacena numeros enteros.

        long numeroLong = 1234567891011121314L;//almacena números enteros muy grandes, se utiliza con el sufijo L.
        //----------------------------------------------------------------------

        //variables de tipo números con decimales o racionales Tipos de punto flotante
        float numeroFloat = 12.7f;//almacena números de punto flotante, con decimales, de presición simple (32 bits). utiliza el sufijo f.

        double numeroDouble = 2.43;//almacena númeroscon decimales, de presición doble (64 bits).
        //puede almacenar un número mucho más grande y con una mayor cantidad de decimales que float.
        //----------------------------------------------------------------------

        //almacena valor de tipo lógico o proposición verdadero o falso. Se utiliza el prefijo is.
        boolean isBooleanTrue = true;
        boolean isBooleanFalse = false;

        //----------------------------------------------------------------------
        //Tipos de declaración de variables:
        //FINAL: no puede cambiar su valor, osea es una variable constante. 
        final double numeroPi = Math.PI;
        //Si es una referencia a un objeto, no puedes cambiar el objeto, pero sí modificar sus propiedades internas:
        /**
         * final List<String> nombres = new ArrayList<>(); nombres.add("Ana");
         * // ✅ permitido nombres = new ArrayList<>(); // ❌ no permitido
         */

        //Un método final no puede ser sobrescrito por una subclase.
        /**
         * class Padre { public final void saludar() { System.out.println("Hola
         * desde Padre"); } }
         *
         * class Hijo extends Padre { // public void saludar() { ... } // ❌
         * Error: no se puede sobrescribir }
         */
        //Una clase final no puede ser extendida.
        /**
         * final class Utilidades { public static void imprimir() {
         * System.out.println("Método útil"); } }
         *
         * // class MisUtilidades extends Utilidades {} // ❌ Error
         */
        //Tipos:
        /**
         * final normal	En la declaración o en el constructor	❌ No static final
         * En la declaración o en bloque static	❌ No final en blanco	Solo en el
         * constructor	❌ No
         */
        //Tipos de variables en java:
        /**
         * Tipo de variable Local ¿Dónde se declara? Dentro de un método,
         * constructor o bloque ¿Cuándo se crea? Al ejecutar ese bloque ¿Quién
         * puede acceder? Solo dentro de ese bloque
         *
         * Tipo de variable De instancia ¿Dónde se declara? Dentro de la clase,
         * fuera de métodos ¿Cuándo se crea? Al crear un objeto ¿Quién puede
         * acceder? Cada objeto tiene su propia copia
         *
         * Tipo de variable De clase (estática) ¿Dónde se declara? Dentro de la
         * clase, con static ¿Cuándo se crea? Al cargar la clase en memoria
         * ¿Quién puede acceder? Compartida por todos los objetos
         *
         */
    }
    //----------------------------------------------------------------------
    //Variables locales:

    void saludar() {
        String mensaje = "Hola Diego"; // variable local
        System.out.println(mensaje);
    }

    //variables de instancia (o miembro):
    public class Persona {

        String nombre; // variable de instancia
        int edad;

        void mostrar() {
            System.out.println(nombre + " tiene " + edad + " años.");
        }
    }

    //Variables de clase(estáticas):
    public class Usuario {

        static int totalUsuarios = 0; // variable de clase

        Usuario() {
            totalUsuarios++; // se incrementa cada vez que se crea un objeto
        }

        static void mostrarTotal() {
            System.out.println("Usuarios creados: " + totalUsuarios);
        }
    }

}
