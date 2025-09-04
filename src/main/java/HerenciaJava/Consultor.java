/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciaJava;

/**
 *
 * @author diego
 */
public class Consultor extends Persona{
    String nombreConsultora;
    int numeroconsultor;

    public Consultor() {
    }

    public Consultor(String nombreConsultora, int numeroconsultor, int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.nombreConsultora = nombreConsultora;
        this.numeroconsultor = numeroconsultor;
    }

    public String getNombreConsultora() {
        return nombreConsultora;
    }

    public void setNombreConsultora(String nombreConsultora) {
        this.nombreConsultora = nombreConsultora;
    }

    public int getNumeroconsultor() {
        return numeroconsultor;
    }

    public void setNumeroconsultor(int numeroconsultor) {
        this.numeroconsultor = numeroconsultor;
    }
    
    
    
}
