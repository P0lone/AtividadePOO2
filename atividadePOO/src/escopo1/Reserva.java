package escopo1;

public class Reserva {
    Usuario usuario;
    String dataReserva;
    Livro livro;
    /**
     * @param dataReserva Valor do atributo no formato "YYYY-MM-DD".
     */
    public Reserva(Usuario usuario, String dataReserva, Livro livro){
        this.usuario = usuario;
        this.dataReserva = dataReserva;
        this.livro = livro;
    }
}
