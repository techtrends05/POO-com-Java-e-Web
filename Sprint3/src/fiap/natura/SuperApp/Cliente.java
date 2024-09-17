package fiap.natura.SuperApp;

import java.util.List;

public class Cliente extends Usuario {
    private List<Consultora> listaConsultorasFavoritas;

    public Cliente(int id_usuario, String nome, String endereco, int idade) {
        this.setId_usuario(id_usuario);
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setIdade(idade);
    }

    public void cadastrarUsuario(Usuario usuario) {}

    public List<Consultora> getListaConsultorasFavoritas() {
        return listaConsultorasFavoritas;
    }

    public void setListaConsultorasFavoritas(List<Consultora> listaConsultorasFavoritas) {
        this.listaConsultorasFavoritas = listaConsultorasFavoritas;
    }
}
