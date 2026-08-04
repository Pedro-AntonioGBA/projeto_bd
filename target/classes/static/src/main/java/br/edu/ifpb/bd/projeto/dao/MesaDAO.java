package br.edu.ifpb.bd.projeto.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.edu.ifpb.bd.projeto.model.Mesa;
import br.edu.ifpb.bd.projeto.util.ConnectionFactory;

@Repository
public class MesaDAO {
    
    public List<Mesa> listar() throws Exception {
        List<Mesa> lista = new ArrayList<>();
        String sql = "SELECT * FROM mesas";
        try (Connection c = ConnectionFactory.getConnection();
             Statement st = c.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
             while (rs.next()) {
                   lista.add(new Mesa(
                           rs.getInt("id_mesa"),
                           rs.getInt("lugares")
                   ));
             }
        }
        return lista;
    }
}