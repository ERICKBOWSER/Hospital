/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guerig
 */
public class Administrativo extends Empleado{
    public Grupo grupo;

    public Administrativo(Grupo grupo, String numeroSeguridadSocial, double salario, String nombre, String apellidos, Nif nif) {
        super(numeroSeguridadSocial, salario, nombre, apellidos, nif);
        this.grupo = grupo;
    }
    

    
    public double calcularIRPF(){
        
        double irpf = 0;
        
        if(grupo == grupo.C){
            irpf = super.getSalario() * (grupo.C.getIrpf() / 100);
        }else if(grupo == grupo.D){
            irpf = super.getSalario() * (grupo.D.getIrpf() / 100);
        }else if(grupo == grupo.E){
            irpf = super.getSalario() * (grupo.E.getIrpf() / 100);
        }
        
        return irpf;
    }
}
