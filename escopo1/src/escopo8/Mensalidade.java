package escopo8;

public class Mensalidade {
    String tipoPagamento;
    double preco;
    String dataInicio;
    String dataFim;
    public Mensalidade(String tipoPagamento, double preco, String dataInicio, String dataFim){
        this.tipoPagamento = tipoPagamento;
        this.preco = preco;
        this. dataInicio = dataInicio;
        this.dataFim = dataFim;
    }
}
