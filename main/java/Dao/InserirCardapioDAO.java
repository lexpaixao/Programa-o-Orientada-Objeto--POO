/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import static Conexao.ConexaoBDH.obterConexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Positivo
 */
public class InserirCardapioDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/Restaurante";
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
                e.printStackTrace(); // ou você pode lidar com a exceção de outra forma
            }
        }
    }
   
   public static void inserirRestaurante(double preco,String modelo, String categoria) {
        try (Connection conexao = obterConexao()) {
            String sql = "INSERT INTO restaurante (preco, modelo, categoria) VALUES (?, ?, ?)";
            try (PreparedStatement ps = conexao.prepareStatement(sql)) {
                ps.setDouble(1, preco);
                ps.setString(2, modelo);
                ps.setString(3, categoria);
                ps.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
}
}
