package escopo2;

public class Assento {
    String numeroAssento;
    boolean disponivel;
    String tipoAssento; //perto da saida, da janela, assento para obesos, etc.
    Voo voo;

    public Assento(String numeroAssento, boolean disponivel, String tipoAssento, Voo voo){
        this.numeroAssento = numeroAssento;
        this.disponivel = disponivel;
        this.tipoAssento = tipoAssento;
        this.voo = voo;
    }
}
