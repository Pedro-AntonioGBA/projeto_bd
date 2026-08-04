package br.edu.ifpb.bd.projeto.dto;

public class AlunoDTO {

    private int id;
    private String nome;
    private String matricula;
    private String dataNascimentoFormatada;
    private String nomeCurso;

    public AlunoDTO(int id, String nome, String matricula, String dataNascimentoFormatada, String nomeCurso) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimentoFormatada = dataNascimentoFormatada;
        this.nomeCurso = nomeCurso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDataNascimentoFormatada() {
        return dataNascimentoFormatada;
    }

    public void setDataNascimentoFormatada(String dataNascimentoFormatada) {
        this.dataNascimentoFormatada = dataNascimentoFormatada;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
}
