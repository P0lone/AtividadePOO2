package escopo5;

public class ProcessoJudicial {
    Cliente cliente;
    String pedido;
    Compromisso compromisso;
    public ProcessoJudicial(Cliente cliente, String pedido, Compromisso compromisso){
        this.cliente = cliente;
        this.pedido = pedido;
        this.compromisso = compromisso;
    }
}
