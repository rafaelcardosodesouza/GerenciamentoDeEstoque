package com.example.SistemaApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;


/**
 * Ainda devo testar e melhorar teoricamente essa classe vai servi para consultar ID existente
 *
 * */
@Service
public class ProdutoService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Long gerarNovoId() {
        String sql = "SELECT MAX(id) FROM cliente";

        Long ultimoId = jdbcTemplate.queryForObject(sql, Long.class);

        // Caso não exista cliente no banco, retornamos 1 como primeiro ID
        if (ultimoId == null) {
            return 1L;
        }

        return ultimoId + 1; // Incrementa 1 ao último ID
    }
}

