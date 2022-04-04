public class Telefone {
    private String numero;
    private TipoTelefone tipo; //enum?

    public Telefone(String numero, TipoTelefone tipoTelefone) {
        this.numero = numero;
        this.tipo = tipoTelefone;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TipoTelefone getTipo() {
        return tipo;
    }

    public void setTipo(TipoTelefone tipo) {
        this.tipo = tipo;
    }
}
