/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Positivo
 */
public class ConexaoBancoDeDados {
      public static void main(String[] args) {
        Connection conexao = null;

        try {
            // Carregando o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Configurando a URL do banco de dados e estabelecendo a conexão
            String url = "jdbc:mysql://localhost:3306/Restaurante";
            String usuario = "root";
            String senha = "123456";
            conexao = DriverManager.getConnection(url, usuario, senha);

            // A partir deste ponto, você tem uma conexão bem-sucedida
            System.out.println("Conexão bem-sucedida!");
            String consultaSQL = "SELECT * FROM Restaurante";
try (Statement statement = conexao.createStatement();
     ResultSet resultSet = statement.executeQuery(consultaSQL)) {

    while (resultSet.next()) {
        // Processar os resultados, se necessário
    }

} catch (SQLException e) {
    e.printStackTrace();
}

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // Fechando a conexão no bloco finally para garantir que seja fechada
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
