package escopo4;

public class Reserva {
    String dataCheckin;
    String dataCheckout;
    Hospede hospede;
    Quarto quarto;
    ServicoAdicional servicoAdicional;
    public Reserva(String dataCheckin, String dataCheckout, Hospede hospede, Quarto quarto, ServicoAdicional servicoAdicional){
        this.dataCheckin = dataCheckin;
        this.dataCheckout = dataCheckout;
        this.hospede = hospede;
        this.quarto = quarto;
        this.servicoAdicional = servicoAdicional;
    }
}
