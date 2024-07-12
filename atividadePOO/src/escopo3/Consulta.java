package escopo3;

public class Consulta {
    Paciente paciente;
    Medico medico;
    String data;
    String hora;
    String tipo; //geral, oftalmo, etc

    public Consulta(Paciente paciente, Medico medico, String data, String hora, String tipo){
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
        this.hora = hora;
        this.tipo = tipo;
    }
}
