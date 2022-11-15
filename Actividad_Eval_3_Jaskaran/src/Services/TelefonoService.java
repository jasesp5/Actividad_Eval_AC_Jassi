/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Repository.TelefonoRepository;
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

    public ArrayList<Telefono> mostrarTelefono() throws SQLException, ClassNotFoundException {
        return this.telefonoRepository.obtenerTodosLosTelefonos();
    }

    public void insertarTelefono(Telefono telefono) throws SQLException, ClassNotFoundException {
        int id = telefono.getIdentificador();
        String nombre = telefono.getNombre();
        int stock = telefono.getStock();
        float peso = telefono.getPeso();
        float precio = telefono.getPrecio();
        LocalDate fechaAlta = telefono.getFechaDeAlta();
        this.telefonoRepository.insertarTelefonos(id,nombre, stock, peso, precio, fechaAlta);
    }

}
