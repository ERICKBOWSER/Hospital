
import java.time.LocalDate;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guerig
 */
public class GestionHospital {
    private static Hospital hospital;
    
    public static void main(String[] args) {
        ArrayList<Paciente> pacientes = new ArrayList();
        ArrayList<Medico> medicos = new ArrayList();
        ArrayList<Administrativo> admins = new ArrayList();
        
        // Crear hospital
        hospital =  new Hospital("Hospital general", "Calle leon", 300);
        
        //medicos = crearMedico("Cardiología", new Empleado("892334231211", 800, "Irina", "LianJun", new Nif(89231273, LocalDate.of(2018, 05, 01))));
        
    }
    
    public Paciente crearPaciente(Persona persona, String numHistoria){
        Paciente paciente = new Paciente(numHistoria, persona.getNombre(), persona.getApellidos(), persona.getNif());
        return paciente;
    }
    
    public static Medico crearMedico(String especialidad, Empleado emp){
        Medico medico = new Medico(especialidad, emp.getNumeroSeguridadSocial(), emp.getSalario(), emp.getNombre(), emp.getApellidos(), emp.getNif());
        
        return medico;
    }
    
    public Administrativo crearPersonalPAS(Grupo grupo, Empleado emp){
        Administrativo admin = new Administrativo(grupo, emp.getNumeroSeguridadSocial(), emp.getSalario(), emp.getNombre(), emp.getApellidos(), emp.getNif());
       
        return admin;
    }
        
}
