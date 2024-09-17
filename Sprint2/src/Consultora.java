import Produto.Produto;

import java.util.List;

public class Consultora extends Usuario{
    private int pontuacaoConsultora;
    private List<Produto> prodDisponiveis;

    public void cadastrarUsuario(Usuario usuario) {

    }

    public Consultora(int pontuacaoConsultora, List<Produto> prodDisponiveis) {
        this.pontuacaoConsultora = pontuacaoConsultora;
        this.prodDisponiveis = prodDisponiveis;
    }

    public int getPontuacaoConsultora() {
        return pontuacaoConsultora;
    }

    public void setPontuacaoConsultora(int pontuacaoConsultora) {
        this.pontuacaoConsultora = pontuacaoConsultora;
    }

    public List<Produto> getProdDisponiveis() {
        return prodDisponiveis;
    }

    public void setProdDisponiveis(List<Produto> prodDisponiveis) {
        this.prodDisponiveis = prodDisponiveis;
    }
}
