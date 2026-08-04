package br.edu.ifpb.bd.projeto.model;

public class Fornecedor {
	private Integer id;
	private String cnpj;
    private String nome;

    public Fornecedor() {
    }

    public Fornecedor(Integer id,String cnpj, String nome) {
    	this.id = id;
        this.cnpj = cnpj;
        this.nome = nome;
    }
    
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
