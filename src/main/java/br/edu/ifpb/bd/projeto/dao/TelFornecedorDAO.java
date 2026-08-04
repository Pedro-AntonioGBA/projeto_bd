package br.edu.ifpb.bd.projeto.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.edu.ifpb.bd.projeto.model.TelFornecedor;
import br.edu.ifpb.bd.projeto.util.ConnectionFactory;

@Repository
public class TelFornecedorDAO {
    
    public List<TelFornecedor> listar() throws Exception {
        List<TelFornecedor> lista = new ArrayList<>();
        String sql = "SELECT * FROM tel_fornencedor";
        try (Connection c = ConnectionFactory.getConnection();
             Statement st = c.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
             while (rs.next()) {
                   lista.add(new TelFornecedor(
                           rs.getInt("id_telefone"),
                           rs.getString("numero"),
                           rs.getInt("cnpj")
                   ));
             }
        }
        return lista;
    }
}