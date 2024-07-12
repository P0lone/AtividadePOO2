package escopo5;

public class Main {
    public static void main(String[] args) {
        Cliente gustavo = new Cliente("Gustavo", "meuemail@gustavo.com", "123.456.789-11");
        Advogado kleber = new Advogado("Kleber", "kleber@kleber.com", "987654231-99", "40");
        Compromisso compromisso = new Compromisso(kleber, "2024-07-08", "5d");
        DocumentoLegal documentoLegal = new DocumentoLegal("CNH", gustavo, compromisso);
        ProcessoJudicial processoJudicial = new ProcessoJudicial(gustavo, null, null);
    }
}
