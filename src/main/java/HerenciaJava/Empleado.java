/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciaJava;

/**
 *
 * @author diego
 */
public class Empleado extends Persona {

    int numeroEmpleado;
    String cargoEmpleado;
    Double sueldoEmpleado;

    public Empleado() {
    }

    public Empleado(int numeroEmpleado, String cargoEmpleado, Double sueldoEmpleado, int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);/*Atributos heredados, se asignan con SUPER (llama a la clase madre y le dice estos son los valores que se tiene que asignar)*/
        this.numeroEmpleado = numeroEmpleado;
        this.cargoEmpleado = cargoEmpleado;
        this.sueldoEmpleado = sueldoEmpleado;
        
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getCargoEmpleado() {
        return cargoEmpleado;
    }

    public void setCargoEmpleado(String cargoEmpleado) {
        this.cargoEmpleado = cargoEmpleado;
    }

    public Double getSueldoEmpleado() {
        return sueldoEmpleado;
    }

    public void setSueldoEmpleado(Double sueldoEmpleado) {
        this.sueldoEmpleado = sueldoEmpleado;
    }
    /**
     * 1. Herencia: extends Persona
     *
     * - La línea public class Empleado extends Persona establece la herencia.
     * La palabra clave extends indica que la clase Empleado "extiende" o hereda
     * todas las propiedades y métodos (que sean públicos o protegidos) de la
     * clase Persona.
     *
     * - Esto es útil porque evita tener que reescribir atributos comunes como
     * id, dni, nombre, apellido, etc. en la clase Empleado. Simplemente se
     * reusan de la clase Persona.
     *
     * 2. Atributos propios del Empleado - Además de lo que hereda, la clase
     * Empleado tiene sus propios atributos que la distinguen:
     *
     * - int numeroEmpleado; : Un número único para identificar al empleado.
     *
     * - String cargoEmpleado; : El puesto de trabajo del empleado.
     *
     * - Double sueldoEmpleado; : El salario del empleado.
     *
     * 3. Constructores - Los constructores son métodos especiales que se usan
     * para crear instancias (objetos) de una clase. En este código hay dos:
     *
     * Constructor por defecto (public Empleado()): Este constructor no recibe
     * ningún parámetro. Se usa para crear un objeto Empleado vacío y luego, si
     * es necesario, puedes llenar sus atributos usando métodos setter.
     *
     * Constructor con parámetros (public Empleado(...)): Este constructor es el
     * más completo. Recibe todos los atributos necesarios para crear tanto la
     * parte de Persona como la parte de Empleado del objeto.
     *
     * La línea super(id, dni, nombre, apellido, domicilio, telefono); dentro
     * del constructor con parámetros es crucial.
     *
     * - La palabra clave super() llama al constructor de la clase padre
     * (Persona). Esto se hace para inicializar los atributos que se heredan
     * antes de inicializar los atributos propios del Empleado.
     *
     * - Después de la llamada a super(), las siguientes líneas
     * (this.numeroEmpleado = numeroEmpleado;, etc.) inicializan los atributos
     * específicos de la clase Empleado.
     *
     *
     *
     *
     *
     *
     *
     */

}
