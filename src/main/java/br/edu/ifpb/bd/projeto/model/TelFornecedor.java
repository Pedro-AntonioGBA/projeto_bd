package br.edu.ifpb.bd.projeto.model;

public class TelFornecedor {
    private int idTelefone;
    private String numero;
    private int cnpj;

    public TelFornecedor() {
    }

    public TelFornecedor(int idTelefone, String numero, int cnpj) {
        this.idTelefone = idTelefone;
        this.numero = numero;
        this.cnpj = cnpj;
    }

    public int getIdTelefone() {
        return idTelefone;
    }

    public void setIdTelefone(int idTelefone) {
        this.idTelefone = idTelefone;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
}