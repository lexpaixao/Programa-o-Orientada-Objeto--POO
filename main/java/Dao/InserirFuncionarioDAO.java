/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Positivo
 */
public class InserirFuncionarioDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/funcionarios";
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
   
   public static void inserirFuncionarios(String cpf, String nome, int nascimento, int nivel, int registro) {
        try (Connection conexao = obterConexao()) {
            String sql = "INSERT INTO funcionarios (cpf, nome, nascimento,nivel, registro) VALUES (?, ?, ?,?,?)";
            try (PreparedStatement ps = conexao.prepareStatement(sql)) {
                ps.setString(1, cpf);
                ps.setString(2, nome);
                ps.setInt(3, nascimento);
                ps.setInt(4, nivel);
                ps.setInt(5, registro);
                ps.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
}
}
