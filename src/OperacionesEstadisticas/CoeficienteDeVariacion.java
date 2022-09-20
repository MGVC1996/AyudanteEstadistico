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
public class CoeficienteDeVariacion {

    String coeficiente_de_variacion;

    public String Calcular_coeficiente_de_variacion(double desviacion_estandar, double media) {
        DecimalFormat df = new DecimalFormat(".00");
        this.coeficiente_de_variacion = df.format(desviacion_estandar / media*100);
        return coeficiente_de_variacion;
    }

    public String Interpretar() {

        return "El coeficiente de variacón es del " + coeficiente_de_variacion + "%";
    }
}
