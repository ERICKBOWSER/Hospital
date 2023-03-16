/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guerig
 */
public class Paciente extends Persona{
    private String numeroHistoria;

    public Paciente(String numeroHistoria, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.numeroHistoria = numeroHistoria;
    }
    
    
    
    public void tomarMedicina(String medicina){
        
    }    
}
