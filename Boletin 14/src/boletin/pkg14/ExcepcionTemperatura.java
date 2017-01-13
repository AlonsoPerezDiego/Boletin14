/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg14;

/**
 *
 * @author Diego
 */
public class ExcepcionTemperatura extends Exception {
    
    public ExcepcionTemperatura(){
        super("La temperatura supera los 80ºC");
    }
    
    public ExcepcionTemperatura(String s){
        super(s);
    }
}
