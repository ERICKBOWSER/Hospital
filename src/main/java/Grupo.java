/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guerig
 */
public enum Grupo {
    
    C(17.5), D(18), E(18.5);    
    
    private Grupo(double irpf){
        this.irpf = irpf;
    }
    
    public double getIrpf(){
        return this.irpf;
    }
    
    private double irpf;
}
