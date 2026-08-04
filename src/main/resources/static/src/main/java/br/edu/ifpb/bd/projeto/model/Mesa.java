package br.edu.ifpb.bd.projeto.model;

public class Mesa {
    private int idMesa;
    private int lugares;

    public Mesa() {
    }

    public Mesa(int idMesa, int lugares) {
        this.idMesa = idMesa;
        this.lugares = lugares;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getLugares() {
        return lugares;
    }

    public void setLugares(int lugares) {
        this.lugares = lugares;
    }
}