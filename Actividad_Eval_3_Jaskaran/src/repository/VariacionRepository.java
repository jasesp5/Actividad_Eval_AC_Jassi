/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import factory.VariacionFactory;
import translation.Castellano;
import classes.Variacion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Shajinder
 */
public class VariacionRepository {

    private DataBase dataBase;

    private VariacionFactory variacionFactory;

    public VariacionRepository() {
        this.dataBase = new DataBase();
        this.variacionFactory = new VariacionFactory();
    }

    /**
     *
     * @param id int
     * @param nombre String
     * @param precio float
     * @param stock float
     * @param fechaDeAlta LocalDate
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public void insertarUnaVariacion(int id, String nombre, float precio, int stock, float peso,
            LocalDate fechaDeAlta, int idTelefono) throws SQLException, ClassNotFoundException {
        try (Statement setenciaParaInsertar = this.dataBase.abrirConexion()) {
            String sqlInsertr = String.format("INSERT INTO Variaciones VALUES (%s,"
                    + " '%s', %s,%s,'%s',%s,%s,%s)", id, nombre, stock, precio, fechaDeAlta, peso, null, idTelefono);
            int executeInsert = setenciaParaInsertar.executeUpdate(sqlInsertr);
        }
        this.dataBase.cerrarConexion();
    }

    /**
     *
     * @return ArrayList devuelve una arrayList con todos los objetos
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public ArrayList<Variacion> obtenerTodosLosTelefonos() throws SQLException, ClassNotFoundException {
        ArrayList<Variacion> variaciones = new ArrayList<>();
        Statement setenciaParaObtenerVariaciones = this.dataBase.abrirConexion();
        ResultSet result = setenciaParaObtenerVariaciones.executeQuery("SELECT * FROM Variaciones;");
        while (result.next()) {
            Variacion variacion = this.variacionFactory.create(result);
            variaciones.add(variacion);
        }
        setenciaParaObtenerVariaciones.close();
        this.dataBase.cerrarConexion();
        return variaciones;
    }

    /**
     *
     * @param id int
     * @return Variacion varicion
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public Variacion obtenerVariacionSelecionada(int id) throws SQLException, ClassNotFoundException,NullPointerException  {

        Statement setenciaParaObtenerVariacion = this.dataBase.abrirConexion();
        String sqlParaObtenerId = "SELECT * FROM Variaciones where id = " + id + ";";
        ResultSet result = setenciaParaObtenerVariacion.executeQuery(sqlParaObtenerId);
        Variacion variacion = new Variacion();
        while (result.next()) {
            variacion = this.variacionFactory.create(result);
        }
        setenciaParaObtenerVariacion.close();
        this.dataBase.cerrarConexion();
        return variacion;

    }

    /**
     *
     * @param nombreVariacion String
     * @return id del del telefono
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public int obtenerProductoIdPorNombreVariacion(String nombreVariacion) throws SQLException, ClassNotFoundException {
        int id = 0;
        try (Statement setenciaParaObtenerIdVariacion = this.dataBase.abrirConexion()) {
            String sqlParaObtenerNombre = String.format("SELECT telefono_id FROM Variaciones where nombre =  '%s'; ", nombreVariacion);
            ResultSet result = setenciaParaObtenerIdVariacion.executeQuery(sqlParaObtenerNombre);

            while (result.next()) {
                id = result.getInt(Castellano.TELEFONO_ID);
            }
            setenciaParaObtenerIdVariacion.close();
        }

        this.dataBase.cerrarConexion();
        return id;

    }

    /**
     *
     * @param id int
     * @param nombre String
     * @param stock int
     * @param precio float
     * @param peso
     * @param fechaModificacion LocalDate
     * @param telefonoId int
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public void modificarUnaVariacion(int id, String nombre, int stock,
            float precio, float peso, LocalDate fechaModificacion, int telefonoId) throws SQLException, ClassNotFoundException {
        Statement sentenciaParaModificarVariacion = this.dataBase.abrirConexion();
        String sqlModificar = String.format("UPDATE Variaciones SET nombre = '%s', stock = %s, "
                + "precio = %s, peso = %s,  fecha_modificacion = '%s', telefono_id = %s "
                + "WHERE id = %s;", nombre, stock, precio, peso, fechaModificacion, telefonoId, id);
        int ejecutarModificacion = sentenciaParaModificarVariacion.executeUpdate(sqlModificar);
        sentenciaParaModificarVariacion.close();
        this.dataBase.cerrarConexion();
    }

    /**
     *
     * @param nombreVariacion String
     * @return id del variacion
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public int obtenerIdVariacionPorElNombre(String nombreVariacion) throws SQLException, ClassNotFoundException {
        int id = 0;
        try (Statement setenciaParaObtenerIdVariacion = this.dataBase.abrirConexion()) {
            String sqlParaObtenerId = String.format("SELECT id FROM Variaciones where nombre =  '%s'; ", nombreVariacion);
            ResultSet result = setenciaParaObtenerIdVariacion.executeQuery(sqlParaObtenerId);

            while (result.next()) {
                id = result.getInt(Castellano.ID);
            }
            setenciaParaObtenerIdVariacion.close();
        }
        this.dataBase.cerrarConexion();
        return id;
    }

    /**
     * @param nombreVariacion String
     * @return boolean
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public String obtenerNombre(String nombreVariacion) throws SQLException, ClassNotFoundException {
        Statement setenciaParaObtenerNombre = this.dataBase.abrirConexion();
        String sqlParaObtenerNombre = String.format("SELECT nombre FROM Variaciones where nombre = "
                + " '%s'; ", nombreVariacion);
        ResultSet result = setenciaParaObtenerNombre.executeQuery(sqlParaObtenerNombre);
        String nombreObtenidoDeLaConstsulta = null;
        while (result.next()) {
            nombreObtenidoDeLaConstsulta = result.getString(Castellano.NOMBRE);
        }
        setenciaParaObtenerNombre.close();
        this.dataBase.cerrarConexion();
        return nombreObtenidoDeLaConstsulta;
    }

    public ArrayList<Variacion> obtenerVariacionPorProductoId(int id) throws SQLException, ClassNotFoundException {
        Statement setenciaParaObtenerVariacion = this.dataBase.abrirConexion();
        String sqlParaObtenerId = "SELECT * FROM Variaciones where telefono_id = " + id + ";";
        ResultSet result = setenciaParaObtenerVariacion.executeQuery(sqlParaObtenerId);
        ArrayList<Variacion> variaciones = new ArrayList<>();
        while (result.next()) {
            Variacion variacion = this.variacionFactory.create(result);
            variaciones.add(variacion);
        }
        setenciaParaObtenerVariacion.close();
        this.dataBase.cerrarConexion();
        return variaciones;
    }

}
