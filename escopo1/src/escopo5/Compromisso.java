package escopo5;

public class Compromisso {
    Advogado advogado;
    String dataIncio;
    String prazo;
    public Compromisso(Advogado advogado, String dataInicio, String prazo){
        this.advogado = advogado;
        this.dataIncio = dataInicio;
        this.prazo = prazo;
    }
}
