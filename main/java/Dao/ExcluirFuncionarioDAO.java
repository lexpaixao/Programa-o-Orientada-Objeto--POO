/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Positivo
 */
public class ExcluirFuncionarioDAO {
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
   
   public static void ExcluirFuncionarios( int codigo) {
         try (Connection conexao = obterConexao()) {
             JOptionPane.showMessageDialog(null,"Valor de id: "+codigo);
        String sql = "DELETE FROM funcionarios WHERE codigo = ?";
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setInt(1, codigo);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Funcionário excluído com sucesso!");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
}
