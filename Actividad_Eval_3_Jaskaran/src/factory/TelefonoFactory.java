/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import translation.Castellano;
import classes.Telefono;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 *
 * @author Shajinder
 */
public class TelefonoFactory {

    /**
     * @param result recibe result
     * @return Telefono telefono
     * @throws SQLException
     */
    public Telefono createTelefono(ResultSet result) throws SQLException {
        int id = result.getInt(Castellano.ID);
        String nombre = result.getString(Castellano.NOMBRE);
        String fechaAlta = result.getString(Castellano.FECHA_ALTA);
        String fechaModificacion = result.getString(Castellano.FECHA_MODIFICACION);

        Telefono telefono = new Telefono(nombre);
        telefono.setIdentificador(id);
        telefono.setFechaDeAlta(LocalDate.parse(fechaAlta));
        if (fechaModificacion != null) {
            telefono.setFechaDeModificacion(LocalDate.parse(fechaModificacion));
        }
        return telefono;

    }

}
