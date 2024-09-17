package fiap.natura.SuperApp;

import fiap.natura.SuperApp.Produto.Produto;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
    private int id_pedido;
    private Cliente cliente;
    private Consultora consultora;
    private List<Produto> produtos;
    private LocalDateTime data;

    public Pedido(Cliente cliente, Consultora consultora, LocalDateTime data, int idPedido, List<Produto> produtos) {
        this.cliente = cliente;
        this.consultora = consultora;
        this.data = data;
        this.id_pedido = idPedido;
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

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
