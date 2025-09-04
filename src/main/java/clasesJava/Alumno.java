/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesJava;

/**
 *
 * @author diego
 */
//clase llamada Alumno
//Clase: molde/plantilla para construir objetos.
public class Alumno {

    int id;
    String nombre;
    String apellido;

//Cosntrutor vacío. --> es un constructor sin parámetros que simplemente permite crear un objeto sin necesidad de pasarle datos al momento de instanciarlo.
    /**
     * Función: 1. Inicializar valores por defecto. 2. Cuando quieres crear el
     * objeto primero y darle valores después. 3. Compatibilidad con
     * frameworks/librerías.
     *
     * Nota: Si no escribes ningún constructor, Java te crea automáticamente un
     * constructor vacío implícito.Pero si escribes un constructor con
     * parámetros, entonces el constructor vacío ya no se genera
     * automáticamente. Si lo necesitas, debes crearlo tú.
     */
    public Alumno() {
    }

    //Contstructor: forma de crear a la persona con valores iniciales.
    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    //--------------------------------------------------------------------------

    //GETTERS y SETTERS
    /**
     * Los getters y setters son métodos fundamentales en la programación
     * orientada a objetos (POO) en Java. Sirven para controlar el acceso y la
     * modificación de los atributos de una clase, lo que ayuda a aplicar el
     * principio de encapsulamiento.
     *
     * Getters: Son métodos que se usan para obtener el valor de una variable o
     * atributo de una clase. Suelen tener el prefijo get (por ejemplo,
     * getNombre()).
     *
     * Setters: Son métodos que se usan para establecer o modificar el valor de
     * una variable. Suelen tener el prefijo set (por ejemplo, setNombre(String
     * nombre)).
     */
    /**
     * *
     * Convención de Orden para los Miembros de una Clase La convención general,
     * de arriba abajo en el archivo de la clase, es la siguiente:
     *
     * - Atributos / Variables de Instancia: Primero se declaran las variables
     * de la clase. Constructores: Después, se definen todos los constructores
     * de la clase.
     *
     * - Métodos Getters y Setters: A continuación, se colocan los métodos para
     * acceder y modificar las variables de instancia (los getters y setters).
     *
     * - Otros Métodos: Finalmente, se ubican los demás métodos de la clase que
     * contienen la lógica de negocio.
     *
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    //Por cada atributo de la clase, nos genera un get(traer) y un set(colocar).
    //--------------------------------------------------------------------------

    public void mostrarNombre() {
        System.out.println("Hola soy un alumno");
    }
    

}
