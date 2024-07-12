package escopo9;

public class Main {
    public static void main(String[] args) {
        Reserva reserva = new Reserva("Acomadacao", 150, "2024-07-11");
        Acomodacao acomodacao = new Acomodacao(reserva, 1, "Quarto Pequeno Solteiro");
        Estadia estadia = new Estadia("2024-07-11", "2024-07-11", "2024-07-11");
        Servico servico = new Servico("Limpeza de Quarto", 50);
        Turista gustavo = new Turista("Gustavo", "Terraqueo", "Humano", estadia, null, reserva);
        LaudoMedico laudoMedico = new LaudoMedico(gustavo, 37, 75, 1.80);
        PontoTuristico pontoTuristico = new PontoTuristico("IFPR", "Brasil", "Paraná", "Paranavaí", "Instituto Federal");
        Passeio passeio = new Passeio(null, "19:20", pontoTuristico);
    }
}
