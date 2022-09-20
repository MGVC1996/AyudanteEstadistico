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
public class Moda {

    String resultado_moda;

    public Moda() {

    }

    public String Calcular_Moda(double[] vector_de_datos) {
        String resultado;
        ordenar_datos_menor_a_mayor(vector_de_datos);
        double[] moda = new double[vector_de_datos.length];
        moda = obtener_vector_de_moda_o_modas_con_mayor_frecuencia(vector_de_datos, obtener_vector_de_frecuencias_de_datos(vector_de_datos));
        if (todos_los_datos_son_iguales(obtener_vector_de_frecuencias_de_datos(vector_de_datos))) {
            resultado_moda = null;
            return "No hay Moda";
        } else {

            String a = "";
            for (int i = 0; i < moda.length; i++) {
                if (moda[i] != 0) {
                    if (i == moda.length - 1) {
                        if (moda[i] != moda[0]) {
                            a = a + moda[i] + " | ";
                        }
                    } else {
                        if (moda[i] != moda[i + 1]) {
                            a = a + moda[i] + " | ";
                        }
                    }
                }
            }
            resultado = a;
        }
        resultado_moda = resultado;
        return resultado;

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

    public int[] obtener_vector_de_frecuencias_de_datos(double[] vector_de_datos) {
        int[] vector_de_frecuencias = new int[vector_de_datos.length];
        int contador = 0;
        for (int i = 0; i < vector_de_datos.length; i++) {
            for (int j = 0; j < vector_de_datos.length; j++) {
                if (vector_de_datos[i] == vector_de_datos[j]) {
                    contador++;
                }
            }
            vector_de_frecuencias[i] = contador;
            contador = 0;
        }

        return vector_de_frecuencias;
    }

    public double[] obtener_vector_de_moda_o_modas_con_mayor_frecuencia(double[] vector_de_datos, int[] vector_paralelo_de_frecuencias) {
        int mayor_repetición = vector_paralelo_de_frecuencias[0];

        double[] vector_de_modas = new double[vector_de_datos.length];
        for (int i = 0; i < vector_de_datos.length; i++) {
            if (vector_paralelo_de_frecuencias[i] > mayor_repetición) {
                mayor_repetición = vector_paralelo_de_frecuencias[i];
            }
        }

        for (int i = 0; i < vector_paralelo_de_frecuencias.length; i++) {

            if (vector_paralelo_de_frecuencias[i] == mayor_repetición) {
                vector_de_modas[i] = vector_de_datos[i];
            } else {
                vector_de_modas[i] = 0;
            }
        }
        return vector_de_modas;
    }

    public boolean todos_los_datos_son_iguales(int[] vector_de_frecuencias) {

        int alerta_de_repetición = 0;
        int carnada = vector_de_frecuencias[0];
        for (int i = 0; i < vector_de_frecuencias.length; i++) {
            if (carnada == vector_de_frecuencias[i]) {
                alerta_de_repetición++;
            }
        }

        if (alerta_de_repetición == vector_de_frecuencias.length) {

            return true;
        } else {

            return false;
        }

    }

    public String Interpretar() {
        if (resultado_moda != null) {
            return "Los numeros que más se repiten son " + resultado_moda + " .";
        } else {
            return "No hay moda.";
        }
    }

}
