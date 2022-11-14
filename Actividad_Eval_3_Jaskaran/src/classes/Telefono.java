/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Shajinder
 */
public class Telefono {

    private String identificador;

    private String nombre;

    private float precio;

    private int stock;

    private float peso;

    private LocalDate fechaDeAlta;

    private LocalDate fechaDeModificacion;

    private ArrayList<String> variaciones;

    public Telefono(String nomnbre, float precio, int stock, float peso) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.peso = peso;
        fechaDeAlta = LocalDate.now();
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setFechaDeAlta(LocalDate fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }

    public void setFechaDeModificacion(LocalDate fechaDeModificacion) {
        this.fechaDeModificacion = fechaDeModificacion;
    }

    public void setVariaciones(ArrayList<String> variaciones) {
        this.variaciones = variaciones;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public float getPeso() {
        return peso;
    }

    public LocalDate getFechaDeAlta() {
        return fechaDeAlta;
    }

    public LocalDate getFechaDeModificacion() {
        return fechaDeModificacion;
    }

    public ArrayList<String> getVariaciones() {
        return variaciones;
    }

}
