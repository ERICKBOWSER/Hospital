/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guerig
 */
public class Medico extends Empleado implements Nadador{
    private String especialidad;

    public Medico(String especialidad, String numeroSeguridadSocial, double salario, String nombre, String apellidos, Nif nif) {
        super(numeroSeguridadSocial, salario, nombre, apellidos, nif);
        this.especialidad = especialidad;
    }

        
    
    public void tratar(Paciente paciente, String medicina){
        System.out.println("El médico " + super.getNombre() + " trata a" + paciente.getNombre() + " con la medicina " + medicina);
    }
    
    public double calcularIRPF(){
        
        double irpf = 0;
        if(especialidad.equalsIgnoreCase("cirugia")){
            irpf = super.getSalario() * 0.25;
        }else{
            irpf = super.getSalario() * 0.235;
        }
        
        return irpf;        
    }
    
    public void nadador(){
        System.out.println("El médico puede nadar");
    }
    
}
