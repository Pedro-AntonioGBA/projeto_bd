package br.edu.ifpb.bd.projeto.model;

public class Ingrediente {
    private int idIngrediente;
    private String nome;
    private float valor;
    private boolean disponibilidade;
    private int idFornecedor;

    public Ingrediente() {
    }

    public Ingrediente(int idIngrediente, String nome, float valor, boolean disponibilidade, int idFornecedor) {
        this.idIngrediente = idIngrediente;
        this.nome = nome;
        this.valor = valor;
        this.disponibilidade = disponibilidade;
        this.idFornecedor = idFornecedor;
    }

    public int getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }
}