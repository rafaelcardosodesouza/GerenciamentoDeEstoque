package com.example.SistemaApp.repository;

import com.example.SistemaApp.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * interface de repositório do Spring Data JPA, que tem a principal função de
 * gerenciar a interação com o banco de dados para a entidade Produto
 * */
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // Você pode adicionar métodos customizados aqui, se necessário.
}
