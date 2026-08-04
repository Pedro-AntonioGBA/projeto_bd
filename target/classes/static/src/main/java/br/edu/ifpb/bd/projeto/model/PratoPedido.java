package br.edu.ifpb.bd.projeto.model;

public class PratoPedido {
    private int idPrato;
    private int idPedido;

    public PratoPedido() {
    }

    public PratoPedido(int idPrato, int idPedido) {
        this.idPrato = idPrato;
        this.idPedido = idPedido;
    }

    public int getIdPrato() {
        return idPrato;
    }

    public void setIdPrato(int idPrato) {
        this.idPrato = idPrato;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
}