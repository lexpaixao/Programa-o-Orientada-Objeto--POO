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
import com.mycompany.planetas.Cliente;
import javax.swing.JOptionPane;
/**
 *
 * @author Positivo
 */
public class PedidoDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/Restaurante";
    private static final String USUARIO = "root";
    private static final String SENHA = "123456";

    public Cliente buscarPedidoPorId(int id) {
        Cliente pedido = new Cliente();

        try (Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA)) {
            
            String sql = "SELECT modelo, preco FROM restaurante WHERE codigo = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setInt(1, id);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        
                        pedido.produto = resultSet.getString("modelo");
                        
                        pedido.svalor = resultSet.getDouble("preco");
                    } else {
                        JOptionPane.showMessageDialog(null, "Pedido não encontrado no banco de dados.");
                        return null;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
          
        }

        return pedido;
    }
}
