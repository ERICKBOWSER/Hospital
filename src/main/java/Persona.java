
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author guerig
 */
abstract class Persona {
    private String nombre;
    private String apellidos;
    private Nif nif;

    public Persona(String nombre, String apellidos, Nif nif) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Nif getNif() {
        return nif;
    }

    public void setNif(Nif nif) {
        this.nif = nif;
    }
    
    // Método para modificar la fecha de caducidad del nif
    public void renovarNIF(LocalDate fechaSolicitud){
        this.nif.setFechaCaducidad(fechaSolicitud.plusYears(10));
        
        // Mostrar nueva fecha de caducidad
        System.out.println(this.nif.getFechaCaducidad());
    }
    
    
}
