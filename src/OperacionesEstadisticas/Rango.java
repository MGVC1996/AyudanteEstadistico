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
public class Rango {

    double rango;

    public double Calcular_Rango_de_variación(double[] vector_de_datos) {
        this.rango = ordenar_datos_menor_a_mayor(vector_de_datos)[vector_de_datos.length - 1] - ordenar_datos_menor_a_mayor(vector_de_datos)[0];
        return rango;
    }

    public double[] ordenar_datos_menor_a_mayor(double[] vector_de_datos) {
        double aux;

        for (int i = 0; i < vector_de_datos.length - 1; i++) {
            for (int j = 0; j < vector_de_datos.length - 1; j++) {
                if (vector_de_datos[j] > vector_de_datos[j + 1]) {
                    aux = vector_de_datos[j];
                    vector_de_datos[j] = vector_de_datos[j + 1];
                    vector_de_datos[j + 1] = aux;
                }
            }
        }

        return vector_de_datos;
    }

    public String Interpretar() {
        DecimalFormat df = new DecimalFormat("#.00");
        return "El rango (valor maximo - valor minimo) es de " + df.format(rango);
    }
}
