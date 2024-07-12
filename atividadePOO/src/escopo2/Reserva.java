package escopo2;

public class Reserva {
    Usuario usuario;
    Assento assento;
    String status; //pendente, confirmado, cancelado
    ServicoExtra servicoExtra;

    public Reserva(Usuario usuario, Assento assento, String status, ServicoExtra servicoExtra){
        this.usuario = usuario;
        this.assento = assento;
        this.status = status;
        this.servicoExtra = servicoExtra;
    }
}
