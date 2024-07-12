package escopo7;

public class Relatorio {
    Produto produtoMaisVendido;
    double totalGanhoMensal;
    double totalGastoMensal;
    public Relatorio(Produto produtoMaisVendido, double totalGanhoMensal, double totalGastoMensal){
        this.produtoMaisVendido = produtoMaisVendido;
        this.totalGanhoMensal = totalGanhoMensal;
        this.totalGastoMensal = totalGastoMensal;
    }
}
