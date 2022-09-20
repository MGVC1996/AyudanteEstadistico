package OperacionesEstadisticas;

import Clases.VectorElegido;
import java.text.DecimalFormat;

/**
 *
 * @author Gilme
 */
public class Media {

    public double media;

    public Media() {

    }

    public double Calcular_Media(double[] vector) {
        double Suma = 0;
        for (int i = 0; i < vector.length; i++) {
            Suma = Suma + vector[i];
        }
        this.media = Suma / vector.length;
        return media;
    }

    public String Interpretar() {
        DecimalFormat df = new DecimalFormat("#.00");
        return "La media (promedio) es de " + df.format(media);
    }
}
