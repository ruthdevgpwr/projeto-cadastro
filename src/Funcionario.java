import java.time.LocalDate;
import java.util.UUID;

public class Funcionario extends Pessoa {
    private String matricula = UUID.randomUUID().toString();
    private Cargo cargo;
    private Double salario;
    private LocalDate dataAdmissao;

    public void cadastrar(String nome,
                          String dataNascimento,
                          Endereco endereco,
                          String telefone,
                          TipoTelefone tipoTelefone,
                          Cargo cargo,
                          Double salario,
                          String dataAdmissao) {
        this.setNome(nome);
        this.setDataNascimento(LocalDate.parse(dataNascimento));
        this.setEndereco(endereco);
        this.getTelefones().add(new Telefone(telefone, tipoTelefone));
        this.setCargo(cargo);
        this.setSalario(salario);
        this.setDataAdmissao(LocalDate.parse(dataAdmissao));
    }

    public void reajustarSalario(Double porcentagem) {
        salario = salario + (salario * (porcentagem / 100.0));
    }

    public void promover() {
        if (cargo.equals(Cargo.AUXILIAR)) {
            cargo = Cargo.VENDEDOR;
        } else if (cargo.equals(Cargo.VENDEDOR)) {
            cargo = Cargo.GERENTE;
        } else if (cargo.equals(Cargo.GERENTE)) {
            cargo = Cargo.CEO;
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

}
