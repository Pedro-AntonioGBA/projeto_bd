package br.edu.ifpb.bd.projeto.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.edu.ifpb.bd.projeto.model.Fornecedor;
import br.edu.ifpb.bd.projeto.util.ConnectionFactory;

@Repository
public class FornecedorDAO {
    
    public List<Fornecedor> listar() throws Exception {
        List<Fornecedor> lista = new ArrayList<>();
        String sql = "SELECT * FROM fornecedor";
        try (Connection c = ConnectionFactory.getConnection();
             Statement st = c.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
             while (rs.next()) {
                   lista.add(new Fornecedor(
                           rs.getInt("cnpj"),
                           rs.getString("nome")
                   ));
             }
        }
        return lista;
    }
}