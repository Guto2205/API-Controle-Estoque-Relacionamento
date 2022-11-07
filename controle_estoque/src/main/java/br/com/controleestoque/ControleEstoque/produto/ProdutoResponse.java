package br.com.controleestoque.ControleEstoque.produto;


public class ProdutoResponse {
	
    private Long id;
    private String nome;
    private Integer quantidadeMinima;
    private Integer quantidadeMaxima;
    private Integer estoqueAtual;

    public ProdutoResponse(Produto produto) {
        this.id = produto.getId();
        this.nome = produto.getNome();
        this.quantidadeMinima = produto.getQuantidadeMinima();
        this.quantidadeMaxima = produto.getQuantidadeMaxima();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    
    public Integer getQuantidadeMaxima() {
		return quantidadeMaxima;
	}
    
    public Integer getQuantidadeMinima() {
		return quantidadeMinima;
	}
    
    public Integer getEstoqueAtual() {
		return estoqueAtual;
	}
    
    public void setEstoqueAtual(Integer estoqueAtual) {
		this.estoqueAtual = estoqueAtual;
	}
    
}
