/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import OperacionesEstadisticas.CoeficienteDeVariacion;
import OperacionesEstadisticas.DesviacionEstandar;
import OperacionesEstadisticas.DesviacionMedia;
import OperacionesEstadisticas.Maximo;
import OperacionesEstadisticas.Media;
import OperacionesEstadisticas.MediaGeometrica;
import OperacionesEstadisticas.Mediana;
import OperacionesEstadisticas.Minimo;
import OperacionesEstadisticas.Moda;
import OperacionesEstadisticas.Rango;
import OperacionesEstadisticas.VarianzaMuestral;
import OperacionesEstadisticas.VarianzaPoblacional;
import java.text.DecimalFormat;

/**
 *
 * @author Gilme
 */
public class CalcularResultados extends VectorElegido {

    // Clases estaddisticas
    Media media = new Media();
    Mediana mediana = new Mediana();
    Moda moda = new Moda();
    Rango rango = new Rango();
    Maximo maximo = new Maximo();
    Minimo minimo = new Minimo();
    VarianzaPoblacional Varianza_poblacional = new VarianzaPoblacional();
    VarianzaMuestral Varianza_muestral = new VarianzaMuestral();
    DesviacionEstandar Desviacion_estandar = new DesviacionEstandar();
    CoeficienteDeVariacion coeficiente_de_variacion = new CoeficienteDeVariacion();
    DesviacionMedia desviacion_media=new DesviacionMedia();
    MediaGeometrica media_geometrica=new MediaGeometrica();
    //funciones
    public double Calcular_Media() {

        return media.Calcular_Media(getVector_Operativo());
    }

    public String Interpretar_Media() {
        return media.Interpretar();
    }

    public double Calcular_Mediana() {

        return mediana.Calcular_Mediana(getVector_Operativo());
    }

    public String Interpretar_Mediana() {
        return mediana.Interpretar();
    }

    public String Calcular_Moda() {

        return moda.Calcular_Moda(getVector_Operativo());
    }

    public String Interpretar_Moda() {
        return moda.Interpretar();
    }

    public double Calcular_Rango() {

        return rango.Calcular_Rango_de_variación(getVector_Operativo());
    }

    public String Interpretar_Rango() {
        return rango.Interpretar();
    }

    public double Calcular_Maximo() {

        return maximo.calcular_valor_maximo(getVector_Operativo());
    }

    public String Interpretar_Maximo() {
        return maximo.Interpretar();
    }

    public double Calcular_Minimo() {

        return minimo.calcular_valor_minimo(getVector_Operativo());
    }

    public String Interpretar_Minimo() {
        return minimo.Interpretar();
    }

    public double Calcular_Varianza_poblacional() {
        Varianza_poblacional.set_media(media.Calcular_Media(getVector_Operativo()));
        Varianza_poblacional.setX_menos_media_al_cuadrado(getVector_Operativo());
        return Varianza_poblacional.Calcular_Varianza_Poblacional();
    }

    public String Interpretar_Varianza_poblacional() {
        return Varianza_poblacional.Interpretar();
    }

    public double Calcular_Varianza_Muestral() {
        Varianza_muestral.set_media(media.Calcular_Media(getVector_Operativo()));
        Varianza_muestral.setX_menos_media_al_cuadrado(getVector_Operativo());
        return Varianza_muestral.Calcular_Varianza_Muestral();
    }

    public String Interpretar_Varianza_Muestral() {
        return Varianza_muestral.Interpretar();
    }

    public String Calcular_Coeficiente_de_Variacion(int poblacion_o_muestra) {

        return coeficiente_de_variacion.Calcular_coeficiente_de_variacion(Calcular_Desviacion_Estandar(poblacion_o_muestra), Calcular_Media());
    }

    public String Interpretar_Coeficiente_de_Variacion() {
        return coeficiente_de_variacion.Interpretar();
    }

    public double Calcular_Desviacion_Media() {

        return desviacion_media.calcular_desviacion_media(getVector_Operativo(), Calcular_Media());
    }

    public String Interpretar_Desviacion_Media() {
        return desviacion_media.Interpretar();
    }

    public double Calcular_Desviacion_Estandar(int opcion) {
        if (opcion == 0) {
            return Desviacion_estandar.calcular_desviacion_estandar(Calcular_Varianza_poblacional());
        } else {
            return Desviacion_estandar.calcular_desviacion_estandar(Calcular_Varianza_Muestral());
        }

    }

    public String Interpretar_Desviacion_Estandar() {
        return Desviacion_estandar.Interpretar();
    }
    
    
     public double Calcular_Media_geometrica() {

        return media_geometrica.calcular_media_geomtrica(getVector_Operativo());
    }

    public String Interpretar_Media_geometrica() {
        return media_geometrica.Interpretar();
    }
}
