/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import OperacionesEstadisticas.Media;

/**
 *
 * @author Gilme
 */
public class OperacionElegida extends MatrizDeDatos {

    double[] vector_operativo;
    int columna_seleccionada;
    int operacion_elegida;
    int poblacion_o_muestra;

    public OperacionElegida() {

    }

    public OperacionElegida(int columna_seleccionada, int operacion_elegida, int poblacion_o_muuestra) {
        vector_operativo = new double[get_Numero_de_Filas()];
        for (int i = 0; i < get_Numero_de_Filas(); i++) {
            vector_operativo[i] = getMatriz_de_datos()[i][columna_seleccionada];
        }
        this.columna_seleccionada = columna_seleccionada;
        this.operacion_elegida = operacion_elegida;
        this.poblacion_o_muestra = poblacion_o_muuestra;
    }

    public double[] getVector_operativo() {
        return vector_operativo;
    }

    public void setVector_operativo(int columna_seleccionada) {
        vector_operativo = new double[get_Numero_de_Filas()];
        for (int i = 0; i < get_Numero_de_Filas(); i++) {
            vector_operativo[i] = getMatriz_de_datos()[i][columna_seleccionada];
        }
    }

    public int getColumna_seleccionada() {
        return columna_seleccionada;
    }

    public void setColumna_seleccionada(int columna_seleccionada) {
        this.columna_seleccionada = columna_seleccionada;
    }

    public int getOperacion_elegida() {
        return operacion_elegida;
    }

    public void setOperacion_elegida(int operacion_elegida) {
        this.operacion_elegida = operacion_elegida;
    }

    public int getPoblacion_o_muestra() {
        return poblacion_o_muestra;
    }

    public void setPoblacion_o_muestra(int poblacion_o_muestra) {
        this.poblacion_o_muestra = poblacion_o_muestra;
    }

    public Object[] devolver_resultado() {
        Object[] o = new Object[3];

        CalcularResultados calculator = new CalcularResultados();
        calculator.setTitulo_de_Vector(getVector_de_titulos()[columna_seleccionada]);
        calculator.setVector_Operativo(vector_operativo);
       if (this.operacion_elegida == 1) {

            o[0] = "Media";
            o[1] = calculator.Calcular_Media();
            o[2] = calculator.Interpretar_Media();
            return o;
        } else if (this.operacion_elegida == 2) {
            o[0] = "Mediana";
            o[1] = calculator.Calcular_Mediana();
            o[2] = calculator.Interpretar_Mediana();
            return o;
        } else if (this.operacion_elegida == 3) {
            o[0] = "Moda";
            o[1] = calculator.Calcular_Moda();
            o[2] = calculator.Interpretar_Moda();
            return o;
        } else if (this.operacion_elegida == 4) {
            o[0] = "Rango";
            o[1] = calculator.Calcular_Rango();
            o[2] = calculator.Interpretar_Rango();
            return o;
        } else if (this.operacion_elegida == 5) {
            o[0] = "Valor Maximo";
            o[1] = calculator.Calcular_Maximo();
            o[2] = calculator.Interpretar_Maximo();
            return o;
        } else if (this.operacion_elegida == 6) {
            o[0] = "Valor Minimo";
            o[1] = calculator.Calcular_Minimo();
            o[2] = calculator.Interpretar_Minimo();
            return o;
        } else if (this.operacion_elegida == 7) {
            if (getPoblacion_o_muestra() == 0) {
                o[0] = "Varianza Poblacional";
                o[1] = calculator.Calcular_Varianza_poblacional();
                o[2] = calculator.Interpretar_Varianza_poblacional();
                return o;
            } else {
                o[0] = "Varianza Muestral";
                o[1] = calculator.Calcular_Varianza_Muestral();
                o[2] = calculator.Interpretar_Varianza_Muestral();
                return o;
            }

        } else if (this.operacion_elegida == 8) {
            o[0] = "Desviacion Estandar";
            o[1] = calculator.Calcular_Desviacion_Estandar(getPoblacion_o_muestra());
            o[2] = calculator.Interpretar_Desviacion_Estandar();
            return o;

        } else if (this.operacion_elegida == 9) {
            o[0] = "Coeficiente de Variacion";
            o[1] = calculator.Calcular_Coeficiente_de_Variacion(getPoblacion_o_muestra());
            o[2] = calculator.Interpretar_Coeficiente_de_Variacion();
            return o;

        } else if (this.operacion_elegida == 10) {
            o[0] = "Desviacion Media";
            o[1] = calculator.Calcular_Desviacion_Media();
            o[2] = calculator.Interpretar_Desviacion_Media();
            return o;

        } else {
            o[0] = "Media Geometrica";
            o[1] = calculator.Calcular_Media_geometrica();
            o[2] = calculator.Interpretar_Media_geometrica();
            return o;
        }
    }

    
}
