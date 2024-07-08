package escopo2;

public class Voo {
    String companhiaAerea;
    String origem;
    String destino;
    String data;
    String horaSaida;
    String horaChegada;
    double preco;

    public Voo (String companhiaAerea, String origem, String destino, String data, String horaSaida, String horaChegada, double preco){
        this.companhiaAerea = companhiaAerea;
        this.origem = origem;
        this.destino = destino;
        this.data = data;
        this.horaSaida = horaSaida;
        this.horaChegada = horaChegada;
        this.preco = preco;
    }
}