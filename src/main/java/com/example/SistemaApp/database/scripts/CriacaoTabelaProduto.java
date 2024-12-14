package com.example.SistemaApp.database.scripts;

import com.example.SistemaApp.database.config.DatabaseConnection;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
/**
 * Essa classe faz a criação da tabela de produtos e o banco de dados "sistemaEstoque"
 *
 * */
public class CriacaoTabelaProduto {

    public static void criaTablea() {
        try (Connection conn = DatabaseConnection.getConnection()) {
            Statement stmt = conn.createStatement();

            // Criar o banco de dados
            String createDatabaseSQL = "CREATE DATABASE IF NOT EXISTS sistemaEstoque";
            stmt.executeUpdate(createDatabaseSQL);
            System.out.println("Banco de dados 'sistemaEstoque' criado com sucesso!");

            // Selecionar o banco de dados
            stmt.executeUpdate("USE sistemaEstoque");

            // Criar a tabela 'produto'
            String createTableSQL = "CREATE TABLE IF NOT EXISTS produto (" +
                    "id BIGINT AUTO_INCREMENT PRIMARY KEY, " +
                    "nome VARCHAR(255) NOT NULL, " +
                    "descricao TEXT, " +
                    "preco DECIMAL(10, 2) NOT NULL, " +
                    "precoAtacado DECIMAL(10, 2), " +
                    "precoDeCompra DECIMAL(10, 2) NOT NULL, " +
                    "descontoPermetido DECIMAL(5, 2) DEFAULT 0.00, " +
                    "quantidadeMinima INT NOT NULL, " +
                    "estoque INT NOT NULL, " +
                    "quantidade INT NOT NULL, " +
                    "atacado BOOLEAN DEFAULT FALSE, " +
                    "ativo BOOLEAN DEFAULT TRUE " +
                    ")";
            stmt.executeUpdate(createTableSQL);
            System.out.println("Tabela 'produto' criada com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
