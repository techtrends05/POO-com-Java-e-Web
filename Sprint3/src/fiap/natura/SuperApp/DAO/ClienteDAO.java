package fiap.natura.SuperApp.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fiap.natura.SuperApp.Cliente;
import fiap.natura.conexao.ConnectionFactory;

import fiap.natura.conexao.ConnectionFactory;

public class ClienteDAO {
    private Connection connection;
    private String sql;
    private PreparedStatement ps;
    private ResultSet rs;

    public void inserir(Cliente cliente) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.inserir(cliente);

        connection = ConnectionFactory.getInstance().getConnection();
        sql = "insert into Cliente values (?)";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, cliente.getId_usuario());
            ps.executeUpdate();
            System.out.println("Cliente inserido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir o cliente \n" + e);
        }
    }
}
