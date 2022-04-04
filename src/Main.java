import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        DateTimeFormatter padraoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Endereco enderecoRuth = new Endereco("Rua Jardim Oceania",
                "Bessa",
                "João Pessoa",
                "PB",
                "192",
                "550263-04",
                "apto 13",
                "Brasil");

        Endereco enderecoEmerson = new Endereco("Rua Brasiliano da Costa",
                "Centenário",
                "Campina Grande",
                "PB",
                "192",
                "540520-20",
                "casa 02",
                "Brasil");

        Cliente cliente = new Cliente();
        cliente.cadastrar("Ruth",
                "1992-01-10",
                enderecoRuth,
                "99826-4742",
                TipoTelefone.CELULAR,
                Profissao.DESENVOLVEDORA);

        Funcionario funcionario = new Funcionario();
        funcionario.cadastrar("Emerson",
                "1988-09-27",
                enderecoEmerson,
                "9909-4020",
                TipoTelefone.RESIDENCIAL,
                Cargo.VENDEDOR,
                2000.0,
                "2020-01-10");

        System.out.println("----- CLIENTE ----- ");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Data de nascimento: " + cliente.getDataNascimento().format(padraoData));
        System.out.println(cliente.getEndereco().toString());
        System.out.println("Telefone: " + cliente.getTelefones().get(0).getNumero());
        System.out.println("Tipo de telefone: " + cliente.getTelefones().get(0).getTipo().name());
        System.out.println("Profissão: " + cliente.getProfissao().name());
        System.out.println("Idade: " + cliente.obterIdade());

        System.out.println("----- FUNCIONARIO(A) ----- ");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Data de Nascimento: " + funcionario.getDataNascimento().format(padraoData));
        System.out.println(funcionario.getEndereco().toString());
        System.out.println("Telefone: " + funcionario.getTelefones().get(0).getNumero());
        System.out.println("Tipo do telefone: " + funcionario.getTelefones().get(0).getTipo());
        System.out.println("Cargo: " + funcionario.getCargo().name());
        System.out.println("Data da admissão: " + funcionario.getDataAdmissao());
        System.out.println("Idade: " + funcionario.obterIdade());

        System.out.println(funcionario.getSalario());
        funcionario.reajustarSalario(20.0);
        System.out.println(funcionario.getSalario());

        System.out.println(funcionario.getCargo());
        funcionario.promover();
        System.out.println(funcionario.getCargo());
    }
}
