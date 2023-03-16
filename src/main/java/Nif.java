
import java.time.LocalDate;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guerig
 */
public class Nif {
    private long numero;
    private char letra;
    private LocalDate fechaCaducidad;

    public Nif(long numero, char letra, LocalDate fechaCaducidad) {
        this.numero = numero;
        this.letra = letra;
        this.fechaCaducidad = fechaCaducidad;
    }
    
    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    
    public void getNif(long numero, LocalDate fechaCaducidad){
        this.numero = numero;
        this.fechaCaducidad = fechaCaducidad;
    }
    
    private char calcularLetra(){
        long divNum = this.numero % 23;
        
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        
        char res = letras.charAt((char)divNum);
        
        return res;
    }
    
}
