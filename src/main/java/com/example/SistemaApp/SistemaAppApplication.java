package com.example.SistemaApp;

import com.example.SistemaApp.database.config.DatabaseConnection;
import com.example.SistemaApp.database.scripts.CriacaoTabelaProduto;
import com.example.SistemaApp.model.Produto;
import com.example.SistemaApp.service.ProdutoInsercao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;


/**
 * classe principal
 * */
@SpringBootApplication
public class SistemaAppApplication implements CommandLineRunner {

	@Autowired
	private ProdutoInsercao produtoInsercao;

	public static void main(String[] args) {
		SpringApplication.run(SistemaAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Criar um produto
		criarDb();
		Produto produto = new Produto();
		produto.setNome("Produto A");
		produto.setDescricao("Descrição do Produto A");
		produto.setPreco(100.0);
		produto.setPrecoAtacado(90.0);
		produto.setPrecoDeCompra(80.0);
		produto.setDescontoPermetido(5.0);
		produto.setQuantidadeMinima(10);
		produto.setEstoque(50);
		produto.setQuantidade(50);
		produto.setAtacado(true);
		produto.setAtivo(true);

		// Inserir produto no banco de dados
		produtoInsercao.inserirProduto(produto);
	}
	public void criarDb(){
		CriacaoTabelaProduto criacaoTabelaProduto  = new CriacaoTabelaProduto();

	}
}
