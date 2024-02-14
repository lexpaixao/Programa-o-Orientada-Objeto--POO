/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Positivo
 */
public class ConexaoBDH {
     private static final String URL = "jdbc:mysql://localhost:3306/historico";
    private static final String USUARIO = "root";
    private static final String SENHA = "123456";
    
    
   public static Connection obterConexao() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver JDBC não encontrado.", e);
        }
    }

    public static void fecharConexao(Connection conexao) {
        if (conexao != null) {
            try {
                conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void inserirHistorico(String cliente, int mesa, String pedido, int quantidade,double custo, double valor, String pagamento) {
        try (Connection conexao = obterConexao()) {
            String sql = "INSERT INTO historico (cliente, mesa, pedido, quantidade,custo, valor, pagamento) VALUES (?, ?, ?, ?, ? , ?, ?)";
            try (PreparedStatement ps = conexao.prepareStatement(sql)) {
                ps.setString(1, cliente);
                ps.setInt(2, mesa);
                ps.setString(3, pedido);
                ps.setInt(4, quantidade);
                 ps.setDouble(5, custo);
                ps.setDouble(6, valor);
                  ps.setString(7, pagamento);
                ps.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
}
}
