/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sobrecargaDeMetodos;

/**
 *
 * @author diego
 */
public class Animal {
    private int idAnimal;
    private String descripcionAnimal;
    //Constructores:
    
    //Métodos getters y setters:
    
    //Otros métodos:
    public void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
    
    public void hacerSonido(String nombreAnimal){
        System.out.println("El anima" + nombreAnimal +  "hace unsonido");
    }
    
    public void hacerSonido(String nombreAnimal, String tipoSonido){
        System.out.println("el animal:" + nombreAnimal + "hace un sonido del tipo:" + tipoSonido);
    }
    //el ide sabe que método utilizar por los parámetros que recibe.
}
