package com.example.demo1.clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    // URL CORREGIDA - añade "jdbc:" al inicio
    private final String URL = "jdbc:postgresql://localhost:5432/clinica";
    private final String USER = "postgres";
    private final String PASSWORD = "postgres";

    public Connection connection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
            e.printStackTrace();
        }
        return conn;
    }

    public static void main(String[] args) {
        Conexion c = new Conexion();
        Connection conn = c.connection();
    }
}