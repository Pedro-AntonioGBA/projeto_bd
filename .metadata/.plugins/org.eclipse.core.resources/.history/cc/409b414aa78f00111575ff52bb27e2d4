package br.edu.ifpb.bd.projeto.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.edu.ifpb.bd.projeto.dto.AlunoDTO;
import br.edu.ifpb.bd.projeto.model.Aluno;
import br.edu.ifpb.bd.projeto.util.ConnectionFactory;

@Repository
public class AlunoDAO {
	
	public void salvar(Aluno aluno) throws Exception {
        String sql = "INSERT INTO aluno " +
        "(nome, matricula, data_nascimento, possui_necessidade_especifica, descricao_necessidade_especifica, id_curso) " +
        "VALUES (?, ?, ?, ? , ?, ?)";
        try (Connection c = ConnectionFactory.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getMatricula());
            ps.setDate(3, Date.valueOf(aluno.getDataNascimento()));
            ps.setBoolean(4, aluno.getPossuiNecessidadeEspecifica());
            ps.setString(5, aluno.getDescricaoNecessidadeEspecifica());
            ps.setInt(6, aluno.getIdCurso());
            ps.execute();
        }
    }
	
    public List<Aluno> listar() throws Exception {
        List<Aluno> lista = new ArrayList<>();
        String sql = "SELECT * FROM aluno";
        try (Connection c = ConnectionFactory.getConnection();
             Statement st = c.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
             while (rs.next()) {
                   lista.add(new Aluno(
                           rs.getInt("id"),
                           rs.getString("nome"),
                           rs.getString("matricula"),
                           rs.getObject("data_nascimento", LocalDate.class)
                   ));
             }
        }
        return lista;
    }

    public List<AlunoDTO> listarAlunosComCurso() throws Exception {
        List<AlunoDTO> lista = new ArrayList<>();
        String sql = "SELECT a.id, a.nome AS nome_aluno, a.matricula, a.data_nascimento, " +
        "c.nome AS nome_curso FROM aluno a " +
        "INNER JOIN curso c ON a.id_curso = c.id";
        try (Connection c = ConnectionFactory.getConnection();
             Statement st = c.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
             while (rs.next()) {
                // Obtendo o valor da coluna data_nascimento
                LocalDate dataNascimento = rs.getObject("data_nascimento", LocalDate.class);
                // Define o padrao brasileiro de data
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                // Convertendo para String
                String dataNascimentoFormatada = dataNascimento.format(formatter);
                   lista.add(new AlunoDTO(
                           rs.getInt("id"),
                           rs.getString("nome_aluno"),
                           rs.getString("matricula"),
                           dataNascimentoFormatada,
                           rs.getString("nome_curso")
                   ));
             }
        }
        return lista;
    }

    public Aluno buscar(Integer id) throws Exception {
        String sql = "SELECT * FROM aluno WHERE id=?";
        try (Connection c = ConnectionFactory.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Aluno a = new Aluno();
                a.setId(id);
                a.setNome(rs.getString("nome"));
                a.setMatricula(rs.getString("matricula"));
                a.setDataNascimento(rs.getObject("data_nascimento", LocalDate.class));
                a.setPossuiNecessidadeEspecifica(rs.getBoolean("possui_necessidade_especifica"));
                a.setDescricaoNecessidadeEspecifica(rs.getString("descricao_necessidade_especifica"));
                a.setIdCurso(rs.getInt("id_curso"));
                return a;
            }
        }
        return null;
    }

    public void atualizar(Aluno aluno) throws Exception {
        String sql =
          "UPDATE aluno SET nome=?, matricula=?, data_nascimento=?, possui_necessidade_especifica = ?, " + 
          " descricao_necessidade_especifica = ?, id_curso = ? " + 
          " WHERE id=?";
        try (Connection c = ConnectionFactory.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getMatricula());
            ps.setDate(3, Date.valueOf(aluno.getDataNascimento()));
            ps.setBoolean(4, aluno.getPossuiNecessidadeEspecifica());
            ps.setString(5, aluno.getDescricaoNecessidadeEspecifica());
            ps.setInt(6, aluno.getIdCurso());
            ps.setInt(7, aluno.getId());

            ps.execute();
        }
    }

    public void excluir(Integer id) throws Exception {
        String sql = "DELETE FROM aluno WHERE id=?";
        try (Connection c = ConnectionFactory.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.execute();
        }
    }


}
