package escopo9;

public class Acomodacao {
    Reserva reserva;
    int totalCama;
    String tipo;
    public Acomodacao(Reserva reserva, int totalCama, String tipo){
        this.reserva = reserva;
        this.totalCama = totalCama;
        this.tipo = tipo;
    }
}
