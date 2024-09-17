package fiap.natura.SuperApp;

import fiap.natura.SuperApp.Produto.Produto;

import java.util.List;

public class Consultora extends Usuario{
    private int pontuacao_consultora;
    private List<Produto> prodDisponiveis;

    public void cadastrarUsuario(Usuario usuario) {

    }

    public Consultora(int pontuacao_consultora, List<Produto> prodDisponiveis) {
        this.pontuacao_consultora = pontuacao_consultora;
        this.prodDisponiveis = prodDisponiveis;
    }

    public int getPontuacao_consultora() {
        return pontuacao_consultora;
    }

    public void setPontuacao_consultora(int pontuacao_consultora) {
        this.pontuacao_consultora = pontuacao_consultora;
    }

    public List<Produto> getProdDisponiveis() {
        return prodDisponiveis;
    }

    public void setProdDisponiveis(List<Produto> prodDisponiveis) {
        this.prodDisponiveis = prodDisponiveis;
    }
}
