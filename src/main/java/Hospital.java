
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guerig
 */
public class Hospital {
    private String nombre;
    private String direccion;
    private int numeroCamas;

    public Hospital(String nombre, String direccion, int numeroCamas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroCamas = numeroCamas;
    }

    
    public void contratarEmpleado(Empleado emp){
        ArrayList<Empleado> empleados = new ArrayList();
        
        empleados.add(emp);
    }
    
    public void ingresarPaciente(Paciente paciente){
        ArrayList<Paciente> pacientes = new ArrayList();

        pacientes.add(paciente);
        
    }
    
}
