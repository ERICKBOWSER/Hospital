
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guerig
 */
public class Paciente extends Persona implements Nadador{
    private String numeroHistoria;
    
    private Random generar = new Random();

    public Paciente(String numeroHistoria, String nombre, String apellidos, Nif nif) {
        super(nombre, apellidos, nif);
        this.numeroHistoria = numeroHistoria;
    }
     

    public String getNumeroHistoria() {
        return numeroHistoria;
    }

    public void setNumeroHistoria(String numeroHistoria) {
        this.numeroHistoria = numeroHistoria;
    }
    
    
    public void tomarMedicina(String medicina){ 
      
      boolean aleatorio = generar.nextBoolean();
      
      if(aleatorio){
          System.out.println("El paciente se ha curado.");
      }else{
          System.out.println("El paciente no se ha curado.");
      }
      
    }
    
    public void nadador(){
        System.out.println("El médico puede nadar");
    }
      
}
