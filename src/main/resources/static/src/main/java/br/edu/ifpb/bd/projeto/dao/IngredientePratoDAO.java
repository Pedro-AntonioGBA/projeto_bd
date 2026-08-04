package br.edu.ifpb.bd.projeto.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.edu.ifpb.bd.projeto.model.IngredientePrato;
import br.edu.ifpb.bd.projeto.util.ConnectionFactory;

@Repository
public class IngredientePratoDAO {
    
    public List<IngredientePrato> listar() throws Exception {
        List<IngredientePrato> lista = new ArrayList<>();
        String sql = "SELECT * FROM ingredientes_prato";
        try (Connection c = ConnectionFactory.getConnection();
             Statement st = c.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
             while (rs.next()) {
                   lista.add(new IngredientePrato(
                           rs.getInt("id_prato"),
                           rs.getInt("id_ingrediente")
                   ));
             }
        }
        return lista;
    }
}