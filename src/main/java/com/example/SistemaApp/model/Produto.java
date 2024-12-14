package com.example.SistemaApp.model;

import jakarta.persistence.*;

/*
 *   TODO 1 - Criação de construtores
 *   TODO 2 - Criação de regras de negocio
 *   TODO 3 - Criação de cadastro
 *   TODO 4 - Criação de removeção
 *   TODO 5 - Criação de logica de desconto
 *
 *  Classe de prdotuso, ele a esta mapeado no banco de dados ainda falta fazer implementos
 * */
@Entity
@Table(name = "produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private String descricao;

    private double preco;
    private double precoAtacado;
    private double precoDeCompra;
    private double descontoPermetido;

    private int quantidadeMinima;
    private int estoque;
    private int quantidade;

    private boolean atacado;
    private boolean ativo;

    public Produto() {
    }

    //cadastro simples
    public Produto(String nome, String descricao, double precoDeCompra) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = precoDeCompra;
        this.ativo = false; //se nao tiver completado as info não é exibido no sistema de venda
        //this.id = geradorId();
    }

    public Produto(int id, String nome, String descricao, double preco, double precoAtacado, double precoDeCompra, double descontoPermetido, int quantidadeMinima, int estoque, int quantidade, boolean atacado, boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.precoAtacado = precoAtacado;
        this.precoDeCompra = precoDeCompra;
        this.descontoPermetido = descontoPermetido;
        this.quantidadeMinima = quantidadeMinima;
        this.estoque = estoque;
        this.quantidade = quantidade;
        this.atacado = atacado;
        this.ativo = ativo;
    }
/* private int geradorId() {

    }
*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPrecoAtacado() {
        return precoAtacado;
    }

    public void setPrecoAtacado(double precoAtacado) {
        this.precoAtacado = precoAtacado;
    }

    public double getPrecoDeCompra() {
        return precoDeCompra;
    }

    public void setPrecoDeCompra(double precoDeCompra) {
        this.precoDeCompra = precoDeCompra;
    }

    public double getDescontoPermetido() {
        return descontoPermetido;
    }

    public void setDescontoPermetido(double descontoPermetido) {
        this.descontoPermetido = descontoPermetido;
    }

    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(int quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isAtacado() {
        return atacado;
    }

    public void setAtacado(boolean atacado) {
        this.atacado = atacado;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
