package escopo3;

public class Leito {
    String numero;
    String necessidadeEspecial;
    boolean disponibilidade;
    Paciente paciente;

    public Leito(String numero, String necessidadeEspecial, boolean disponibilidade, Paciente paciente){
        this.numero = numero;
        this.necessidadeEspecial = necessidadeEspecial;
        this.disponibilidade = disponibilidade;
        this.paciente = paciente;
    }
}
