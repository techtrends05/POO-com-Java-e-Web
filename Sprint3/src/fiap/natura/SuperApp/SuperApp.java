package fiap.natura.SuperApp;

import fiap.natura.SuperApp.Produto.Produto;

import java.util.List;

public class SuperApp {
    private List<Cliente> clientes;
    private List<Consultora> consultoras;
    private List<Produto> produtos;
    private List<Pedido> pedidos;

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Consultora> getConsultoras() {
        return consultoras;
    }

    public void setConsultoras(List<Consultora> consultoras) {
        this.consultoras = consultoras;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}

