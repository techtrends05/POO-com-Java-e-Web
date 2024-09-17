package fiap.natura.SuperApp.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fiap.natura.SuperApp.Produto.Categoria;
import fiap.natura.SuperApp.Produto.Produto;
import fiap.natura.conexao.ConnectionFactory;

public class ProdutoDAO {
    private Connection connection;
    private String sql;
    private PreparedStatement ps;
    private ResultSet rs;

    public void inserir(Produto produto) {
        connection = ConnectionFactory.getInstance().getConnection();
        sql = "insert into Produto values (?, ?, ?, ?, ?, ?)";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, produto.getId_produto());
            ps.setString(2, produto.getNome_produto());
            ps.setString(3, produto.getDescricao_produto());
            ps.setDouble(4, produto.getPreco_produto());
            ps.setObject(5,produto.getCategoria().getId_categoria());
            ps.setInt(6, produto.getEstoque());
            ps.execute();
            System.out.println("Produto inserido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir produto \n" + e);
        }
    }

    public Produto pesquisarId(int id) {
        Produto produto = null;
        connection = ConnectionFactory.getInstance().getConnection();
        sql = "select * from Produto where id_produto = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                String nomeProduto = rs.getString("nome_produto");
                String descricaoProduto = rs.getString("descricao_produto");
                double precoProduto = rs.getDouble("preco_produto");
                int idCategoria = rs.getInt("id_categoria");
                int estoque = rs.getInt("estoque");

                CategoriaDAO categoriaDAO = new CategoriaDAO();
                Categoria BuscaCategoriaId = categoriaDAO.pesquisarId(id);
                System.out.println(BuscaCategoriaId);

                produto = new Produto(id, nomeProduto, descricaoProduto, BuscaCategoriaId, estoque, precoProduto);
            } else {
                System.out.println("Produto não encontrado");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produto;
    }

    public void excluir(int id) {
        connection = ConnectionFactory.getInstance().getConnection();
        sql = "delete from Produto where id_produto = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Produto excluído com sucesso!");
            } else {
                System.out.println("Nenhum produto encontrado com o ID fornecido.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao excluir produto \n" + e);
        }
    }

    // Método para alterar um produto pelo ID
    public void alterar(Produto produto) {
        connection = ConnectionFactory.getInstance().getConnection();
        sql = "update Produto set nome_produto = ?, descricao_produto = ?, preco_produto = ?, id_categoria = ?, estoque = ? WHERE id_produto = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, produto.getNome_produto());
            ps.setString(2, produto.getDescricao_produto());
            ps.setDouble(3, produto.getPreco_produto());
            ps.setInt(4, produto.getCategoria().getId_categoria());
            ps.setInt(5, produto.getEstoque());
            ps.setInt(6, produto.getId_produto());
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Produto atualizado com sucesso!");
            } else {
                System.out.println("Nenhum produto encontrado com o ID fornecido.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao alterar produto \n" + e);
        }
    }
}

