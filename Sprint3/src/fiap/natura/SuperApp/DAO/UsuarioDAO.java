package fiap.natura.SuperApp.DAO;

import fiap.natura.SuperApp.Produto.Categoria;
import fiap.natura.SuperApp.Usuario;
import fiap.natura.conexao.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fiap.natura.conexao.ConnectionFactory;

public class UsuarioDAO {
    private Connection connection;
    private String sql;
    private PreparedStatement ps;
    private ResultSet rs;

    public void inserir(Usuario usuario) {
        connection = ConnectionFactory.getInstance().getConnection();
        sql = "insert into Usuario values (?, ?, ?, ?)";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, usuario.getId_usuario());
            ps.setString(2, usuario.getNome());
            ps.setString(3, usuario.getEndereco());
            ps.setInt(4,usuario.getIdade());
            ps.execute();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir usuário \n" + e);
        }
    }
}
