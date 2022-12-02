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

    private int identificador;

    private String nombre;

    private LocalDate fechaDeAlta;

    private LocalDate fechaDeModificacion;

    private ArrayList<Variacion> variaciones;

    public Telefono(String nombre) {
        this.nombre = nombre;
        this.variaciones = new ArrayList<>();
    }

    public Telefono() {

    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeAlta(LocalDate fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }

    public void setFechaDeModificacion(LocalDate fechaDeModificacion) {
        this.fechaDeModificacion = fechaDeModificacion;
    }

    public void setVariaciones(ArrayList<Variacion> variaciones) {
        this.variaciones = variaciones;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaDeAlta() {
        return fechaDeAlta;
    }

    public LocalDate getFechaDeModificacion() {
        return fechaDeModificacion;
    }

    public ArrayList<Variacion> getVariaciones() {
        return variaciones;
    }

}
