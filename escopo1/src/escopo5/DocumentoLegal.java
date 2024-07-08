package escopo5;

public class DocumentoLegal {
    String tipo;
    Cliente cliente;
    Compromisso compromisso;
    public DocumentoLegal(String tipo, Cliente cliente, Compromisso compromisso){
        this.tipo = tipo;
        this.cliente = cliente;
        this.compromisso = compromisso;
    }
}
