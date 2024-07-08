package escopo3;

public class Exame {
    Paciente paciente;
    String tipo; //exame de vista, sangue, etc
    String data;
    String hora;
    String resultado;

    public Exame(Paciente paciente, String tipo, String data, String hora, String resultado){
        this.paciente = paciente;
        this.tipo = tipo;
        this.data = data;
        this.hora = hora;
        this.resultado = resultado;
    }
}
