package br.edu.ifpb.bd.projeto.model;

public class Prato {
    private int idPrato;
    private String receita;
    private float valor;
    private boolean disponibilidade;

    public Prato() {
    }

    public Prato(int idPrato, String receita, float valor, boolean disponibilidade) {
        this.idPrato = idPrato;
        this.receita = receita;
        this.valor = valor;
        this.disponibilidade = disponibilidade;
    }

    public int getIdPrato() {
        return idPrato;
    }

    public void setIdPrato(int idPrato) {
        this.idPrato = idPrato;
    }

    public String getReceita() {
        return receita;
    }

    public void setReceita(String receita) {
        this.receita = receita;
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
}