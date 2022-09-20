/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Gilme
 */
public class VectorElegido {

    protected String Titulo_de_Vector;
    protected double[] Vector_Operativo;

    public VectorElegido() {
    }

    public VectorElegido(String Titulo_de_Vector, double[] Vector_Operativo) {
        this.Titulo_de_Vector = Titulo_de_Vector;
        this.Vector_Operativo = Vector_Operativo;
    }

    public String getTitulo_de_Vector() {
        return Titulo_de_Vector;
    }

    public void setTitulo_de_Vector(String Titulo_de_Vector) {
        this.Titulo_de_Vector = Titulo_de_Vector;
    }

    public double[] getVector_Operativo() {
        return Vector_Operativo;
    }

    public void setVector_Operativo(double[] Vector_Operativo) {
        this.Vector_Operativo = Vector_Operativo;
    }

}
