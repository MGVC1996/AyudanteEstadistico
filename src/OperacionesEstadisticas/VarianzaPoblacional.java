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
public class VarianzaPoblacional extends Varianza {

    double varianza_poblacional;

    public double Calcular_Varianza_Poblacional() {
        varianza_poblacional = Math.pow(getX_menos_media_al_cuadrado() / getNum_elementos(),0.5);
        return varianza_poblacional;
    }

    public String Interpretar() {
        DecimalFormat df = new DecimalFormat("#.00");
        return "La varianza poblacional es de " + df.format(varianza_poblacional);
    }
}
