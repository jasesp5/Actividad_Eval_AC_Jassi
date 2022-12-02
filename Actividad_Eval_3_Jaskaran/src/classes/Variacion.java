/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.time.LocalDate;

/**
 *
 * @author Shajinder
 */
public class Variacion {

    private int identificador;

    private String nombre;

    private float precio;

    private float peso;

    private int stock;

    private LocalDate fechaDeAlta;

    private LocalDate fechaDeModificacion;

    private int idTelefeno;

    public Variacion(String nombre, float precio, int stock, float peso) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.peso = peso;
    }

    public Variacion() {

    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setIdTelefeno(int idTelefeno) {
        this.idTelefeno = idTelefeno;
    }

    public void setIdentificador(int identificador) {
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

    public void setFechaDeAlta(LocalDate fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }

    public void setFechaDeModificacion(LocalDate fechaDeModificacion) {
        this.fechaDeModificacion = fechaDeModificacion;
    }

    public int getIdentificador() {
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

    public LocalDate getFechaDeAlta() {
        return fechaDeAlta;
    }

    public LocalDate getFechaDeModificacion() {
        return fechaDeModificacion;
    }

    public int getIdTelefeno() {
        return idTelefeno;
    }

}
