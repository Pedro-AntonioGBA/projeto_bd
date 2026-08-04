package br.edu.ifpb.bd.projeto.model;

public class Pedido {
    private int idPedido;
    private float valorPedido;
    private int idMesa;

    public Pedido() {
    }

    public Pedido(int idPedido, float valorPedido, int idMesa) {
        this.idPedido = idPedido;
        this.valorPedido = valorPedido;
        this.idMesa = idMesa;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public float getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(float valorPedido) {
        this.valorPedido = valorPedido;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }
}