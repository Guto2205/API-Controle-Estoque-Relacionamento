package br.com.controleestoque.ControleEstoque.produto;

import javax.validation.constraints.*;

public class ProdutoRequest {
    @NotBlank
    private String nome;
    @NotBlank
    private String descricao;
    @NotNull
    @PositiveOrZero
    private Integer quantidadeMinima;
    @NotNull
    @Positive
    private Integer quantidadeMaxima;

    public ProdutoRequest(String nome, String descricao, Integer quantidadeMinima, Integer quantidadeMaxima) {
        this.nome = nome;
        this.descricao = descricao;
        this.quantidadeMinima = quantidadeMinima;
        this.quantidadeMaxima = quantidadeMaxima;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public Integer getQuantidadeMaxima() {
        return quantidadeMaxima;
    }
    public Produto toModelo(){
        return new Produto(nome,descricao,quantidadeMinima,quantidadeMaxima);
    }
}
