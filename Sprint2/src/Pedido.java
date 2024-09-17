import Produto.Produto;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
    private int idPedido;
    private Cliente cliente;
    private Consultora consultora;
    private List<Produto> produtos;
    private LocalDateTime data;

    public Pedido(Cliente cliente, Consultora consultora, LocalDateTime data, int idPedido, List<Produto> produtos) {
        this.cliente = cliente;
        this.consultora = consultora;
        this.data = data;
        this.idPedido = idPedido;
        this.produtos = produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Consultora getConsultora() {
        return consultora;
    }

    public void setConsultora(Consultora consultora) {
        this.consultora = consultora;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
