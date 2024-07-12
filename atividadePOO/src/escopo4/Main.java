package escopo4;

public class Main {
    public static void main(String[] args) {
        Hospede gustavo = new Hospede("Gustavo","meuemail@gustavo.com");
        Quarto quarto19 = new Quarto("19", "1", "VIP", 699.99, false);
        ServicoAdicional servicoDeQuarto = new ServicoAdicional("Serviço de Quarto", 100);
        Reserva reserva01 = new Reserva("2024-07-10", "2024-07-15", gustavo, quarto19,servicoDeQuarto);
        Relatorio relatorio = new Relatorio(1, 799.99, 500);
    }
}
