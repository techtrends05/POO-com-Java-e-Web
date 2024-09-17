package fiap.natura.SuperApp.Produto;

public class Categoria {
    int id_categoria;
    String nome_categoria;

    @Override
    public String toString() {
        return "Id: " + id_categoria + ", Categoria: " + nome_categoria;
    }

    public Categoria(int id_categoria, String nome_categoria) {
        this.id_categoria = id_categoria;
        this.nome_categoria = nome_categoria;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNome_categoria() {
        return nome_categoria;
    }

    public void setNome_categoria(String nome_categoria) {
        this.nome_categoria = nome_categoria;
    }
}
