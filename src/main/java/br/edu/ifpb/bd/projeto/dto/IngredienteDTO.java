package br.edu.ifpb.bd.projeto.dto;

public class IngredienteDTO {
    
    private Integer idIngrediente;
    private String nome;
    private Float valor;
    private Boolean disponibilidade;
    private String nomeFornecedor;
    private String numFornecedor;

    public IngredienteDTO() {
    }

    // Construtor atualizado com as letras maiúsculas
    public IngredienteDTO(Integer idIngrediente, String nome, Float valor, Boolean disponibilidade, String nomeFornecedor, String numFornecedor) {
        this.idIngrediente = idIngrediente;
        this.nome = nome;
        this.valor = valor;
        this.disponibilidade = disponibilidade;
        this.nomeFornecedor = nomeFornecedor;
        this.numFornecedor = numFornecedor;
    }

	public Integer getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(Integer idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    // Para o tipo Boolean (com B maiúsculo), o padrão do Java é usar 'get' em vez de 'is'
    public Boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }
    
    public String getNumFornecedor() {
		return numFornecedor;
	}

	public void setNumFornecedor(String numFornecedor) {
		this.numFornecedor = numFornecedor;
	}
}
