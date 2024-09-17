import java.util.List;

public class Cliente extends Usuario {
    private List<Consultora> listaConsultorasFavoritas;

    public Cliente(List<Consultora> listaConsultorasFavoritas) {
        this.listaConsultorasFavoritas = listaConsultorasFavoritas;
    }

    public void cadastrarUsuario(Usuario usuario) {}

    public List<Consultora> getListaConsultorasFavoritas() {
        return listaConsultorasFavoritas;
    }

    public void setListaConsultorasFavoritas(List<Consultora> listaConsultorasFavoritas) {
        this.listaConsultorasFavoritas = listaConsultorasFavoritas;
    }
}
