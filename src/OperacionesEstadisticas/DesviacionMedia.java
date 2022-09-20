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
public class DesviacionMedia {

    double desviacion_media;

    public double calcular_desviacion_media(double[] vector_de_datos, double media) {

        double[] vector_xi_menos_u_al_cuadrado = new double[vector_de_datos.length];
        System.arraycopy(vector_de_datos, 0, vector_xi_menos_u_al_cuadrado, 0, vector_de_datos.length);

        DecimalFormat df = new DecimalFormat("#.00");

        for (int i = 0; i < vector_xi_menos_u_al_cuadrado.length; i++) {
            vector_xi_menos_u_al_cuadrado[i] = Double.parseDouble(df.format(Math.abs(vector_de_datos[i] - media)));
        }

        double sumatoria = 0;
        for (int i = 0; i < vector_xi_menos_u_al_cuadrado.length; i++) {
            sumatoria = sumatoria + vector_xi_menos_u_al_cuadrado[i];
        }
        desviacion_media = sumatoria / (double) vector_xi_menos_u_al_cuadrado.length;
        return desviacion_media;
    }

    public String Interpretar() {
        DecimalFormat df = new DecimalFormat("#.00");
        return "La desviación media es de " + df.format(desviacion_media);
    }

}
