package br.edu.ifpb.bd.projeto.model;

public class IngredientePrato {
    private int idPrato;
    private int idIngrediente;

    public IngredientePrato() {
    }

    public IngredientePrato(int idPrato, int idIngrediente) {
        this.idPrato = idPrato;
        this.idIngrediente = idIngrediente;
    }

    public int getIdPrato() {
        return idPrato;
    }

    public void setIdPrato(int idPrato) {
        this.idPrato = idPrato;
    }

    public int getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }
}