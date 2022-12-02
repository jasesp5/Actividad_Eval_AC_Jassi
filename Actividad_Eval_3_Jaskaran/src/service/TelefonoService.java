/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import repository.TelefonoRepository;
import classes.Telefono;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Shajinder
 */
public class TelefonoService {

    private TelefonoRepository telefonoRepository;

    public TelefonoService() {
        this.telefonoRepository = new TelefonoRepository();

    }

    /**
     *
     * @return Arraylist con todos los telefonos
     * @throws SQLException lanza exception
     * @throws ClassNotFoundException lanza exception
     */
    public ArrayList<Telefono> mostrarTelefono() throws SQLException, ClassNotFoundException {

        return this.telefonoRepository.obtenerTodosLosTelefonos();
    }

    /**
     *
     * @param telefono Telefono
     * @throws SQLException lanza exception
     * @throws ClassNotFoundException lanza exception
     */
    public void insertarTelefono(Telefono telefono) throws SQLException, ClassNotFoundException {
        int id = telefono.getIdentificador();
        String nombre = telefono.getNombre();
        LocalDate fechaAlta = telefono.getFechaDeAlta();
        this.telefonoRepository.insertarTelefonos(id, nombre, fechaAlta);
    }

    /**
     * @param id int
     * @return telefono
     * @throws SQLException lanza exception
     * @throws ClassNotFoundException lanza exception
     */
    public Telefono obtenerTelefono(int id) throws SQLException, ClassNotFoundException,NullPointerException {
        return this.telefonoRepository.obtenerTelefonoPorId(id);
    }

    /**
     *
     * @param id int
     * @param nombre String
     * @param peso float
     * @param fechaMoficicacion LocalDate
     * @throws SQLException lanza exception
     * @throws ClassNotFoundException lanza exception
     */
    public void modificarTelefono(int id, String nombre,LocalDate fechaMoficicacion) throws SQLException, ClassNotFoundException {
        this.telefonoRepository.modificarUnTelefono(id, nombre, fechaMoficicacion);
    }

    /**
     * @param nombre String
     * @return id
     * @throws SQLException lanza exception
     * @throws ClassNotFoundException lanza exception
     */
    public int obtenerIdTelefono(String nombre) throws SQLException, ClassNotFoundException {
        return this.telefonoRepository.obtenerTelefonoPorNombre(nombre);

    }
}
