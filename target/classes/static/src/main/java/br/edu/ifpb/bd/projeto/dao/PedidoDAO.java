package br.edu.ifpb.bd.projeto.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.edu.ifpb.bd.projeto.model.Pedido;
import br.edu.ifpb.bd.projeto.util.ConnectionFactory;

@Repository
public class PedidoDAO {
    
    public List<Pedido> listar() throws Exception {
        List<Pedido> lista = new ArrayList<>();
        String sql = "SELECT * FROM pedido";
        try (Connection c = ConnectionFactory.getConnection();
             Statement st = c.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
             while (rs.next()) {
                   lista.add(new Pedido(
                           rs.getInt("id_pedido"),
                           rs.getFloat("valor_pedido"),
                           rs.getInt("id_mesa")
                   ));
             }
        }
        return lista;
    }
}