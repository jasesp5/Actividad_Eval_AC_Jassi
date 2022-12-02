/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import translation.Castellano;
import classes.Variacion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 *
 * @author Shajinder
 */
public class VariacionFactory {

    /**
     * @param result recibe un result
     * @return Variacion varicion
     * @throws java.sql.SQLException
     */
    public Variacion create(ResultSet result) throws SQLException {
        int id = result.getInt(Castellano.ID);
        String nombre = result.getString(Castellano.NOMBRE);
        int stock = result.getInt(Castellano.STOCK);
        float precio = result.getFloat(Castellano.PRECIO);
        String fechaAlta = result.getString(Castellano.FECHA_ALTA);
        String fechaModificacion = result.getString(Castellano.FECHA_MODIFICACION);
        int idTelefono = result.getInt(Castellano.TELEFONO_ID);
        float peso = result.getFloat(Castellano.PESO);
        Variacion variacion = new Variacion(nombre, precio,stock,peso);
        variacion.setIdentificador(id);
        variacion.setFechaDeAlta(LocalDate.parse(fechaAlta));
        if (fechaModificacion != null) {
            variacion.setFechaDeModificacion(LocalDate.parse(fechaModificacion));
        }

        variacion.setIdTelefeno(idTelefono);

        return variacion;

    }

}
