package br.edu.ifpb.bd.projeto.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.edu.ifpb.bd.projeto.model.PratoPedido;
import br.edu.ifpb.bd.projeto.util.ConnectionFactory;

@Repository
public class PratoPedidoDAO {
    
    public List<PratoPedido> listar() throws Exception {
        List<PratoPedido> lista = new ArrayList<>();
        String sql = "SELECT * FROM prato_pedido";
        try (Connection c = ConnectionFactory.getConnection();
             Statement st = c.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
             while (rs.next()) {
                   lista.add(new PratoPedido(
                           rs.getInt("id_prato"),
                           rs.getInt("id_pedido")
                   ));
             }
        }
        return lista;
    }
}