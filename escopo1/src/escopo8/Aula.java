package escopo8;

public class Aula {
    String data;
    String horaInicio;
    String horaFim;
    PlanoTreinamento planoTreinamento;
    public Aula(String data, String horaInicio, String horaFim, PlanoTreinamento planoTreinamento){
        this.data = data;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.planoTreinamento = planoTreinamento;
    }
}
