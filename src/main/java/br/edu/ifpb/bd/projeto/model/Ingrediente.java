package br.edu.ifpb.bd.projeto.model;

public class Ingrediente {
    
    private Integer idIngrediente;
    private String nome;
    private Float valor; // Alterado de float para Float
    private Boolean disponibilidade; // Alterado de boolean para Boolean
    private Integer idFornecedor; // Alterado de int para Integer

    public Ingrediente() {
    }

    // Construtor atualizado com as letras maiúsculas
    public Ingrediente(Integer idIngrediente, String nome, Float valor, Boolean disponibilidade, Integer idFornecedor) {
        this.idIngrediente = idIngrediente;
        this.nome = nome;
        this.valor = valor;
        this.disponibilidade = disponibilidade;
        this.idFornecedor = idFornecedor;
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

    public Integer getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(Integer idFornecedor) {
        this.idFornecedor = idFornecedor;
    }
}