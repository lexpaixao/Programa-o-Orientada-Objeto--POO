/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Positivo
 */
public class ExibirFBDDAO {
     private static final String URL = "jdbc:mysql://localhost:3306/funcionarios";
    private static final String USUARIO = "root";
    private static final String SENHA = "123456";
    
       public Object[][] carregarDadosfuncionarios() {
    try (Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA)) {
        String sql = "SELECT codigo, cpf, nome, nascimento, nivel, registro FROM funcionarios";
        try (Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
             ResultSet resultSet = statement.executeQuery(sql)) {
          
            resultSet.last();
            int rowCount = resultSet.getRow();
            resultSet.beforeFirst();

           
            Object[][] data = new Object[rowCount][6];

            
            int index = 0;
            while (resultSet.next()) {
                data[index][0] = resultSet.getInt("codigo");
                data[index][1] = resultSet.getDouble("cpf");
                data[index][2] = resultSet.getString("nome");
                data[index][3] = resultSet.getInt("nascimento");
                data[index][4] = resultSet.getInt("nivel");
                data[index][5] = resultSet.getInt("registro");

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
