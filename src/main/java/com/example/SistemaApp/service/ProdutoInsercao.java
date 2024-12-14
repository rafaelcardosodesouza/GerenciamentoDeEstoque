package com.example.SistemaApp.service;

import com.example.SistemaApp.model.Produto;
import com.example.SistemaApp.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * Esta classe é uma implementação de um serviço de negócios que oferece
 * uma forma de interagir com o banco de dados através do ProdutoRepository
 *
 * ainda deve por metodos para validação de dados
 * */
@Service
public class ProdutoInsercao {

    private final ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoInsercao(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Produto inserirProduto(Produto produto) {
        return produtoRepository.save(produto);  // Isso salva ou atualiza o produto
    }
}
