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
public class MediaGeometrica {
     double media_geometrica;
    public double calcular_media_geomtrica(double[] vector) {
        double producto=1;
        for (int i = 0; i < vector.length; i++) {
            producto=producto*vector[i];
        }
       media_geometrica=Math.pow(producto, 1/(double)vector.length);
       return media_geometrica;
    }
      public String Interpretar() {
        DecimalFormat df = new DecimalFormat("#.00");
        return "La media geometrica es de " + df.format(media_geometrica);
    }
}
