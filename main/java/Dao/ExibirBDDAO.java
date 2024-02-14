/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Positivo
 */
public class ExibirBDDAO {
     private static final String URL = "jdbc:mysql://localhost:3306/Restaurante";
    private static final String USUARIO = "root";
    private static final String SENHA = "123456";
    
       public Object[][] carregarDadosRestaurante() {
    try (Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA)) {
        String sql = "SELECT codigo, modelo, preco, categoria FROM restaurante";
        try (Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
             ResultSet resultSet = statement.executeQuery(sql)) {
            // Obter o número de linhas no ResultSet
            resultSet.last();
            int rowCount = resultSet.getRow();
            resultSet.beforeFirst();

            // Definir a estrutura do array bidimensional
            Object[][] data = new Object[rowCount][4];

            // Preencher o array bidimensional com os dados do ResultSet
            int index = 0;
            while (resultSet.next()) {
                data[index][0] = resultSet.getInt("codigo");
                data[index][1] = resultSet.getDouble("preco");
                data[index][2] = resultSet.getString("modelo");
                data[index][3] = resultSet.getString("categoria");

                index++;
            }

            return data;
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Erro ao carregar dados do restaurante: " + e.getMessage());
    }

    return null;
}
     }
