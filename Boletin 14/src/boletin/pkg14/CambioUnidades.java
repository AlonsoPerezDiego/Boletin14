/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg14;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class CambioUnidades {
    private float c, r;
    private final int Maximo = 80;
    
    public CambioUnidades(){
        }
    
    public CambioUnidades(float c) {
        this.c=c;
    }
    
    public float centigradosAFharenheit(){
        float f;
        f = (float) (9.0/5.0 * c + 32.4);
        return f;
    }
    
    public void centigradosAReamur(){
        r = (float) ((4.0 / 5.0) * c);
    }
    
    public void mostrar() throws ExcepcionTemperatura{
        if(c>Maximo){
            throw new ExcepcionTemperatura();
        }
        centigradosAReamur();
        JOptionPane.showMessageDialog(null, "Temperatura en Celsius: " + c + "ºC" + "\nTemperatura en Fharenheit: " + centigradosAFharenheit() + "ºF" + "\nTemperatura en Remaur: " + r + "ºR");
    }
}
 