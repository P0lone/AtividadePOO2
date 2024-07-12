package escopo9;

public class Turista {
    String nome;
    String origem;
    String especie;
    Estadia estadia;
    Servico servico;
    Reserva reserva;
    public Turista(String nome, String origem, String especie, Estadia estadia, Servico servico, Reserva reserva){
        this.nome = nome;
        this.origem = origem;
        this.especie = especie;
        this.estadia = estadia;
        this.servico = servico;
        this.reserva = reserva;
    }
}
