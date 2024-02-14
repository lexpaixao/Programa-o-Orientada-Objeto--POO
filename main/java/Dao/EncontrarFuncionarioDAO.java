/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;


import com.mycompany.planetas.Funcionarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Positivo
 */
public class EncontrarFuncionarioDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/funcionarios";
    private static final String USUARIO = "root";
    private static final String SENHA = "123456";
    
    public static Funcionarios buscarFuncionarioPorCpf(String cpf, int registro) {
    Funcionarios colaborador = new Funcionarios();

    try (Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA)) {
        String sql = "SELECT nome, cpf, nascimento, nivel, registro FROM funcionarios WHERE cpf = ? AND registro = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, cpf);
            preparedStatement.setInt(2, registro);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    colaborador.nome = resultSet.getString("nome");
                    colaborador.cpf = resultSet.getString("cpf");
                    colaborador.data = resultSet.getInt("nascimento");
                    colaborador.nivel = resultSet.getInt("nivel");
                    colaborador.registro = resultSet.getInt("registro");
                } else {
                    JOptionPane.showMessageDialog(null, "Funcionario não encontrado no banco de dados.");
                    return null;
                }
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
   
    }

    return colaborador;
}
}
