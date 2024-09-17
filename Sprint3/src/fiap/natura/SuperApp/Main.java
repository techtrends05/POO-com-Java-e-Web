package fiap.natura.SuperApp;

import fiap.natura.SuperApp.DAO.ClienteDAO;
import fiap.natura.SuperApp.DAO.UsuarioDAO;
import fiap.natura.SuperApp.Produto.Categoria;
import fiap.natura.SuperApp.DAO.CategoriaDAO;
import fiap.natura.SuperApp.Produto.Produto;
import fiap.natura.SuperApp.DAO.ProdutoDAO;

import java.awt.*;
import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ClienteDAO clienteDAO = new ClienteDAO();
        Cliente cliente;

        CategoriaDAO categoriaDAO = new CategoriaDAO();
        Categoria categoria;

        ProdutoDAO produtoDAO = new ProdutoDAO();
        Produto produto;

        // Método para inserir usuario do tipo cliente
        cliente = new Cliente(3, "Francisco Lima", "Av Paulista, 500", 23);
        clienteDAO.inserir(cliente);

        // Método para inserir categoria produto
        categoria = new Categoria(3, "Colônia");
        categoriaDAO.inserir(categoria);

        // Método para inserir produto
        produto = new Produto(3, "Colônia 24s", "Colônia pós banho", categoria, 10, 25.9);
        produtoDAO.inserir(produto);

        // Método para pesquisar cateogoria
        // CategoriaDAO categoria1 = new CategoriaDAO();
        // Categoria BuscaCategoriaId = categoria1.pesquisarId(1);
        // System.out.println(BuscaCategoriaId);

        // Método para pesquisar produto
        System.out.println("----------- 1º INSERÇÃO PRODUTO -----------");
        Produto produtoId = produtoDAO.pesquisarId(3);
        System.out.println(produtoId);

        // Alterar um produto
        produto.setNome_produto("Men's Fragrance");
        produto.setDescricao_produto("Fragancia masculina");
        produtoDAO.alterar(produto);

        // Método para pesquisar produto
        System.out.println("\n---------- PRODUTO ALTERADO ------------");
        Produto produtoId1 = produtoDAO.pesquisarId(3);
        System.out.println(produtoId1);

        // Método para excluir produto
        System.out.println("----------- 1º EXCLUINDO PRODUTO -----------");
        produtoDAO.excluir(3);

        System.out.println("\n---------- PRODUTO EXCLUÍDO ------------");
        Produto produtoId3 = produtoDAO.pesquisarId(3);
        System.out.println(produtoId3);
    }
}