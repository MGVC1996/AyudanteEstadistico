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
public class Varianza {

    protected double media;
    protected double x_menos_media_al_cuadrado;
    protected int num_elementos;
    public void set_media(double media) {
        this.media = media;
    }

    public double getMedia() {
        return media;
    }

    public double getX_menos_media_al_cuadrado() {
        return x_menos_media_al_cuadrado;
    }

    public void setX_menos_media_al_cuadrado(double[] vector) {
        this.num_elementos=vector.length;
        double[] vector_xi_menos_u_al_cuadrado = new double[vector.length];
        System.arraycopy(vector, 0, vector_xi_menos_u_al_cuadrado, 0, vector.length);
        DecimalFormat df = new DecimalFormat("#.00");

        for (int i = 0; i < vector.length; i++) {
            vector_xi_menos_u_al_cuadrado[i] = Double.parseDouble(df.format(Math.pow(vector[i] - media, 2)));
        }

        double sumatoria = 0;
        for (int i = 0; i < vector_xi_menos_u_al_cuadrado.length; i++) {
            sumatoria = sumatoria + vector_xi_menos_u_al_cuadrado[i];
        }
        
        this.x_menos_media_al_cuadrado=sumatoria;
    }

    public int getNum_elementos() {
        return num_elementos;
    }

}
