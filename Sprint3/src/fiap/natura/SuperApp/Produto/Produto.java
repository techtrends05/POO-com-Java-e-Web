package fiap.natura.SuperApp.Produto;

public class Produto {
    private int id_produto;
    private String nome_produto;
    private String descricao_produto;
    private double preco_produto;
    private Categoria categoria;
    private int estoque;

    public Produto(int id_produto, String nome_produto, String descricao_produto, Categoria categoria, int estoque, double preco_produto) {
        this.id_produto = id_produto;
        this.nome_produto = nome_produto;
        this.descricao_produto = descricao_produto;
        this.categoria = categoria;
        this.estoque = estoque;
        this.preco_produto = preco_produto;
    }

    @Override
    public String toString() {
        return "Produto: \n" +
                "    ID Produto: " + id_produto + ",\n" +
                "    Nome Produto: '" + nome_produto + "',\n" +
                "    Descrição Produto: '" + descricao_produto + "',\n" +
                "    Preço Produto: " + preco_produto + ",\n" +
                "    Categoria: { " + categoria + " },\n" +
                "    Estoque: " + estoque + "\n";
    }


    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getDescricao_produto() {
        return descricao_produto;
    }

    public void setDescricao_produto(String descricao_produto) {
        this.descricao_produto = descricao_produto;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public double getPreco_produto() {
        return preco_produto;
    }

    public void setPreco_produto(double preco_produto) {
        this.preco_produto = preco_produto;
    }
}
