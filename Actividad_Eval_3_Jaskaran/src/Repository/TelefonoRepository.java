/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import Factory.TelefonoFactory;
import classes.Telefono;
import java.sql.Date;
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

    public void insertarTelefonos(int id, String nombre, int stock, float peso, float precio, LocalDate fechaAlta) throws SQLException, ClassNotFoundException {
        Statement setenciaParaInsertar = this.dataBase.abrirConexion();
     
        String sqlInsertr = String.format("INSERT INTO Telefono VALUES (%s, '%s', %s,%s,%s,'%s',%s)", id, nombre, stock, peso, precio, fechaAlta,null);
        int executeUpdate = setenciaParaInsertar.executeUpdate(sqlInsertr);
        setenciaParaInsertar.close();
        this.dataBase.cerrarConexion();

    }

}
