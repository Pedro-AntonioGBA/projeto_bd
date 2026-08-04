package br.edu.ifpb.bd.projeto.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.edu.ifpb.bd.projeto.model.Prato;
import br.edu.ifpb.bd.projeto.util.ConnectionFactory;

@Repository
public class PratoDAO {
    
    public List<Prato> listar() throws Exception {
        List<Prato> lista = new ArrayList<>();
        String sql = "SELECT * FROM pratos";
        try (Connection c = ConnectionFactory.getConnection();
             Statement st = c.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
             while (rs.next()) {
                   lista.add(new Prato(
                           rs.getInt("id_prato"),
                           rs.getString("receita"),
                           rs.getFloat("valor"),
                           rs.getBoolean("disponibilidade")
                   ));
             }
        }
        return lista;
    }
}