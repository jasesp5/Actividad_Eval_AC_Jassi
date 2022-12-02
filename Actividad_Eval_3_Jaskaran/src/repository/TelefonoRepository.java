/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import factory.TelefonoFactory;
import translation.Castellano;
import classes.Telefono;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Shajinder
 */
public class TelefonoRepository {

    private DataBase dataBase;

    private TelefonoFactory telefonoFactory;

    public TelefonoRepository() {
        this.dataBase = new DataBase();
        this.telefonoFactory = new TelefonoFactory();
    }

    /**
     *
     * @return ArrayList de telefonos devuelve un arraylist con todos los
     * telefenos
     * @throws SQLException lanza exception
     * @throws ClassNotFoundException lanza exception
     */
    public ArrayList<Telefono> obtenerTodosLosTelefonos() throws SQLException, ClassNotFoundException {
        ArrayList<Telefono> telefonos = new ArrayList<>();
        Statement setenciaParaObtenerLosTelefonos = this.dataBase.abrirConexion();
        ResultSet result = setenciaParaObtenerLosTelefonos.executeQuery("SELECT * FROM Telefono;");
        while (result.next()) {
            Telefono telefono = this.telefonoFactory.createTelefono(result);
            telefonos.add(telefono);
        }
        setenciaParaObtenerLosTelefonos.close();
        this.dataBase.cerrarConexion();
        return telefonos;
    }

    /**
     * @param id int
     * @param nombre String
     * @param fechaAlta LocalDAte
     * @throws SQLException lanza exception
     * @throws ClassNotFoundException lanza exception
     */
    public void insertarTelefonos(int id, String nombre, LocalDate fechaAlta) throws SQLException, ClassNotFoundException {
        try (Statement setenciaParaInsertar = this.dataBase.abrirConexion()) {
            String sqlInsertr = String.format("INSERT INTO Telefono VALUES (%s, '%s','%s',%s)", id, nombre, fechaAlta, null);
            int executeInsert = setenciaParaInsertar.executeUpdate(sqlInsertr);
        }
        this.dataBase.cerrarConexion();

    }

    /**
     *
     * @param id int
     * @return telefeno Telefono
     * @throws SQLException lanza exception
     * @throws ClassNotFoundException lanza exception
     */
    public Telefono obtenerTelefonoPorId(int id) throws SQLException, ClassNotFoundException,NullPointerException{

        Statement setenciaParaObtenerTelefonoSelecionado = this.dataBase.abrirConexion();
        String sqlParaObtenerId = "SELECT * FROM Telefono where id = " + id + ";";
        ResultSet result = setenciaParaObtenerTelefonoSelecionado.executeQuery(sqlParaObtenerId);

        Telefono telefono = new Telefono();
        while (result.next()) {
            telefono = this.telefonoFactory.createTelefono(result);
        }

        setenciaParaObtenerTelefonoSelecionado.close();
        this.dataBase.cerrarConexion();
        return telefono;

    }

    /**
     * @param id int
     * @param nombre String
     * @param fechaModificacion LocalDate
     * @throws SQLException lanza exception
     * @throws ClassNotFoundException lanza exception
     */
    public void modificarUnTelefono(int id, String nombre,
            LocalDate fechaModificacion) throws SQLException, ClassNotFoundException {

        Statement sentenciaParaModificarTelefono = this.dataBase.abrirConexion();
        String sqlModificar = String.format("UPDATE Telefono SET nombre = '%s', "
                + "fecha_modificacion = '%s' "
                + "WHERE id = %s;", nombre, fechaModificacion, id);
        int ejecutarModificacion = sentenciaParaModificarTelefono.executeUpdate(sqlModificar);
        sentenciaParaModificarTelefono.close();

    }

    /**
     *
     * @param nombre String
     * @return id int id del Telefono
     * @throws SQLException lanza exception
     * @throws ClassNotFoundException lanza exception
     */
    public int obtenerTelefonoPorNombre(String nombre) throws SQLException, ClassNotFoundException {
        int id = 0;
        try (Statement setenciaParaObtenerTelefonoConElNombre = this.dataBase.abrirConexion()) {
            String sqlParaObtenerNombre = String.format("SELECT id FROM Telefono where nombre =  '%s'; ", nombre);
            ResultSet result = setenciaParaObtenerTelefonoConElNombre.executeQuery(sqlParaObtenerNombre);
            while (result.next()) {
                id = result.getInt(Castellano.ID);
            }
            setenciaParaObtenerTelefonoConElNombre.close();
        }
        this.dataBase.cerrarConexion();
        return id;

    }

}
