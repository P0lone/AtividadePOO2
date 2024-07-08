package escopo4;

public class Quarto {
    String numeroQuarto;
    String totalDeCamas;
    String tipo; //VIP, C/ Suite, S/ Suite, etc
    double precoDiaria;
    boolean disponibilidade;
    public Quarto(String numeroQuarto, String totalDeCamas, String tipo, double precoDiaria, boolean disponibilidade){
        this.numeroQuarto = numeroQuarto;
        this.totalDeCamas = totalDeCamas;
        this.tipo = tipo;
        this.precoDiaria = precoDiaria;
        this.disponibilidade = disponibilidade;
    }
}
