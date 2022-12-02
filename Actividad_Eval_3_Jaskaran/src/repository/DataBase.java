/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Shajinder
 */
public class DataBase {

    private final String NOMBRE_BASE_DE_DATOS = "jdbc:mysql://localhost/Telefono_Variaciones";
    
    private final String CLASS_NAME = "com.mysql.cj.jdbc.Driver";

    private final String USER = "root";

    private final String PASSWORD = "1234";

    private Connection connection;

    /**
     *
     * @return Statement statement
     * @throws SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public Statement abrirConexion() throws SQLException, ClassNotFoundException {
        Class.forName(CLASS_NAME);
        this.connection = DriverManager.getConnection(NOMBRE_BASE_DE_DATOS, USER, PASSWORD);
        return this.connection.createStatement();
    }

    public void cerrarConexion() throws SQLException {
        this.connection.close();
    }

}
