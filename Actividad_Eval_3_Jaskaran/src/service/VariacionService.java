/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import repository.VariacionRepository;
import classes.Variacion;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Shajinder
 */
public class VariacionService {

    private VariacionRepository variacionRepository;

    public VariacionService() {
        this.variacionRepository = new VariacionRepository();
    }

    /**
     *
     * @param variacion Variacion
     * @param idTelefono int
     * @throws SQLException lanza exception
     * @throws ClassNotFoundException lanza exception
     */
    public void insertarVariacion(Variacion variacion, int idTelefono) throws SQLException, ClassNotFoundException {
        int id = variacion.getIdentificador();
        String nombre = variacion.getNombre();
        float precio = variacion.getPrecio();
        int stock = variacion.getStock();
        float peso = variacion.getPeso();
        LocalDate fechaModificaion = LocalDate.now();
        this.variacionRepository.insertarUnaVariacion(id, nombre, precio, stock, peso,fechaModificaion, idTelefono);

    }

    /**
     *
     * @return Arraylist con todas las variaciones
     * @throws SQLException lanza exception
     * @throws ClassNotFoundException lanza exception
     */
    public ArrayList<Variacion> obtenerTodasLasVariaciones() throws SQLException, ClassNotFoundException {
        return this.variacionRepository.obtenerTodosLosTelefonos();

    }

    /**
     *
     * @param id int
     * @return Variacion variacion
     * @throws SQLException lanza exception
     * @throws ClassNotFoundException lanza exception
     */
    public Variacion obtenerVariacion(int id) throws SQLException, ClassNotFoundException,NullPointerException {
        return this.variacionRepository.obtenerVariacionSelecionada(id);
    }

    /**
     *
     * @param nombreVariacion String
     * @return int id del telefono
     * @throws SQLException lanza exception
     * @throws ClassNotFoundException lanza exception
     */
    public int obtenerIdDelTelefono(String nombreVariacion) throws SQLException, ClassNotFoundException {
        return this.variacionRepository.obtenerProductoIdPorNombreVariacion(nombreVariacion);
    }

    /**
     *
     * @param nombreDeLaVariacion String
     * @return int id de la variacion
     * @throws SQLException lanza exception
     * @throws ClassNotFoundException lanza exception
     */
    public int obtenerIdVariacion(String nombreDeLaVariacion) throws SQLException, ClassNotFoundException {
        return this.variacionRepository.obtenerIdVariacionPorElNombre(nombreDeLaVariacion);
    }

    /**
     * @param variacion Variacion
     * @throws SQLException lanza exception
     * @throws ClassNotFoundException lanza exception
     */
    public void modificarVariacion(Variacion variacion) throws SQLException, ClassNotFoundException {
        int id = variacion.getIdentificador();
        String nombre = variacion.getNombre();
        int stock = variacion.getStock();
        float precio = variacion.getPrecio();
        LocalDate fechaModificaion = LocalDate.now();
        int telefonoID = variacion.getIdTelefeno();
        float peso = variacion.getPeso();
        this.variacionRepository.modificarUnaVariacion(id, nombre, stock, precio,peso,
                fechaModificaion, telefonoID);

    }

    /**
     *
     * @param nombreVariacion String
     * @return boolean
     * @throws SQLException lanza exception
     */
    public boolean comprobarSiExisteNombreDeLaVariacion(String nombreVariacion) throws SQLException, ClassNotFoundException {
        if (variacionRepository.obtenerNombre(nombreVariacion) != null) {
            return true;
        }
        return false;
    }

    /**
     *
     * @param id int
     * @return Variacion
     * @throws SQLException lanza exception
     * @throws ClassNotFoundException lanza exception
     */
    public ArrayList<Variacion> obtenerVariacionesConLaForeignKey(int id) throws SQLException, ClassNotFoundException {
        return this.variacionRepository.obtenerVariacionPorProductoId(id);
    }

}
