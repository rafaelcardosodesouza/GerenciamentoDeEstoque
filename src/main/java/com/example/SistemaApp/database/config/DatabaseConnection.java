package com.example.SistemaApp.database.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    /**
     * Esta classe cria a conexção com o banco de dados, mesmo sabendo que nao é uma boa
     * pratica ter esses dados updados
     *
     * */

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    // metodo para criar a conexão com o banco de dados
    public static Connection getConnection() throws SQLException {
        try {
            // Carregar o driver JDBC para MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver JDBC não encontrado.", e);
        }
    }
}
