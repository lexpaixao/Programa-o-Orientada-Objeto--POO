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
public class ExibirHBDDAO {
       private static final String URL = "jdbc:mysql://localhost:3306/historico";
    private static final String USUARIO = "root";
    private static final String SENHA = "123456";
    
       public Object[][] carregarDadosHistorico() {
    try (Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA)) {
        String sql = "SELECT codigo, cliente, mesa, pedido, quantidade, custo, valor, pagamento FROM historico";
        try (Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
             ResultSet resultSet = statement.executeQuery(sql)) {
          
            resultSet.last();
            int rowCount = resultSet.getRow();
            resultSet.beforeFirst();

          
            Object[][] data = new Object[rowCount][8];

            
            int index = 0;
            while (resultSet.next()) {
                data[index][0] = resultSet.getInt("codigo");
                data[index][1] = resultSet.getString("cliente");
                data[index][2] = resultSet.getInt("mesa");
                data[index][3] = resultSet.getString("pedido");
                data[index][4] = resultSet.getInt("quantidade");
                data[index][5] = resultSet.getDouble("custo");
                data[index][6] = resultSet.getDouble("valor");
                data[index][7] = resultSet.getString("pagamento");

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
