/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import classes.Telefono;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 *
 * @author Shajinder
 */
public class TelefonoFactory {

    public Telefono createTelefono(ResultSet result) throws SQLException {
        int id = result.getInt("id");
        String nombre = result.getString("nombre");
        int stock = result.getInt("stock");
        float precio = result.getFloat("precio");
        float peso = result.getFloat("peso");
        String fechaAlta = result.getString("fecha_alta");
        Telefono telefono = new Telefono(nombre, precio, stock, peso);
        telefono.setIdentificador(id);
        telefono.setFechaDeAlta(LocalDate.parse(fechaAlta));
        return telefono;

    }

}
