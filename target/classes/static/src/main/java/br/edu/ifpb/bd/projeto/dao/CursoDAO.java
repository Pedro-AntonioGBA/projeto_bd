package br.edu.ifpb.bd.projeto.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.edu.ifpb.bd.projeto.model.Curso;
import br.edu.ifpb.bd.projeto.util.ConnectionFactory;

@Repository
public class CursoDAO {
    
    public List<Curso> listar() throws Exception {
        List<Curso> lista = new ArrayList<>();
        String sql = "SELECT * FROM curso";
        try (Connection c = ConnectionFactory.getConnection();
             Statement st = c.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
             while (rs.next()) {
                   lista.add(new Curso(
                           rs.getInt("id"),
                           rs.getString("nome"),
                           rs.getString("sigla")
                   ));
             }
        }
        return lista;
    }

}
