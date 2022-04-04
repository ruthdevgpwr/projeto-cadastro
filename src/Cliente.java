import java.time.LocalDate;
import java.util.UUID;

public class Cliente extends Pessoa {

    private String codigo = UUID.randomUUID().toString();
    private Profissao profissao;

    public void cadastrar(String nome,
                          String dataNascimento,
                          Endereco endereco,
                          String telefone,
                          TipoTelefone tipoTelefone,
                          Profissao profissao) {
        this.setNome(nome);
        this.setDataNascimento(LocalDate.parse(dataNascimento));
        this.setEndereco(endereco);
        this.getTelefones().add(new Telefone(telefone, tipoTelefone));
        this.setProfissao(profissao);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }


}
