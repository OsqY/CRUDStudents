package com.mycomapny.baseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDeDatos {
    protected Connection conexionBaseDeDatos;
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost:3306/sistemaDeEstudiantes?zeroDateTimeBehavior=CONVERT_TO_NULL";
    
    private final String USER = "root";
    private final String PASS = "";
    public void conectarDb() throws ClassNotFoundException {
        try {
            conexionBaseDeDatos = DriverManager.getConnection(DB_URL, USER, PASS);
            Class.forName(JDBC_DRIVER);
        } catch (SQLException e) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public void cerrarDb() throws SQLException {
    if (conexionBaseDeDatos != null) {
        if (!conexionBaseDeDatos.isClosed()){
            conexionBaseDeDatos.close();
        }
    }
}
}
