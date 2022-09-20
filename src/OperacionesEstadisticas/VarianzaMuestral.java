/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OperacionesEstadisticas;

import java.text.DecimalFormat;

/**
 *
 * @author Gilme
 */
public class VarianzaMuestral extends Varianza {
        double varianza_muestral;

    public double Calcular_Varianza_Muestral() {
        varianza_muestral=getX_menos_media_al_cuadrado()/(getNum_elementos()-1);
        return varianza_muestral;
    }
    
     public String Interpretar() {
        DecimalFormat df = new DecimalFormat("#.00");
        return "La varianza muestral es de " + df.format(varianza_muestral);
    }
}
