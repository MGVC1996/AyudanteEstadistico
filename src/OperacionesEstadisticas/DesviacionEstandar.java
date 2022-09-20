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
public class DesviacionEstandar {

    double desviacion_estandar;

    public double calcular_desviacion_estandar(double varianza) {
        desviacion_estandar = Math.pow(varianza, 0.5);
        return desviacion_estandar;

    }

    public String Interpretar() {
        DecimalFormat df = new DecimalFormat("#.00");
        return "La desviacion estandar es de " + df.format(desviacion_estandar);
    }
}
