package escopo9;

public class Passeio {
    Reserva reserva;
    String hora;
    PontoTuristico pontoTuristico;
    public Passeio(Reserva reserva, String hora, PontoTuristico pontoTuristico){
        this.reserva = reserva;
        this.hora = hora;
        this.pontoTuristico = pontoTuristico;
    }
}
