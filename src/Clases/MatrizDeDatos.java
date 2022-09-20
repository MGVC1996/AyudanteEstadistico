/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gilme
 */
public class MatrizDeDatos {

    protected double[][] matriz_de_datos;
    protected int numero_de_filas;
    protected int numero_de_columnas;
    protected String[] Vector_de_titulos;
   

    public MatrizDeDatos() {

    }

    public void set_Matriz_de_datos(double[][] matriz_de_datos) {
        this.matriz_de_datos = new double[numero_de_filas][numero_de_columnas];
        for (int j = 0; j < numero_de_columnas; j++) {
            for (int i = 0; i < numero_de_filas; i++) {
                this.matriz_de_datos[i][j] = matriz_de_datos[i][j];
            }
        }
    }

    public void set_Numero_de_Filas(int nfilas) {
        this.numero_de_filas = nfilas;
    }

    public void setNumero_de_columnas(int numero_de_columnas) {
        this.numero_de_columnas = numero_de_columnas;
    }

    public int get_Numero_de_Filas() {
        return numero_de_filas;
    }

    public double[][] getMatriz_de_datos() {
        return matriz_de_datos;
    }

    public int getNumero_de_columnas() {
        return numero_de_columnas;
    }

    public String[] getVector_de_titulos() {
        return Vector_de_titulos;
    }

    public void setVector_de_titulos(String[] vector_de_titulos) {
        this.Vector_de_titulos = new String[vector_de_titulos.length];
        System.arraycopy(vector_de_titulos, 0, this.Vector_de_titulos, 0, vector_de_titulos.length);
    }

    

}
