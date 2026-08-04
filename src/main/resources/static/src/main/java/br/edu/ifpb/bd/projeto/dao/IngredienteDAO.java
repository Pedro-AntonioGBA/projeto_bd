package br.edu.ifpb.bd.projeto.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.edu.ifpb.bd.projeto.model.Ingrediente;
import br.edu.ifpb.bd.projeto.util.ConnectionFactory;

@Repository
public class IngredienteDAO {
    
    public List<Ingrediente> listar() throws Exception {
        List<Ingrediente> lista = new ArrayList<>();
        String sql = "SELECT * FROM ingredientes";
        try (Connection c = ConnectionFactory.getConnection();
             Statement st = c.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
             while (rs.next()) {
                   lista.add(new Ingrediente(
                           rs.getInt("id_ingrediente"),
                           rs.getString("nome"),
                           rs.getFloat("valor"),
                           rs.getBoolean("disponibilidade"),
                           rs.getInt("id_fornecedor")
                   ));
             }
        }
        return lista;
    }
}