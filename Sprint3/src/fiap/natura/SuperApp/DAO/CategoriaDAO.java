package fiap.natura.SuperApp.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fiap.natura.SuperApp.Produto.Categoria;
import fiap.natura.conexao.ConnectionFactory;

public class CategoriaDAO {
    private Connection connection;
    private String sql;
    private PreparedStatement ps;
    private ResultSet rs;

    // Método para inserir categoria
    public void inserir(Categoria cateogoria) {
        connection = ConnectionFactory.getInstance().getConnection();
        sql = "insert into Categoria values (?, ?)";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, cateogoria.getId_categoria());
            ps.setString(2, cateogoria.getNome_categoria());
            ps.execute();
            System.out.println("Categoria inserida com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir categoria \n" + e);
        }
    }

    // método para pesquisar uma categoria pelo ID
    public Categoria pesquisarId(int id) {
        Categoria categoria = null;
        connection = ConnectionFactory.getInstance().getConnection();
        sql = "select * from Categoria where id_categoria = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if(rs.next()) {
                categoria = new Categoria(id, rs.getString("nome_categoria"));
            } else {
                System.out.println("Categoria não encontrada");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categoria;
    }

    // Método para excluir categoria
    public void excluir(int id) {
        connection = ConnectionFactory.getInstance().getConnection();
        sql = "delete from Categoria WHERE id_categoria = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Categoria excluída com sucesso!");
            } else {
                System.out.println("Nenhuma categoria encontrada com o ID fornecido.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao excluir categoria \n" + e);
        }
    }

    // Método para alterar uma categoria pelo ID
    public void alterar(Categoria categoria) {
        connection = ConnectionFactory.getInstance().getConnection();
        sql = "update Categoria set nome_cateogoria = ? where id_categoria = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, categoria.getNome_categoria());
            ps.setInt(2, categoria.getId_categoria());
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Categoria atualizada com sucesso!");
            } else {
                System.out.println("Nenhuma categoria encontrada com o ID fornecido.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao alterar categoria \n" + e);
        }
    }
}
