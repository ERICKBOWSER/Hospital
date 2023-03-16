/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guerig
 */
public class Medico extends Empleado {
    private String especialidad;
    private Paciente paciente;
    
    public void tratar(Paciente paciente, String medicina){
        System.out.println("El médico menganito trata a" + paciente.getNombre() + " con la medicina " + medicina);
    }
    
    public double calcularIRPF(){
        
    }
    
}
